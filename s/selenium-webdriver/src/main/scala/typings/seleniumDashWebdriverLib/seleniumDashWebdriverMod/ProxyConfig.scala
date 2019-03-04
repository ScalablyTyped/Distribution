package typings
package seleniumDashWebdriverLib.seleniumDashWebdriverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxyConfig extends js.Object {
  var ftpProxy: js.UndefOr[java.lang.String] = js.undefined
  var httpProxy: js.UndefOr[java.lang.String] = js.undefined
  var noProxy: js.UndefOr[java.lang.String] = js.undefined
  var proxyAutoconfigUrl: js.UndefOr[java.lang.String] = js.undefined
  var proxyType: java.lang.String
  var socksPassword: js.UndefOr[java.lang.String] = js.undefined
  var socksProxy: js.UndefOr[java.lang.String] = js.undefined
  var socksUsername: js.UndefOr[java.lang.String] = js.undefined
  var sslProxy: js.UndefOr[java.lang.String] = js.undefined
}

object ProxyConfig {
  @scala.inline
  def apply(
    proxyType: java.lang.String,
    ftpProxy: java.lang.String = null,
    httpProxy: java.lang.String = null,
    noProxy: java.lang.String = null,
    proxyAutoconfigUrl: java.lang.String = null,
    socksPassword: java.lang.String = null,
    socksProxy: java.lang.String = null,
    socksUsername: java.lang.String = null,
    sslProxy: java.lang.String = null
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

