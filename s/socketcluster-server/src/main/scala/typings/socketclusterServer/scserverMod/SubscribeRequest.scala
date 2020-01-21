package typings.socketclusterServer.scserverMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscribeRequest extends js.Object {
  var authTokenExpiredError: js.UndefOr[Error] = js.undefined
  var channel: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var socket: typings.socketclusterServer.scserversocketMod.^
  var waitForAuth: js.UndefOr[Boolean] = js.undefined
}

object SubscribeRequest {
  @scala.inline
  def apply(
    socket: typings.socketclusterServer.scserversocketMod.^,
    authTokenExpiredError: Error = null,
    channel: String = null,
    data: js.Any = null,
    waitForAuth: js.UndefOr[Boolean] = js.undefined
  ): SubscribeRequest = {
    val __obj = js.Dynamic.literal(socket = socket.asInstanceOf[js.Any])
    if (authTokenExpiredError != null) __obj.updateDynamic("authTokenExpiredError")(authTokenExpiredError.asInstanceOf[js.Any])
    if (channel != null) __obj.updateDynamic("channel")(channel.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForAuth)) __obj.updateDynamic("waitForAuth")(waitForAuth.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubscribeRequest]
  }
}

