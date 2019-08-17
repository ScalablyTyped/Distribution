package typings.rsocketDashWebsocketDashServer.rSocketWebSocketServerMod

import typings.rsocketDashCore.rSocketEncodingMod.Encoders
import typings.rsocketDashCore.rSocketServerMod.TransportServer
import typings.rsocketDashFlowable.rsocketDashFlowableMod.Flowable
import typings.rsocketDashTypes.reactiveSocketTypesMod.DuplexConnection
import typings.ws.wsMod.ServerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-websocket-server/RSocketWebSocketServer", "RSocketWebSocketServer")
@js.native
class RSocketWebSocketServer protected () extends TransportServer {
  def this(options: ServerOptions) = this()
  def this(options: ServerOptions, encoders: Encoders[_]) = this()
  /* CompleteClass */
  override def start(): Flowable[DuplexConnection] = js.native
  /* CompleteClass */
  override def stop(): Unit = js.native
}

