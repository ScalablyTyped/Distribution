package typings.socks.typingsCommonConstantsMod

import typings.socks.socksNumbers.`false`
import typings.socks.socksStrings.connect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SocksClient chain connection options.
  */
trait SocksClientChainOptions extends js.Object {
  var command: connect
  var destination: SocksRemoteHost
  var proxies: js.Array[SocksProxy]
  var randomizeChain: js.UndefOr[`false`] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
}

object SocksClientChainOptions {
  @scala.inline
  def apply(
    command: connect,
    destination: SocksRemoteHost,
    proxies: js.Array[SocksProxy],
    randomizeChain: `false` = null,
    timeout: Int | Double = null
  ): SocksClientChainOptions = {
    val __obj = js.Dynamic.literal(command = command, destination = destination, proxies = proxies)
    if (randomizeChain != null) __obj.updateDynamic("randomizeChain")(randomizeChain)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocksClientChainOptions]
  }
}

