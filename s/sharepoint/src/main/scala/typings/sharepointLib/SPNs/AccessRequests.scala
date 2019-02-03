package typings
package sharepointLib.SPNs

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
    context: sharepointLib.SPNs.ClientRuntimeContext,
    itemId: scala.Double,
    newStatus: scala.Double,
    convStr: java.lang.String,
    permType: java.lang.String,
    permissionLevel: scala.Double
  ): scala.Unit = js.native
  def changeRequestStatusBulk(
    context: sharepointLib.SPNs.ClientRuntimeContext,
    requestIds: js.Array[scala.Double],
    newStatus: scala.Double
  ): scala.Unit = js.native
}

