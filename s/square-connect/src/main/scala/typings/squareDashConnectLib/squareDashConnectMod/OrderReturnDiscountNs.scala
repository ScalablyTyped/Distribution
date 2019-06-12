package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "OrderReturnDiscount")
@js.native
object OrderReturnDiscountNs extends js.Object {
  @js.native
  sealed trait ScopeEnum extends js.Object
  
  @js.native
  sealed trait TypeEnum extends js.Object
  
  @js.native
  object ScopeEnum extends js.Object {
    @js.native
    sealed trait LINE_ITEM
      extends squareDashConnectLib.squareDashConnectMod.OrderReturnDiscountNs.ScopeEnum
    
    @js.native
    sealed trait ORDER
      extends squareDashConnectLib.squareDashConnectMod.OrderReturnDiscountNs.ScopeEnum
    
    @js.native
    sealed trait OTHER_DISCOUNT_SCOPE
      extends squareDashConnectLib.squareDashConnectMod.OrderReturnDiscountNs.ScopeEnum
    
    /* "LINE_ITEM" */ val LINE_ITEM: LINE_ITEM with java.lang.String = js.native
    /* "ORDER" */ val ORDER: ORDER with java.lang.String = js.native
    /* "OTHER_DISCOUNT_SCOPE" */ val OTHER_DISCOUNT_SCOPE: OTHER_DISCOUNT_SCOPE with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.OrderReturnDiscountNs.ScopeEnum with java.lang.String
      ] = js.native
  }
  
  @js.native
  object TypeEnum extends js.Object {
    @js.native
    sealed trait FIXED_AMOUNT
      extends squareDashConnectLib.squareDashConnectMod.OrderReturnDiscountNs.TypeEnum
    
    @js.native
    sealed trait FIXED_PERCENTAGE
      extends squareDashConnectLib.squareDashConnectMod.OrderReturnDiscountNs.TypeEnum
    
    @js.native
    sealed trait UNKNOWN_DISCOUNT
      extends squareDashConnectLib.squareDashConnectMod.OrderReturnDiscountNs.TypeEnum
    
    @js.native
    sealed trait VARIABLE_AMOUNT
      extends squareDashConnectLib.squareDashConnectMod.OrderReturnDiscountNs.TypeEnum
    
    @js.native
    sealed trait VARIABLE_PERCENTAGE
      extends squareDashConnectLib.squareDashConnectMod.OrderReturnDiscountNs.TypeEnum
    
    /* "FIXED_AMOUNT" */ val FIXED_AMOUNT: FIXED_AMOUNT with java.lang.String = js.native
    /* "FIXED_PERCENTAGE" */ val FIXED_PERCENTAGE: FIXED_PERCENTAGE with java.lang.String = js.native
    /* "UNKNOWN_DISCOUNT" */ val UNKNOWN_DISCOUNT: UNKNOWN_DISCOUNT with java.lang.String = js.native
    /* "VARIABLE_AMOUNT" */ val VARIABLE_AMOUNT: VARIABLE_AMOUNT with java.lang.String = js.native
    /* "VARIABLE_PERCENTAGE" */ val VARIABLE_PERCENTAGE: VARIABLE_PERCENTAGE with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.OrderReturnDiscountNs.TypeEnum with java.lang.String
      ] = js.native
  }
  
}

