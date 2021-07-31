package typings.rsocketTcpClient

import typings.node.netMod.Socket
import typings.node.netMod.TcpSocketConnectOpts
import typings.rsocketCore.rsocketencodingMod.Encoders
import typings.rsocketTcpClient.rsockettcpclientMod.RSocketTcpClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rsocket-tcp-client", JSImport.Default)
  @js.native
  class default protected () extends RSocketTcpClient {
    def this(options: TcpSocketConnectOpts) = this()
    def this(options: TcpSocketConnectOpts, encoders: Encoders[js.Any]) = this()
  }
  
  @JSImport("rsocket-tcp-client", "RSocketTcpConnection")
  @js.native
  class RSocketTcpConnection ()
    extends typings.rsocketTcpClient.rsockettcpclientMod.RSocketTcpConnection {
    def this(socket: Socket) = this()
    def this(socket: Unit, encoders: Encoders[js.Any]) = this()
    def this(socket: Socket, encoders: Encoders[js.Any]) = this()
  }
}
