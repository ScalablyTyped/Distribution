package typings
package simplecrawlerLib.tlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TlsOptions extends js.Object {
  var ALPNProtocols: js.UndefOr[js.Array[java.lang.String] | simplecrawlerLib.Buffer] = js.undefined
  var NPNProtocols: js.UndefOr[js.Array[java.lang.String] | simplecrawlerLib.Buffer] = js.undefined
  var SNICallback: js.UndefOr[
    js.Function2[
      /* servername */ java.lang.String, 
      /* cb */ js.Function2[/* err */ simplecrawlerLib.Error, /* ctx */ SecureContext, _], 
      _
    ]
  ] = js.undefined
  var ca: js.UndefOr[
    java.lang.String | js.Array[java.lang.String] | simplecrawlerLib.Buffer | js.Array[simplecrawlerLib.Buffer]
  ] = js.undefined
  var cert: js.UndefOr[
    java.lang.String | js.Array[java.lang.String] | simplecrawlerLib.Buffer | js.Array[simplecrawlerLib.Buffer]
  ] = js.undefined
  var ciphers: js.UndefOr[java.lang.String] = js.undefined
  var crl: js.UndefOr[java.lang.String | js.Array[java.lang.String]] = js.undefined
  var dhparam: js.UndefOr[java.lang.String | simplecrawlerLib.Buffer] = js.undefined
  var ecdhCurve: js.UndefOr[java.lang.String] = js.undefined
  var handshakeTimeout: js.UndefOr[scala.Double] = js.undefined
  var honorCipherOrder: js.UndefOr[scala.Boolean] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var key: js.UndefOr[
    java.lang.String | js.Array[java.lang.String] | simplecrawlerLib.Buffer | js.Array[_]
  ] = js.undefined
  var passphrase: js.UndefOr[java.lang.String] = js.undefined
  var pfx: js.UndefOr[java.lang.String | js.Array[simplecrawlerLib.Buffer]] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined
  var requestCert: js.UndefOr[scala.Boolean] = js.undefined
  var secureProtocol: js.UndefOr[java.lang.String] = js.undefined
  var sessionIdContext: js.UndefOr[java.lang.String] = js.undefined
  var sessionTimeout: js.UndefOr[scala.Double] = js.undefined
  var ticketKeys: js.UndefOr[js.Any] = js.undefined
}

object TlsOptions {
  @scala.inline
  def apply(
    ALPNProtocols: js.Array[java.lang.String] | simplecrawlerLib.Buffer = null,
    NPNProtocols: js.Array[java.lang.String] | simplecrawlerLib.Buffer = null,
    SNICallback: (/* servername */ java.lang.String, /* cb */ js.Function2[/* err */ simplecrawlerLib.Error, /* ctx */ SecureContext, _]) => _ = null,
    ca: java.lang.String | js.Array[java.lang.String] | simplecrawlerLib.Buffer | js.Array[simplecrawlerLib.Buffer] = null,
    cert: java.lang.String | js.Array[java.lang.String] | simplecrawlerLib.Buffer | js.Array[simplecrawlerLib.Buffer] = null,
    ciphers: java.lang.String = null,
    crl: java.lang.String | js.Array[java.lang.String] = null,
    dhparam: java.lang.String | simplecrawlerLib.Buffer = null,
    ecdhCurve: java.lang.String = null,
    handshakeTimeout: scala.Int | scala.Double = null,
    honorCipherOrder: js.UndefOr[scala.Boolean] = js.undefined,
    host: java.lang.String = null,
    key: java.lang.String | js.Array[java.lang.String] | simplecrawlerLib.Buffer | js.Array[_] = null,
    passphrase: java.lang.String = null,
    pfx: java.lang.String | js.Array[simplecrawlerLib.Buffer] = null,
    port: scala.Int | scala.Double = null,
    rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined,
    requestCert: js.UndefOr[scala.Boolean] = js.undefined,
    secureProtocol: java.lang.String = null,
    sessionIdContext: java.lang.String = null,
    sessionTimeout: scala.Int | scala.Double = null,
    ticketKeys: js.Any = null
  ): TlsOptions = {
    val __obj = js.Dynamic.literal()
    if (ALPNProtocols != null) __obj.updateDynamic("ALPNProtocols")(ALPNProtocols.asInstanceOf[js.Any])
    if (NPNProtocols != null) __obj.updateDynamic("NPNProtocols")(NPNProtocols.asInstanceOf[js.Any])
    if (SNICallback != null) __obj.updateDynamic("SNICallback")(js.Any.fromFunction2(SNICallback))
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (ciphers != null) __obj.updateDynamic("ciphers")(ciphers)
    if (crl != null) __obj.updateDynamic("crl")(crl.asInstanceOf[js.Any])
    if (dhparam != null) __obj.updateDynamic("dhparam")(dhparam.asInstanceOf[js.Any])
    if (ecdhCurve != null) __obj.updateDynamic("ecdhCurve")(ecdhCurve)
    if (handshakeTimeout != null) __obj.updateDynamic("handshakeTimeout")(handshakeTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(honorCipherOrder)) __obj.updateDynamic("honorCipherOrder")(honorCipherOrder)
    if (host != null) __obj.updateDynamic("host")(host)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase)
    if (pfx != null) __obj.updateDynamic("pfx")(pfx.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized)
    if (!js.isUndefined(requestCert)) __obj.updateDynamic("requestCert")(requestCert)
    if (secureProtocol != null) __obj.updateDynamic("secureProtocol")(secureProtocol)
    if (sessionIdContext != null) __obj.updateDynamic("sessionIdContext")(sessionIdContext)
    if (sessionTimeout != null) __obj.updateDynamic("sessionTimeout")(sessionTimeout.asInstanceOf[js.Any])
    if (ticketKeys != null) __obj.updateDynamic("ticketKeys")(ticketKeys)
    __obj.asInstanceOf[TlsOptions]
  }
}

