package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CustomerErrorCode extends StObject
@JSImport("shopify-buy", "CustomerErrorCode")
@js.native
object CustomerErrorCode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CustomerErrorCode & String] = js.native
  
  @js.native
  sealed trait ALREADY_ENABLED
    extends StObject
       with CustomerErrorCode
  /* "ALREADY_ENABLED" */ val ALREADY_ENABLED: typings.shopifyBuy.mod.CustomerErrorCode.ALREADY_ENABLED & String = js.native
  
  @js.native
  sealed trait BAD_DOMAIN
    extends StObject
       with CustomerErrorCode
  /* "BAD_DOMAIN" */ val BAD_DOMAIN: typings.shopifyBuy.mod.CustomerErrorCode.BAD_DOMAIN & String = js.native
  
  @js.native
  sealed trait BLANK
    extends StObject
       with CustomerErrorCode
  /* "BLANK" */ val BLANK: typings.shopifyBuy.mod.CustomerErrorCode.BLANK & String = js.native
  
  @js.native
  sealed trait CONTAINS_HTML_TAGS
    extends StObject
       with CustomerErrorCode
  /* "CONTAINS_HTML_TAGS" */ val CONTAINS_HTML_TAGS: typings.shopifyBuy.mod.CustomerErrorCode.CONTAINS_HTML_TAGS & String = js.native
  
  @js.native
  sealed trait CONTAINS_URL
    extends StObject
       with CustomerErrorCode
  /* "CONTAINS_URL" */ val CONTAINS_URL: typings.shopifyBuy.mod.CustomerErrorCode.CONTAINS_URL & String = js.native
  
  @js.native
  sealed trait CUSTOMER_DISABLED
    extends StObject
       with CustomerErrorCode
  /* "CUSTOMER_DISABLED" */ val CUSTOMER_DISABLED: typings.shopifyBuy.mod.CustomerErrorCode.CUSTOMER_DISABLED & String = js.native
  
  @js.native
  sealed trait INVALID
    extends StObject
       with CustomerErrorCode
  /* "INVALID" */ val INVALID: typings.shopifyBuy.mod.CustomerErrorCode.INVALID & String = js.native
  
  @js.native
  sealed trait INVALID_MULTIPASS_REQUEST
    extends StObject
       with CustomerErrorCode
  /* "INVALID_MULTIPASS_REQUEST" */ val INVALID_MULTIPASS_REQUEST: typings.shopifyBuy.mod.CustomerErrorCode.INVALID_MULTIPASS_REQUEST & String = js.native
  
  @js.native
  sealed trait NOT_FOUND
    extends StObject
       with CustomerErrorCode
  /* "NOT_FOUND" */ val NOT_FOUND: typings.shopifyBuy.mod.CustomerErrorCode.NOT_FOUND & String = js.native
  
  @js.native
  sealed trait PASSWORD_STARTS_OR_ENDS_WITH_WHITESPACE
    extends StObject
       with CustomerErrorCode
  /* "PASSWORD_STARTS_OR_ENDS_WITH_WHITESPACE" */ val PASSWORD_STARTS_OR_ENDS_WITH_WHITESPACE: typings.shopifyBuy.mod.CustomerErrorCode.PASSWORD_STARTS_OR_ENDS_WITH_WHITESPACE & String = js.native
  
  @js.native
  sealed trait TAKEN
    extends StObject
       with CustomerErrorCode
  /* "TAKEN" */ val TAKEN: typings.shopifyBuy.mod.CustomerErrorCode.TAKEN & String = js.native
  
  @js.native
  sealed trait TOKEN_INVALID
    extends StObject
       with CustomerErrorCode
  /* "TOKEN_INVALID" */ val TOKEN_INVALID: typings.shopifyBuy.mod.CustomerErrorCode.TOKEN_INVALID & String = js.native
  
  @js.native
  sealed trait TOO_LONG
    extends StObject
       with CustomerErrorCode
  /* "TOO_LONG" */ val TOO_LONG: typings.shopifyBuy.mod.CustomerErrorCode.TOO_LONG & String = js.native
  
  @js.native
  sealed trait TOO_SHORT
    extends StObject
       with CustomerErrorCode
  /* "TOO_SHORT" */ val TOO_SHORT: typings.shopifyBuy.mod.CustomerErrorCode.TOO_SHORT & String = js.native
  
  @js.native
  sealed trait UNIDENTIFIED_CUSTOMER
    extends StObject
       with CustomerErrorCode
  /* "UNIDENTIFIED_CUSTOMER" */ val UNIDENTIFIED_CUSTOMER: typings.shopifyBuy.mod.CustomerErrorCode.UNIDENTIFIED_CUSTOMER & String = js.native
}
