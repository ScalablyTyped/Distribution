package typings.rsocketWebsocketServer

import typings.rsocketCore.rsocketencodingMod.Encoders
import typings.rsocketCore.rsocketserverMod.TransportServer
import typings.ws.mod.Server
import typings.ws.mod.ServerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rsocketwebsocketserverMod {
  
  @JSImport("rsocket-websocket-server/RSocketWebSocketServer", "RSocketWebSocketServer")
  @js.native
  class RSocketWebSocketServer protected () extends TransportServer {
    def this(options: ServerOptions) = this()
    def this(options: ServerOptions, encoders: Encoders[_]) = this()
    def this(
      options: ServerOptions,
      encoders: js.UndefOr[scala.Nothing],
      factory: js.Function1[/* options */ ServerOptions, Server]
    ) = this()
    def this(
      options: ServerOptions,
      encoders: Encoders[_],
      factory: js.Function1[/* options */ ServerOptions, Server]
    ) = this()
  }
}
