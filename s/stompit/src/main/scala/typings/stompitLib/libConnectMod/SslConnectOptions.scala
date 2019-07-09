package typings
package stompitLib.libConnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SslConnectOptions
  extends nodeLib.tlsMod.ConnectionOptions
     with BaseConnectOptions
     with ConnectOptions {
  @JSName("ssl")
  var ssl_SslConnectOptions: stompitLib.stompitLibNumbers.`true`
}

object SslConnectOptions {
  @scala.inline
  def apply(
    ssl: stompitLib.stompitLibNumbers.`true`,
    ALPNProtocols: (js.Array[nodeLib.Buffer | java.lang.String | stdLib.Uint8Array]) | nodeLib.Buffer | stdLib.Uint8Array = null,
    SNICallback: (/* servername */ java.lang.String, /* cb */ js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* ctx */ nodeLib.tlsMod.SecureContext, 
      scala.Unit
    ]) => scala.Unit = null,
    ca: java.lang.String | nodeLib.Buffer | (js.Array[java.lang.String | nodeLib.Buffer]) = null,
    cert: java.lang.String | nodeLib.Buffer | (js.Array[java.lang.String | nodeLib.Buffer]) = null,
    checkServerIdentity: (/* host */ java.lang.String, /* cert */ nodeLib.tlsMod.PeerCertificate) => js.UndefOr[nodeLib.Error] = null,
    ciphers: java.lang.String = null,
    clientCertEngine: java.lang.String = null,
    commandHandlers: stompitLib.libSocketMod.CommandHandlers = null,
    connect: (/* options */ ConnectOptions, /* connectionListener */ js.UndefOr[js.Function0[scala.Unit]]) => nodeLib.netMod.Socket = null,
    connectHeaders: ConnectHeaders = null,
    crl: java.lang.String | nodeLib.Buffer | (js.Array[java.lang.String | nodeLib.Buffer]) = null,
    dhparam: java.lang.String | nodeLib.Buffer = null,
    ecdhCurve: java.lang.String = null,
    enableTrace: js.UndefOr[scala.Boolean] = js.undefined,
    heartbeat: stompitLib.libSocketMod.Heartbeat = null,
    heartbeatDelayMargin: scala.Int | scala.Double = null,
    heartbeatOutputMargin: scala.Int | scala.Double = null,
    honorCipherOrder: js.UndefOr[scala.Boolean] = js.undefined,
    host: java.lang.String = null,
    key: java.lang.String | nodeLib.Buffer | (js.Array[nodeLib.Buffer | js.Object]) = null,
    lookup: nodeLib.netMod.LookupFunction = null,
    maxVersion: nodeLib.tlsMod.SecureVersion = null,
    minDHSize: scala.Int | scala.Double = null,
    minVersion: nodeLib.tlsMod.SecureVersion = null,
    outgoingFrameStream: stompitLib.libOutgoingFrameStreamMod.^ = null,
    passphrase: java.lang.String = null,
    path: java.lang.String = null,
    pfx: java.lang.String | nodeLib.Buffer | (js.Array[java.lang.String | nodeLib.Buffer | js.Object]) = null,
    port: scala.Int | scala.Double = null,
    rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined,
    requestCert: js.UndefOr[scala.Boolean] = js.undefined,
    resetDisconnect: js.UndefOr[scala.Boolean] = js.undefined,
    secureContext: nodeLib.tlsMod.SecureContext = null,
    secureOptions: scala.Int | scala.Double = null,
    secureProtocol: java.lang.String = null,
    servername: java.lang.String = null,
    session: nodeLib.Buffer = null,
    sessionIdContext: java.lang.String = null,
    socket: nodeLib.netMod.Socket = null,
    timeout: scala.Int | scala.Double = null,
    unknownCommand: () => scala.Unit = null
  ): SslConnectOptions = {
    val __obj = js.Dynamic.literal(ssl = ssl)
    if (ALPNProtocols != null) __obj.updateDynamic("ALPNProtocols")(ALPNProtocols.asInstanceOf[js.Any])
    if (SNICallback != null) __obj.updateDynamic("SNICallback")(js.Any.fromFunction2(SNICallback))
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (checkServerIdentity != null) __obj.updateDynamic("checkServerIdentity")(js.Any.fromFunction2(checkServerIdentity))
    if (ciphers != null) __obj.updateDynamic("ciphers")(ciphers)
    if (clientCertEngine != null) __obj.updateDynamic("clientCertEngine")(clientCertEngine)
    if (commandHandlers != null) __obj.updateDynamic("commandHandlers")(commandHandlers)
    if (connect != null) __obj.updateDynamic("connect")(js.Any.fromFunction2(connect))
    if (connectHeaders != null) __obj.updateDynamic("connectHeaders")(connectHeaders)
    if (crl != null) __obj.updateDynamic("crl")(crl.asInstanceOf[js.Any])
    if (dhparam != null) __obj.updateDynamic("dhparam")(dhparam.asInstanceOf[js.Any])
    if (ecdhCurve != null) __obj.updateDynamic("ecdhCurve")(ecdhCurve)
    if (!js.isUndefined(enableTrace)) __obj.updateDynamic("enableTrace")(enableTrace)
    if (heartbeat != null) __obj.updateDynamic("heartbeat")(heartbeat)
    if (heartbeatDelayMargin != null) __obj.updateDynamic("heartbeatDelayMargin")(heartbeatDelayMargin.asInstanceOf[js.Any])
    if (heartbeatOutputMargin != null) __obj.updateDynamic("heartbeatOutputMargin")(heartbeatOutputMargin.asInstanceOf[js.Any])
    if (!js.isUndefined(honorCipherOrder)) __obj.updateDynamic("honorCipherOrder")(honorCipherOrder)
    if (host != null) __obj.updateDynamic("host")(host)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (lookup != null) __obj.updateDynamic("lookup")(lookup)
    if (maxVersion != null) __obj.updateDynamic("maxVersion")(maxVersion)
    if (minDHSize != null) __obj.updateDynamic("minDHSize")(minDHSize.asInstanceOf[js.Any])
    if (minVersion != null) __obj.updateDynamic("minVersion")(minVersion)
    if (outgoingFrameStream != null) __obj.updateDynamic("outgoingFrameStream")(outgoingFrameStream)
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase)
    if (path != null) __obj.updateDynamic("path")(path)
    if (pfx != null) __obj.updateDynamic("pfx")(pfx.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized)
    if (!js.isUndefined(requestCert)) __obj.updateDynamic("requestCert")(requestCert)
    if (!js.isUndefined(resetDisconnect)) __obj.updateDynamic("resetDisconnect")(resetDisconnect)
    if (secureContext != null) __obj.updateDynamic("secureContext")(secureContext)
    if (secureOptions != null) __obj.updateDynamic("secureOptions")(secureOptions.asInstanceOf[js.Any])
    if (secureProtocol != null) __obj.updateDynamic("secureProtocol")(secureProtocol)
    if (servername != null) __obj.updateDynamic("servername")(servername)
    if (session != null) __obj.updateDynamic("session")(session)
    if (sessionIdContext != null) __obj.updateDynamic("sessionIdContext")(sessionIdContext)
    if (socket != null) __obj.updateDynamic("socket")(socket)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    if (unknownCommand != null) __obj.updateDynamic("unknownCommand")(js.Any.fromFunction0(unknownCommand))
    __obj.asInstanceOf[SslConnectOptions]
  }
}

