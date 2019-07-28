package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.CreateOrderRequestTaxNs.TypeEnum
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
    sealed trait ADDITIVE extends TypeEnum
    
    @js.native
    sealed trait INCLUSIVE extends TypeEnum
    
    @js.native
    sealed trait UNKNOWN_TAX extends TypeEnum
    
    /* "ADDITIVE" */ val ADDITIVE: typings.squareDashConnect.squareDashConnectMod.CreateOrderRequestTaxNs.TypeEnum.ADDITIVE with String = js.native
    /* "INCLUSIVE" */ val INCLUSIVE: typings.squareDashConnect.squareDashConnectMod.CreateOrderRequestTaxNs.TypeEnum.INCLUSIVE with String = js.native
    /* "UNKNOWN_TAX" */ val UNKNOWN_TAX: typings.squareDashConnect.squareDashConnectMod.CreateOrderRequestTaxNs.TypeEnum.UNKNOWN_TAX with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TypeEnum with String] = js.native
  }
  
}

