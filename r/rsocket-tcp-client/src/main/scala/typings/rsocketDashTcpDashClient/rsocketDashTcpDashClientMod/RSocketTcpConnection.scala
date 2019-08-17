package typings.rsocketDashTcpDashClient.rsocketDashTcpDashClientMod

import typings.node.netMod.Socket
import typings.rsocketDashCore.rSocketEncodingMod.Encoders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-tcp-client", "RSocketTcpConnection")
@js.native
class RSocketTcpConnection ()
  extends typings.rsocketDashTcpDashClient.rSocketTcpClientMod.RSocketTcpConnection {
  def this(socket: Socket) = this()
  def this(socket: Socket, encoders: Encoders[_]) = this()
}

