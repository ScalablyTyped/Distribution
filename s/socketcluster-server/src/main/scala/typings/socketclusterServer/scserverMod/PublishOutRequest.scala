package typings.socketclusterServer.scserverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PublishOutRequest extends js.Object {
  var channel: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var socket: typings.socketclusterServer.scserversocketMod.^
  var useCache: js.UndefOr[Boolean] = js.undefined
}

object PublishOutRequest {
  @scala.inline
  def apply(
    socket: typings.socketclusterServer.scserversocketMod.^,
    channel: String = null,
    data: js.Any = null,
    useCache: js.UndefOr[Boolean] = js.undefined
  ): PublishOutRequest = {
    val __obj = js.Dynamic.literal(socket = socket.asInstanceOf[js.Any])
    if (channel != null) __obj.updateDynamic("channel")(channel.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(useCache)) __obj.updateDynamic("useCache")(useCache.asInstanceOf[js.Any])
    __obj.asInstanceOf[PublishOutRequest]
  }
}

