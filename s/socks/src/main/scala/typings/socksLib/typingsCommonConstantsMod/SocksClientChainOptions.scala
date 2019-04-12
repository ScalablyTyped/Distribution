package typings
package socksLib.typingsCommonConstantsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SocksClient chain connection options.
  */
trait SocksClientChainOptions extends js.Object {
  var command: socksLib.socksLibStrings.connect
  var destination: SocksRemoteHost
  var proxies: js.Array[SocksProxy]
  var randomizeChain: js.UndefOr[socksLib.socksLibNumbers.`false`] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
}

object SocksClientChainOptions {
  @scala.inline
  def apply(
    command: socksLib.socksLibStrings.connect,
    destination: SocksRemoteHost,
    proxies: js.Array[SocksProxy],
    randomizeChain: socksLib.socksLibNumbers.`false` = null,
    timeout: scala.Int | scala.Double = null
  ): SocksClientChainOptions = {
    val __obj = js.Dynamic.literal(command = command, destination = destination, proxies = proxies)
    if (randomizeChain != null) __obj.updateDynamic("randomizeChain")(randomizeChain)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocksClientChainOptions]
  }
}

