package typings.shopifyBuy

import typings.shopifyBuy.mod.ConfigAttrs
import typings.shopifyBuy.mod.FetchFunction
import typings.shopifyBuy.mod.GraphQLJSClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object ShopifyBuy {
    
    @JSGlobal("ShopifyBuy")
    @js.native
    open class ^ protected ()
      extends typings.shopifyBuy.mod.^ {
      def this(config: typings.shopifyBuy.mod.Config) = this()
      def this(config: typings.shopifyBuy.mod.Config, GraphQLClientClass: GraphQLJSClient) = this()
      def this(config: typings.shopifyBuy.mod.Config, GraphQLClientClass: Unit, fetchFunction: FetchFunction) = this()
      def this(
        config: typings.shopifyBuy.mod.Config,
        GraphQLClientClass: GraphQLJSClient,
        fetchFunction: FetchFunction
      ) = this()
    }
    
    @JSGlobal("ShopifyBuy")
    @js.native
    val ^ : js.Any = js.native
    
    // end GraphQL Types - Scalars
    // GraphQL Types - Enums
    @JSGlobal("ShopifyBuy.ArticleSortKeys")
    @js.native
    object ArticleSortKeys extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.shopifyBuy.mod.ArticleSortKeys & String] = js.native
      
      /* "author" */ val AUTHOR: typings.shopifyBuy.mod.ArticleSortKeys.AUTHOR & String = js.native
      
      /* "blog_title" */ val BLOG_TITLE: typings.shopifyBuy.mod.ArticleSortKeys.BLOG_TITLE & String = js.native
      
      /* "id" */ val ID: typings.shopifyBuy.mod.ArticleSortKeys.ID & String = js.native
      
      /* "published_at" */ val PUBLISHED_AT: typings.shopifyBuy.mod.ArticleSortKeys.PUBLISHED_AT & String = js.native
      
      /* "query" */ val RELEVANCE: typings.shopifyBuy.mod.ArticleSortKeys.RELEVANCE & String = js.native
      
      /* "title" */ val TITLE: typings.shopifyBuy.mod.ArticleSortKeys.TITLE & String = js.native
      
      /* "updated_at" */ val UPDATED_AT: typings.shopifyBuy.mod.ArticleSortKeys.UPDATED_AT & String = js.native
    }
    
    @JSGlobal("ShopifyBuy.BlogSortKeys")
    @js.native
    object BlogSortKeys extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.shopifyBuy.mod.BlogSortKeys & String] = js.native
      
      /* "HANDLE" */ val HANDLE: typings.shopifyBuy.mod.BlogSortKeys.HANDLE & String = js.native
      
      /* "id" */ val ID: typings.shopifyBuy.mod.BlogSortKeys.ID & String = js.native
      
      /* "query" */ val RELEVANCE: typings.shopifyBuy.mod.BlogSortKeys.RELEVANCE & String = js.native
      
      /* "title" */ val TITLE: typings.shopifyBuy.mod.BlogSortKeys.TITLE & String = js.native
    }
    
    @JSGlobal("ShopifyBuy.CardBrand")
    @js.native
    object CardBrand extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.shopifyBuy.mod.CardBrand & String] = js.native
      
      /* "AMERICAN_EXPRESS" */ val AMERICAN_EXPRESS: typings.shopifyBuy.mod.CardBrand.AMERICAN_EXPRESS & String = js.native
      
      /* "DINERS_CLUB" */ val DINERS_CLUB: typings.shopifyBuy.mod.CardBrand.DINERS_CLUB & String = js.native
      
      /* "DISCOVER" */ val DISCOVER: typings.shopifyBuy.mod.CardBrand.DISCOVER & String = js.native
      
      /* "ELO" */ val ELO: typings.shopifyBuy.mod.CardBrand.ELO & String = js.native
      
      /* "JCB" */ val JCB: typings.shopifyBuy.mod.CardBrand.JCB & String = js.native
      
      /* "MASTERCARD" */ val MASTERCARD: typings.shopifyBuy.mod.CardBrand.MASTERCARD & String = js.native
      
      /* "UNIONPAY" */ val UNIONPAY: typings.shopifyBuy.mod.CardBrand.UNIONPAY & String = js.native
      
      /* "VISA" */ val VISA: typings.shopifyBuy.mod.CardBrand.VISA & String = js.native
    }
    
    @JSGlobal("ShopifyBuy.CartErrorCode")
    @js.native
    object CartErrorCode extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.shopifyBuy.mod.CartErrorCode & String] = js.native
      
      /* "INVALID" */ val INVALID: typings.shopifyBuy.mod.CartErrorCode.INVALID & String = js.native
      
      /* "INVALID_MERCHANDISE_LINE" */ val INVALID_MERCHANDISE_LINE: typings.shopifyBuy.mod.CartErrorCode.INVALID_MERCHANDISE_LINE & String = js.native
      
      /* "LESS_THAN" */ val LESS_THAN: typings.shopifyBuy.mod.CartErrorCode.LESS_THAN & String = js.native
      
      /* "MISSING_DISCOUNT_CODE" */ val MISSING_DISCOUNT_CODE: typings.shopifyBuy.mod.CartErrorCode.MISSING_DISCOUNT_CODE & String = js.native
      
      /* "MISSING_NOTE" */ val MISSING_NOTE: typings.shopifyBuy.mod.CartErrorCode.MISSING_NOTE & String = js.native
    }
    
    @JSGlobal("ShopifyBuy.CheckoutErrorCode")
    @js.native
    object CheckoutErrorCode extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.shopifyBuy.mod.CheckoutErrorCode & String] = js.native
      
      /* "ALREADY_COMPLETED" */ val ALREADY_COMPLETED: typings.shopifyBuy.mod.CheckoutErrorCode.ALREADY_COMPLETED & String = js.native
      
      /* "BAD_DOMAIN" */ val BAD_DOMAIN: typings.shopifyBuy.mod.CheckoutErrorCode.BAD_DOMAIN & String = js.native
      
      /* "BLANK" */ val BLANK: typings.shopifyBuy.mod.CheckoutErrorCode.BLANK & String = js.native
      
      /* "CART_DOES_NOT_MEET_DISCOUNT_REQUIREMENTS_NOTICE" */ val CART_DOES_NOT_MEET_DISCOUNT_REQUIREMENTS_NOTICE: typings.shopifyBuy.mod.CheckoutErrorCode.CART_DOES_NOT_MEET_DISCOUNT_REQUIREMENTS_NOTICE & String = js.native
      
      /* "CUSTOMER_ALREADY_USED_ONCE_PER_CUSTOMER_DISCOUNT_NOTICE" */ val CUSTOMER_ALREADY_USED_ONCE_PER_CUSTOMER_DISCOUNT_NOTICE: typings.shopifyBuy.mod.CheckoutErrorCode.CUSTOMER_ALREADY_USED_ONCE_PER_CUSTOMER_DISCOUNT_NOTICE & String = js.native
      
      /* "DISCOUNT_ALREADY_APPLIED" */ val DISCOUNT_ALREADY_APPLIED: typings.shopifyBuy.mod.CheckoutErrorCode.DISCOUNT_ALREADY_APPLIED & String = js.native
      
      /* "DISCOUNT_DISABLED" */ val DISCOUNT_DISABLED: typings.shopifyBuy.mod.CheckoutErrorCode.DISCOUNT_DISABLED & String = js.native
      
      /* "DISCOUNT_EXPIRED" */ val DISCOUNT_EXPIRED: typings.shopifyBuy.mod.CheckoutErrorCode.DISCOUNT_EXPIRED & String = js.native
      
      /* "DISCOUNT_LIMIT_REACHED" */ val DISCOUNT_LIMIT_REACHED: typings.shopifyBuy.mod.CheckoutErrorCode.DISCOUNT_LIMIT_REACHED & String = js.native
      
      /* "DISCOUNT_NOT_FOUND" */ val DISCOUNT_NOT_FOUND: typings.shopifyBuy.mod.CheckoutErrorCode.DISCOUNT_NOT_FOUND & String = js.native
      
      /* "EMPTY" */ val EMPTY: typings.shopifyBuy.mod.CheckoutErrorCode.EMPTY & String = js.native
      
      /* "EXPIRED_QUEUE_TOKEN" */ val EXPIRED_QUEUE_TOKEN: typings.shopifyBuy.mod.CheckoutErrorCode.EXPIRED_QUEUE_TOKEN & String = js.native
      
      /* "GIFT_CARD_ALREADY_APPLIED" */ val GIFT_CARD_ALREADY_APPLIED: typings.shopifyBuy.mod.CheckoutErrorCode.GIFT_CARD_ALREADY_APPLIED & String = js.native
      
      /* "GIFT_CARD_CODE_INVALID" */ val GIFT_CARD_CODE_INVALID: typings.shopifyBuy.mod.CheckoutErrorCode.GIFT_CARD_CODE_INVALID & String = js.native
      
      /* "GIFT_CARD_CURRENCY_MISMATCH" */ val GIFT_CARD_CURRENCY_MISMATCH: typings.shopifyBuy.mod.CheckoutErrorCode.GIFT_CARD_CURRENCY_MISMATCH & String = js.native
      
      /* "GIFT_CARD_DEPLETED" */ val GIFT_CARD_DEPLETED: typings.shopifyBuy.mod.CheckoutErrorCode.GIFT_CARD_DEPLETED & String = js.native
      
      /* "GIFT_CARD_DISABLED" */ val GIFT_CARD_DISABLED: typings.shopifyBuy.mod.CheckoutErrorCode.GIFT_CARD_DISABLED & String = js.native
      
      /* "GIFT_CARD_EXPIRED" */ val GIFT_CARD_EXPIRED: typings.shopifyBuy.mod.CheckoutErrorCode.GIFT_CARD_EXPIRED & String = js.native
      
      /* "GIFT_CARD_NOT_FOUND" */ val GIFT_CARD_NOT_FOUND: typings.shopifyBuy.mod.CheckoutErrorCode.GIFT_CARD_NOT_FOUND & String = js.native
      
      /* "GIFT_CARD_UNUSABLE" */ val GIFT_CARD_UNUSABLE: typings.shopifyBuy.mod.CheckoutErrorCode.GIFT_CARD_UNUSABLE & String = js.native
      
      /* "GREATER_THAN_OR_EQUAL_TO" */ val GREATER_THAN_OR_EQUAL_TO: typings.shopifyBuy.mod.CheckoutErrorCode.GREATER_THAN_OR_EQUAL_TO & String = js.native
      
      /* "HIGHER_VALUE_DISCOUNT_APPLIED" */ val HIGHER_VALUE_DISCOUNT_APPLIED: typings.shopifyBuy.mod.CheckoutErrorCode.HIGHER_VALUE_DISCOUNT_APPLIED & String = js.native
      
      /* "INVALID" */ val INVALID: typings.shopifyBuy.mod.CheckoutErrorCode.INVALID & String = js.native
      
      /* "INVALID_COUNTRY_AND_CURRENCY" */ val INVALID_COUNTRY_AND_CURRENCY: typings.shopifyBuy.mod.CheckoutErrorCode.INVALID_COUNTRY_AND_CURRENCY & String = js.native
      
      /* "INVALID_FOR_COUNTRY" */ val INVALID_FOR_COUNTRY: typings.shopifyBuy.mod.CheckoutErrorCode.INVALID_FOR_COUNTRY & String = js.native
      
      /* "INVALID_FOR_COUNTRY_AND_PROVINCE" */ val INVALID_FOR_COUNTRY_AND_PROVINCE: typings.shopifyBuy.mod.CheckoutErrorCode.INVALID_FOR_COUNTRY_AND_PROVINCE & String = js.native
      
      /* "INVALID_PROVINCE_IN_COUNTRY" */ val INVALID_PROVINCE_IN_COUNTRY: typings.shopifyBuy.mod.CheckoutErrorCode.INVALID_PROVINCE_IN_COUNTRY & String = js.native
      
      /* "INVALID_QUEUE_TOKEN" */ val INVALID_QUEUE_TOKEN: typings.shopifyBuy.mod.CheckoutErrorCode.INVALID_QUEUE_TOKEN & String = js.native
      
      /* "INVALID_REGION_IN_COUNTRY" */ val INVALID_REGION_IN_COUNTRY: typings.shopifyBuy.mod.CheckoutErrorCode.INVALID_REGION_IN_COUNTRY & String = js.native
      
      /* "INVALID_STATE_IN_COUNTRY" */ val INVALID_STATE_IN_COUNTRY: typings.shopifyBuy.mod.CheckoutErrorCode.INVALID_STATE_IN_COUNTRY & String = js.native
      
      /* "LESS_THAN" */ val LESS_THAN: typings.shopifyBuy.mod.CheckoutErrorCode.LESS_THAN & String = js.native
      
      /* "LESS_THAN_OR_EQUAL_TO" */ val LESS_THAN_OR_EQUAL_TO: typings.shopifyBuy.mod.CheckoutErrorCode.LESS_THAN_OR_EQUAL_TO & String = js.native
      
      /* "LINE_ITEM_NOT_FOUND" */ val LINE_ITEM_NOT_FOUND: typings.shopifyBuy.mod.CheckoutErrorCode.LINE_ITEM_NOT_FOUND & String = js.native
      
      /* "LOCKED" */ val LOCKED: typings.shopifyBuy.mod.CheckoutErrorCode.LOCKED & String = js.native
      
      /* "MAXIMUM_DISCOUNT_CODE_LIMIT_REACHED" */ val MAXIMUM_DISCOUNT_CODE_LIMIT_REACHED: typings.shopifyBuy.mod.CheckoutErrorCode.MAXIMUM_DISCOUNT_CODE_LIMIT_REACHED & String = js.native
      
      /* "MISSING_PAYMENT_INPUT" */ val MISSING_PAYMENT_INPUT: typings.shopifyBuy.mod.CheckoutErrorCode.MISSING_PAYMENT_INPUT & String = js.native
      
      /* "NOT_ENOUGH_IN_STOCK" */ val NOT_ENOUGH_IN_STOCK: typings.shopifyBuy.mod.CheckoutErrorCode.NOT_ENOUGH_IN_STOCK & String = js.native
      
      /* "NOT_SUPPORTED" */ val NOT_SUPPORTED: typings.shopifyBuy.mod.CheckoutErrorCode.NOT_SUPPORTED & String = js.native
      
      /* "PRESENT" */ val PRESENT: typings.shopifyBuy.mod.CheckoutErrorCode.PRESENT & String = js.native
      
      /* "PRODUCT_NOT_AVAILABLE" */ val PRODUCT_NOT_AVAILABLE: typings.shopifyBuy.mod.CheckoutErrorCode.PRODUCT_NOT_AVAILABLE & String = js.native
      
      /* "SHIPPING_RATE_EXPIRED" */ val SHIPPING_RATE_EXPIRED: typings.shopifyBuy.mod.CheckoutErrorCode.SHIPPING_RATE_EXPIRED & String = js.native
      
      /* "THROTTLED_DURING_CHECKOUT" */ val THROTTLED_DURING_CHECKOUT: typings.shopifyBuy.mod.CheckoutErrorCode.THROTTLED_DURING_CHECKOUT & String = js.native
      
      /* "TOO_LONG" */ val TOO_LONG: typings.shopifyBuy.mod.CheckoutErrorCode.TOO_LONG & String = js.native
      
      /* "TOTAL_PRICE_MISMATCH" */ val TOTAL_PRICE_MISMATCH: typings.shopifyBuy.mod.CheckoutErrorCode.TOTAL_PRICE_MISMATCH & String = js.native
      
      /* "UNABLE_TO_APPLY" */ val UNABLE_TO_APPLY: typings.shopifyBuy.mod.CheckoutErrorCode.UNABLE_TO_APPLY & String = js.native
    }
    
    /**
      * Collection resource
      *
      * @see https://github.com/Shopify/js-buy-sdk/blob/master/src/collection-resource.js
      */
    @JSGlobal("ShopifyBuy.CheckoutResource")
    @js.native
    open class CheckoutResource protected ()
      extends typings.shopifyBuy.mod.CheckoutResource {
      def this(client: GraphQLJSClient) = this()
    }
    
    /**
      * Collection resource
      *
      * @see https://github.com/Shopify/js-buy-sdk/blob/master/src/collection-resource.js
      */
    @JSGlobal("ShopifyBuy.CollectionResource")
    @js.native
    open class CollectionResource protected ()
      extends typings.shopifyBuy.mod.CollectionResource {
      def this(client: GraphQLJSClient) = this()
    }
    
    @JSGlobal("ShopifyBuy.CollectionSortKeys")
    @js.native
    object CollectionSortKeys extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.shopifyBuy.mod.CollectionSortKeys & String] = js.native
      
      /* "id" */ val ID: typings.shopifyBuy.mod.CollectionSortKeys.ID & String = js.native
      
      /* "query" */ val RELEVANCE: typings.shopifyBuy.mod.CollectionSortKeys.RELEVANCE & String = js.native
      
      /* "title" */ val TITLE: typings.shopifyBuy.mod.CollectionSortKeys.TITLE & String = js.native
      
      /* "updated_at" */ val UPDATED_AT: typings.shopifyBuy.mod.CollectionSortKeys.UPDATED_AT & String = js.native
    }
    
    @JSGlobal("ShopifyBuy.Config")
    @js.native
    open class Config protected ()
      extends typings.shopifyBuy.mod.Config {
      def this(attrs: ConfigAttrs) = this()
    }
    
    @JSGlobal("ShopifyBuy.CropRegion")
    @js.native
    object CropRegion extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.shopifyBuy.mod.CropRegion & String] = js.native
      
      /* "BOTTOM" */ val BOTTOM: typings.shopifyBuy.mod.CropRegion.BOTTOM & String = js.native
      
      /* "CENTER" */ val CENTER: typings.shopifyBuy.mod.CropRegion.CENTER & String = js.native
      
      /* "LEFT" */ val LEFT: typings.shopifyBuy.mod.CropRegion.LEFT & String = js.native
      
      /* "RIGHT" */ val RIGHT: typings.shopifyBuy.mod.CropRegion.RIGHT & String = js.native
      
      /* "TOP" */ val TOP: typings.shopifyBuy.mod.CropRegion.TOP & String = js.native
    }
    
    @JSGlobal("ShopifyBuy.CustomerErrorCode")
    @js.native
    object CustomerErrorCode extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.shopifyBuy.mod.CustomerErrorCode & String] = js.native
      
      /* "ALREADY_ENABLED" */ val ALREADY_ENABLED: typings.shopifyBuy.mod.CustomerErrorCode.ALREADY_ENABLED & String = js.native
      
      /* "BAD_DOMAIN" */ val BAD_DOMAIN: typings.shopifyBuy.mod.CustomerErrorCode.BAD_DOMAIN & String = js.native
      
      /* "BLANK" */ val BLANK: typings.shopifyBuy.mod.CustomerErrorCode.BLANK & String = js.native
      
      /* "CONTAINS_HTML_TAGS" */ val CONTAINS_HTML_TAGS: typings.shopifyBuy.mod.CustomerErrorCode.CONTAINS_HTML_TAGS & String = js.native
      
      /* "CONTAINS_URL" */ val CONTAINS_URL: typings.shopifyBuy.mod.CustomerErrorCode.CONTAINS_URL & String = js.native
      
      /* "CUSTOMER_DISABLED" */ val CUSTOMER_DISABLED: typings.shopifyBuy.mod.CustomerErrorCode.CUSTOMER_DISABLED & String = js.native
      
      /* "INVALID" */ val INVALID: typings.shopifyBuy.mod.CustomerErrorCode.INVALID & String = js.native
      
      /* "INVALID_MULTIPASS_REQUEST" */ val INVALID_MULTIPASS_REQUEST: typings.shopifyBuy.mod.CustomerErrorCode.INVALID_MULTIPASS_REQUEST & String = js.native
      
      /* "NOT_FOUND" */ val NOT_FOUND: typings.shopifyBuy.mod.CustomerErrorCode.NOT_FOUND & String = js.native
      
      /* "PASSWORD_STARTS_OR_ENDS_WITH_WHITESPACE" */ val PASSWORD_STARTS_OR_ENDS_WITH_WHITESPACE: typings.shopifyBuy.mod.CustomerErrorCode.PASSWORD_STARTS_OR_ENDS_WITH_WHITESPACE & String = js.native
      
      /* "TAKEN" */ val TAKEN: typings.shopifyBuy.mod.CustomerErrorCode.TAKEN & String = js.native
      
      /* "TOKEN_INVALID" */ val TOKEN_INVALID: typings.shopifyBuy.mod.CustomerErrorCode.TOKEN_INVALID & String = js.native
      
      /* "TOO_LONG" */ val TOO_LONG: typings.shopifyBuy.mod.CustomerErrorCode.TOO_LONG & String = js.native
      
      /* "TOO_SHORT" */ val TOO_SHORT: typings.shopifyBuy.mod.CustomerErrorCode.TOO_SHORT & String = js.native
      
      /* "UNIDENTIFIED_CUSTOMER" */ val UNIDENTIFIED_CUSTOMER: typings.shopifyBuy.mod.CustomerErrorCode.UNIDENTIFIED_CUSTOMER & String = js.native
    }
    
    @JSGlobal("ShopifyBuy.DeliveryMethodType")
    @js.native
    object DeliveryMethodType extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.shopifyBuy.mod.DeliveryMethodType & String] = js.native
      
      /* "LOCAL" */ val LOCAL: typings.shopifyBuy.mod.DeliveryMethodType.LOCAL & String = js.native
      
      /* "NONE" */ val NONE: typings.shopifyBuy.mod.DeliveryMethodType.NONE & String = js.native
      
      /* "PICKUP_POINT" */ val PICKUP_POINT: typings.shopifyBuy.mod.DeliveryMethodType.PICKUP_POINT & String = js.native
      
      /* "PICK_UP" */ val PICK_UP: typings.shopifyBuy.mod.DeliveryMethodType.PICK_UP & String = js.native
      
      /* "RETAIL" */ val RETAIL: typings.shopifyBuy.mod.DeliveryMethodType.RETAIL & String = js.native
      
      /* "SHIPPING" */ val SHIPPING: typings.shopifyBuy.mod.DeliveryMethodType.SHIPPING & String = js.native
    }
    
    @JSGlobal("ShopifyBuy.DigitalWallet")
    @js.native
    object DigitalWallet extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.shopifyBuy.mod.DigitalWallet & String] = js.native
      
      /* "ANDROID_PAY" */ val ANDROID_PAY: typings.shopifyBuy.mod.DigitalWallet.ANDROID_PAY & String = js.native
      
      /* "APPLE_PAY" */ val APPLE_PAY: typings.shopifyBuy.mod.DigitalWallet.APPLE_PAY & String = js.native
      
      /* "FACEBOOK_PAY" */ val FACEBOOK_PAY: typings.shopifyBuy.mod.DigitalWallet.FACEBOOK_PAY & String = js.native
      
      /* "GOOGLE_PAY" */ val GOOGLE_PAY: typings.shopifyBuy.mod.DigitalWallet.GOOGLE_PAY & String = js.native
      
      /* "SHOPIFY_PAY" */ val SHOPIFY_PAY: typings.shopifyBuy.mod.DigitalWallet.SHOPIFY_PAY & String = js.native
    }
    
    @JSGlobal("ShopifyBuy.DiscountApplicationAllocationMethod")
    @js.native
    object DiscountApplicationAllocationMethod extends StObject {
      
      @JSBracketAccess
      def apply(value: String): js.UndefOr[typings.shopifyBuy.mod.DiscountApplicationAllocationMethod & String] = js.native
      
      /* "ACROSS" */ val ACROSS: typings.shopifyBuy.mod.DiscountApplicationAllocationMethod.ACROSS & String = js.native
      
      /* "EACH" */ val EACH: typings.shopifyBuy.mod.DiscountApplicationAllocationMethod.EACH & String = js.native
      
      /* "ONE" */ val ONE: typings.shopifyBuy.mod.DiscountApplicationAllocationMethod.ONE & String = js.native
    }
    
    /**
      * Image resource
      *
      * @see https://github.com/Shopify/js-buy-sdk/blob/master/src/image-resource.js
      */
    @JSGlobal("ShopifyBuy.ImageResource")
    @js.native
    open class ImageResource protected ()
      extends typings.shopifyBuy.mod.ImageResource {
      def this(client: GraphQLJSClient) = this()
    }
    
    /**
      * Product resource
      *
      * @see https://github.com/Shopify/js-buy-sdk/blob/master/src/product-resource.js
      */
    @JSGlobal("ShopifyBuy.ProductResource")
    @js.native
    open class ProductResource protected ()
      extends typings.shopifyBuy.mod.ProductResource {
      def this(client: GraphQLJSClient) = this()
    }
    
    /**
      * Resource
      *
      * @see https://github.com/Shopify/js-buy-sdk/blob/master/src/resource.js
      */
    @JSGlobal("ShopifyBuy.Resource")
    @js.native
    open class Resource protected ()
      extends typings.shopifyBuy.mod.Resource {
      def this(client: GraphQLJSClient) = this()
    }
    
    /**
      * Shop Resource
      *
      * @see https://github.com/Shopify/js-buy-sdk/blob/master/src/shop-resource.js
      */
    @JSGlobal("ShopifyBuy.ShopResource")
    @js.native
    open class ShopResource protected ()
      extends typings.shopifyBuy.mod.ShopResource {
      def this(client: GraphQLJSClient) = this()
    }
    
    /**
      * Primary entry point for building a new Client.
      */
    /* static member */
    inline def buildClient(config: typings.shopifyBuy.mod.Config): typings.shopifyBuy.mod.ShopifyBuy = ^.asInstanceOf[js.Dynamic].applyDynamic("buildClient")(config.asInstanceOf[js.Any]).asInstanceOf[typings.shopifyBuy.mod.ShopifyBuy]
    inline def buildClient(config: typings.shopifyBuy.mod.Config, fetchFunction: FetchFunction): typings.shopifyBuy.mod.ShopifyBuy = (^.asInstanceOf[js.Dynamic].applyDynamic("buildClient")(config.asInstanceOf[js.Any], fetchFunction.asInstanceOf[js.Any])).asInstanceOf[typings.shopifyBuy.mod.ShopifyBuy]
  }
}
