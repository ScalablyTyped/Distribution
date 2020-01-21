package typings.rsocketWebsocketClient.rsocketwebsocketclientMod

import typings.std.WebSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions extends js.Object {
  var debug: js.UndefOr[Boolean] = js.undefined
  var lengthPrefixedFrames: js.UndefOr[Boolean] = js.undefined
  var url: String
  var wsCreator: js.UndefOr[js.Function1[/* url */ String, WebSocket]] = js.undefined
}

object ClientOptions {
  @scala.inline
  def apply(
    url: String,
    debug: js.UndefOr[Boolean] = js.undefined,
    lengthPrefixedFrames: js.UndefOr[Boolean] = js.undefined,
    wsCreator: /* url */ String => WebSocket = null
  ): ClientOptions = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.asInstanceOf[js.Any])
    if (!js.isUndefined(lengthPrefixedFrames)) __obj.updateDynamic("lengthPrefixedFrames")(lengthPrefixedFrames.asInstanceOf[js.Any])
    if (wsCreator != null) __obj.updateDynamic("wsCreator")(js.Any.fromFunction1(wsCreator))
    __obj.asInstanceOf[ClientOptions]
  }
}

