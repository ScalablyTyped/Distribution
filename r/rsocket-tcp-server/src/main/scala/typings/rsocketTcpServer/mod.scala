package typings.rsocketTcpServer

import typings.rsocketCore.rsocketencodingMod.Encoders
import typings.rsocketTcpServer.rsockettcpserverMod.ServerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rsocket-tcp-server", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  @js.native
  class default protected ()
    extends typings.rsocketTcpServer.rsockettcpserverMod.default {
    def this(options: ServerOptions) = this()
    def this(options: ServerOptions, encoders: Encoders[_]) = this()
  }
}
