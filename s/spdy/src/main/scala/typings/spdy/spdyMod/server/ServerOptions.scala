package typings.spdy.spdyMod.server

import org.scalablytyped.runtime.Instantiable1
import typings.node.Buffer
import typings.node.Error
import typings.node.tlsMod.SecureContext
import typings.node.tlsMod.SecureVersion
import typings.node.tlsMod.TlsOptions
import typings.spdy.Anon_Connection
import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ServerOptions
  extends TlsOptions
     with typings.node.httpMod.ServerOptions {
  var spdy: js.UndefOr[Anon_Connection] = js.undefined
}

object ServerOptions {
  @scala.inline
  def apply(
    ALPNProtocols: (js.Array[String | Uint8Array]) | Uint8Array = null,
    IncomingMessage: Instantiable1[/* socket */ typings.node.netMod.Socket, typings.node.httpMod.IncomingMessage] = null,
    SNICallback: (/* servername */ String, /* cb */ js.Function2[/* err */ Error | Null, /* ctx */ SecureContext, Unit]) => Unit = null,
    ServerResponse: Instantiable1[
      /* req */ typings.node.httpMod.IncomingMessage, 
      typings.node.httpMod.ServerResponse
    ] = null,
    ca: String | Buffer | (js.Array[String | Buffer]) = null,
    cert: String | Buffer | (js.Array[String | Buffer]) = null,
    ciphers: String = null,
    clientCertEngine: String = null,
    crl: String | Buffer | (js.Array[String | Buffer]) = null,
    dhparam: String | Buffer = null,
    ecdhCurve: String = null,
    enableTrace: js.UndefOr[Boolean] = js.undefined,
    handshakeTimeout: Int | Double = null,
    honorCipherOrder: js.UndefOr[Boolean] = js.undefined,
    key: String | Buffer | (js.Array[Buffer | js.Object]) = null,
    maxVersion: SecureVersion = null,
    minVersion: SecureVersion = null,
    passphrase: String = null,
    pfx: String | Buffer | (js.Array[String | Buffer | js.Object]) = null,
    rejectUnauthorized: js.UndefOr[Boolean] = js.undefined,
    requestCert: js.UndefOr[Boolean] = js.undefined,
    secureContext: SecureContext = null,
    secureOptions: Int | Double = null,
    secureProtocol: String = null,
    sessionIdContext: String = null,
    sessionTimeout: Int | Double = null,
    spdy: Anon_Connection = null,
    ticketKeys: Buffer = null
  ): ServerOptions = {
    val __obj = js.Dynamic.literal()
    if (ALPNProtocols != null) __obj.updateDynamic("ALPNProtocols")(ALPNProtocols.asInstanceOf[js.Any])
    if (IncomingMessage != null) __obj.updateDynamic("IncomingMessage")(IncomingMessage)
    if (SNICallback != null) __obj.updateDynamic("SNICallback")(js.Any.fromFunction2(SNICallback))
    if (ServerResponse != null) __obj.updateDynamic("ServerResponse")(ServerResponse)
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (ciphers != null) __obj.updateDynamic("ciphers")(ciphers)
    if (clientCertEngine != null) __obj.updateDynamic("clientCertEngine")(clientCertEngine)
    if (crl != null) __obj.updateDynamic("crl")(crl.asInstanceOf[js.Any])
    if (dhparam != null) __obj.updateDynamic("dhparam")(dhparam.asInstanceOf[js.Any])
    if (ecdhCurve != null) __obj.updateDynamic("ecdhCurve")(ecdhCurve)
    if (!js.isUndefined(enableTrace)) __obj.updateDynamic("enableTrace")(enableTrace)
    if (handshakeTimeout != null) __obj.updateDynamic("handshakeTimeout")(handshakeTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(honorCipherOrder)) __obj.updateDynamic("honorCipherOrder")(honorCipherOrder)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (maxVersion != null) __obj.updateDynamic("maxVersion")(maxVersion)
    if (minVersion != null) __obj.updateDynamic("minVersion")(minVersion)
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase)
    if (pfx != null) __obj.updateDynamic("pfx")(pfx.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized)
    if (!js.isUndefined(requestCert)) __obj.updateDynamic("requestCert")(requestCert)
    if (secureContext != null) __obj.updateDynamic("secureContext")(secureContext)
    if (secureOptions != null) __obj.updateDynamic("secureOptions")(secureOptions.asInstanceOf[js.Any])
    if (secureProtocol != null) __obj.updateDynamic("secureProtocol")(secureProtocol)
    if (sessionIdContext != null) __obj.updateDynamic("sessionIdContext")(sessionIdContext)
    if (sessionTimeout != null) __obj.updateDynamic("sessionTimeout")(sessionTimeout.asInstanceOf[js.Any])
    if (spdy != null) __obj.updateDynamic("spdy")(spdy)
    if (ticketKeys != null) __obj.updateDynamic("ticketKeys")(ticketKeys)
    __obj.asInstanceOf[ServerOptions]
  }
}

