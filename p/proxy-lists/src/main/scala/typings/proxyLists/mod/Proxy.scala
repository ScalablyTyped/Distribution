package typings.proxyLists.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Proxy extends js.Object {
  var anonymityLevel: js.UndefOr[AnonymityLevel] = js.native
  var country: String = js.native
  var ipAddress: String = js.native
  var port: Double = js.native
  var protocols: js.UndefOr[js.Array[Protocol]] = js.native
  var source: String = js.native
  var tunnel: js.UndefOr[Boolean] = js.native
}

object Proxy {
  @scala.inline
  def apply(country: String, ipAddress: String, port: Double, source: String): Proxy = {
    val __obj = js.Dynamic.literal(country = country.asInstanceOf[js.Any], ipAddress = ipAddress.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
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
    def setCountry(value: String): Self = this.set("country", value.asInstanceOf[js.Any])
    @scala.inline
    def setIpAddress(value: String): Self = this.set("ipAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnonymityLevel(value: AnonymityLevel): Self = this.set("anonymityLevel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnonymityLevel: Self = this.set("anonymityLevel", js.undefined)
    @scala.inline
    def setProtocolsVarargs(value: Protocol*): Self = this.set("protocols", js.Array(value :_*))
    @scala.inline
    def setProtocols(value: js.Array[Protocol]): Self = this.set("protocols", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProtocols: Self = this.set("protocols", js.undefined)
    @scala.inline
    def setTunnel(value: Boolean): Self = this.set("tunnel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTunnel: Self = this.set("tunnel", js.undefined)
  }
  
}

