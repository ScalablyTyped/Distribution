package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait CartErrorCode extends StObject
@JSImport("shopify-buy", "CartErrorCode")
@js.native
object CartErrorCode extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CartErrorCode & String] = js.native
  
  @js.native
  sealed trait INVALID
    extends StObject
       with CartErrorCode
  /* "INVALID" */ val INVALID: typings.shopifyBuy.mod.CartErrorCode.INVALID & String = js.native
  
  @js.native
  sealed trait INVALID_MERCHANDISE_LINE
    extends StObject
       with CartErrorCode
  /* "INVALID_MERCHANDISE_LINE" */ val INVALID_MERCHANDISE_LINE: typings.shopifyBuy.mod.CartErrorCode.INVALID_MERCHANDISE_LINE & String = js.native
  
  @js.native
  sealed trait LESS_THAN
    extends StObject
       with CartErrorCode
  /* "LESS_THAN" */ val LESS_THAN: typings.shopifyBuy.mod.CartErrorCode.LESS_THAN & String = js.native
  
  @js.native
  sealed trait MISSING_DISCOUNT_CODE
    extends StObject
       with CartErrorCode
  /* "MISSING_DISCOUNT_CODE" */ val MISSING_DISCOUNT_CODE: typings.shopifyBuy.mod.CartErrorCode.MISSING_DISCOUNT_CODE & String = js.native
  
  @js.native
  sealed trait MISSING_NOTE
    extends StObject
       with CartErrorCode
  /* "MISSING_NOTE" */ val MISSING_NOTE: typings.shopifyBuy.mod.CartErrorCode.MISSING_NOTE & String = js.native
}
