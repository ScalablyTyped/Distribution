package typings.socketclusterDashServer.scserverMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SubscribeRequest extends js.Object {
  var authTokenExpiredError: js.UndefOr[Error] = js.undefined
  var channel: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var socket: typings.socketclusterDashServer.scserversocketMod.^
  var waitForAuth: js.UndefOr[Boolean] = js.undefined
}

object SubscribeRequest {
  @scala.inline
  def apply(
    socket: typings.socketclusterDashServer.scserversocketMod.^,
    authTokenExpiredError: Error = null,
    channel: String = null,
    data: js.Any = null,
    waitForAuth: js.UndefOr[Boolean] = js.undefined
  ): SubscribeRequest = {
    val __obj = js.Dynamic.literal(socket = socket)
    if (authTokenExpiredError != null) __obj.updateDynamic("authTokenExpiredError")(authTokenExpiredError)
    if (channel != null) __obj.updateDynamic("channel")(channel)
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(waitForAuth)) __obj.updateDynamic("waitForAuth")(waitForAuth)
    __obj.asInstanceOf[SubscribeRequest]
  }
}

