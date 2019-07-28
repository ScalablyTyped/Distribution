package typings.socks.typingsCommonUtilMod

import typings.socks.typingsCommonConstantsMod.SocksClientChainOptions
import typings.socks.typingsCommonConstantsMod.SocksClientOptions
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Error wrapper for SocksClient
  */
@JSImport("socks/typings/common/util", "SocksClientError")
@js.native
class SocksClientError protected () extends Error {
  def this(message: String, options: SocksClientChainOptions) = this()
  def this(message: String, options: SocksClientOptions) = this()
  /* CompleteClass */
  override var message: String = js.native
  /* CompleteClass */
  override var name: String = js.native
  var options: SocksClientOptions | SocksClientChainOptions = js.native
}

