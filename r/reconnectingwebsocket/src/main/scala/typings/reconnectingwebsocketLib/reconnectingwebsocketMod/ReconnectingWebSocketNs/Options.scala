package typings
package reconnectingwebsocketLib.reconnectingwebsocketMod.ReconnectingWebSocketNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var automaticOpen: js.UndefOr[scala.Boolean] = js.undefined
  var binaryType: js.UndefOr[
    reconnectingwebsocketLib.reconnectingwebsocketLibStrings.blob | reconnectingwebsocketLib.reconnectingwebsocketLibStrings.arraybuffer
  ] = js.undefined
  var debug: js.UndefOr[scala.Boolean] = js.undefined
  var maxReconnectAttempts: js.UndefOr[scala.Double | scala.Null] = js.undefined
  var maxReconnectInterval: js.UndefOr[scala.Double] = js.undefined
  var reconnectDecay: js.UndefOr[scala.Double] = js.undefined
  var reconnectInterval: js.UndefOr[scala.Double] = js.undefined
  var timeoutInterval: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    automaticOpen: js.UndefOr[scala.Boolean] = js.undefined,
    binaryType: reconnectingwebsocketLib.reconnectingwebsocketLibStrings.blob | reconnectingwebsocketLib.reconnectingwebsocketLibStrings.arraybuffer = null,
    debug: js.UndefOr[scala.Boolean] = js.undefined,
    maxReconnectAttempts: scala.Int | scala.Double = null,
    maxReconnectInterval: scala.Int | scala.Double = null,
    reconnectDecay: scala.Int | scala.Double = null,
    reconnectInterval: scala.Int | scala.Double = null,
    timeoutInterval: scala.Int | scala.Double = null
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

