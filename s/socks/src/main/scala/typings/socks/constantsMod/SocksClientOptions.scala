package typings.socks.constantsMod

import typings.node.netMod.SocketConnectOpts
import typings.node.streamMod.Duplex
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SocksClient connection options.
  */
trait SocksClientOptions extends js.Object {
  var command: SocksCommandOption
  var destination: SocksRemoteHost
  var existing_socket: js.UndefOr[Duplex] = js.undefined
  var proxy: SocksProxy
  var set_tcp_nodelay: js.UndefOr[Boolean] = js.undefined
  var socket_options: js.UndefOr[SocketConnectOpts] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object SocksClientOptions {
  @scala.inline
  def apply(
    command: SocksCommandOption,
    destination: SocksRemoteHost,
    proxy: SocksProxy,
    existing_socket: Duplex = null,
    set_tcp_nodelay: js.UndefOr[Boolean] = js.undefined,
    socket_options: SocketConnectOpts = null,
    timeout: js.UndefOr[Double] = js.undefined
  ): SocksClientOptions = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], proxy = proxy.asInstanceOf[js.Any])
    if (existing_socket != null) __obj.updateDynamic("existing_socket")(existing_socket.asInstanceOf[js.Any])
    if (!js.isUndefined(set_tcp_nodelay)) __obj.updateDynamic("set_tcp_nodelay")(set_tcp_nodelay.get.asInstanceOf[js.Any])
    if (socket_options != null) __obj.updateDynamic("socket_options")(socket_options.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocksClientOptions]
  }
}

