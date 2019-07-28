package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.V1SettlementNs.StatusEnum
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "V1Settlement")
@js.native
object V1SettlementNs extends js.Object {
  @js.native
  sealed trait StatusEnum extends js.Object
  
  @js.native
  object StatusEnum extends js.Object {
    @js.native
    sealed trait FAILED extends StatusEnum
    
    @js.native
    sealed trait SENT extends StatusEnum
    
    /* "FAILED" */ val FAILED: typings.squareDashConnect.squareDashConnectMod.V1SettlementNs.StatusEnum.FAILED with String = js.native
    /* "SENT" */ val SENT: typings.squareDashConnect.squareDashConnectMod.V1SettlementNs.StatusEnum.SENT with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[StatusEnum with String] = js.native
  }
  
}

