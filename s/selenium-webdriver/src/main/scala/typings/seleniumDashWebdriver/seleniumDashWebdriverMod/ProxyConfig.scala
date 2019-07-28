package typings.seleniumDashWebdriver.seleniumDashWebdriverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxyConfig extends js.Object {
  var ftpProxy: js.UndefOr[String] = js.undefined
  var httpProxy: js.UndefOr[String] = js.undefined
  var noProxy: js.UndefOr[String] = js.undefined
  var proxyAutoconfigUrl: js.UndefOr[String] = js.undefined
  var proxyType: String
  var socksPassword: js.UndefOr[String] = js.undefined
  var socksProxy: js.UndefOr[String] = js.undefined
  var socksUsername: js.UndefOr[String] = js.undefined
  var sslProxy: js.UndefOr[String] = js.undefined
}

object ProxyConfig {
  @scala.inline
  def apply(
    proxyType: String,
    ftpProxy: String = null,
    httpProxy: String = null,
    noProxy: String = null,
    proxyAutoconfigUrl: String = null,
    socksPassword: String = null,
    socksProxy: String = null,
    socksUsername: String = null,
    sslProxy: String = null
  ): ProxyConfig = {
    val __obj = js.Dynamic.literal(proxyType = proxyType)
    if (ftpProxy != null) __obj.updateDynamic("ftpProxy")(ftpProxy)
    if (httpProxy != null) __obj.updateDynamic("httpProxy")(httpProxy)
    if (noProxy != null) __obj.updateDynamic("noProxy")(noProxy)
    if (proxyAutoconfigUrl != null) __obj.updateDynamic("proxyAutoconfigUrl")(proxyAutoconfigUrl)
    if (socksPassword != null) __obj.updateDynamic("socksPassword")(socksPassword)
    if (socksProxy != null) __obj.updateDynamic("socksProxy")(socksProxy)
    if (socksUsername != null) __obj.updateDynamic("socksUsername")(socksUsername)
    if (sslProxy != null) __obj.updateDynamic("sslProxy")(sslProxy)
    __obj.asInstanceOf[ProxyConfig]
  }
}

