package typings.socks

import typings.socks.typingsCommonConstantsMod.SocksClientChainOptions
import typings.socks.typingsCommonConstantsMod.SocksClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("socks/typings/common/helpers", JSImport.Namespace)
@js.native
object typingsCommonHelpersMod extends js.Object {
  /**
    * Validates the SocksClientChainOptions
    * @param options { SocksClientChainOptions }
    */
  def validateSocksClientChainOptions(options: SocksClientChainOptions): Unit = js.native
  /**
    * Validates the provided SocksClientOptions
    * @param options { SocksClientOptions }
    * @param acceptedCommands { string[] } A list of accepted SocksProxy commands.
    */
  def validateSocksClientOptions(options: SocksClientOptions): Unit = js.native
  def validateSocksClientOptions(options: SocksClientOptions, acceptedCommands: js.Array[String]): Unit = js.native
}

