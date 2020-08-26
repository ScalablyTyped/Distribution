package typings.proxyVerifier.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Proxy extends js.Object {
  /**
    * Proxy-Authorization header
    */
  var auth: js.UndefOr[String] = js.native
  var ipAddress: String = js.native
  var port: Double = js.native
  var protocol: js.UndefOr[Protocol] = js.native
  var protocols: js.UndefOr[js.Array[Protocol]] = js.native
}

object Proxy {
  @scala.inline
  def apply(ipAddress: String, port: Double): Proxy = {
    val __obj = js.Dynamic.literal(ipAddress = ipAddress.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any])
    __obj.asInstanceOf[Proxy]
  }
  @scala.inline
  implicit class ProxyOps[Self <: Proxy] (val x: Self) extends AnyVal {
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
    def setIpAddress(value: String): Self = this.set("ipAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def setAuth(value: String): Self = this.set("auth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuth: Self = this.set("auth", js.undefined)
    @scala.inline
    def setProtocol(value: Protocol): Self = this.set("protocol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocol: Self = this.set("protocol", js.undefined)
    @scala.inline
    def setProtocolsVarargs(value: Protocol*): Self = this.set("protocols", js.Array(value :_*))
    @scala.inline
    def setProtocols(value: js.Array[Protocol]): Self = this.set("protocols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocols: Self = this.set("protocols", js.undefined)
  }
  
}

