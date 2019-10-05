package typings.rsocketDashTcpDashClient

import typings.node.netMod.Socket
import typings.node.netMod.TcpSocketConnectOpts
import typings.rsocketDashCore.rSocketEncodingMod.Encoders
import typings.rsocketDashTcpDashClient.rSocketTcpClientMod.RSocketTcpClient
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-tcp-client", JSImport.Namespace)
@js.native
object rsocketDashTcpDashClientMod extends js.Object {
  @js.native
  class RSocketTcpConnection ()
    extends typings.rsocketDashTcpDashClient.rSocketTcpClientMod.RSocketTcpConnection {
    def this(socket: Socket) = this()
    def this(socket: Socket, encoders: Encoders[_]) = this()
  }
  
  @js.native
  class default protected () extends RSocketTcpClient {
    def this(options: TcpSocketConnectOpts) = this()
    def this(options: TcpSocketConnectOpts, encoders: Encoders[_]) = this()
  }
  
}

