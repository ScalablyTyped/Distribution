package typings.smtpServer

import org.scalablytyped.runtime.StringDictionary
import typings.node.eventsMod.EventEmitter
import typings.node.netMod.ListenOptions
import typings.node.netMod.Server
import typings.node.streamMod.PassThrough
import typings.node.tlsMod.SecureContext
import typings.node.tlsMod.TlsOptions
import typings.nodemailer.libSharedMod.Logger
import typings.smtpServer.smtpServerBooleans.`false`
import typings.smtpServer.smtpServerStrings.LOGIN
import typings.smtpServer.smtpServerStrings.PLAIN
import typings.smtpServer.smtpServerStrings.XOAUTH2
import typings.smtpServer.smtpServerStrings.close
import typings.smtpServer.smtpServerStrings.error
import typings.std.Map
import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("smtp-server", "SMTPServer")
  @js.native
  open class SMTPServer () extends EventEmitter {
    def this(options: SMTPServerOptions) = this()
    
    @JSName("addListener")
    def addListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("addListener")
    def addListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    
    // tslint:disable-line unified-signatures
    /** Closes the server */
    def close(): Unit = js.native
    def close(callback: js.Function0[Unit]): Unit = js.native
    
    var connections: Set[Any] = js.native
    
    @JSName("emit")
    def emit_close(event: close): Boolean = js.native
    @JSName("emit")
    def emit_error(event: error, err: js.Error): Boolean = js.native
    
    /** Start listening on selected port and interface */
    def listen(): Server = js.native
    def listen(handle: Any): Server = js.native
    def listen(handle: Any, backlog: Double): Server = js.native
    def listen(handle: Any, backlog: Double, listeningListener: js.Function0[Unit]): Server = js.native
    def listen(handle: Any, backlog: Unit, listeningListener: js.Function0[Unit]): Server = js.native
    def listen(handle: Any, listeningListener: js.Function0[Unit]): Server = js.native
    def listen(options: ListenOptions): Server = js.native
    def listen(options: ListenOptions, listeningListener: js.Function0[Unit]): Server = js.native
    def listen(path: String): Unit = js.native
    def listen(path: String, backlog: Double): Server = js.native
    def listen(path: String, backlog: Double, listeningListener: js.Function0[Unit]): Server = js.native
    def listen(path: String, backlog: Unit, listeningListener: js.Function0[Unit]): Server = js.native
    def listen(path: String, listeningListener: js.Function0[Unit]): Unit = js.native
    def listen(port: Double): Server = js.native
    def listen(port: Double, backlog: Double): Server = js.native
    def listen(port: Double, backlog: Double, listeningListener: js.Function0[Unit]): Server = js.native
    def listen(port: Double, hostname: String): Server = js.native
    def listen(port: Double, hostname: String, backlog: Double): Server = js.native
    def listen(port: Double, hostname: String, backlog: Double, listeningListener: js.Function0[Unit]): Server = js.native
    def listen(port: Double, hostname: String, backlog: Unit, listeningListener: js.Function0[Unit]): Server = js.native
    def listen(port: Double, hostname: String, listeningListener: js.Function0[Unit]): Server = js.native
    def listen(port: Double, hostname: Unit, backlog: Double): Server = js.native
    def listen(port: Double, hostname: Unit, backlog: Double, listeningListener: js.Function0[Unit]): Server = js.native
    def listen(port: Double, hostname: Unit, backlog: Unit, listeningListener: js.Function0[Unit]): Server = js.native
    def listen(port: Double, hostname: Unit, listeningListener: js.Function0[Unit]): Server = js.native
    def listen(port: Double, listeningListener: js.Function0[Unit]): Server = js.native
    def listen(port: Unit, backlog: Double): Server = js.native
    def listen(port: Unit, backlog: Double, listeningListener: js.Function0[Unit]): Server = js.native
    def listen(port: Unit, hostname: String): Server = js.native
    def listen(port: Unit, hostname: String, backlog: Double): Server = js.native
    def listen(port: Unit, hostname: String, backlog: Double, listeningListener: js.Function0[Unit]): Server = js.native
    def listen(port: Unit, hostname: String, backlog: Unit, listeningListener: js.Function0[Unit]): Server = js.native
    def listen(port: Unit, hostname: String, listeningListener: js.Function0[Unit]): Server = js.native
    def listen(port: Unit, hostname: Unit, backlog: Double): Server = js.native
    def listen(port: Unit, hostname: Unit, backlog: Double, listeningListener: js.Function0[Unit]): Server = js.native
    def listen(port: Unit, hostname: Unit, backlog: Unit, listeningListener: js.Function0[Unit]): Server = js.native
    def listen(port: Unit, hostname: Unit, listeningListener: js.Function0[Unit]): Server = js.native
    def listen(port: Unit, listeningListener: js.Function0[Unit]): Server = js.native
    @JSName("listen")
    def listen_Server(path: String): Server = js.native
    
    def listenerCount(event: close | error): Double = js.native
    
    @JSName("listeners")
    def listeners_close(event: close): js.Array[js.Function0[Unit]] = js.native
    @JSName("listeners")
    def listeners_error(event: error): js.Array[js.Function1[/* err */ js.Error, Unit]] = js.native
    
    var logger: Logger = js.native
    
    @JSName("off")
    def off_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("off")
    def off_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    
    /** Authentication handler. Override this */
    def onAuth(
      auth: SMTPServerAuthentication,
      session: SMTPServerSession,
      callback: js.Function2[
          /* err */ js.UndefOr[js.Error | Null], 
          /* response */ js.UndefOr[SMTPServerAuthenticationResponse], 
          Unit
        ]
    ): Unit = js.native
    
    /** Override this */
    def onClose(session: SMTPServerSession, callback: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
    
    /** Override this */
    def onConnect(session: SMTPServerSession, callback: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]): Unit = js.native
    
    /** Override this */
    def onData(
      stream: SMTPServerDataStream,
      session: SMTPServerSession,
      callback: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
    
    /** Override this */
    def onMailFrom(
      address: SMTPServerAddress,
      session: SMTPServerSession,
      callback: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
    
    /** Override this */
    def onRcptTo(
      address: SMTPServerAddress,
      session: SMTPServerSession,
      callback: js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]
    ): Unit = js.native
    
    @JSName("on")
    def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    
    @JSName("once")
    def once_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("once")
    def once_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    
    var options: SMTPServerOptions = js.native
    
    @JSName("prependListener")
    def prependListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependListener")
    def prependListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    
    @JSName("prependOnceListener")
    def prependOnceListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("prependOnceListener")
    def prependOnceListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    
    @JSName("rawListeners")
    def rawListeners_close(event: close): js.Array[js.Function0[Unit]] = js.native
    @JSName("rawListeners")
    def rawListeners_error(event: error): js.Array[js.Function1[/* err */ js.Error, Unit]] = js.native
    
    def removeAllListener(event: close | error): this.type = js.native
    
    @JSName("removeListener")
    def removeListener_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("removeListener")
    def removeListener_error(event: error, listener: js.Function1[/* err */ js.Error, Unit]): this.type = js.native
    
    var secureContext: Map[String, SecureContext] = js.native
    
    var server: Server = js.native
    
    def updateSecureContext(options: TlsOptions): Unit = js.native
  }
  
  trait SMTPServerAddress extends StObject {
    
    /**
      * the address provided with the MAIL FROM or RCPT TO command
      */
    var address: String
    
    /**
      * an object with additional arguments (all key names are uppercase)
      */
    var args: js.Object
  }
  object SMTPServerAddress {
    
    inline def apply(address: String, args: js.Object): SMTPServerAddress = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], args = args.asInstanceOf[js.Any])
      __obj.asInstanceOf[SMTPServerAddress]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SMTPServerAddress] (val x: Self) extends AnyVal {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setArgs(value: js.Object): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
    }
  }
  
  trait SMTPServerAuthentication extends StObject {
    
    /**
      *  the OAuth2 bearer access token if 'XOAUTH2' was used as the authentication method
      */
    var accessToken: js.UndefOr[String] = js.undefined
    
    /**
      * indicates the authentication method used, 'PLAIN', 'LOGIN' or 'XOAUTH2'
      */
    var method: PLAIN | LOGIN | XOAUTH2
    
    /**
      * the password if LOGIN or PLAIN was used
      */
    var password: js.UndefOr[String] = js.undefined
    
    /**
      * the username of the user
      */
    var username: js.UndefOr[String] = js.undefined
    
    /**
      * a function for validating CRAM-MD5 challenge responses.
      * Takes the password of the user as an argument and returns true if the response matches the password
      */
    def validatePassword(password: String): Boolean
  }
  object SMTPServerAuthentication {
    
    inline def apply(method: PLAIN | LOGIN | XOAUTH2, validatePassword: String => Boolean): SMTPServerAuthentication = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], validatePassword = js.Any.fromFunction1(validatePassword))
      __obj.asInstanceOf[SMTPServerAuthentication]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SMTPServerAuthentication] (val x: Self) extends AnyVal {
      
      inline def setAccessToken(value: String): Self = StObject.set(x, "accessToken", value.asInstanceOf[js.Any])
      
      inline def setAccessTokenUndefined: Self = StObject.set(x, "accessToken", js.undefined)
      
      inline def setMethod(value: PLAIN | LOGIN | XOAUTH2): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
      
      inline def setPasswordUndefined: Self = StObject.set(x, "password", js.undefined)
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
      
      inline def setUsernameUndefined: Self = StObject.set(x, "username", js.undefined)
      
      inline def setValidatePassword(value: String => Boolean): Self = StObject.set(x, "validatePassword", js.Any.fromFunction1(value))
    }
  }
  
  trait SMTPServerAuthenticationResponse extends StObject {
    
    /**
      * an object to return if XOAUTH2 authentication failed (do not set the error object in this case).
      * This value is serialized to JSON and base64 encoded automatically, so you can just return the object
      */
    var data: js.UndefOr[js.Object] = js.undefined
    
    /**
      * can be any value - if this is set then the user is considered logged in
      * and this value is used later with the session data to identify the user.
      * If this value is empty, then the authentication is considered failed
      */
    var user: js.UndefOr[Any] = js.undefined
  }
  object SMTPServerAuthenticationResponse {
    
    inline def apply(): SMTPServerAuthenticationResponse = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SMTPServerAuthenticationResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SMTPServerAuthenticationResponse] (val x: Self) extends AnyVal {
      
      inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setUser(value: Any): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
  
  @js.native
  trait SMTPServerDataStream extends PassThrough {
    
    /**
      * number of bytes read from DATA stream
      */
    var byteLength: Double = js.native
    
    /**
      * boolean, if set to true, the message was oversized.
      * When creating the server you can define maximum allowed message size with
      * the size option, see RFC1870 for details.
      */
    var sizeExceeded: Boolean = js.native
  }
  
  trait SMTPServerEnvelope extends StObject {
    
    /**
      * includes an address object or is set to false
      */
    var mailFrom: SMTPServerAddress | `false`
    
    /**
      * includes an array of address objects
      */
    var rcptTo: js.Array[SMTPServerAddress]
  }
  object SMTPServerEnvelope {
    
    inline def apply(mailFrom: SMTPServerAddress | `false`, rcptTo: js.Array[SMTPServerAddress]): SMTPServerEnvelope = {
      val __obj = js.Dynamic.literal(mailFrom = mailFrom.asInstanceOf[js.Any], rcptTo = rcptTo.asInstanceOf[js.Any])
      __obj.asInstanceOf[SMTPServerEnvelope]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SMTPServerEnvelope] (val x: Self) extends AnyVal {
      
      inline def setMailFrom(value: SMTPServerAddress | `false`): Self = StObject.set(x, "mailFrom", value.asInstanceOf[js.Any])
      
      inline def setRcptTo(value: js.Array[SMTPServerAddress]): Self = StObject.set(x, "rcptTo", value.asInstanceOf[js.Any])
      
      inline def setRcptToVarargs(value: SMTPServerAddress*): Self = StObject.set(x, "rcptTo", js.Array(value*))
    }
  }
  
  trait SMTPServerOptions
    extends StObject
       with TlsOptions {
    
    /**
      * optional boolean, if set to true allows authentication even if connection is not secured first
      */
    var allowInsecureAuth: js.UndefOr[Boolean] = js.undefined
    
    /**
      * optional array of allowed authentication methods, defaults to ['PLAIN', 'LOGIN'].
      * Only the methods listed in this array are allowed,
      * so if you set it to ['XOAUTH2'] then PLAIN and LOGIN are not available.
      * Use ['PLAIN', 'LOGIN', 'XOAUTH2'] to allow all three.
      * Authentication is only allowed in secure mode
      * (either the server is started with secure: true option or STARTTLS command is used)
      */
    var authMethods: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * allow authentication, but do not require it
      */
    var authOptional: js.UndefOr[Boolean] = js.undefined
    
    /**
      * optional greeting message.
      * This message is appended to the default ESMTP response.
      */
    var banner: js.UndefOr[String] = js.undefined
    
    /**
      * How many millisceonds to wait before disconnecting pending
      * connections once `server.close()` has been called (defaults to 30 seconds)
      */
    var closeTimeout: js.UndefOr[ms] = js.undefined
    
    /**
      * optional boolean, if set to true then does not try to reverse resolve client hostname
      */
    var disableReverseLookup: js.UndefOr[Boolean] = js.undefined
    
    /**
      * optional array of disabled commands (see all supported commands here).
      * For example if you want to disable authentication,
      * use ['AUTH'] as this value.
      * If you want to allow authentication in clear text, set it to ['STARTTLS'].
      */
    var disabledCommands: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * optional boolean, if set to true then does not show 8BITMIME in features list
      */
    var hide8BITMIME: js.UndefOr[Boolean] = js.undefined
    
    /**
      * optional boolean, if set to true then does not show PIPELINING in feature list
      */
    var hidePIPELINING: js.UndefOr[Boolean] = js.undefined
    
    /**
      * optional boolean, if set to true then does not show SMTPUTF8 in features list
      */
    var hideSMTPUTF8: js.UndefOr[Boolean] = js.undefined
    
    // TODO: ('AUTH' | 'STARTTLS' | 'XCLIENT' | 'XFORWARD')[];
    /**
      * optional boolean, if set to true then allow using STARTTLS
      * but do not advertise or require it. It only makes sense
      * when creating integration test servers for testing the scenario
      * where you want to try STARTTLS even when it is not advertised
      */
    var hideSTARTTLS: js.UndefOr[Boolean] = js.undefined
    
    /**
      * boolean, if set to true use LMTP protocol instead of SMTP
      */
    var lmtp: js.UndefOr[Boolean] = js.undefined
    
    /**
      * optional bunyan compatible logger instance.
      * If set to true then logs to console.
      * If value is not set or is false then nothing is logged
      */
    var logger: js.UndefOr[Logger | Boolean] = js.undefined
    
    /**
      * sets the maximum number of concurrently connected clients, defaults to Infinity
      */
    var maxClients: js.UndefOr[Double] = js.undefined
    
    /**
      * optional hostname of the server,
      * used for identifying to the client (defaults to os.hostname())
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * optional boolean, if set to true then upgrade sockets to TLS immediately after connection is established. Works with secure: true
      */
    var needsUpgrade: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The callback to handle authentications ([see details](https://github.com/andris9/smtp-server#handling-authentication))
      */
    var onAuth: js.UndefOr[
        js.Function3[
          /* auth */ SMTPServerAuthentication, 
          /* session */ SMTPServerSession, 
          /* callback */ js.Function2[
            /* err */ js.UndefOr[js.Error | Null], 
            /* response */ js.UndefOr[SMTPServerAuthenticationResponse], 
            Unit
          ], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * the callback that informs about closed client connection
      */
    var onClose: js.UndefOr[
        js.Function2[
          /* session */ SMTPServerSession, 
          /* callback */ js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * The callback to handle the client connection. ([see details](https://github.com/andris9/smtp-server#validating-client-connection))
      */
    var onConnect: js.UndefOr[
        js.Function2[
          /* session */ SMTPServerSession, 
          /* callback */ js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * the callback to handle incoming messages ([see details](https://github.com/andris9/smtp-server#processing-incoming-message))
      */
    var onData: js.UndefOr[
        js.Function3[
          /* stream */ SMTPServerDataStream, 
          /* session */ SMTPServerSession, 
          /* callback */ js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * the callback to validate MAIL FROM commands ([see details](https://github.com/andris9/smtp-server#validating-sender-addresses))
      */
    var onMailFrom: js.UndefOr[
        js.Function3[
          /* address */ SMTPServerAddress, 
          /* session */ SMTPServerSession, 
          /* callback */ js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit], 
          Unit
        ]
      ] = js.undefined
    
    /**
      * The callback to validate RCPT TO commands ([see details](https://github.com/andris9/smtp-server#validating-recipient-addresses))
      */
    var onRcptTo: js.UndefOr[
        js.Function3[
          /* address */ SMTPServerAddress, 
          /* session */ SMTPServerSession, 
          /* callback */ js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit], 
          Unit
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
    var secure: js.UndefOr[Boolean] = js.undefined
    
    /** indicate an TLS server where TLS is handled upstream */
    var secured: js.UndefOr[Boolean] = js.undefined
    
    /**
      * optional maximum allowed message size in bytes
      * ([see details](https://github.com/andris9/smtp-server#using-size-extension))
      */
    var size: js.UndefOr[Double] = js.undefined
    
    /**
      * optional Map or an object of TLS options for SNI where servername is the key. Overrided by SNICallback.
      */
    var sniOptions: js.UndefOr[StringDictionary[TlsOptions] | (Map[String, TlsOptions])] = js.undefined
    
    /**
      * How many milliseconds of inactivity to allow before disconnecting the client (defaults to 1 minute)
      */
    var socketTimeout: js.UndefOr[ms] = js.undefined
    
    /**
      * boolean, if set to true expects to be behind a proxy that emits a
      * [PROXY](http://www.haproxy.org/download/1.5/doc/proxy-protocol.txt) header (version 1 only)
      */
    var useProxy: js.UndefOr[Boolean] = js.undefined
    
    /**
      * boolean, if set to true, enables usage of
      * [XCLIENT](http://www.postfix.org/XCLIENT_README.html) extension to override connection properties.
      * See session.xClient (Map object) for the details provided by the client
      */
    var useXClient: js.UndefOr[Boolean] = js.undefined
    
    /**
      * boolean, if set to true, enables usage of [XFORWARD](http://www.postfix.org/XFORWARD_README.html) extension.
      * See session.xForward (Map object) for the details provided by the client
      */
    var useXForward: js.UndefOr[Boolean] = js.undefined
  }
  object SMTPServerOptions {
    
    inline def apply(): SMTPServerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SMTPServerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SMTPServerOptions] (val x: Self) extends AnyVal {
      
      inline def setAllowInsecureAuth(value: Boolean): Self = StObject.set(x, "allowInsecureAuth", value.asInstanceOf[js.Any])
      
      inline def setAllowInsecureAuthUndefined: Self = StObject.set(x, "allowInsecureAuth", js.undefined)
      
      inline def setAuthMethods(value: js.Array[String]): Self = StObject.set(x, "authMethods", value.asInstanceOf[js.Any])
      
      inline def setAuthMethodsUndefined: Self = StObject.set(x, "authMethods", js.undefined)
      
      inline def setAuthMethodsVarargs(value: String*): Self = StObject.set(x, "authMethods", js.Array(value*))
      
      inline def setAuthOptional(value: Boolean): Self = StObject.set(x, "authOptional", value.asInstanceOf[js.Any])
      
      inline def setAuthOptionalUndefined: Self = StObject.set(x, "authOptional", js.undefined)
      
      inline def setBanner(value: String): Self = StObject.set(x, "banner", value.asInstanceOf[js.Any])
      
      inline def setBannerUndefined: Self = StObject.set(x, "banner", js.undefined)
      
      inline def setCloseTimeout(value: ms): Self = StObject.set(x, "closeTimeout", value.asInstanceOf[js.Any])
      
      inline def setCloseTimeoutUndefined: Self = StObject.set(x, "closeTimeout", js.undefined)
      
      inline def setDisableReverseLookup(value: Boolean): Self = StObject.set(x, "disableReverseLookup", value.asInstanceOf[js.Any])
      
      inline def setDisableReverseLookupUndefined: Self = StObject.set(x, "disableReverseLookup", js.undefined)
      
      inline def setDisabledCommands(value: js.Array[String]): Self = StObject.set(x, "disabledCommands", value.asInstanceOf[js.Any])
      
      inline def setDisabledCommandsUndefined: Self = StObject.set(x, "disabledCommands", js.undefined)
      
      inline def setDisabledCommandsVarargs(value: String*): Self = StObject.set(x, "disabledCommands", js.Array(value*))
      
      inline def setHide8BITMIME(value: Boolean): Self = StObject.set(x, "hide8BITMIME", value.asInstanceOf[js.Any])
      
      inline def setHide8BITMIMEUndefined: Self = StObject.set(x, "hide8BITMIME", js.undefined)
      
      inline def setHidePIPELINING(value: Boolean): Self = StObject.set(x, "hidePIPELINING", value.asInstanceOf[js.Any])
      
      inline def setHidePIPELININGUndefined: Self = StObject.set(x, "hidePIPELINING", js.undefined)
      
      inline def setHideSMTPUTF8(value: Boolean): Self = StObject.set(x, "hideSMTPUTF8", value.asInstanceOf[js.Any])
      
      inline def setHideSMTPUTF8Undefined: Self = StObject.set(x, "hideSMTPUTF8", js.undefined)
      
      inline def setHideSTARTTLS(value: Boolean): Self = StObject.set(x, "hideSTARTTLS", value.asInstanceOf[js.Any])
      
      inline def setHideSTARTTLSUndefined: Self = StObject.set(x, "hideSTARTTLS", js.undefined)
      
      inline def setLmtp(value: Boolean): Self = StObject.set(x, "lmtp", value.asInstanceOf[js.Any])
      
      inline def setLmtpUndefined: Self = StObject.set(x, "lmtp", js.undefined)
      
      inline def setLogger(value: Logger | Boolean): Self = StObject.set(x, "logger", value.asInstanceOf[js.Any])
      
      inline def setLoggerUndefined: Self = StObject.set(x, "logger", js.undefined)
      
      inline def setMaxClients(value: Double): Self = StObject.set(x, "maxClients", value.asInstanceOf[js.Any])
      
      inline def setMaxClientsUndefined: Self = StObject.set(x, "maxClients", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setNeedsUpgrade(value: Boolean): Self = StObject.set(x, "needsUpgrade", value.asInstanceOf[js.Any])
      
      inline def setNeedsUpgradeUndefined: Self = StObject.set(x, "needsUpgrade", js.undefined)
      
      inline def setOnAuth(
        value: (/* auth */ SMTPServerAuthentication, /* session */ SMTPServerSession, /* callback */ js.Function2[
              /* err */ js.UndefOr[js.Error | Null], 
              /* response */ js.UndefOr[SMTPServerAuthenticationResponse], 
              Unit
            ]) => Unit
      ): Self = StObject.set(x, "onAuth", js.Any.fromFunction3(value))
      
      inline def setOnAuthUndefined: Self = StObject.set(x, "onAuth", js.undefined)
      
      inline def setOnClose(
        value: (/* session */ SMTPServerSession, /* callback */ js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]) => Unit
      ): Self = StObject.set(x, "onClose", js.Any.fromFunction2(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setOnConnect(
        value: (/* session */ SMTPServerSession, /* callback */ js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]) => Unit
      ): Self = StObject.set(x, "onConnect", js.Any.fromFunction2(value))
      
      inline def setOnConnectUndefined: Self = StObject.set(x, "onConnect", js.undefined)
      
      inline def setOnData(
        value: (/* stream */ SMTPServerDataStream, /* session */ SMTPServerSession, /* callback */ js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]) => Unit
      ): Self = StObject.set(x, "onData", js.Any.fromFunction3(value))
      
      inline def setOnDataUndefined: Self = StObject.set(x, "onData", js.undefined)
      
      inline def setOnMailFrom(
        value: (/* address */ SMTPServerAddress, /* session */ SMTPServerSession, /* callback */ js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]) => Unit
      ): Self = StObject.set(x, "onMailFrom", js.Any.fromFunction3(value))
      
      inline def setOnMailFromUndefined: Self = StObject.set(x, "onMailFrom", js.undefined)
      
      inline def setOnRcptTo(
        value: (/* address */ SMTPServerAddress, /* session */ SMTPServerSession, /* callback */ js.Function1[/* err */ js.UndefOr[js.Error | Null], Unit]) => Unit
      ): Self = StObject.set(x, "onRcptTo", js.Any.fromFunction3(value))
      
      inline def setOnRcptToUndefined: Self = StObject.set(x, "onRcptTo", js.undefined)
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
      
      inline def setSecured(value: Boolean): Self = StObject.set(x, "secured", value.asInstanceOf[js.Any])
      
      inline def setSecuredUndefined: Self = StObject.set(x, "secured", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSniOptions(value: StringDictionary[TlsOptions] | (Map[String, TlsOptions])): Self = StObject.set(x, "sniOptions", value.asInstanceOf[js.Any])
      
      inline def setSniOptionsUndefined: Self = StObject.set(x, "sniOptions", js.undefined)
      
      inline def setSocketTimeout(value: ms): Self = StObject.set(x, "socketTimeout", value.asInstanceOf[js.Any])
      
      inline def setSocketTimeoutUndefined: Self = StObject.set(x, "socketTimeout", js.undefined)
      
      inline def setUseProxy(value: Boolean): Self = StObject.set(x, "useProxy", value.asInstanceOf[js.Any])
      
      inline def setUseProxyUndefined: Self = StObject.set(x, "useProxy", js.undefined)
      
      inline def setUseXClient(value: Boolean): Self = StObject.set(x, "useXClient", value.asInstanceOf[js.Any])
      
      inline def setUseXClientUndefined: Self = StObject.set(x, "useXClient", js.undefined)
      
      inline def setUseXForward(value: Boolean): Self = StObject.set(x, "useXForward", value.asInstanceOf[js.Any])
      
      inline def setUseXForwardUndefined: Self = StObject.set(x, "useXForward", js.undefined)
    }
  }
  
  trait SMTPServerSession extends StObject {
    
    /**
      * reverse resolved hostname for remoteAddress
      */
    var clientHostname: String
    
    /**
      * Envelope Object
      */
    var envelope: SMTPServerEnvelope
    
    /**
      * hostname the client provided with HELO/EHLO call
      */
    var hostNameAppearsAs: String
    
    /**
      * random string identificator generated when the client connected
      */
    var id: String
    
    /**
      * local IP address for the connected client
      */
    var localAddress: String
    
    /**
      * local port number for the connected client
      */
    var localPort: Double
    
    /**
      * the opening SMTP command (HELO/EHLO/LHLO)
      */
    var openingCommand: String
    
    /**
      * remote IP address for the connected client
      */
    var remoteAddress: String
    
    /**
      * remote port number for the connected client
      */
    var remotePort: Double
    
    /**
      *  If true, then the connection is using TLS
      */
    var secure: Boolean
    
    var tlsOptions: TlsOptions
    
    var transmissionType: String
    
    /*
      * Optional parameter that is added to the session object if provided to the onAuth callback
      */
    var user: js.UndefOr[String] = js.undefined
  }
  object SMTPServerSession {
    
    inline def apply(
      clientHostname: String,
      envelope: SMTPServerEnvelope,
      hostNameAppearsAs: String,
      id: String,
      localAddress: String,
      localPort: Double,
      openingCommand: String,
      remoteAddress: String,
      remotePort: Double,
      secure: Boolean,
      tlsOptions: TlsOptions,
      transmissionType: String
    ): SMTPServerSession = {
      val __obj = js.Dynamic.literal(clientHostname = clientHostname.asInstanceOf[js.Any], envelope = envelope.asInstanceOf[js.Any], hostNameAppearsAs = hostNameAppearsAs.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], localAddress = localAddress.asInstanceOf[js.Any], localPort = localPort.asInstanceOf[js.Any], openingCommand = openingCommand.asInstanceOf[js.Any], remoteAddress = remoteAddress.asInstanceOf[js.Any], remotePort = remotePort.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any], tlsOptions = tlsOptions.asInstanceOf[js.Any], transmissionType = transmissionType.asInstanceOf[js.Any])
      __obj.asInstanceOf[SMTPServerSession]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SMTPServerSession] (val x: Self) extends AnyVal {
      
      inline def setClientHostname(value: String): Self = StObject.set(x, "clientHostname", value.asInstanceOf[js.Any])
      
      inline def setEnvelope(value: SMTPServerEnvelope): Self = StObject.set(x, "envelope", value.asInstanceOf[js.Any])
      
      inline def setHostNameAppearsAs(value: String): Self = StObject.set(x, "hostNameAppearsAs", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLocalAddress(value: String): Self = StObject.set(x, "localAddress", value.asInstanceOf[js.Any])
      
      inline def setLocalPort(value: Double): Self = StObject.set(x, "localPort", value.asInstanceOf[js.Any])
      
      inline def setOpeningCommand(value: String): Self = StObject.set(x, "openingCommand", value.asInstanceOf[js.Any])
      
      inline def setRemoteAddress(value: String): Self = StObject.set(x, "remoteAddress", value.asInstanceOf[js.Any])
      
      inline def setRemotePort(value: Double): Self = StObject.set(x, "remotePort", value.asInstanceOf[js.Any])
      
      inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
      
      inline def setTlsOptions(value: TlsOptions): Self = StObject.set(x, "tlsOptions", value.asInstanceOf[js.Any])
      
      inline def setTransmissionType(value: String): Self = StObject.set(x, "transmissionType", value.asInstanceOf[js.Any])
      
      inline def setUser(value: String): Self = StObject.set(x, "user", value.asInstanceOf[js.Any])
      
      inline def setUserUndefined: Self = StObject.set(x, "user", js.undefined)
    }
  }
  
  type ms = Double
}
