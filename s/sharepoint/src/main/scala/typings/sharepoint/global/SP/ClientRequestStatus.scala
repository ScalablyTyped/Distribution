package typings.sharepoint.global.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.ClientRequestStatus")
@js.native
object ClientRequestStatus extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[typings.sharepoint.SP.ClientRequestStatus with Double] = js.native
  
  /* 0 */ val active: typings.sharepoint.SP.ClientRequestStatus.active with Double = js.native
  
  /* 3 */ val completedException: typings.sharepoint.SP.ClientRequestStatus.completedException with Double = js.native
  
  /* 2 */ val completedSuccess: typings.sharepoint.SP.ClientRequestStatus.completedSuccess with Double = js.native
  
  /* 1 */ val inProgress: typings.sharepoint.SP.ClientRequestStatus.inProgress with Double = js.native
}
