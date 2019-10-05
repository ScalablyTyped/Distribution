package typings.rsocketDashWebsocketDashServer

import typings.rsocketDashCore.rSocketEncodingMod.Encoders
import typings.rsocketDashWebsocketDashServer.rSocketWebSocketServerMod.RSocketWebSocketServer
import typings.ws.wsMod.ServerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-websocket-server", JSImport.Namespace)
@js.native
object rsocketDashWebsocketDashServerMod extends js.Object {
  @js.native
  class default protected () extends RSocketWebSocketServer {
    def this(options: ServerOptions) = this()
    def this(options: ServerOptions, encoders: Encoders[_]) = this()
  }
  
}

