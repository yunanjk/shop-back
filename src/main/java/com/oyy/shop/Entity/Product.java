package com.oyy.shop.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class Product {

    // 상품 이름
    private String name;

    // 상품 가격
    private Long price;
}
