package typings
package socksLib.typingsCommonUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Error wrapper for SocksClient
  */
@JSImport("socks/typings/common/util", "SocksClientError")
@js.native
class SocksClientError protected ()
  extends stdLib.Error {
  def this(message: java.lang.String, options: socksLib.typingsCommonConstantsMod.SocksClientChainOptions) = this()
  def this(message: java.lang.String, options: socksLib.typingsCommonConstantsMod.SocksClientOptions) = this()
  /* CompleteClass */
  override var message: java.lang.String = js.native
  /* CompleteClass */
  override var name: java.lang.String = js.native
  var options: socksLib.typingsCommonConstantsMod.SocksClientOptions | socksLib.typingsCommonConstantsMod.SocksClientChainOptions = js.native
}

