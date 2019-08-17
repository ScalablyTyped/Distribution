package typings.rsocketDashTcpDashClient.rsocketDashTcpDashClientMod

import typings.node.netMod.TcpSocketConnectOpts
import typings.rsocketDashCore.rSocketEncodingMod.Encoders
import typings.rsocketDashTcpDashClient.rSocketTcpClientMod.RSocketTcpClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-tcp-client", JSImport.Default)
@js.native
class default protected () extends RSocketTcpClient {
  def this(options: TcpSocketConnectOpts) = this()
  def this(options: TcpSocketConnectOpts, encoders: Encoders[_]) = this()
}

