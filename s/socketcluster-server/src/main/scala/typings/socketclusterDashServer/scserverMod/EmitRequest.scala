package typings.socketclusterDashServer.scserverMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmitRequest extends js.Object {
  var authTokenExpiredError: js.UndefOr[Error] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var event: String
  var socket: typings.socketclusterDashServer.scserversocketMod.^
}

object EmitRequest {
  @scala.inline
  def apply(
    event: String,
    socket: typings.socketclusterDashServer.scserversocketMod.^,
    authTokenExpiredError: Error = null,
    data: js.Any = null
  ): EmitRequest = {
    val __obj = js.Dynamic.literal(event = event.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
    if (authTokenExpiredError != null) __obj.updateDynamic("authTokenExpiredError")(authTokenExpiredError.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[EmitRequest]
  }
}

