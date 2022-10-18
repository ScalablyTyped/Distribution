package typings.socks

import typings.socks.typingsCommonConstantsMod.SocksClientChainOptions
import typings.socks.typingsCommonConstantsMod.SocksClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Error wrapper for SocksClient
    */
  @JSImport("socks", "SocksClientError")
  @js.native
  open class SocksClientError protected ()
    extends typings.socks.typingsClientSocksclientMod.SocksClientError {
    def this(message: String, options: SocksClientChainOptions) = this()
    def this(message: String, options: SocksClientOptions) = this()
  }
}
