package typings.smtpServer.mod

import org.scalablytyped.runtime.StringDictionary
import typings.node.tlsMod.TlsOptions
import typings.nodemailer.sharedMod.Logger
import typings.std.Error
import typings.std.Map
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SMTPServerOptions extends TlsOptions {
  /**
    * optional boolean, if set to true allows authentication even if connection is not secured first
    */
  var allowInsecureAuth: js.UndefOr[Boolean] = js.native
  /**
    * optional array of allowed authentication methods, defaults to ['PLAIN', 'LOGIN'].
    * Only the methods listed in this array are allowed,
    * so if you set it to ['XOAUTH2'] then PLAIN and LOGIN are not available.
    * Use ['PLAIN', 'LOGIN', 'XOAUTH2'] to allow all three.
    * Authentication is only allowed in secure mode
    * (either the server is started with secure: true option or STARTTLS command is used)
    */
  var authMethods: js.UndefOr[js.Array[String]] = js.native
  /**
    * allow authentication, but do not require it
    */
  var authOptional: js.UndefOr[Boolean] = js.native
  /**
    * optional greeting message.
    * This message is appended to the default ESMTP response.
    */
  var banner: js.UndefOr[String] = js.native
  /**
    * How many millisceonds to wait before disconnecting pending
    * connections once `server.close()` has been called (defaults to 30 seconds)
    */
  var closeTimeout: js.UndefOr[ms] = js.native
  /**
    * optional boolean, if set to true then does not try to reverse resolve client hostname
    */
  var disableReverseLookup: js.UndefOr[Boolean] = js.native
  /**
    * optional array of disabled commands (see all supported commands here).
    * For example if you want to disable authentication,
    * use ['AUTH'] as this value.
    * If you want to allow authentication in clear text, set it to ['STARTTLS'].
    */
  var disabledCommands: js.UndefOr[js.Array[String]] = js.native
  /**
    * optional boolean, if set to true then does not show 8BITMIME in features list
    */
  var hide8BITMIME: js.UndefOr[Boolean] = js.native
  /**
    * optional boolean, if set to true then does not show PIPELINING in feature list
    */
  var hidePIPELINING: js.UndefOr[Boolean] = js.native
  /**
    * optional boolean, if set to true then does not show SMTPUTF8 in features list
    */
  var hideSMTPUTF8: js.UndefOr[Boolean] = js.native
   // TODO: ('AUTH' | 'STARTTLS' | 'XCLIENT' | 'XFORWARD')[];
  /**
    * optional boolean, if set to true then allow using STARTTLS
    * but do not advertise or require it. It only makes sense
    * when creating integration test servers for testing the scenario
    * where you want to try STARTTLS even when it is not advertised
    */
  var hideSTARTTLS: js.UndefOr[Boolean] = js.native
  /**
    * boolean, if set to true use LMTP protocol instead of SMTP
    */
  var lmtp: js.UndefOr[Boolean] = js.native
  /**
    * optional bunyan compatible logger instance.
    * If set to true then logs to console.
    * If value is not set or is false then nothing is logged
    */
  var logger: js.UndefOr[Logger | Boolean] = js.native
  /**
    * sets the maximum number of concurrently connected clients, defaults to Infinity
    */
  var maxClients: js.UndefOr[Double] = js.native
  /**
    * optional hostname of the server,
    * used for identifying to the client (defaults to os.hostname())
    */
  var name: js.UndefOr[String] = js.native
  /**
    * optional boolean, if set to true then upgrade sockets to TLS immediately after connection is established. Works with secure: true
    */
  var needsUpgrade: js.UndefOr[Boolean] = js.native
  /**
    * The callback to handle authentications ([see details](https://github.com/andris9/smtp-server#handling-authentication))
    */
  var onAuth: js.UndefOr[
    js.Function3[
      /* auth */ SMTPServerAuthentication, 
      /* session */ SMTPServerSession, 
      /* callback */ js.Function2[
        /* err */ js.UndefOr[Error | Null], 
        /* response */ js.UndefOr[SMTPServerAuthenticationResponse], 
        Unit
      ], 
      Unit
    ]
  ] = js.native
  /**
    * the callback that informs about closed client connection
    */
  var onClose: js.UndefOr[
    js.Function2[
      /* session */ SMTPServerSession, 
      /* callback */ js.Function1[/* err */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]
  ] = js.native
  /**
    * The callback to handle the client connection. ([see details](https://github.com/andris9/smtp-server#validating-client-connection))
    */
  var onConnect: js.UndefOr[
    js.Function2[
      /* session */ SMTPServerSession, 
      /* callback */ js.Function1[/* err */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]
  ] = js.native
  /**
    * the callback to handle incoming messages ([see details](https://github.com/andris9/smtp-server#processing-incoming-message))
    */
  var onData: js.UndefOr[
    js.Function3[
      /* stream */ SMTPServerDataStream, 
      /* session */ SMTPServerSession, 
      /* callback */ js.Function1[/* err */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]
  ] = js.native
  /**
    * the callback to validate MAIL FROM commands ([see details](https://github.com/andris9/smtp-server#validating-sender-addresses))
    */
  var onMailFrom: js.UndefOr[
    js.Function3[
      /* address */ SMTPServerAddress, 
      /* session */ SMTPServerSession, 
      /* callback */ js.Function1[/* err */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]
  ] = js.native
  /**
    * The callback to validate RCPT TO commands ([see details](https://github.com/andris9/smtp-server#validating-recipient-addresses))
    */
  var onRcptTo: js.UndefOr[
    js.Function3[
      /* address */ SMTPServerAddress, 
      /* session */ SMTPServerSession, 
      /* callback */ js.Function1[/* err */ js.UndefOr[Error | Null], Unit], 
      Unit
    ]
  ] = js.native
  /**
    * if true, the connection will use TLS. The default is false.
    * If the server doesn't start in TLS mode,
    * it is still possible to upgrade clear text socket to
    * TLS socket with the STARTTLS command (unless you disable support for it).
    * If secure is true, additional tls options for tls.
    * createServer can be added directly onto this options object.
    */
  var secure: js.UndefOr[Boolean] = js.native
  /** indicate an TLS server where TLS is handled upstream */
  var secured: js.UndefOr[Boolean] = js.native
  /**
    * optional maximum allowed message size in bytes
    * ([see details](https://github.com/andris9/smtp-server#using-size-extension))
    */
  var size: js.UndefOr[Double] = js.native
  /**
    * optional Map or an object of TLS options for SNI where servername is the key. Overrided by SNICallback.
    */
  var sniOptions: js.UndefOr[StringDictionary[TlsOptions] | (Map[String, TlsOptions])] = js.native
  /**
    * How many milliseconds of inactivity to allow before disconnecting the client (defaults to 1 minute)
    */
  var socketTimeout: js.UndefOr[ms] = js.native
  /**
    * boolean, if set to true expects to be behind a proxy that emits a
    * [PROXY](http://www.haproxy.org/download/1.5/doc/proxy-protocol.txt) header (version 1 only)
    */
  var useProxy: js.UndefOr[Boolean] = js.native
  /**
    * boolean, if set to true, enables usage of
    * [XCLIENT](http://www.postfix.org/XCLIENT_README.html) extension to override connection properties.
    * See session.xClient (Map object) for the details provided by the client
    */
  var useXClient: js.UndefOr[Boolean] = js.native
  /**
    * boolean, if set to true, enables usage of [XFORWARD](http://www.postfix.org/XFORWARD_README.html) extension.
    * See session.xForward (Map object) for the details provided by the client
    */
  var useXForward: js.UndefOr[Boolean] = js.native
}

object SMTPServerOptions {
  @scala.inline
  def apply(): SMTPServerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SMTPServerOptions]
  }
  @scala.inline
  implicit class SMTPServerOptionsOps[Self <: SMTPServerOptions] (val x: Self) extends AnyVal {
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
    def setAllowInsecureAuth(value: Boolean): Self = this.set("allowInsecureAuth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowInsecureAuth: Self = this.set("allowInsecureAuth", js.undefined)
    @scala.inline
    def setAuthMethodsVarargs(value: String*): Self = this.set("authMethods", js.Array(value :_*))
    @scala.inline
    def setAuthMethods(value: js.Array[String]): Self = this.set("authMethods", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthMethods: Self = this.set("authMethods", js.undefined)
    @scala.inline
    def setAuthOptional(value: Boolean): Self = this.set("authOptional", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAuthOptional: Self = this.set("authOptional", js.undefined)
    @scala.inline
    def setBanner(value: String): Self = this.set("banner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBanner: Self = this.set("banner", js.undefined)
    @scala.inline
    def setCloseTimeout(value: ms): Self = this.set("closeTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloseTimeout: Self = this.set("closeTimeout", js.undefined)
    @scala.inline
    def setDisableReverseLookup(value: Boolean): Self = this.set("disableReverseLookup", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableReverseLookup: Self = this.set("disableReverseLookup", js.undefined)
    @scala.inline
    def setDisabledCommandsVarargs(value: String*): Self = this.set("disabledCommands", js.Array(value :_*))
    @scala.inline
    def setDisabledCommands(value: js.Array[String]): Self = this.set("disabledCommands", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabledCommands: Self = this.set("disabledCommands", js.undefined)
    @scala.inline
    def setHide8BITMIME(value: Boolean): Self = this.set("hide8BITMIME", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHide8BITMIME: Self = this.set("hide8BITMIME", js.undefined)
    @scala.inline
    def setHidePIPELINING(value: Boolean): Self = this.set("hidePIPELINING", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidePIPELINING: Self = this.set("hidePIPELINING", js.undefined)
    @scala.inline
    def setHideSMTPUTF8(value: Boolean): Self = this.set("hideSMTPUTF8", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideSMTPUTF8: Self = this.set("hideSMTPUTF8", js.undefined)
    @scala.inline
    def setHideSTARTTLS(value: Boolean): Self = this.set("hideSTARTTLS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideSTARTTLS: Self = this.set("hideSTARTTLS", js.undefined)
    @scala.inline
    def setLmtp(value: Boolean): Self = this.set("lmtp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLmtp: Self = this.set("lmtp", js.undefined)
    @scala.inline
    def setLogger(value: Logger | Boolean): Self = this.set("logger", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogger: Self = this.set("logger", js.undefined)
    @scala.inline
    def setMaxClients(value: Double): Self = this.set("maxClients", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxClients: Self = this.set("maxClients", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNeedsUpgrade(value: Boolean): Self = this.set("needsUpgrade", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNeedsUpgrade: Self = this.set("needsUpgrade", js.undefined)
    @scala.inline
    def setOnAuth(
      value: (/* auth */ SMTPServerAuthentication, /* session */ SMTPServerSession, /* callback */ js.Function2[
          /* err */ js.UndefOr[Error | Null], 
          /* response */ js.UndefOr[SMTPServerAuthenticationResponse], 
          Unit
        ]) => Unit
    ): Self = this.set("onAuth", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnAuth: Self = this.set("onAuth", js.undefined)
    @scala.inline
    def setOnClose(
      value: (/* session */ SMTPServerSession, /* callback */ js.Function1[/* err */ js.UndefOr[Error | Null], Unit]) => Unit
    ): Self = this.set("onClose", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnClose: Self = this.set("onClose", js.undefined)
    @scala.inline
    def setOnConnect(
      value: (/* session */ SMTPServerSession, /* callback */ js.Function1[/* err */ js.UndefOr[Error | Null], Unit]) => Unit
    ): Self = this.set("onConnect", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnConnect: Self = this.set("onConnect", js.undefined)
    @scala.inline
    def setOnData(
      value: (/* stream */ SMTPServerDataStream, /* session */ SMTPServerSession, /* callback */ js.Function1[/* err */ js.UndefOr[Error | Null], Unit]) => Unit
    ): Self = this.set("onData", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnData: Self = this.set("onData", js.undefined)
    @scala.inline
    def setOnMailFrom(
      value: (/* address */ SMTPServerAddress, /* session */ SMTPServerSession, /* callback */ js.Function1[/* err */ js.UndefOr[Error | Null], Unit]) => Unit
    ): Self = this.set("onMailFrom", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnMailFrom: Self = this.set("onMailFrom", js.undefined)
    @scala.inline
    def setOnRcptTo(
      value: (/* address */ SMTPServerAddress, /* session */ SMTPServerSession, /* callback */ js.Function1[/* err */ js.UndefOr[Error | Null], Unit]) => Unit
    ): Self = this.set("onRcptTo", js.Any.fromFunction3(value))
    @scala.inline
    def deleteOnRcptTo: Self = this.set("onRcptTo", js.undefined)
    @scala.inline
    def setSecure(value: Boolean): Self = this.set("secure", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecure: Self = this.set("secure", js.undefined)
    @scala.inline
    def setSecured(value: Boolean): Self = this.set("secured", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecured: Self = this.set("secured", js.undefined)
    @scala.inline
    def setSize(value: Double): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSize: Self = this.set("size", js.undefined)
    @scala.inline
    def setSniOptions(value: StringDictionary[TlsOptions] | (Map[String, TlsOptions])): Self = this.set("sniOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSniOptions: Self = this.set("sniOptions", js.undefined)
    @scala.inline
    def setSocketTimeout(value: ms): Self = this.set("socketTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSocketTimeout: Self = this.set("socketTimeout", js.undefined)
    @scala.inline
    def setUseProxy(value: Boolean): Self = this.set("useProxy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseProxy: Self = this.set("useProxy", js.undefined)
    @scala.inline
    def setUseXClient(value: Boolean): Self = this.set("useXClient", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseXClient: Self = this.set("useXClient", js.undefined)
    @scala.inline
    def setUseXForward(value: Boolean): Self = this.set("useXForward", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseXForward: Self = this.set("useXForward", js.undefined)
  }
  
}

