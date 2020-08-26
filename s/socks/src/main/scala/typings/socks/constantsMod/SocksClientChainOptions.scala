package typings.socks.constantsMod

import typings.socks.socksBooleans.`false`
import typings.socks.socksStrings.connect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SocksClient chain connection options.
  */
@js.native
trait SocksClientChainOptions extends js.Object {
  var command: connect = js.native
  var destination: SocksRemoteHost = js.native
  var proxies: js.Array[SocksProxy] = js.native
  var randomizeChain: js.UndefOr[`false`] = js.native
  var timeout: js.UndefOr[Double] = js.native
}

object SocksClientChainOptions {
  @scala.inline
  def apply(command: connect, destination: SocksRemoteHost, proxies: js.Array[SocksProxy]): SocksClientChainOptions = {
    val __obj = js.Dynamic.literal(command = command.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], proxies = proxies.asInstanceOf[js.Any])
    __obj.asInstanceOf[SocksClientChainOptions]
  }
  @scala.inline
  implicit class SocksClientChainOptionsOps[Self <: SocksClientChainOptions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCommand(value: connect): Self = this.set("command", value.asInstanceOf[js.Any])
    @scala.inline
    def setDestination(value: SocksRemoteHost): Self = this.set("destination", value.asInstanceOf[js.Any])
    @scala.inline
    def setProxiesVarargs(value: SocksProxy*): Self = this.set("proxies", js.Array(value :_*))
    @scala.inline
    def setProxies(value: js.Array[SocksProxy]): Self = this.set("proxies", value.asInstanceOf[js.Any])
    @scala.inline
    def setRandomizeChain(value: `false`): Self = this.set("randomizeChain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRandomizeChain: Self = this.set("randomizeChain", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

