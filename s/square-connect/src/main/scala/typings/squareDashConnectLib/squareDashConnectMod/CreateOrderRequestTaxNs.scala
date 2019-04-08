package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "CreateOrderRequestTax")
@js.native
object CreateOrderRequestTaxNs extends js.Object {
  @js.native
  sealed trait TypeEnum extends js.Object
  
  @js.native
  object TypeEnum extends js.Object {
    @js.native
    sealed trait ADDITIVE
      extends squareDashConnectLib.squareDashConnectMod.CreateOrderRequestTaxNs.TypeEnum
    
    @js.native
    sealed trait INCLUSIVE
      extends squareDashConnectLib.squareDashConnectMod.CreateOrderRequestTaxNs.TypeEnum
    
    @js.native
    sealed trait UNKNOWNTAX
      extends squareDashConnectLib.squareDashConnectMod.CreateOrderRequestTaxNs.TypeEnum
    
    /* "ADDITIVE" */ val ADDITIVE: ADDITIVE with java.lang.String = js.native
    /* "INCLUSIVE" */ val INCLUSIVE: INCLUSIVE with java.lang.String = js.native
    /* "UNKNOWN_TAX" */ val UNKNOWNTAX: UNKNOWNTAX with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.CreateOrderRequestTaxNs.TypeEnum with java.lang.String
      ] = js.native
  }
  
}

