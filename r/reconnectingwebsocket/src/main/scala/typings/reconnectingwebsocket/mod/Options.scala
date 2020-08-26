package typings.reconnectingwebsocket.mod

import typings.std.BinaryType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * Whether or not the WebSocket should attempt to connect immediately upon instantiation.
    * The socket can be manually opened or closed at any time using `open()` and `close()`.
    * @default `true`
    */
  var automaticOpen: js.UndefOr[Boolean] = js.native
  /**
    * The binary type, possible values `'blob'` or `'arraybuffer'`.
    * @default `'blob'`
    */
  var binaryType: js.UndefOr[BinaryType] = js.native
  /**
    * Whether this instance should log debug messages.
    * @default `false`
    */
  var debug: js.UndefOr[Boolean] = js.native
  /**
    * The maximum number of reconnection attempts to make. Unlimited if `null`.
    * @default `null`
    */
  var maxReconnectAttempts: js.UndefOr[Double | Null] = js.native
  /**
    * The maximum number of milliseconds to delay a reconnection attempt.
    * Accepts integer.
    * @default `30000`
    */
  var maxReconnectInterval: js.UndefOr[Double] = js.native
  /**
    * The rate of increase of the reconnect delay. Allows reconnect attempts to back off when problems persist.
    * Accepts integer or float.
    * @default `1.5`
    */
  var reconnectDecay: js.UndefOr[Double] = js.native
  /**
    * The number of milliseconds to delay before attempting to reconnect.
    * Accepts integer.
    * @default `1000`
    */
  var reconnectInterval: js.UndefOr[Double] = js.native
  /**
    * The maximum time in milliseconds to wait for a connection to succeed before closing and retrying.
    * Accepts integer.
    * @default `2000`
    */
  var timeoutInterval: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAutomaticOpen(value: Boolean): Self = this.set("automaticOpen", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutomaticOpen: Self = this.set("automaticOpen", js.undefined)
    @scala.inline
    def setBinaryType(value: BinaryType): Self = this.set("binaryType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBinaryType: Self = this.set("binaryType", js.undefined)
    @scala.inline
    def setDebug(value: Boolean): Self = this.set("debug", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebug: Self = this.set("debug", js.undefined)
    @scala.inline
    def setMaxReconnectAttempts(value: Double): Self = this.set("maxReconnectAttempts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxReconnectAttempts: Self = this.set("maxReconnectAttempts", js.undefined)
    @scala.inline
    def setMaxReconnectAttemptsNull: Self = this.set("maxReconnectAttempts", null)
    @scala.inline
    def setMaxReconnectInterval(value: Double): Self = this.set("maxReconnectInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxReconnectInterval: Self = this.set("maxReconnectInterval", js.undefined)
    @scala.inline
    def setReconnectDecay(value: Double): Self = this.set("reconnectDecay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReconnectDecay: Self = this.set("reconnectDecay", js.undefined)
    @scala.inline
    def setReconnectInterval(value: Double): Self = this.set("reconnectInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReconnectInterval: Self = this.set("reconnectInterval", js.undefined)
    @scala.inline
    def setTimeoutInterval(value: Double): Self = this.set("timeoutInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeoutInterval: Self = this.set("timeoutInterval", js.undefined)
  }
  
}

