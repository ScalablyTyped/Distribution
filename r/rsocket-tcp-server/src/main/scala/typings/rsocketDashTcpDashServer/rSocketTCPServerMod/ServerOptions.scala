package typings.rsocketDashTcpDashServer.rSocketTCPServerMod

import typings.node.netMod.Server
import typings.node.netMod.Socket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerOptions extends js.Object {
  var host: js.UndefOr[String] = js.undefined
  var port: Double
  var serverFactory: js.UndefOr[js.Function1[/* onConnect */ js.Function1[/* socket */ Socket, Unit], Server]] = js.undefined
}

object ServerOptions {
  @scala.inline
  def apply(
    port: Double,
    host: String = null,
    serverFactory: /* onConnect */ js.Function1[/* socket */ Socket, Unit] => Server = null
  ): ServerOptions = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (serverFactory != null) __obj.updateDynamic("serverFactory")(js.Any.fromFunction1(serverFactory))
    __obj.asInstanceOf[ServerOptions]
  }
}

