package typings.socketclusterDashServer.scserverMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishInRequest extends js.Object {
  var ackData: js.UndefOr[js.Any] = js.undefined
  var authTokenExpiredError: js.UndefOr[Error] = js.undefined
  var channel: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var socket: typings.socketclusterDashServer.scserversocketMod.^
}

object PublishInRequest {
  @scala.inline
  def apply(
    socket: typings.socketclusterDashServer.scserversocketMod.^,
    ackData: js.Any = null,
    authTokenExpiredError: Error = null,
    channel: String = null,
    data: js.Any = null
  ): PublishInRequest = {
    val __obj = js.Dynamic.literal(socket = socket.asInstanceOf[js.Any])
    if (ackData != null) __obj.updateDynamic("ackData")(ackData.asInstanceOf[js.Any])
    if (authTokenExpiredError != null) __obj.updateDynamic("authTokenExpiredError")(authTokenExpiredError.asInstanceOf[js.Any])
    if (channel != null) __obj.updateDynamic("channel")(channel.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishInRequest]
  }
}

