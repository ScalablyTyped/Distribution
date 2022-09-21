package typings.rsocketWebsocketServer

import typings.rsocketCore.rsocketencodingMod.Encoders
import typings.rsocketWebsocketServer.rsocketwebsocketserverMod.RSocketWebSocketServer
import typings.ws.mod.Server
import typings.ws.mod.ServerOptions
import typings.ws.mod.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rsocket-websocket-server", JSImport.Default)
  @js.native
  open class default protected () extends RSocketWebSocketServer {
    def this(options: ServerOptions) = this()
    def this(options: ServerOptions, encoders: Encoders[Any]) = this()
    def this(
      options: ServerOptions,
      encoders: Unit,
      factory: js.Function1[/* options */ ServerOptions, Server[WebSocket]]
    ) = this()
    def this(
      options: ServerOptions,
      encoders: Encoders[Any],
      factory: js.Function1[/* options */ ServerOptions, Server[WebSocket]]
    ) = this()
  }
}
