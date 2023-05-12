package typings.shopifyBuy.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DiscountApplicationAllocationMethod extends StObject
@JSImport("shopify-buy", "DiscountApplicationAllocationMethod")
@js.native
object DiscountApplicationAllocationMethod extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DiscountApplicationAllocationMethod & String] = js.native
  
  @js.native
  sealed trait ACROSS
    extends StObject
       with DiscountApplicationAllocationMethod
  /* "ACROSS" */ val ACROSS: typings.shopifyBuy.mod.DiscountApplicationAllocationMethod.ACROSS & String = js.native
  
  @js.native
  sealed trait EACH
    extends StObject
       with DiscountApplicationAllocationMethod
  /* "EACH" */ val EACH: typings.shopifyBuy.mod.DiscountApplicationAllocationMethod.EACH & String = js.native
  
  /**
    * @deprecated
    */
  @js.native
  sealed trait ONE
    extends StObject
       with DiscountApplicationAllocationMethod
  /* "ONE" */ val ONE: typings.shopifyBuy.mod.DiscountApplicationAllocationMethod.ONE & String = js.native
}
