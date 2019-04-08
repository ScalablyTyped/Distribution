package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1PaymentTax")
@js.native
object V1PaymentTaxNs extends js.Object {
  @js.native
  sealed trait InclusionTypeEnum extends js.Object
  
  @js.native
  object InclusionTypeEnum extends js.Object {
    @js.native
    sealed trait ADDITIVE
      extends squareDashConnectLib.squareDashConnectMod.V1PaymentTaxNs.InclusionTypeEnum
    
    @js.native
    sealed trait INCLUSIVE
      extends squareDashConnectLib.squareDashConnectMod.V1PaymentTaxNs.InclusionTypeEnum
    
    /* "ADDITIVE" */ val ADDITIVE: ADDITIVE with java.lang.String = js.native
    /* "INCLUSIVE" */ val INCLUSIVE: INCLUSIVE with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.V1PaymentTaxNs.InclusionTypeEnum with java.lang.String
      ] = js.native
  }
  
}

