package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.AccessRequests")
@js.native
class AccessRequests () extends js.Object

/* static members */
@JSGlobal("SP.AccessRequests")
@js.native
object AccessRequests extends js.Object {
  def changeRequestStatus(
    context: ClientRuntimeContext,
    itemId: Double,
    newStatus: Double,
    convStr: String,
    permType: String,
    permissionLevel: Double
  ): Unit = js.native
  def changeRequestStatusBulk(context: ClientRuntimeContext, requestIds: js.Array[Double], newStatus: Double): Unit = js.native
}

