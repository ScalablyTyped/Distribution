package typings.sharepoint.SP

import org.scalablytyped.runtime.TopLevel
import typings.sharepoint.SP.ClientRequestStatus.active
import typings.sharepoint.SP.ClientRequestStatus.completedException
import typings.sharepoint.SP.ClientRequestStatus.completedSuccess
import typings.sharepoint.SP.ClientRequestStatus.inProgress
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ClientRequestStatus with Double] = js.native
  /* 0 */ @js.native
  object active extends TopLevel[active with Double]
  
  /* 3 */ @js.native
  object completedException extends TopLevel[completedException with Double]
  
  /* 2 */ @js.native
  object completedSuccess extends TopLevel[completedSuccess with Double]
  
  /* 1 */ @js.native
  object inProgress extends TopLevel[inProgress with Double]
  
}

