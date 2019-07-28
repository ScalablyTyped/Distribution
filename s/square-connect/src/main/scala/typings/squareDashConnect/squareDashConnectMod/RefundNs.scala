package typings.squareDashConnect.squareDashConnectMod

import typings.squareDashConnect.squareDashConnectMod.RefundNs.StatusEnum
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
    sealed trait APPROVED extends StatusEnum
    
    @js.native
    sealed trait FAILED extends StatusEnum
    
    @js.native
    sealed trait PENDING extends StatusEnum
    
    @js.native
    sealed trait REJECTED extends StatusEnum
    
    /* "APPROVED" */ val APPROVED: typings.squareDashConnect.squareDashConnectMod.RefundNs.StatusEnum.APPROVED with String = js.native
    /* "FAILED" */ val FAILED: typings.squareDashConnect.squareDashConnectMod.RefundNs.StatusEnum.FAILED with String = js.native
    /* "PENDING" */ val PENDING: typings.squareDashConnect.squareDashConnectMod.RefundNs.StatusEnum.PENDING with String = js.native
    /* "REJECTED" */ val REJECTED: typings.squareDashConnect.squareDashConnectMod.RefundNs.StatusEnum.REJECTED with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[StatusEnum with String] = js.native
  }
  
}

