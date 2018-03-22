package com.itheima.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.itheima.TestDubboInterface;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author bear
 * @version 1.0
 * @description com.itheima.dubbo.controller
 * @date 2018/3/22
 */
@Controller
public class TestDubboCustomerController {
    @Reference
    private TestDubboInterface testDubboInterface;
    @ResponseBody
    @RequestMapping(value = "/dubbo/test/{name}")
    public  String sayhell0(@PathVariable String name){
        String s = testDubboInterface.sayhell0(name);
        return s;
    }
}
