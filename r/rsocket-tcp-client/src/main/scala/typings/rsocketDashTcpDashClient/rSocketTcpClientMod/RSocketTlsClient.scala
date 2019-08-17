package typings.rsocketDashTcpDashClient.rSocketTcpClientMod

import typings.node.tlsMod.ConnectionOptions
import typings.rsocketDashCore.rSocketEncodingMod.Encoders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-tcp-client/RSocketTcpClient", "RSocketTlsClient")
@js.native
class RSocketTlsClient protected () extends RSocketTcpConnection {
  def this(options: ConnectionOptions) = this()
  def this(options: ConnectionOptions, encoders: Encoders[_]) = this()
}

