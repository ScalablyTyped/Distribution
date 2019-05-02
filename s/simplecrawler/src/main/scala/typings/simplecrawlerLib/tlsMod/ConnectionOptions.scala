package typings
package simplecrawlerLib.tlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ConnectionOptions extends js.Object {
  var ALPNProtocols: js.UndefOr[js.Array[java.lang.String | simplecrawlerLib.Buffer]] = js.undefined
  var NPNProtocols: js.UndefOr[js.Array[java.lang.String | simplecrawlerLib.Buffer]] = js.undefined
  var ca: js.UndefOr[
    java.lang.String | simplecrawlerLib.Buffer | (js.Array[java.lang.String | simplecrawlerLib.Buffer])
  ] = js.undefined
  var cert: js.UndefOr[
    java.lang.String | js.Array[java.lang.String] | simplecrawlerLib.Buffer | js.Array[simplecrawlerLib.Buffer]
  ] = js.undefined
  var checkServerIdentity: js.UndefOr[
    js.Function2[
      /* servername */ java.lang.String, 
      /* cert */ java.lang.String | simplecrawlerLib.Buffer | (js.Array[java.lang.String | simplecrawlerLib.Buffer]), 
      _
    ]
  ] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var key: js.UndefOr[
    java.lang.String | js.Array[java.lang.String] | simplecrawlerLib.Buffer | js.Array[simplecrawlerLib.Buffer]
  ] = js.undefined
  var minDHSize: js.UndefOr[scala.Double] = js.undefined
  var passphrase: js.UndefOr[java.lang.String] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var pfx: js.UndefOr[java.lang.String | simplecrawlerLib.Buffer] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined
  var secureContext: js.UndefOr[js.Object] = js.undefined
  var secureProtocol: js.UndefOr[java.lang.String] = js.undefined
  var servername: js.UndefOr[java.lang.String] = js.undefined
  var session: js.UndefOr[simplecrawlerLib.Buffer] = js.undefined
  var socket: js.UndefOr[simplecrawlerLib.netMod.Socket] = js.undefined
}

object ConnectionOptions {
  @scala.inline
  def apply(
    ALPNProtocols: js.Array[java.lang.String | simplecrawlerLib.Buffer] = null,
    NPNProtocols: js.Array[java.lang.String | simplecrawlerLib.Buffer] = null,
    ca: java.lang.String | simplecrawlerLib.Buffer | (js.Array[java.lang.String | simplecrawlerLib.Buffer]) = null,
    cert: java.lang.String | js.Array[java.lang.String] | simplecrawlerLib.Buffer | js.Array[simplecrawlerLib.Buffer] = null,
    checkServerIdentity: (/* servername */ java.lang.String, /* cert */ java.lang.String | simplecrawlerLib.Buffer | (js.Array[java.lang.String | simplecrawlerLib.Buffer])) => _ = null,
    host: java.lang.String = null,
    key: java.lang.String | js.Array[java.lang.String] | simplecrawlerLib.Buffer | js.Array[simplecrawlerLib.Buffer] = null,
    minDHSize: scala.Int | scala.Double = null,
    passphrase: java.lang.String = null,
    path: java.lang.String = null,
    pfx: java.lang.String | simplecrawlerLib.Buffer = null,
    port: scala.Int | scala.Double = null,
    rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined,
    secureContext: js.Object = null,
    secureProtocol: java.lang.String = null,
    servername: java.lang.String = null,
    session: simplecrawlerLib.Buffer = null,
    socket: simplecrawlerLib.netMod.Socket = null
  ): ConnectionOptions = {
    val __obj = js.Dynamic.literal()
    if (ALPNProtocols != null) __obj.updateDynamic("ALPNProtocols")(ALPNProtocols)
    if (NPNProtocols != null) __obj.updateDynamic("NPNProtocols")(NPNProtocols)
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (checkServerIdentity != null) __obj.updateDynamic("checkServerIdentity")(js.Any.fromFunction2(checkServerIdentity))
    if (host != null) __obj.updateDynamic("host")(host)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (minDHSize != null) __obj.updateDynamic("minDHSize")(minDHSize.asInstanceOf[js.Any])
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase)
    if (path != null) __obj.updateDynamic("path")(path)
    if (pfx != null) __obj.updateDynamic("pfx")(pfx.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized)
    if (secureContext != null) __obj.updateDynamic("secureContext")(secureContext)
    if (secureProtocol != null) __obj.updateDynamic("secureProtocol")(secureProtocol)
    if (servername != null) __obj.updateDynamic("servername")(servername)
    if (session != null) __obj.updateDynamic("session")(session)
    if (socket != null) __obj.updateDynamic("socket")(socket)
    __obj.asInstanceOf[ConnectionOptions]
  }
}

