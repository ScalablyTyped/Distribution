package typings.reconnectingwebsocket.reconnectingwebsocketMod

import typings.std.BinaryType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * Whether or not the WebSocket should attempt to connect immediately upon instantiation.
    * The socket can be manually opened or closed at any time using `open()` and `close()`.
    * @default `true`
    */
  var automaticOpen: js.UndefOr[Boolean] = js.undefined
  /**
    * The binary type, possible values `'blob'` or `'arraybuffer'`.
    * @default `'blob'`
    */
  var binaryType: js.UndefOr[BinaryType] = js.undefined
  /**
    * Whether this instance should log debug messages.
    * @default `false`
    */
  var debug: js.UndefOr[Boolean] = js.undefined
  /**
    * The maximum number of reconnection attempts to make. Unlimited if `null`.
    * @default `null`
    */
  var maxReconnectAttempts: js.UndefOr[Double | Null] = js.undefined
  /**
    * The maximum number of milliseconds to delay a reconnection attempt.
    * Accepts integer.
    * @default `30000`
    */
  var maxReconnectInterval: js.UndefOr[Double] = js.undefined
  /**
    * The rate of increase of the reconnect delay. Allows reconnect attempts to back off when problems persist.
    * Accepts integer or float.
    * @default `1.5`
    */
  var reconnectDecay: js.UndefOr[Double] = js.undefined
  /**
    * The number of milliseconds to delay before attempting to reconnect.
    * Accepts integer.
    * @default `1000`
    */
  var reconnectInterval: js.UndefOr[Double] = js.undefined
  /**
    * The maximum time in milliseconds to wait for a connection to succeed before closing and retrying.
    * Accepts integer.
    * @default `2000`
    */
  var timeoutInterval: js.UndefOr[Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    automaticOpen: js.UndefOr[Boolean] = js.undefined,
    binaryType: BinaryType = null,
    debug: js.UndefOr[Boolean] = js.undefined,
    maxReconnectAttempts: Int | Double = null,
    maxReconnectInterval: Int | Double = null,
    reconnectDecay: Int | Double = null,
    reconnectInterval: Int | Double = null,
    timeoutInterval: Int | Double = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(automaticOpen)) __obj.updateDynamic("automaticOpen")(automaticOpen)
    if (binaryType != null) __obj.updateDynamic("binaryType")(binaryType)
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug)
    if (maxReconnectAttempts != null) __obj.updateDynamic("maxReconnectAttempts")(maxReconnectAttempts.asInstanceOf[js.Any])
    if (maxReconnectInterval != null) __obj.updateDynamic("maxReconnectInterval")(maxReconnectInterval.asInstanceOf[js.Any])
    if (reconnectDecay != null) __obj.updateDynamic("reconnectDecay")(reconnectDecay.asInstanceOf[js.Any])
    if (reconnectInterval != null) __obj.updateDynamic("reconnectInterval")(reconnectInterval.asInstanceOf[js.Any])
    if (timeoutInterval != null) __obj.updateDynamic("timeoutInterval")(timeoutInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

