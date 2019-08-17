package typings.rsocketDashTcpDashServer.rSocketTCPServerMod

import typings.rsocketDashCore.rSocketEncodingMod.Encoders
import typings.rsocketDashFlowable.rsocketDashFlowableMod.Flowable
import typings.rsocketDashTypes.reactiveSocketTypesMod.DuplexConnection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-tcp-server/RSocketTCPServer", JSImport.Default)
@js.native
class default protected () extends RSocketTCPServer {
  def this(options: ServerOptions) = this()
  def this(options: ServerOptions, encoders: Encoders[_]) = this()
  /* CompleteClass */
  override def start(): Flowable[DuplexConnection] = js.native
  /* CompleteClass */
  override def stop(): Unit = js.native
}

