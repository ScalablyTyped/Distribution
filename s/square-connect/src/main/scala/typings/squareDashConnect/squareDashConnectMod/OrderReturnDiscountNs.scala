package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.OrderReturnDiscountNs.ScopeEnum
import typings.squareDashConnect.squareDashConnectMod.OrderReturnDiscountNs.TypeEnum
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
    sealed trait LINE_ITEM extends ScopeEnum
    
    @js.native
    sealed trait ORDER extends ScopeEnum
    
    @js.native
    sealed trait OTHER_DISCOUNT_SCOPE extends ScopeEnum
    
    /* "LINE_ITEM" */ val LINE_ITEM: typings.squareDashConnect.squareDashConnectMod.OrderReturnDiscountNs.ScopeEnum.LINE_ITEM with String = js.native
    /* "ORDER" */ val ORDER: typings.squareDashConnect.squareDashConnectMod.OrderReturnDiscountNs.ScopeEnum.ORDER with String = js.native
    /* "OTHER_DISCOUNT_SCOPE" */ val OTHER_DISCOUNT_SCOPE: typings.squareDashConnect.squareDashConnectMod.OrderReturnDiscountNs.ScopeEnum.OTHER_DISCOUNT_SCOPE with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[ScopeEnum with String] = js.native
  }
  
  @js.native
  object TypeEnum extends js.Object {
    @js.native
    sealed trait FIXED_AMOUNT extends TypeEnum
    
    @js.native
    sealed trait FIXED_PERCENTAGE extends TypeEnum
    
    @js.native
    sealed trait UNKNOWN_DISCOUNT extends TypeEnum
    
    @js.native
    sealed trait VARIABLE_AMOUNT extends TypeEnum
    
    @js.native
    sealed trait VARIABLE_PERCENTAGE extends TypeEnum
    
    /* "FIXED_AMOUNT" */ val FIXED_AMOUNT: typings.squareDashConnect.squareDashConnectMod.OrderReturnDiscountNs.TypeEnum.FIXED_AMOUNT with String = js.native
    /* "FIXED_PERCENTAGE" */ val FIXED_PERCENTAGE: typings.squareDashConnect.squareDashConnectMod.OrderReturnDiscountNs.TypeEnum.FIXED_PERCENTAGE with String = js.native
    /* "UNKNOWN_DISCOUNT" */ val UNKNOWN_DISCOUNT: typings.squareDashConnect.squareDashConnectMod.OrderReturnDiscountNs.TypeEnum.UNKNOWN_DISCOUNT with String = js.native
    /* "VARIABLE_AMOUNT" */ val VARIABLE_AMOUNT: typings.squareDashConnect.squareDashConnectMod.OrderReturnDiscountNs.TypeEnum.VARIABLE_AMOUNT with String = js.native
    /* "VARIABLE_PERCENTAGE" */ val VARIABLE_PERCENTAGE: typings.squareDashConnect.squareDashConnectMod.OrderReturnDiscountNs.TypeEnum.VARIABLE_PERCENTAGE with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TypeEnum with String] = js.native
  }
  
}

