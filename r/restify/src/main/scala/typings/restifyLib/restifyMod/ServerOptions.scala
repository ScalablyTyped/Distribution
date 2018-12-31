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

