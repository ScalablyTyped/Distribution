package typings.reconnectingwebsocket.mod

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
    maxReconnectAttempts: js.UndefOr[Null | Double] = js.undefined,
    maxReconnectInterval: js.UndefOr[Double] = js.undefined,
    reconnectDecay: js.UndefOr[Double] = js.undefined,
    reconnectInterval: js.UndefOr[Double] = js.undefined,
    timeoutInterval: js.UndefOr[Double] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(automaticOpen)) __obj.updateDynamic("automaticOpen")(automaticOpen.get.asInstanceOf[js.Any])
    if (binaryType != null) __obj.updateDynamic("binaryType")(binaryType.asInstanceOf[js.Any])
    if (!js.isUndefined(debug)) __obj.updateDynamic("debug")(debug.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxReconnectAttempts)) __obj.updateDynamic("maxReconnectAttempts")(maxReconnectAttempts.asInstanceOf[js.Any])
    if (!js.isUndefined(maxReconnectInterval)) __obj.updateDynamic("maxReconnectInterval")(maxReconnectInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reconnectDecay)) __obj.updateDynamic("reconnectDecay")(reconnectDecay.get.asInstanceOf[js.Any])
    if (!js.isUndefined(reconnectInterval)) __obj.updateDynamic("reconnectInterval")(reconnectInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeoutInterval)) __obj.updateDynamic("timeoutInterval")(timeoutInterval.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

