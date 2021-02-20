package typings.rsocketTcpServer

import typings.rsocketCore.rsocketencodingMod.Encoders
import typings.rsocketTcpServer.rsockettcpserverMod.ServerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rsocket-tcp-server", JSImport.Default)
  @js.native
  class default protected ()
    extends typings.rsocketTcpServer.rsockettcpserverMod.default {
    def this(options: ServerOptions) = this()
    def this(options: ServerOptions, encoders: Encoders[_]) = this()
  }
}
