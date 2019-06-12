package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "OrderLineItemTax")
@js.native
object OrderLineItemTaxNs extends js.Object {
  @js.native
  sealed trait ScopeEnum extends js.Object
  
  @js.native
  sealed trait TypeEnum extends js.Object
  
  @js.native
  object ScopeEnum extends js.Object {
    @js.native
    sealed trait LINE_ITEM
      extends squareDashConnectLib.squareDashConnectMod.OrderLineItemTaxNs.ScopeEnum
    
    @js.native
    sealed trait ORDER
      extends squareDashConnectLib.squareDashConnectMod.OrderLineItemTaxNs.ScopeEnum
    
    @js.native
    sealed trait OTHER_TAX_SCOPE
      extends squareDashConnectLib.squareDashConnectMod.OrderLineItemTaxNs.ScopeEnum
    
    /* "LINE_ITEM" */ val LINE_ITEM: LINE_ITEM with java.lang.String = js.native
    /* "ORDER" */ val ORDER: ORDER with java.lang.String = js.native
    /* "OTHER_TAX_SCOPE" */ val OTHER_TAX_SCOPE: OTHER_TAX_SCOPE with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.OrderLineItemTaxNs.ScopeEnum with java.lang.String
      ] = js.native
  }
  
  @js.native
  object TypeEnum extends js.Object {
    @js.native
    sealed trait ADDITIVE
      extends squareDashConnectLib.squareDashConnectMod.OrderLineItemTaxNs.TypeEnum
    
    @js.native
    sealed trait INCLUSIVE
      extends squareDashConnectLib.squareDashConnectMod.OrderLineItemTaxNs.TypeEnum
    
    @js.native
    sealed trait UNKNOWN_TAX
      extends squareDashConnectLib.squareDashConnectMod.OrderLineItemTaxNs.TypeEnum
    
    /* "ADDITIVE" */ val ADDITIVE: ADDITIVE with java.lang.String = js.native
    /* "INCLUSIVE" */ val INCLUSIVE: INCLUSIVE with java.lang.String = js.native
    /* "UNKNOWN_TAX" */ val UNKNOWN_TAX: UNKNOWN_TAX with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.OrderLineItemTaxNs.TypeEnum with java.lang.String
      ] = js.native
  }
  
}

