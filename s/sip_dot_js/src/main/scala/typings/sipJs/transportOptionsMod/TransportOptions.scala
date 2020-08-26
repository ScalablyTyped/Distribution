package typings.sipJs.transportOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransportOptions extends js.Object {
  /**
    * Seconds to wait for WebSocket to connect before giving up.
    * @defaultValue `5`
    */
  var connectionTimeout: js.UndefOr[Double] = js.native
  /**
    * Keep alive - needs review.
    * @internal
    */
  var keepAliveDebounce: js.UndefOr[Double] = js.native
  /**
    * Keep alive - needs review.
    * @internal
    */
  var keepAliveInterval: js.UndefOr[Double] = js.native
  /**
    * URL of WebSocket server to connect with. For example, "wss://localhost:8080".
    */
  var server: String = js.native
  /**
    * If true, messages sent and received by the transport are logged.
    * @defaultValue `true`
    */
  var traceSip: js.UndefOr[Boolean] = js.native
}

object TransportOptions {
  @scala.inline
  def apply(server: String): TransportOptions = {
    val __obj = js.Dynamic.literal(server = server.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransportOptions]
  }
  @scala.inline
  implicit class TransportOptionsOps[Self <: TransportOptions] (val x: Self) extends AnyVal {
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
    def setServer(value: String): Self = this.set("server", value.asInstanceOf[js.Any])
    @scala.inline
    def setConnectionTimeout(value: Double): Self = this.set("connectionTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionTimeout: Self = this.set("connectionTimeout", js.undefined)
    @scala.inline
    def setKeepAliveDebounce(value: Double): Self = this.set("keepAliveDebounce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepAliveDebounce: Self = this.set("keepAliveDebounce", js.undefined)
    @scala.inline
    def setKeepAliveInterval(value: Double): Self = this.set("keepAliveInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepAliveInterval: Self = this.set("keepAliveInterval", js.undefined)
    @scala.inline
    def setTraceSip(value: Boolean): Self = this.set("traceSip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTraceSip: Self = this.set("traceSip", js.undefined)
  }
  
}

