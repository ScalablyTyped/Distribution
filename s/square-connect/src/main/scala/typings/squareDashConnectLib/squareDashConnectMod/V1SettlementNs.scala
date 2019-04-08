package typings
package squareDashConnectLib.squareDashConnectMod

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
    sealed trait FAILED
      extends squareDashConnectLib.squareDashConnectMod.V1SettlementNs.StatusEnum
    
    @js.native
    sealed trait SENT
      extends squareDashConnectLib.squareDashConnectMod.V1SettlementNs.StatusEnum
    
    /* "FAILED" */ val FAILED: FAILED with java.lang.String = js.native
    /* "SENT" */ val SENT: SENT with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.V1SettlementNs.StatusEnum with java.lang.String
      ] = js.native
  }
  
}

