package typings.rsocketDashTcpDashServer

import typings.rsocketDashCore.rSocketEncodingMod.Encoders
import typings.rsocketDashTcpDashServer.rSocketTCPServerMod.ServerOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsocket-tcp-server", JSImport.Namespace)
@js.native
object rsocketDashTcpDashServerMod extends js.Object {
  @js.native
  class default protected ()
    extends typings.rsocketDashTcpDashServer.rSocketTCPServerMod.default {
    def this(options: ServerOptions) = this()
    def this(options: ServerOptions, encoders: Encoders[_]) = this()
  }
  
}

