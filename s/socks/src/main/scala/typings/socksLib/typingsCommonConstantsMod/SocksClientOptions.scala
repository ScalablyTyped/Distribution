package typings
package socksLib.typingsCommonConstantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SocksClient connection options.
  */
trait SocksClientOptions extends js.Object {
  var command: SocksCommandOption
  var destination: SocksRemoteHost
  var existing_socket: js.UndefOr[nodeLib.streamMod.Duplex] = js.undefined
  var proxy: SocksProxy
  var set_tcp_nodelay: js.UndefOr[scala.Boolean] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object SocksClientOptions {
  @scala.inline
  def apply(
    command: SocksCommandOption,
    destination: SocksRemoteHost,
    proxy: SocksProxy,
    existing_socket: nodeLib.streamMod.Duplex = null,
    set_tcp_nodelay: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: scala.Int | scala.Double = null
  ): SocksClientOptions = {
    val __obj = js.Dynamic.literal(command = command, destination = destination, proxy = proxy)
    if (existing_socket != null) __obj.updateDynamic("existing_socket")(existing_socket)
    if (!js.isUndefined(set_tcp_nodelay)) __obj.updateDynamic("set_tcp_nodelay")(set_tcp_nodelay)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocksClientOptions]
  }
}

