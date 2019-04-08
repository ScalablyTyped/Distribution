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
    sealed trait LINEITEM
      extends squareDashConnectLib.squareDashConnectMod.OrderLineItemTaxNs.ScopeEnum
    
    @js.native
    sealed trait ORDER
      extends squareDashConnectLib.squareDashConnectMod.OrderLineItemTaxNs.ScopeEnum
    
    @js.native
    sealed trait OTHERTAXSCOPE
      extends squareDashConnectLib.squareDashConnectMod.OrderLineItemTaxNs.ScopeEnum
    
    /* "LINE_ITEM" */ val LINEITEM: LINEITEM with java.lang.String = js.native
    /* "ORDER" */ val ORDER: ORDER with java.lang.String = js.native
    /* "OTHER_TAX_SCOPE" */ val OTHERTAXSCOPE: OTHERTAXSCOPE with java.lang.String = js.native
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
    sealed trait UNKNOWNTAX
      extends squareDashConnectLib.squareDashConnectMod.OrderLineItemTaxNs.TypeEnum
    
    /* "ADDITIVE" */ val ADDITIVE: ADDITIVE with java.lang.String = js.native
    /* "INCLUSIVE" */ val INCLUSIVE: INCLUSIVE with java.lang.String = js.native
    /* "UNKNOWN_TAX" */ val UNKNOWNTAX: UNKNOWNTAX with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.OrderLineItemTaxNs.TypeEnum with java.lang.String
      ] = js.native
  }
  
}

