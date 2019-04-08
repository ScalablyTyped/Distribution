package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1PaymentSurcharge")
@js.native
object V1PaymentSurchargeNs extends js.Object {
  @js.native
  sealed trait TypeEnum extends js.Object
  
  @js.native
  object TypeEnum extends js.Object {
    @js.native
    sealed trait AUTOGRATUITY
      extends squareDashConnectLib.squareDashConnectMod.V1PaymentSurchargeNs.TypeEnum
    
    @js.native
    sealed trait CUSTOM
      extends squareDashConnectLib.squareDashConnectMod.V1PaymentSurchargeNs.TypeEnum
    
    @js.native
    sealed trait UNKNOWN
      extends squareDashConnectLib.squareDashConnectMod.V1PaymentSurchargeNs.TypeEnum
    
    /* "AUTO_GRATUITY" */ val AUTOGRATUITY: AUTOGRATUITY with java.lang.String = js.native
    /* "CUSTOM" */ val CUSTOM: CUSTOM with java.lang.String = js.native
    /* "UNKNOWN" */ val UNKNOWN: UNKNOWN with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.V1PaymentSurchargeNs.TypeEnum with java.lang.String
      ] = js.native
  }
  
}

