package typings.socks

import typings.socks.constantsMod.SocksClientChainOptions
import typings.socks.constantsMod.SocksClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object helpersMod {
  
  /**
    * Validates the SocksClientChainOptions
    * @param options { SocksClientChainOptions }
    */
  @JSImport("socks/typings/common/helpers", "validateSocksClientChainOptions")
  @js.native
  def validateSocksClientChainOptions(options: SocksClientChainOptions): Unit = js.native
  
  /**
    * Validates the provided SocksClientOptions
    * @param options { SocksClientOptions }
    * @param acceptedCommands { string[] } A list of accepted SocksProxy commands.
    */
  @JSImport("socks/typings/common/helpers", "validateSocksClientOptions")
  @js.native
  def validateSocksClientOptions(options: SocksClientOptions): Unit = js.native
  @JSImport("socks/typings/common/helpers", "validateSocksClientOptions")
  @js.native
  def validateSocksClientOptions(options: SocksClientOptions, acceptedCommands: js.Array[String]): Unit = js.native
}
