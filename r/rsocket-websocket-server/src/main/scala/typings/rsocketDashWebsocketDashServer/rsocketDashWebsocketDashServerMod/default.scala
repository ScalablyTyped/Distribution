package typings.rsocketDashWebsocketDashServer.rsocketDashWebsocketDashServerMod

import typings.rsocketDashCore.rSocketEncodingMod.Encoders
import typings.rsocketDashWebsocketDashServer.rSocketWebSocketServerMod.RSocketWebSocketServer
import typings.ws.wsMod.ServerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-websocket-server", JSImport.Default)
@js.native
class default protected () extends RSocketWebSocketServer {
  def this(options: ServerOptions) = this()
  def this(options: ServerOptions, encoders: Encoders[_]) = this()
}

