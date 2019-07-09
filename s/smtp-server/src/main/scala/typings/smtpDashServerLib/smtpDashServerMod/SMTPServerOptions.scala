package typings
package smtpDashServerLib.smtpDashServerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SMTPServerOptions
  extends nodeLib.tlsMod.TlsOptions {
  /**
    * optional boolean, if set to true allows authentication even if connection is not secured first
    */
  var allowInsecureAuth: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * optional array of allowed authentication methods, defaults to ['PLAIN', 'LOGIN'].
    * Only the methods listed in this array are allowed,
    * so if you set it to ['XOAUTH2'] then PLAIN and LOGIN are not available.
    * Use ['PLAIN', 'LOGIN', 'XOAUTH2'] to allow all three.
    * Authentication is only allowed in secure mode
    * (either the server is started with secure: true option or STARTTLS command is used)
    */
  var authMethods: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * allow authentication, but do not require it
    */
  var authOptional: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * optional greeting message.
    * This message is appended to the default ESMTP response.
    */
  var banner: js.UndefOr[java.lang.String] = js.undefined
  /** optionally override the trusted CA certificates */
  @JSName("ca")
  var ca_SMTPServerOptions: js.UndefOr[
    java.lang.String | (js.Array[nodeLib.Buffer | java.lang.String]) | nodeLib.Buffer
  ] = js.undefined
  /** optional cert chains in PEM format */
  @JSName("cert")
  var cert_SMTPServerOptions: js.UndefOr[
    java.lang.String | (js.Array[nodeLib.Buffer | java.lang.String]) | nodeLib.Buffer
  ] = js.undefined
  /**
    * How many millisceonds to wait before disconnecting pending
    * connections once `server.close()` has been called (defaults to 30 seconds)
    */
  var closeTimeout: js.UndefOr[ms] = js.undefined
  /**
    * optional boolean, if set to true then does not try to reverse resolve client hostname
    */
  var disableReverseLookup: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * optional array of disabled commands (see all supported commands here).
    * For example if you want to disable authentication,
    * use ['AUTH'] as this value.
    * If you want to allow authentication in clear text, set it to ['STARTTLS'].
    */
  var disabledCommands: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * optional boolean, if set to true then does not show 8BITMIME in features list
    */
  var hide8BITMIME: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * optional boolean, if set to true then does not show PIPELINING in feature list
    */
  var hidePIPELINING: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * optional boolean, if set to true then does not show SMTPUTF8 in features list
    */
  var hideSMTPUTF8: js.UndefOr[scala.Boolean] = js.undefined
   // TODO: ('AUTH' | 'STARTTLS' | 'XCLIENT' | 'XFORWARD')[];
  /**
    * optional boolean, if set to true then allow using STARTTLS
    * but do not advertise or require it. It only makes sense
    * when creating integration test servers for testing the scenario
    * where you want to try STARTTLS even when it is not advertised
    */
  var hideSTARTTLS: js.UndefOr[scala.Boolean] = js.undefined
  /** optional private keys in PEM format */
  @JSName("key")
  var key_SMTPServerOptions: js.UndefOr[
    java.lang.String | (js.Array[smtpDashServerLib.Anon_Passphrase | nodeLib.Buffer | java.lang.String]) | nodeLib.Buffer
  ] = js.undefined
  /**
    * boolean, if set to true use LMTP protocol instead of SMTP
    */
  var lmtp: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * optional bunyan compatible logger instance.
    * If set to true then logs to console.
    * If value is not set or is false then nothing is logged
    */
  var logger: js.UndefOr[nodemailerLib.libSharedMod.Logger | scala.Boolean] = js.undefined
  /**
    * sets the maximum number of concurrently connected clients, defaults to Infinity
    */
  var maxClients: js.UndefOr[scala.Double] = js.undefined
  /**
    * optional hostname of the server,
    * used for identifying to the client (defaults to os.hostname())
    */
  var name: js.UndefOr[java.lang.String] = js.undefined
  /**
    * optional boolean, if set to true then upgrade sockets to TLS immediately after connection is established. Works with secure: true
    */
  var needsUpgrade: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * The callback to handle authentications ([see details](https://github.com/andris9/smtp-server#handling-authentication))
    */
  var onAuth: js.UndefOr[
    js.Function3[
      /* auth */ SMTPServerAuthentication, 
      /* session */ SMTPServerSession, 
      /* callback */ js.Function2[
        /* err */ js.UndefOr[stdLib.Error | scala.Null], 
        /* response */ js.UndefOr[SMTPServerAuthenticationResponse], 
        scala.Unit
      ], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * the callback that informs about closed client connection
    */
  var onClose: js.UndefOr[
    js.Function2[
      /* session */ SMTPServerSession, 
      /* callback */ js.Function1[/* err */ js.UndefOr[stdLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * The callback to handle the client connection. ([see details](https://github.com/andris9/smtp-server#validating-client-connection))
    */
  var onConnect: js.UndefOr[
    js.Function2[
      /* session */ SMTPServerSession, 
      /* callback */ js.Function1[/* err */ js.UndefOr[stdLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * the callback to handle incoming messages ([see details](https://github.com/andris9/smtp-server#processing-incoming-message))
    */
  var onData: js.UndefOr[
    js.Function3[
      /* stream */ SMTPServerDataStream, 
      /* session */ SMTPServerSession, 
      /* callback */ js.Function1[/* err */ js.UndefOr[stdLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * the callback to validate MAIL FROM commands ([see details](https://github.com/andris9/smtp-server#validating-sender-addresses))
    */
  var onMailFrom: js.UndefOr[
    js.Function3[
      /* address */ SMTPServerAddress, 
      /* session */ SMTPServerSession, 
      /* callback */ js.Function1[/* err */ js.UndefOr[stdLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * The callback to validate RCPT TO commands ([see details](https://github.com/andris9/smtp-server#validating-recipient-addresses))
    */
  var onRcptTo: js.UndefOr[
    js.Function3[
      /* address */ SMTPServerAddress, 
      /* session */ SMTPServerSession, 
      /* callback */ js.Function1[/* err */ js.UndefOr[stdLib.Error | scala.Null], scala.Unit], 
      scala.Unit
    ]
  ] = js.undefined
  /**
    * if true, the connection will use TLS. The default is false.
    * If the server doesn't start in TLS mode,
    * it is still possible to upgrade clear text socket to
    * TLS socket with the STARTTLS command (unless you disable support for it).
    * If secure is true, additional tls options for tls.
    * createServer can be added directly onto this options object.
    */
  var secure: js.UndefOr[scala.Boolean] = js.undefined
  /** indicate an TLS server where TLS is handled upstream */
  var secured: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * optional maximum allowed message size in bytes
    * ([see details](https://github.com/andris9/smtp-server#using-size-extension))
    */
  var size: js.UndefOr[scala.Double] = js.undefined
  /**
    * optional Map or an object of TLS options for SNI where servername is the key. Overrided by SNICallback.
    */
  var sniOptions: js.UndefOr[
    org.scalablytyped.runtime.StringDictionary[nodeLib.tlsMod.TlsOptions] | (stdLib.Map[java.lang.String, nodeLib.tlsMod.TlsOptions])
  ] = js.undefined
  /**
    * How many milliseconds of inactivity to allow before disconnecting the client (defaults to 1 minute)
    */
  var socketTimeout: js.UndefOr[ms] = js.undefined
  /**
    * boolean, if set to true expects to be behind a proxy that emits a
    * [PROXY](http://www.haproxy.org/download/1.5/doc/proxy-protocol.txt) header (version 1 only)
    */
  var useProxy: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * boolean, if set to true, enables usage of
    * [XCLIENT](http://www.postfix.org/XCLIENT_README.html) extension to override connection properties.
    * See session.xClient (Map object) for the details provided by the client
    */
  var useXClient: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * boolean, if set to true, enables usage of [XFORWARD](http://www.postfix.org/XFORWARD_README.html) extension.
    * See session.xForward (Map object) for the details provided by the client
    */
  var useXForward: js.UndefOr[scala.Boolean] = js.undefined
}

object SMTPServerOptions {
  @scala.inline
  def apply(
    ALPNProtocols: (js.Array[nodeLib.Buffer | java.lang.String | stdLib.Uint8Array]) | nodeLib.Buffer | stdLib.Uint8Array = null,
    SNICallback: (/* servername */ java.lang.String, /* cb */ js.Function2[
      /* err */ nodeLib.Error | scala.Null, 
      /* ctx */ nodeLib.tlsMod.SecureContext, 
      scala.Unit
    ]) => scala.Unit = null,
    allowInsecureAuth: js.UndefOr[scala.Boolean] = js.undefined,
    authMethods: js.Array[java.lang.String] = null,
    authOptional: js.UndefOr[scala.Boolean] = js.undefined,
    banner: java.lang.String = null,
    ca: java.lang.String | (js.Array[nodeLib.Buffer | java.lang.String]) | nodeLib.Buffer = null,
    cert: java.lang.String | (js.Array[nodeLib.Buffer | java.lang.String]) | nodeLib.Buffer = null,
    ciphers: java.lang.String = null,
    clientCertEngine: java.lang.String = null,
    closeTimeout: js.UndefOr[ms] = js.undefined,
    crl: java.lang.String | nodeLib.Buffer | (js.Array[java.lang.String | nodeLib.Buffer]) = null,
    dhparam: java.lang.String | nodeLib.Buffer = null,
    disableReverseLookup: js.UndefOr[scala.Boolean] = js.undefined,
    disabledCommands: js.Array[java.lang.String] = null,
    ecdhCurve: java.lang.String = null,
    enableTrace: js.UndefOr[scala.Boolean] = js.undefined,
    handshakeTimeout: scala.Int | scala.Double = null,
    hide8BITMIME: js.UndefOr[scala.Boolean] = js.undefined,
    hidePIPELINING: js.UndefOr[scala.Boolean] = js.undefined,
    hideSMTPUTF8: js.UndefOr[scala.Boolean] = js.undefined,
    hideSTARTTLS: js.UndefOr[scala.Boolean] = js.undefined,
    honorCipherOrder: js.UndefOr[scala.Boolean] = js.undefined,
    key: java.lang.String | (js.Array[smtpDashServerLib.Anon_Passphrase | nodeLib.Buffer | java.lang.String]) | nodeLib.Buffer = null,
    lmtp: js.UndefOr[scala.Boolean] = js.undefined,
    logger: nodemailerLib.libSharedMod.Logger | scala.Boolean = null,
    maxClients: scala.Int | scala.Double = null,
    maxVersion: nodeLib.tlsMod.SecureVersion = null,
    minVersion: nodeLib.tlsMod.SecureVersion = null,
    name: java.lang.String = null,
    needsUpgrade: js.UndefOr[scala.Boolean] = js.undefined,
    onAuth: (/* auth */ SMTPServerAuthentication, /* session */ SMTPServerSession, /* callback */ js.Function2[
      /* err */ js.UndefOr[stdLib.Error | scala.Null], 
      /* response */ js.UndefOr[SMTPServerAuthenticationResponse], 
      scala.Unit
    ]) => scala.Unit = null,
    onClose: (/* session */ SMTPServerSession, /* callback */ js.Function1[/* err */ js.UndefOr[stdLib.Error | scala.Null], scala.Unit]) => scala.Unit = null,
    onConnect: (/* session */ SMTPServerSession, /* callback */ js.Function1[/* err */ js.UndefOr[stdLib.Error | scala.Null], scala.Unit]) => scala.Unit = null,
    onData: (/* stream */ SMTPServerDataStream, /* session */ SMTPServerSession, /* callback */ js.Function1[/* err */ js.UndefOr[stdLib.Error | scala.Null], scala.Unit]) => scala.Unit = null,
    onMailFrom: (/* address */ SMTPServerAddress, /* session */ SMTPServerSession, /* callback */ js.Function1[/* err */ js.UndefOr[stdLib.Error | scala.Null], scala.Unit]) => scala.Unit = null,
    onRcptTo: (/* address */ SMTPServerAddress, /* session */ SMTPServerSession, /* callback */ js.Function1[/* err */ js.UndefOr[stdLib.Error | scala.Null], scala.Unit]) => scala.Unit = null,
    passphrase: java.lang.String = null,
    pfx: java.lang.String | nodeLib.Buffer | (js.Array[java.lang.String | nodeLib.Buffer | js.Object]) = null,
    rejectUnauthorized: js.UndefOr[scala.Boolean] = js.undefined,
    requestCert: js.UndefOr[scala.Boolean] = js.undefined,
    secure: js.UndefOr[scala.Boolean] = js.undefined,
    secureContext: nodeLib.tlsMod.SecureContext = null,
    secureOptions: scala.Int | scala.Double = null,
    secureProtocol: java.lang.String = null,
    secured: js.UndefOr[scala.Boolean] = js.undefined,
    sessionIdContext: java.lang.String = null,
    sessionTimeout: scala.Int | scala.Double = null,
    size: scala.Int | scala.Double = null,
    sniOptions: org.scalablytyped.runtime.StringDictionary[nodeLib.tlsMod.TlsOptions] | (stdLib.Map[java.lang.String, nodeLib.tlsMod.TlsOptions]) = null,
    socketTimeout: js.UndefOr[ms] = js.undefined,
    ticketKeys: nodeLib.Buffer = null,
    useProxy: js.UndefOr[scala.Boolean] = js.undefined,
    useXClient: js.UndefOr[scala.Boolean] = js.undefined,
    useXForward: js.UndefOr[scala.Boolean] = js.undefined
  ): SMTPServerOptions = {
    val __obj = js.Dynamic.literal()
    if (ALPNProtocols != null) __obj.updateDynamic("ALPNProtocols")(ALPNProtocols.asInstanceOf[js.Any])
    if (SNICallback != null) __obj.updateDynamic("SNICallback")(js.Any.fromFunction2(SNICallback))
    if (!js.isUndefined(allowInsecureAuth)) __obj.updateDynamic("allowInsecureAuth")(allowInsecureAuth)
    if (authMethods != null) __obj.updateDynamic("authMethods")(authMethods)
    if (!js.isUndefined(authOptional)) __obj.updateDynamic("authOptional")(authOptional)
    if (banner != null) __obj.updateDynamic("banner")(banner)
    if (ca != null) __obj.updateDynamic("ca")(ca.asInstanceOf[js.Any])
    if (cert != null) __obj.updateDynamic("cert")(cert.asInstanceOf[js.Any])
    if (ciphers != null) __obj.updateDynamic("ciphers")(ciphers)
    if (clientCertEngine != null) __obj.updateDynamic("clientCertEngine")(clientCertEngine)
    if (!js.isUndefined(closeTimeout)) __obj.updateDynamic("closeTimeout")(closeTimeout)
    if (crl != null) __obj.updateDynamic("crl")(crl.asInstanceOf[js.Any])
    if (dhparam != null) __obj.updateDynamic("dhparam")(dhparam.asInstanceOf[js.Any])
    if (!js.isUndefined(disableReverseLookup)) __obj.updateDynamic("disableReverseLookup")(disableReverseLookup)
    if (disabledCommands != null) __obj.updateDynamic("disabledCommands")(disabledCommands)
    if (ecdhCurve != null) __obj.updateDynamic("ecdhCurve")(ecdhCurve)
    if (!js.isUndefined(enableTrace)) __obj.updateDynamic("enableTrace")(enableTrace)
    if (handshakeTimeout != null) __obj.updateDynamic("handshakeTimeout")(handshakeTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(hide8BITMIME)) __obj.updateDynamic("hide8BITMIME")(hide8BITMIME)
    if (!js.isUndefined(hidePIPELINING)) __obj.updateDynamic("hidePIPELINING")(hidePIPELINING)
    if (!js.isUndefined(hideSMTPUTF8)) __obj.updateDynamic("hideSMTPUTF8")(hideSMTPUTF8)
    if (!js.isUndefined(hideSTARTTLS)) __obj.updateDynamic("hideSTARTTLS")(hideSTARTTLS)
    if (!js.isUndefined(honorCipherOrder)) __obj.updateDynamic("honorCipherOrder")(honorCipherOrder)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(lmtp)) __obj.updateDynamic("lmtp")(lmtp)
    if (logger != null) __obj.updateDynamic("logger")(logger.asInstanceOf[js.Any])
    if (maxClients != null) __obj.updateDynamic("maxClients")(maxClients.asInstanceOf[js.Any])
    if (maxVersion != null) __obj.updateDynamic("maxVersion")(maxVersion)
    if (minVersion != null) __obj.updateDynamic("minVersion")(minVersion)
    if (name != null) __obj.updateDynamic("name")(name)
    if (!js.isUndefined(needsUpgrade)) __obj.updateDynamic("needsUpgrade")(needsUpgrade)
    if (onAuth != null) __obj.updateDynamic("onAuth")(js.Any.fromFunction3(onAuth))
    if (onClose != null) __obj.updateDynamic("onClose")(js.Any.fromFunction2(onClose))
    if (onConnect != null) __obj.updateDynamic("onConnect")(js.Any.fromFunction2(onConnect))
    if (onData != null) __obj.updateDynamic("onData")(js.Any.fromFunction3(onData))
    if (onMailFrom != null) __obj.updateDynamic("onMailFrom")(js.Any.fromFunction3(onMailFrom))
    if (onRcptTo != null) __obj.updateDynamic("onRcptTo")(js.Any.fromFunction3(onRcptTo))
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase)
    if (pfx != null) __obj.updateDynamic("pfx")(pfx.asInstanceOf[js.Any])
    if (!js.isUndefined(rejectUnauthorized)) __obj.updateDynamic("rejectUnauthorized")(rejectUnauthorized)
    if (!js.isUndefined(requestCert)) __obj.updateDynamic("requestCert")(requestCert)
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure)
    if (secureContext != null) __obj.updateDynamic("secureContext")(secureContext)
    if (secureOptions != null) __obj.updateDynamic("secureOptions")(secureOptions.asInstanceOf[js.Any])
    if (secureProtocol != null) __obj.updateDynamic("secureProtocol")(secureProtocol)
    if (!js.isUndefined(secured)) __obj.updateDynamic("secured")(secured)
    if (sessionIdContext != null) __obj.updateDynamic("sessionIdContext")(sessionIdContext)
    if (sessionTimeout != null) __obj.updateDynamic("sessionTimeout")(sessionTimeout.asInstanceOf[js.Any])
    if (size != null) __obj.updateDynamic("size")(size.asInstanceOf[js.Any])
    if (sniOptions != null) __obj.updateDynamic("sniOptions")(sniOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(socketTimeout)) __obj.updateDynamic("socketTimeout")(socketTimeout)
    if (ticketKeys != null) __obj.updateDynamic("ticketKeys")(ticketKeys)
    if (!js.isUndefined(useProxy)) __obj.updateDynamic("useProxy")(useProxy)
    if (!js.isUndefined(useXClient)) __obj.updateDynamic("useXClient")(useXClient)
    if (!js.isUndefined(useXForward)) __obj.updateDynamic("useXForward")(useXForward)
    __obj.asInstanceOf[SMTPServerOptions]
  }
}

