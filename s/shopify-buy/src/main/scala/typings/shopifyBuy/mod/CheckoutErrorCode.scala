package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CheckoutErrorCode extends StObject
@JSImport("shopify-buy", "CheckoutErrorCode")
@js.native
object CheckoutErrorCode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CheckoutErrorCode & String] = js.native
  
  @js.native
  sealed trait ALREADY_COMPLETED
    extends StObject
       with CheckoutErrorCode
  /* "ALREADY_COMPLETED" */ val ALREADY_COMPLETED: typings.shopifyBuy.mod.CheckoutErrorCode.ALREADY_COMPLETED & String = js.native
  
  @js.native
  sealed trait BAD_DOMAIN
    extends StObject
       with CheckoutErrorCode
  /* "BAD_DOMAIN" */ val BAD_DOMAIN: typings.shopifyBuy.mod.CheckoutErrorCode.BAD_DOMAIN & String = js.native
  
  @js.native
  sealed trait BLANK
    extends StObject
       with CheckoutErrorCode
  /* "BLANK" */ val BLANK: typings.shopifyBuy.mod.CheckoutErrorCode.BLANK & String = js.native
  
  @js.native
  sealed trait CART_DOES_NOT_MEET_DISCOUNT_REQUIREMENTS_NOTICE
    extends StObject
       with CheckoutErrorCode
  /* "CART_DOES_NOT_MEET_DISCOUNT_REQUIREMENTS_NOTICE" */ val CART_DOES_NOT_MEET_DISCOUNT_REQUIREMENTS_NOTICE: typings.shopifyBuy.mod.CheckoutErrorCode.CART_DOES_NOT_MEET_DISCOUNT_REQUIREMENTS_NOTICE & String = js.native
  
  @js.native
  sealed trait CUSTOMER_ALREADY_USED_ONCE_PER_CUSTOMER_DISCOUNT_NOTICE
    extends StObject
       with CheckoutErrorCode
  /* "CUSTOMER_ALREADY_USED_ONCE_PER_CUSTOMER_DISCOUNT_NOTICE" */ val CUSTOMER_ALREADY_USED_ONCE_PER_CUSTOMER_DISCOUNT_NOTICE: typings.shopifyBuy.mod.CheckoutErrorCode.CUSTOMER_ALREADY_USED_ONCE_PER_CUSTOMER_DISCOUNT_NOTICE & String = js.native
  
  @js.native
  sealed trait DISCOUNT_ALREADY_APPLIED
    extends StObject
       with CheckoutErrorCode
  /* "DISCOUNT_ALREADY_APPLIED" */ val DISCOUNT_ALREADY_APPLIED: typings.shopifyBuy.mod.CheckoutErrorCode.DISCOUNT_ALREADY_APPLIED & String = js.native
  
  @js.native
  sealed trait DISCOUNT_DISABLED
    extends StObject
       with CheckoutErrorCode
  /* "DISCOUNT_DISABLED" */ val DISCOUNT_DISABLED: typings.shopifyBuy.mod.CheckoutErrorCode.DISCOUNT_DISABLED & String = js.native
  
  @js.native
  sealed trait DISCOUNT_EXPIRED
    extends StObject
       with CheckoutErrorCode
  /* "DISCOUNT_EXPIRED" */ val DISCOUNT_EXPIRED: typings.shopifyBuy.mod.CheckoutErrorCode.DISCOUNT_EXPIRED & String = js.native
  
  @js.native
  sealed trait DISCOUNT_LIMIT_REACHED
    extends StObject
       with CheckoutErrorCode
  /* "DISCOUNT_LIMIT_REACHED" */ val DISCOUNT_LIMIT_REACHED: typings.shopifyBuy.mod.CheckoutErrorCode.DISCOUNT_LIMIT_REACHED & String = js.native
  
  @js.native
  sealed trait DISCOUNT_NOT_FOUND
    extends StObject
       with CheckoutErrorCode
  /* "DISCOUNT_NOT_FOUND" */ val DISCOUNT_NOT_FOUND: typings.shopifyBuy.mod.CheckoutErrorCode.DISCOUNT_NOT_FOUND & String = js.native
  
  @js.native
  sealed trait EMPTY
    extends StObject
       with CheckoutErrorCode
  /* "EMPTY" */ val EMPTY: typings.shopifyBuy.mod.CheckoutErrorCode.EMPTY & String = js.native
  
  @js.native
  sealed trait EXPIRED_QUEUE_TOKEN
    extends StObject
       with CheckoutErrorCode
  /* "EXPIRED_QUEUE_TOKEN" */ val EXPIRED_QUEUE_TOKEN: typings.shopifyBuy.mod.CheckoutErrorCode.EXPIRED_QUEUE_TOKEN & String = js.native
  
  @js.native
  sealed trait GIFT_CARD_ALREADY_APPLIED
    extends StObject
       with CheckoutErrorCode
  /* "GIFT_CARD_ALREADY_APPLIED" */ val GIFT_CARD_ALREADY_APPLIED: typings.shopifyBuy.mod.CheckoutErrorCode.GIFT_CARD_ALREADY_APPLIED & String = js.native
  
  @js.native
  sealed trait GIFT_CARD_CODE_INVALID
    extends StObject
       with CheckoutErrorCode
  /* "GIFT_CARD_CODE_INVALID" */ val GIFT_CARD_CODE_INVALID: typings.shopifyBuy.mod.CheckoutErrorCode.GIFT_CARD_CODE_INVALID & String = js.native
  
  @js.native
  sealed trait GIFT_CARD_CURRENCY_MISMATCH
    extends StObject
       with CheckoutErrorCode
  /* "GIFT_CARD_CURRENCY_MISMATCH" */ val GIFT_CARD_CURRENCY_MISMATCH: typings.shopifyBuy.mod.CheckoutErrorCode.GIFT_CARD_CURRENCY_MISMATCH & String = js.native
  
  @js.native
  sealed trait GIFT_CARD_DEPLETED
    extends StObject
       with CheckoutErrorCode
  /* "GIFT_CARD_DEPLETED" */ val GIFT_CARD_DEPLETED: typings.shopifyBuy.mod.CheckoutErrorCode.GIFT_CARD_DEPLETED & String = js.native
  
  @js.native
  sealed trait GIFT_CARD_DISABLED
    extends StObject
       with CheckoutErrorCode
  /* "GIFT_CARD_DISABLED" */ val GIFT_CARD_DISABLED: typings.shopifyBuy.mod.CheckoutErrorCode.GIFT_CARD_DISABLED & String = js.native
  
  @js.native
  sealed trait GIFT_CARD_EXPIRED
    extends StObject
       with CheckoutErrorCode
  /* "GIFT_CARD_EXPIRED" */ val GIFT_CARD_EXPIRED: typings.shopifyBuy.mod.CheckoutErrorCode.GIFT_CARD_EXPIRED & String = js.native
  
  @js.native
  sealed trait GIFT_CARD_NOT_FOUND
    extends StObject
       with CheckoutErrorCode
  /* "GIFT_CARD_NOT_FOUND" */ val GIFT_CARD_NOT_FOUND: typings.shopifyBuy.mod.CheckoutErrorCode.GIFT_CARD_NOT_FOUND & String = js.native
  
  @js.native
  sealed trait GIFT_CARD_UNUSABLE
    extends StObject
       with CheckoutErrorCode
  /* "GIFT_CARD_UNUSABLE" */ val GIFT_CARD_UNUSABLE: typings.shopifyBuy.mod.CheckoutErrorCode.GIFT_CARD_UNUSABLE & String = js.native
  
  @js.native
  sealed trait GREATER_THAN_OR_EQUAL_TO
    extends StObject
       with CheckoutErrorCode
  /* "GREATER_THAN_OR_EQUAL_TO" */ val GREATER_THAN_OR_EQUAL_TO: typings.shopifyBuy.mod.CheckoutErrorCode.GREATER_THAN_OR_EQUAL_TO & String = js.native
  
  @js.native
  sealed trait HIGHER_VALUE_DISCOUNT_APPLIED
    extends StObject
       with CheckoutErrorCode
  /* "HIGHER_VALUE_DISCOUNT_APPLIED" */ val HIGHER_VALUE_DISCOUNT_APPLIED: typings.shopifyBuy.mod.CheckoutErrorCode.HIGHER_VALUE_DISCOUNT_APPLIED & String = js.native
  
  @js.native
  sealed trait INVALID
    extends StObject
       with CheckoutErrorCode
  /* "INVALID" */ val INVALID: typings.shopifyBuy.mod.CheckoutErrorCode.INVALID & String = js.native
  
  @js.native
  sealed trait INVALID_COUNTRY_AND_CURRENCY
    extends StObject
       with CheckoutErrorCode
  /* "INVALID_COUNTRY_AND_CURRENCY" */ val INVALID_COUNTRY_AND_CURRENCY: typings.shopifyBuy.mod.CheckoutErrorCode.INVALID_COUNTRY_AND_CURRENCY & String = js.native
  
  @js.native
  sealed trait INVALID_FOR_COUNTRY
    extends StObject
       with CheckoutErrorCode
  /* "INVALID_FOR_COUNTRY" */ val INVALID_FOR_COUNTRY: typings.shopifyBuy.mod.CheckoutErrorCode.INVALID_FOR_COUNTRY & String = js.native
  
  @js.native
  sealed trait INVALID_FOR_COUNTRY_AND_PROVINCE
    extends StObject
       with CheckoutErrorCode
  /* "INVALID_FOR_COUNTRY_AND_PROVINCE" */ val INVALID_FOR_COUNTRY_AND_PROVINCE: typings.shopifyBuy.mod.CheckoutErrorCode.INVALID_FOR_COUNTRY_AND_PROVINCE & String = js.native
  
  @js.native
  sealed trait INVALID_PROVINCE_IN_COUNTRY
    extends StObject
       with CheckoutErrorCode
  /* "INVALID_PROVINCE_IN_COUNTRY" */ val INVALID_PROVINCE_IN_COUNTRY: typings.shopifyBuy.mod.CheckoutErrorCode.INVALID_PROVINCE_IN_COUNTRY & String = js.native
  
  @js.native
  sealed trait INVALID_QUEUE_TOKEN
    extends StObject
       with CheckoutErrorCode
  /* "INVALID_QUEUE_TOKEN" */ val INVALID_QUEUE_TOKEN: typings.shopifyBuy.mod.CheckoutErrorCode.INVALID_QUEUE_TOKEN & String = js.native
  
  @js.native
  sealed trait INVALID_REGION_IN_COUNTRY
    extends StObject
       with CheckoutErrorCode
  /* "INVALID_REGION_IN_COUNTRY" */ val INVALID_REGION_IN_COUNTRY: typings.shopifyBuy.mod.CheckoutErrorCode.INVALID_REGION_IN_COUNTRY & String = js.native
  
  @js.native
  sealed trait INVALID_STATE_IN_COUNTRY
    extends StObject
       with CheckoutErrorCode
  /* "INVALID_STATE_IN_COUNTRY" */ val INVALID_STATE_IN_COUNTRY: typings.shopifyBuy.mod.CheckoutErrorCode.INVALID_STATE_IN_COUNTRY & String = js.native
  
  @js.native
  sealed trait LESS_THAN
    extends StObject
       with CheckoutErrorCode
  /* "LESS_THAN" */ val LESS_THAN: typings.shopifyBuy.mod.CheckoutErrorCode.LESS_THAN & String = js.native
  
  @js.native
  sealed trait LESS_THAN_OR_EQUAL_TO
    extends StObject
       with CheckoutErrorCode
  /* "LESS_THAN_OR_EQUAL_TO" */ val LESS_THAN_OR_EQUAL_TO: typings.shopifyBuy.mod.CheckoutErrorCode.LESS_THAN_OR_EQUAL_TO & String = js.native
  
  @js.native
  sealed trait LINE_ITEM_NOT_FOUND
    extends StObject
       with CheckoutErrorCode
  /* "LINE_ITEM_NOT_FOUND" */ val LINE_ITEM_NOT_FOUND: typings.shopifyBuy.mod.CheckoutErrorCode.LINE_ITEM_NOT_FOUND & String = js.native
  
  @js.native
  sealed trait LOCKED
    extends StObject
       with CheckoutErrorCode
  /* "LOCKED" */ val LOCKED: typings.shopifyBuy.mod.CheckoutErrorCode.LOCKED & String = js.native
  
  @js.native
  sealed trait MAXIMUM_DISCOUNT_CODE_LIMIT_REACHED
    extends StObject
       with CheckoutErrorCode
  /* "MAXIMUM_DISCOUNT_CODE_LIMIT_REACHED" */ val MAXIMUM_DISCOUNT_CODE_LIMIT_REACHED: typings.shopifyBuy.mod.CheckoutErrorCode.MAXIMUM_DISCOUNT_CODE_LIMIT_REACHED & String = js.native
  
  @js.native
  sealed trait MISSING_PAYMENT_INPUT
    extends StObject
       with CheckoutErrorCode
  /* "MISSING_PAYMENT_INPUT" */ val MISSING_PAYMENT_INPUT: typings.shopifyBuy.mod.CheckoutErrorCode.MISSING_PAYMENT_INPUT & String = js.native
  
  @js.native
  sealed trait NOT_ENOUGH_IN_STOCK
    extends StObject
       with CheckoutErrorCode
  /* "NOT_ENOUGH_IN_STOCK" */ val NOT_ENOUGH_IN_STOCK: typings.shopifyBuy.mod.CheckoutErrorCode.NOT_ENOUGH_IN_STOCK & String = js.native
  
  @js.native
  sealed trait NOT_SUPPORTED
    extends StObject
       with CheckoutErrorCode
  /* "NOT_SUPPORTED" */ val NOT_SUPPORTED: typings.shopifyBuy.mod.CheckoutErrorCode.NOT_SUPPORTED & String = js.native
  
  @js.native
  sealed trait PRESENT
    extends StObject
       with CheckoutErrorCode
  /* "PRESENT" */ val PRESENT: typings.shopifyBuy.mod.CheckoutErrorCode.PRESENT & String = js.native
  
  @js.native
  sealed trait PRODUCT_NOT_AVAILABLE
    extends StObject
       with CheckoutErrorCode
  /* "PRODUCT_NOT_AVAILABLE" */ val PRODUCT_NOT_AVAILABLE: typings.shopifyBuy.mod.CheckoutErrorCode.PRODUCT_NOT_AVAILABLE & String = js.native
  
  @js.native
  sealed trait SHIPPING_RATE_EXPIRED
    extends StObject
       with CheckoutErrorCode
  /* "SHIPPING_RATE_EXPIRED" */ val SHIPPING_RATE_EXPIRED: typings.shopifyBuy.mod.CheckoutErrorCode.SHIPPING_RATE_EXPIRED & String = js.native
  
  @js.native
  sealed trait THROTTLED_DURING_CHECKOUT
    extends StObject
       with CheckoutErrorCode
  /* "THROTTLED_DURING_CHECKOUT" */ val THROTTLED_DURING_CHECKOUT: typings.shopifyBuy.mod.CheckoutErrorCode.THROTTLED_DURING_CHECKOUT & String = js.native
  
  @js.native
  sealed trait TOO_LONG
    extends StObject
       with CheckoutErrorCode
  /* "TOO_LONG" */ val TOO_LONG: typings.shopifyBuy.mod.CheckoutErrorCode.TOO_LONG & String = js.native
  
  @js.native
  sealed trait TOTAL_PRICE_MISMATCH
    extends StObject
       with CheckoutErrorCode
  /* "TOTAL_PRICE_MISMATCH" */ val TOTAL_PRICE_MISMATCH: typings.shopifyBuy.mod.CheckoutErrorCode.TOTAL_PRICE_MISMATCH & String = js.native
  
  @js.native
  sealed trait UNABLE_TO_APPLY
    extends StObject
       with CheckoutErrorCode
  /* "UNABLE_TO_APPLY" */ val UNABLE_TO_APPLY: typings.shopifyBuy.mod.CheckoutErrorCode.UNABLE_TO_APPLY & String = js.native
}
