package typings.reconnectingwebsocket.reconnectingwebsocketMod

import typings.reconnectingwebsocket.reconnectingwebsocketStrings.arraybuffer
import typings.reconnectingwebsocket.reconnectingwebsocketStrings.blob
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var automaticOpen: js.UndefOr[Boolean] = js.undefined
  var binaryType: js.UndefOr[blob | arraybuffer] = js.undefined
  var debug: js.UndefOr[Boolean] = js.undefined
  var maxReconnectAttempts: js.UndefOr[Double | Null] = js.undefined
  var maxReconnectInterval: js.UndefOr[Double] = js.undefined
  var reconnectDecay: js.UndefOr[Double] = js.undefined
  var reconnectInterval: js.UndefOr[Double] = js.undefined
  var timeoutInterval: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    automaticOpen: js.UndefOr[Boolean] = js.undefined,
    binaryType: blob | arraybuffer = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    maxReconnectAttempts: Int | Double = null,
    maxReconnectInterval: Int | Double = null,
    reconnectDecay: Int | Double = null,
    reconnectInterval: Int | Double = null,
    timeoutInterval: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(automaticOpen)) __obj.updateDynamic("automaticOpen")(automaticOpen)
    if (binaryType != null) __obj.updateDynamic("binaryType")(binaryType.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (maxReconnectAttempts != null) __obj.updateDynamic("maxReconnectAttempts")(maxReconnectAttempts.asInstanceOf[js.Any])
    if (maxReconnectInterval != null) __obj.updateDynamic("maxReconnectInterval")(maxReconnectInterval.asInstanceOf[js.Any])
    if (reconnectDecay != null) __obj.updateDynamic("reconnectDecay")(reconnectDecay.asInstanceOf[js.Any])
    if (reconnectInterval != null) __obj.updateDynamic("reconnectInterval")(reconnectInterval.asInstanceOf[js.Any])
    if (timeoutInterval != null) __obj.updateDynamic("timeoutInterval")(timeoutInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

