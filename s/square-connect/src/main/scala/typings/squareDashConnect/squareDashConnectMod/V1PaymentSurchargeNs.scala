package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.V1PaymentSurchargeNs.TypeEnum
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
    sealed trait AUTO_GRATUITY extends TypeEnum
    
    @js.native
    sealed trait CUSTOM extends TypeEnum
    
    @js.native
    sealed trait UNKNOWN extends TypeEnum
    
    /* "AUTO_GRATUITY" */ val AUTO_GRATUITY: typings.squareDashConnect.squareDashConnectMod.V1PaymentSurchargeNs.TypeEnum.AUTO_GRATUITY with String = js.native
    /* "CUSTOM" */ val CUSTOM: typings.squareDashConnect.squareDashConnectMod.V1PaymentSurchargeNs.TypeEnum.CUSTOM with String = js.native
    /* "UNKNOWN" */ val UNKNOWN: typings.squareDashConnect.squareDashConnectMod.V1PaymentSurchargeNs.TypeEnum.UNKNOWN with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[TypeEnum with String] = js.native
  }
  
}

