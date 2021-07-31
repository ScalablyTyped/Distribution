package typings.rsocketWebsocketServer

import typings.rsocketCore.rsocketencodingMod.Encoders
import typings.rsocketCore.rsocketserverMod.TransportServer
import typings.rsocketFlowable.mod.Flowable
import typings.rsocketTypes.reactiveSocketTypesMod.DuplexConnection
import typings.ws.mod.Server
import typings.ws.mod.ServerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rsocketwebsocketserverMod {
  
  @JSImport("rsocket-websocket-server/RSocketWebSocketServer", "RSocketWebSocketServer")
  @js.native
  class RSocketWebSocketServer protected ()
    extends StObject
       with TransportServer {
    def this(options: ServerOptions) = this()
    def this(options: ServerOptions, encoders: Encoders[js.Any]) = this()
    def this(options: ServerOptions, encoders: Unit, factory: js.Function1[/* options */ ServerOptions, Server]) = this()
    def this(
      options: ServerOptions,
      encoders: Encoders[js.Any],
      factory: js.Function1[/* options */ ServerOptions, Server]
    ) = this()
    
    /* CompleteClass */
    override def start(): Flowable[DuplexConnection] = js.native
    
    /* CompleteClass */
    override def stop(): Unit = js.native
  }
}
