package typings.primus.mod

import typings.primus.anon.Factor
import typings.primus.primusStrings.disconnect
import typings.primus.primusStrings.online
import typings.primus.primusStrings.timeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SocketOptions extends js.Object {
  var manual: js.UndefOr[Boolean] = js.native
  var network: js.UndefOr[Boolean] = js.native
  var pingTimeout: js.UndefOr[Double] = js.native
  var queueSize: js.UndefOr[Double] = js.native
  // https://github.com/unshiftio/recovery
  var reconnect: js.UndefOr[Factor] = js.native
  var strategy: js.UndefOr[String | (js.Array[disconnect | online | timeout])] = js.native
  var timeout: js.UndefOr[Double] = js.native
  var transport: js.UndefOr[js.Object] = js.native
  var websockets: js.UndefOr[Boolean] = js.native
}

object SocketOptions {
  @scala.inline
  def apply(): SocketOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SocketOptions]
  }
  @scala.inline
  implicit class SocketOptionsOps[Self <: SocketOptions] (val x: Self) extends AnyVal {
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
    def setManual(value: Boolean): Self = this.set("manual", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManual: Self = this.set("manual", js.undefined)
    @scala.inline
    def setNetwork(value: Boolean): Self = this.set("network", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetwork: Self = this.set("network", js.undefined)
    @scala.inline
    def setPingTimeout(value: Double): Self = this.set("pingTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePingTimeout: Self = this.set("pingTimeout", js.undefined)
    @scala.inline
    def setQueueSize(value: Double): Self = this.set("queueSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQueueSize: Self = this.set("queueSize", js.undefined)
    @scala.inline
    def setReconnect(value: Factor): Self = this.set("reconnect", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReconnect: Self = this.set("reconnect", js.undefined)
    @scala.inline
    def setStrategyVarargs(value: (disconnect | online | timeout)*): Self = this.set("strategy", js.Array(value :_*))
    @scala.inline
    def setStrategy(value: String | (js.Array[disconnect | online | timeout])): Self = this.set("strategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStrategy: Self = this.set("strategy", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    @scala.inline
    def setTransport(value: js.Object): Self = this.set("transport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTransport: Self = this.set("transport", js.undefined)
    @scala.inline
    def setWebsockets(value: Boolean): Self = this.set("websockets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebsockets: Self = this.set("websockets", js.undefined)
  }
  
}

