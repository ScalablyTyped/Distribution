package typings
package squareDashConnectLib.squareDashConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("square-connect", "Refund")
@js.native
object RefundNs extends js.Object {
  @js.native
  sealed trait StatusEnum extends js.Object
  
  @js.native
  object StatusEnum extends js.Object {
    @js.native
    sealed trait APPROVED
      extends squareDashConnectLib.squareDashConnectMod.RefundNs.StatusEnum
    
    @js.native
    sealed trait FAILED
      extends squareDashConnectLib.squareDashConnectMod.RefundNs.StatusEnum
    
    @js.native
    sealed trait PENDING
      extends squareDashConnectLib.squareDashConnectMod.RefundNs.StatusEnum
    
    @js.native
    sealed trait REJECTED
      extends squareDashConnectLib.squareDashConnectMod.RefundNs.StatusEnum
    
    /* "APPROVED" */ val APPROVED: APPROVED with java.lang.String = js.native
    /* "FAILED" */ val FAILED: FAILED with java.lang.String = js.native
    /* "PENDING" */ val PENDING: PENDING with java.lang.String = js.native
    /* "REJECTED" */ val REJECTED: REJECTED with java.lang.String = js.native
    @JSBracketAccess
    def apply(value: java.lang.String): js.UndefOr[
        squareDashConnectLib.squareDashConnectMod.RefundNs.StatusEnum with java.lang.String
      ] = js.native
  }
  
}

