package typings.seleniumWebdriver.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProxyConfig extends js.Object {
  var ftpProxy: js.UndefOr[String] = js.native
  var httpProxy: js.UndefOr[String] = js.native
  var noProxy: js.UndefOr[String] = js.native
  var proxyAutoconfigUrl: js.UndefOr[String] = js.native
  var proxyType: String = js.native
  var socksPassword: js.UndefOr[String] = js.native
  var socksProxy: js.UndefOr[String] = js.native
  var socksUsername: js.UndefOr[String] = js.native
  var sslProxy: js.UndefOr[String] = js.native
}

object ProxyConfig {
  @scala.inline
  def apply(proxyType: String): ProxyConfig = {
    val __obj = js.Dynamic.literal(proxyType = proxyType.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProxyConfig]
  }
  @scala.inline
  implicit class ProxyConfigOps[Self <: ProxyConfig] (val x: Self) extends AnyVal {
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
    def setProxyType(value: String): Self = this.set("proxyType", value.asInstanceOf[js.Any])
    @scala.inline
    def setFtpProxy(value: String): Self = this.set("ftpProxy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFtpProxy: Self = this.set("ftpProxy", js.undefined)
    @scala.inline
    def setHttpProxy(value: String): Self = this.set("httpProxy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHttpProxy: Self = this.set("httpProxy", js.undefined)
    @scala.inline
    def setNoProxy(value: String): Self = this.set("noProxy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNoProxy: Self = this.set("noProxy", js.undefined)
    @scala.inline
    def setProxyAutoconfigUrl(value: String): Self = this.set("proxyAutoconfigUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProxyAutoconfigUrl: Self = this.set("proxyAutoconfigUrl", js.undefined)
    @scala.inline
    def setSocksPassword(value: String): Self = this.set("socksPassword", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSocksPassword: Self = this.set("socksPassword", js.undefined)
    @scala.inline
    def setSocksProxy(value: String): Self = this.set("socksProxy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSocksProxy: Self = this.set("socksProxy", js.undefined)
    @scala.inline
    def setSocksUsername(value: String): Self = this.set("socksUsername", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSocksUsername: Self = this.set("socksUsername", js.undefined)
    @scala.inline
    def setSslProxy(value: String): Self = this.set("sslProxy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSslProxy: Self = this.set("sslProxy", js.undefined)
  }
  
}

