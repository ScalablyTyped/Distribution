package typings.rsocketTcpServer.rsockettcpserverMod

import typings.rsocketCore.rsocketserverMod.TransportServer
import typings.rsocketFlowable.mod.Flowable
import typings.rsocketTypes.reactiveSocketTypesMod.DuplexConnection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RSocketTCPServer extends TransportServer

object RSocketTCPServer {
  @scala.inline
  def apply(start: () => Flowable[DuplexConnection], stop: () => Unit): RSocketTCPServer = {
    val __obj = js.Dynamic.literal(start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
  
    __obj.asInstanceOf[RSocketTCPServer]
  }
}

