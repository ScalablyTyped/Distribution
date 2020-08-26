package typings.socks.constantsMod

import typings.node.netMod.SocketConnectOpts
import typings.node.streamMod.Duplex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SocksClient connection options.
  */
@js.native
trait SocksClientOptions extends js.Object {
  var command: SocksCommandOption = js.native
  var destination: SocksRemoteHost = js.native
  var existing_socket: js.UndefOr[Duplex] = js.native
  var proxy: SocksProxy = js.native
  var set_tcp_nodelay: js.UndefOr[Boolean] = js.native
  var socket_options: js.UndefOr[SocketConnectOpts] = js.native
  var timeout: js.UndefOr[Double] = js.native
}

object SocksClientOptions {
  @scala.inline
  def apply(command: SocksCommandOption, destination: SocksRemoteHost, proxy: SocksProxy): SocksClientOptions = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], proxy = proxy.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocksClientOptions]
  }
  @scala.inline
  implicit class SocksClientOptionsOps[Self <: SocksClientOptions] (val x: Self) extends AnyVal {
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
    def setCommand(value: SocksCommandOption): Self = this.set("command", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestination(value: SocksRemoteHost): Self = this.set("destination", value.asInstanceOf[js.Any])
    @scala.inline
    def setProxy(value: SocksProxy): Self = this.set("proxy", value.asInstanceOf[js.Any])
    @scala.inline
    def setExisting_socket(value: Duplex): Self = this.set("existing_socket", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExisting_socket: Self = this.set("existing_socket", js.undefined)
    @scala.inline
    def setSet_tcp_nodelay(value: Boolean): Self = this.set("set_tcp_nodelay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSet_tcp_nodelay: Self = this.set("set_tcp_nodelay", js.undefined)
    @scala.inline
    def setSocket_options(value: SocketConnectOpts): Self = this.set("socket_options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSocket_options: Self = this.set("socket_options", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

