package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ClientRequestStatus extends js.Object

@JSGlobal("SP.ClientRequestStatus")
@js.native
object ClientRequestStatus extends js.Object {
  @js.native
  sealed trait active extends ClientRequestStatus
  
  @js.native
  sealed trait completedException extends ClientRequestStatus
  
  @js.native
  sealed trait completedSuccess extends ClientRequestStatus
  
  @js.native
  sealed trait inProgress extends ClientRequestStatus
  
  /* 0 */ val active: typings.sharepoint.SP.ClientRequestStatus.active with Double = js.native
  /* 3 */ val completedException: typings.sharepoint.SP.ClientRequestStatus.completedException with Double = js.native
  /* 2 */ val completedSuccess: typings.sharepoint.SP.ClientRequestStatus.completedSuccess with Double = js.native
  /* 1 */ val inProgress: typings.sharepoint.SP.ClientRequestStatus.inProgress with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ClientRequestStatus with Double] = js.native
}

