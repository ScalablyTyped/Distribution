package typings.rsocketDashTcpDashClient.rSocketTcpClientMod

import typings.node.netMod.TcpSocketConnectOpts
import typings.rsocketDashCore.rSocketEncodingMod.Encoders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-tcp-client/RSocketTcpClient", "RSocketTcpClient")
@js.native
class RSocketTcpClient protected () extends RSocketTcpConnection {
  def this(options: TcpSocketConnectOpts) = this()
  def this(options: TcpSocketConnectOpts, encoders: Encoders[_]) = this()
}

