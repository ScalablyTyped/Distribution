package typings
package restifyLib.restifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerOptions extends js.Object {
  var ca: js.UndefOr[
    java.lang.String | nodeLib.Buffer | (js.Array[java.lang.String | nodeLib.Buffer])
  ] = js.undefined
  var cert: js.UndefOr[
    java.lang.String | nodeLib.Buffer | (js.Array[java.lang.String | nodeLib.Buffer])
  ] = js.undefined
  var certificate: js.UndefOr[
    java.lang.String | nodeLib.Buffer | (js.Array[java.lang.String | nodeLib.Buffer])
  ] = js.undefined
  var ciphers: js.UndefOr[java.lang.String] = js.undefined
  var dtrace: js.UndefOr[scala.Boolean] = js.undefined
  var formatters: js.UndefOr[Formatters] = js.undefined
  var handleUncaughtExceptions: js.UndefOr[scala.Boolean] = js.undefined
  var handleUpgrades: js.UndefOr[scala.Boolean] = js.undefined
  var http2: js.UndefOr[js.Any] = js.undefined
  var httpsServerOptions: js.UndefOr[nodeLib.httpsMod.ServerOptions] = js.undefined
  var ignoreTrailingSlash: js.UndefOr[scala.Boolean] = js.undefined
  var key: js.UndefOr[
    java.lang.String | nodeLib.Buffer | (js.Array[java.lang.String | nodeLib.Buffer])
  ] = js.undefined
  var log: js.UndefOr[bunyanLib.bunyanMod.namespaced] = js.undefined
  var name: js.UndefOr[java.lang.String] = js.undefined
  var noWriteContinue: js.UndefOr[scala.Boolean] = js.undefined
  var onceNext: js.UndefOr[scala.Boolean] = js.undefined
  var passphrase: js.UndefOr[java.lang.String] = js.undefined
  var rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined
  var requestCert: js.UndefOr[scala.Boolean] = js.undefined
  var router: js.UndefOr[Router] = js.undefined
  var secureOptions: js.UndefOr[scala.Double] = js.undefined
  var socketio: js.UndefOr[scala.Boolean] = js.undefined
  var spdy: js.UndefOr[spdyLib.spdyMod.ServerOptions] = js.undefined
  var strictNext: js.UndefOr[scala.Boolean] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
  var versions: js.UndefOr[js.Array[java.lang.String]] = js.undefined
}

object ServerOptions {
  @scala.inline
  def apply(
    ca: java.lang.String | nodeLib.Buffer | (js.Array[java.lang.String | nodeLib.Buffer]) = null,
    cert: java.lang.String | nodeLib.Buffer | (js.Array[java.lang.String | nodeLib.Buffer]) = null,
    certificate: java.lang.String | nodeLib.Buffer | (js.Array[java.lang.String | nodeLib.Buffer]) = null,
    ciphers: java.lang.String = null,
    dtrace: js.UndefOr[scala.Boolean] = js.undefined,
    formatters: Formatters = null,
    handleUncaughtExceptions: js.UndefOr[scala.Boolean] = js.undefined,
    handleUpgrades: js.UndefOr[scala.Boolean] = js.undefined,
    http2: js.Any = null,
    httpsServerOptions: nodeLib.httpsMod.ServerOptions = null,
    ignoreTrailingSlash: js.UndefOr[scala.Boolean] = js.undefined,
    key: java.lang.String | nodeLib.Buffer | (js.Array[java.lang.String | nodeLib.Buffer]) = null,
    log: bunyanLib.bunyanMod.namespaced = null,
    name: java.lang.String = null,
    noWriteContinue: js.UndefOr[scala.Boolean] = js.undefined,
    onceNext: js.UndefOr[scala.Boolean] = js.undefined,
    passphrase: java.lang.String = null,
    rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined,
    requestCert: js.UndefOr[scala.Boolean] = js.undefined,
    router: Router = null,
    secureOptions: scala.Int | scala.Double = null,
    socketio: js.UndefOr[scala.Boolean] = js.undefined,
    spdy: spdyLib.spdyMod.ServerOptions = null,
    strictNext: js.UndefOr[scala.Boolean] = js.undefined,
    version: java.lang.String = null,
    versions: js.Array[java.lang.String] = null
  ): ServerOptions = {
    val __obj = js.Dynamic.literal()
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (certificate != null) __obj.updateDynamic("certificate")(certificate.asInstanceOf[js.Any])
    if (ciphers != null) __obj.updateDynamic("ciphers")(ciphers)
    if (!js.isUndefined(dtrace)) __obj.updateDynamic("dtrace")(dtrace)
    if (formatters != null) __obj.updateDynamic("formatters")(formatters)
    if (!js.isUndefined(handleUncaughtExceptions)) __obj.updateDynamic("handleUncaughtExceptions")(handleUncaughtExceptions)
    if (!js.isUndefined(handleUpgrades)) __obj.updateDynamic("handleUpgrades")(handleUpgrades)
    if (http2 != null) __obj.updateDynamic("http2")(http2)
    if (httpsServerOptions != null) __obj.updateDynamic("httpsServerOptions")(httpsServerOptions)
    if (!js.isUndefined(ignoreTrailingSlash)) __obj.updateDynamic("ignoreTrailingSlash")(ignoreTrailingSlash)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(log)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(noWriteContinue)) __obj.updateDynamic("noWriteContinue")(noWriteContinue)
    if (!js.isUndefined(onceNext)) __obj.updateDynamic("onceNext")(onceNext)
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase)
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized)
    if (!js.isUndefined(requestCert)) __obj.updateDynamic("requestCert")(requestCert)
    if (router != null) __obj.updateDynamic("router")(router)
    if (secureOptions != null) __obj.updateDynamic("secureOptions")(secureOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(socketio)) __obj.updateDynamic("socketio")(socketio)
    if (spdy != null) __obj.updateDynamic("spdy")(spdy)
    if (!js.isUndefined(strictNext)) __obj.updateDynamic("strictNext")(strictNext)
    if (version != null) __obj.updateDynamic("version")(version)
    if (versions != null) __obj.updateDynamic("versions")(versions)
    __obj.asInstanceOf[ServerOptions]
  }
}

