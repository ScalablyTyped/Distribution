package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "OrderLineItemDiscount")
@js.native
object OrderLineItemDiscountNs extends js.Object {
  @js.native
  sealed trait ScopeEnum extends js.Object
  
  @js.native
  sealed trait TypeEnum extends js.Object
  
  @js.native
  object ScopeEnum extends js.Object {
    @js.native
    sealed trait LINEITEM
      extends squareDashConnectLib.squareDashConnectMod.OrderLineItemDiscountNs.ScopeEnum
    
    @js.native
    sealed trait ORDER
      extends squareDashConnectLib.squareDashConnectMod.OrderLineItemDiscountNs.ScopeEnum
    
    @js.native
    sealed trait OTHERDISCOUNTSCOPE
      extends squareDashConnectLib.squareDashConnectMod.OrderLineItemDiscountNs.ScopeEnum
    
    /* "LINE_ITEM" */ val LINEITEM: LINEITEM with java.lang.String = js.native
    /* "ORDER" */ val ORDER: ORDER with java.lang.String = js.native
    /* "OTHER_DISCOUNT_SCOPE" */ val OTHERDISCOUNTSCOPE: OTHERDISCOUNTSCOPE with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.OrderLineItemDiscountNs.ScopeEnum with java.lang.String
      ] = js.native
  }
  
  @js.native
  object TypeEnum extends js.Object {
    @js.native
    sealed trait FIXEDAMOUNT
      extends squareDashConnectLib.squareDashConnectMod.OrderLineItemDiscountNs.TypeEnum
    
    @js.native
    sealed trait FIXEDPERCENTAGE
      extends squareDashConnectLib.squareDashConnectMod.OrderLineItemDiscountNs.TypeEnum
    
    @js.native
    sealed trait UNKNOWNDISCOUNT
      extends squareDashConnectLib.squareDashConnectMod.OrderLineItemDiscountNs.TypeEnum
    
    @js.native
    sealed trait VARIABLEAMOUNT
      extends squareDashConnectLib.squareDashConnectMod.OrderLineItemDiscountNs.TypeEnum
    
    @js.native
    sealed trait VARIABLEPERCENTAGE
      extends squareDashConnectLib.squareDashConnectMod.OrderLineItemDiscountNs.TypeEnum
    
    /* "FIXED_AMOUNT" */ val FIXEDAMOUNT: FIXEDAMOUNT with java.lang.String = js.native
    /* "FIXED_PERCENTAGE" */ val FIXEDPERCENTAGE: FIXEDPERCENTAGE with java.lang.String = js.native
    /* "UNKNOWN_DISCOUNT" */ val UNKNOWNDISCOUNT: UNKNOWNDISCOUNT with java.lang.String = js.native
    /* "VARIABLE_AMOUNT" */ val VARIABLEAMOUNT: VARIABLEAMOUNT with java.lang.String = js.native
    /* "VARIABLE_PERCENTAGE" */ val VARIABLEPERCENTAGE: VARIABLEPERCENTAGE with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.OrderLineItemDiscountNs.TypeEnum with java.lang.String
      ] = js.native
  }
  
}

