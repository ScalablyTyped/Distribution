package typings.simplesmtp

import typings.node.NodeJS.ReadableStream
import typings.node.eventsMod.EventEmitter
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("simplesmtp", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("simplesmtp", "SMTPServer")
  @js.native
  class SMTPServer () extends EventEmitter {
    def this(options: SmtpServerOptions) = this()
    
    /**
      * <p>Closes the server</p>
      *
      * @param {Function} callback The callback function to run when the server is closed
      */
    def end(callback: js.Function0[Unit]): Unit = js.native
    
    /**
      * Server starts listening on defined port and hostname
      *
      * @param {Number} port The port number to listen
      * @param {String} [host] The hostname to listen
      * @param {Function} callback The callback function to run when the server is listening
      */
    def listen(port: Double, host: String): Unit = js.native
    def listen(port: Double, host: String, callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  }
  
  @JSImport("simplesmtp", "SimpleServer")
  @js.native
  class SimpleServer () extends EventEmitter {
    def this(callback: js.Function1[/* connection */ SimpleServerConnection, Unit]) = this()
    def this(options: SmtpServerOptions) = this()
    def this(options: Unit, callback: js.Function1[/* connection */ SimpleServerConnection, Unit]) = this()
    def this(options: SmtpServerOptions, callback: js.Function1[/* connection */ SimpleServerConnection, Unit]) = this()
    
    /**
      * Server starts listening on defined port and hostname
      *
      * @param {Number} port The port number to listen
      * @param {String} [host] The hostname to listen
      * @param {Function} callback The callback function to run when the server is listening
      */
    def listen(port: Double, host: String): Unit = js.native
    def listen(port: Double, host: String, callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
    
    var server: SMTPServer = js.native
  }
  
  @scala.inline
  def createSimpleServer(): SimpleServer = ^.asInstanceOf[js.Dynamic].applyDynamic("createSimpleServer")().asInstanceOf[SimpleServer]
  @scala.inline
  def createSimpleServer(callback: js.Function1[/* connection */ SimpleServerConnection, Unit]): SimpleServer = ^.asInstanceOf[js.Dynamic].applyDynamic("createSimpleServer")(callback.asInstanceOf[js.Any]).asInstanceOf[SimpleServer]
  @scala.inline
  def createSimpleServer(options: Unit, callback: js.Function1[/* connection */ SimpleServerConnection, Unit]): SimpleServer = (^.asInstanceOf[js.Dynamic].applyDynamic("createSimpleServer")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[SimpleServer]
  @scala.inline
  def createSimpleServer(options: SmtpServerOptions): SimpleServer = ^.asInstanceOf[js.Dynamic].applyDynamic("createSimpleServer")(options.asInstanceOf[js.Any]).asInstanceOf[SimpleServer]
  @scala.inline
  def createSimpleServer(options: SmtpServerOptions, callback: js.Function1[/* connection */ SimpleServerConnection, Unit]): SimpleServer = (^.asInstanceOf[js.Dynamic].applyDynamic("createSimpleServer")(options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[SimpleServer]
  
  @js.native
  trait SimpleServerConnection
    extends StObject
       with ReadableStream {
    
    /**
      * Accept the message with the selected ID
      */
    def accept(): Unit = js.native
    def accept(id: String): Unit = js.native
    
    /**
      * From address
      */
    var from: String = js.native
    
    /**
      * hostname reported by the client
      */
    var host: String = js.native
    
    /**
      * Reject the message with the selected message
      */
    def reject(): Unit = js.native
    def reject(reason: String): Unit = js.native
    
    /**
      * client IP address
      */
    var remoteAddress: String = js.native
    
    /**
      * an array of To addresses
      */
    var to: js.Array[String] = js.native
  }
  
  trait SmtpServerOptions extends StObject {
    
    /**
      * greeting banner that is sent to the client on connection
      */
    var SMTPBanner: js.UndefOr[String] = js.undefined
    
    /**
      * allowed authentication methods, defaults to <code>['PLAIN', 'LOGIN']</code>
      */
    var authMethods: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * TLS credentials
      */
    var credentials: js.UndefOr[js.Any] = js.undefined
    
    /**
      * if set to true, print out messages about the connection
      */
    var debug: js.UndefOr[Boolean] = js.undefined
    
    /**
      * if set, do not validate sender domains
      */
    var disableDNSValidation: js.UndefOr[Boolean] = js.undefined
    
    /**
      * if set, support HELO only
      */
    var disableEHLO: js.UndefOr[Boolean] = js.undefined
    
    /**
      * if set to true, client may authenticate itself but don't have to
      */
    var enableAuthentication: js.UndefOr[Boolean] = js.undefined
    
    /**
      * if set, allow client do not use STARTTLS
      */
    var ignoreTLS: js.UndefOr[Boolean] = js.undefined
    
    /**
      * if set, limit the number of simultaneous connections to the server
      */
    var maxClients: js.UndefOr[Double] = js.undefined
    
    /**
      * maximum size of an e-mail in bytes
      */
    var maxSize: js.UndefOr[Double] = js.undefined
    
    /**
      * the hostname of the server, will be used for informational messages
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * if set to true, require that the client must authenticate itself
      */
    var requireAuthentication: js.UndefOr[Boolean] = js.undefined
    
    /**
      * start a server on secure connection
      */
    var secureConnection: js.UndefOr[Boolean] = js.undefined
    
    /**
      * client timeout in milliseconds, defaults to 60 000
      */
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object SmtpServerOptions {
    
    @scala.inline
    def apply(): SmtpServerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SmtpServerOptions]
    }
    
    @scala.inline
    implicit class SmtpServerOptionsMutableBuilder[Self <: SmtpServerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthMethods(value: js.Array[String]): Self = StObject.set(x, "authMethods", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthMethodsUndefined: Self = StObject.set(x, "authMethods", js.undefined)
      
      @scala.inline
      def setAuthMethodsVarargs(value: String*): Self = StObject.set(x, "authMethods", js.Array(value :_*))
      
      @scala.inline
      def setCredentials(value: js.Any): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      @scala.inline
      def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      @scala.inline
      def setDisableDNSValidation(value: Boolean): Self = StObject.set(x, "disableDNSValidation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableDNSValidationUndefined: Self = StObject.set(x, "disableDNSValidation", js.undefined)
      
      @scala.inline
      def setDisableEHLO(value: Boolean): Self = StObject.set(x, "disableEHLO", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableEHLOUndefined: Self = StObject.set(x, "disableEHLO", js.undefined)
      
      @scala.inline
      def setEnableAuthentication(value: Boolean): Self = StObject.set(x, "enableAuthentication", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableAuthenticationUndefined: Self = StObject.set(x, "enableAuthentication", js.undefined)
      
      @scala.inline
      def setIgnoreTLS(value: Boolean): Self = StObject.set(x, "ignoreTLS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreTLSUndefined: Self = StObject.set(x, "ignoreTLS", js.undefined)
      
      @scala.inline
      def setMaxClients(value: Double): Self = StObject.set(x, "maxClients", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxClientsUndefined: Self = StObject.set(x, "maxClients", js.undefined)
      
      @scala.inline
      def setMaxSize(value: Double): Self = StObject.set(x, "maxSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxSizeUndefined: Self = StObject.set(x, "maxSize", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setRequireAuthentication(value: Boolean): Self = StObject.set(x, "requireAuthentication", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequireAuthenticationUndefined: Self = StObject.set(x, "requireAuthentication", js.undefined)
      
      @scala.inline
      def setSMTPBanner(value: String): Self = StObject.set(x, "SMTPBanner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSMTPBannerUndefined: Self = StObject.set(x, "SMTPBanner", js.undefined)
      
      @scala.inline
      def setSecureConnection(value: Boolean): Self = StObject.set(x, "secureConnection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecureConnectionUndefined: Self = StObject.set(x, "secureConnection", js.undefined)
      
      @scala.inline
      def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
}
