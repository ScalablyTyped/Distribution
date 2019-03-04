package typings
package socketclusterDashServerLib.scserverMod.SCServerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmitRequest extends js.Object {
  var authTokenExpiredError: js.UndefOr[nodeLib.Error] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var event: java.lang.String
  var socket: socketclusterDashServerLib.scserversocketMod.namespaced
}

object EmitRequest {
  @scala.inline
  def apply(
    event: java.lang.String,
    socket: socketclusterDashServerLib.scserversocketMod.namespaced,
    authTokenExpiredError: nodeLib.Error = null,
    data: js.Any = null
  ): EmitRequest = {
    val __obj = js.Dynamic.literal(event = event, socket = socket)
    if (authTokenExpiredError != null) __obj.updateDynamic("authTokenExpiredError")(authTokenExpiredError)
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[EmitRequest]
  }
}

