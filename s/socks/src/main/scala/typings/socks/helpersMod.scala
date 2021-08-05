package typings.socks

import typings.socks.constantsMod.SocksClientChainOptions
import typings.socks.constantsMod.SocksClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersMod {
  
  @JSImport("socks/typings/common/helpers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Validates the SocksClientChainOptions
    * @param options { SocksClientChainOptions }
    */
  inline def validateSocksClientChainOptions(options: SocksClientChainOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateSocksClientChainOptions")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Validates the provided SocksClientOptions
    * @param options { SocksClientOptions }
    * @param acceptedCommands { string[] } A list of accepted SocksProxy commands.
    */
  inline def validateSocksClientOptions(options: SocksClientOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("validateSocksClientOptions")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def validateSocksClientOptions(options: SocksClientOptions, acceptedCommands: js.Array[String]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateSocksClientOptions")(options.asInstanceOf[js.Any], acceptedCommands.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
