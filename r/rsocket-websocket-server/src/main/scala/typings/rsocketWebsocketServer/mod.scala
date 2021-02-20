package typings.rsocketWebsocketServer

import typings.rsocketCore.rsocketencodingMod.Encoders
import typings.rsocketWebsocketServer.rsocketwebsocketserverMod.RSocketWebSocketServer
import typings.ws.mod.Server
import typings.ws.mod.ServerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rsocket-websocket-server", JSImport.Default)
  @js.native
  class default protected () extends RSocketWebSocketServer {
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
