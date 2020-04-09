package typings.rsocketWebsocketServer

import typings.rsocketCore.rsocketencodingMod.Encoders
import typings.rsocketWebsocketServer.rsocketwebsocketserverMod.RSocketWebSocketServer
import typings.ws.mod.Server
import typings.ws.mod.ServerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-websocket-server", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class default protected () extends RSocketWebSocketServer {
    def this(options: ServerOptions) = this()
    def this(options: ServerOptions, encoders: Encoders[_]) = this()
    def this(
      options: ServerOptions,
      encoders: Encoders[_],
      factory: js.Function1[/* options */ ServerOptions, Server]
    ) = this()
  }
  
}

