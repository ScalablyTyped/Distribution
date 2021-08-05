package typings.socketclusterServer

import org.scalablytyped.runtime.StringDictionary
import typings.agSimpleBroker.mod.SimpleExchange
import typings.jsonwebtoken.mod.Secret
import typings.node.httpMod.OutgoingHttpHeaders
import typings.node.httpMod.Server
import typings.scAuth.mod.SCAuthEngine
import typings.socketclusterServer.anon.Algorithm
import typings.socketclusterServer.anon.Algorithms
import typings.socketclusterServer.anon.Socket
import typings.socketclusterServer.anon.Warning
import typings.socketclusterServer.serversocketMod.AuthenticateData
import typings.socketclusterServer.serversocketMod.BadAuthTokenData
import typings.socketclusterServer.serversocketMod.CloseData
import typings.socketclusterServer.serversocketMod.ConnectAbortData
import typings.socketclusterServer.serversocketMod.ConnectData
import typings.socketclusterServer.serversocketMod.DeauthenticateData
import typings.socketclusterServer.serversocketMod.DisconnectData
import typings.socketclusterServer.serversocketMod.StateChangeData
import typings.socketclusterServer.serversocketMod.SubscribeData
import typings.socketclusterServer.serversocketMod.SubscriptionOptions
import typings.socketclusterServer.serversocketMod.UnsubscribeData
import typings.socketclusterServer.socketclusterServerNumbers.`1`
import typings.socketclusterServer.socketclusterServerNumbers.`2`
import typings.socketclusterServer.socketclusterServerStrings.authenticated
import typings.socketclusterServer.socketclusterServerStrings.authentication
import typings.socketclusterServer.socketclusterServerStrings.authenticationStateChange
import typings.socketclusterServer.socketclusterServerStrings.badSocketAuthToken
import typings.socketclusterServer.socketclusterServerStrings.close
import typings.socketclusterServer.socketclusterServerStrings.closure
import typings.socketclusterServer.socketclusterServerStrings.connection
import typings.socketclusterServer.socketclusterServerStrings.connectionAbort
import typings.socketclusterServer.socketclusterServerStrings.deauthentication
import typings.socketclusterServer.socketclusterServerStrings.disconnection
import typings.socketclusterServer.socketclusterServerStrings.error
import typings.socketclusterServer.socketclusterServerStrings.handshake
import typings.socketclusterServer.socketclusterServerStrings.inbound
import typings.socketclusterServer.socketclusterServerStrings.inboundRaw
import typings.socketclusterServer.socketclusterServerStrings.kill
import typings.socketclusterServer.socketclusterServerStrings.outbound
import typings.socketclusterServer.socketclusterServerStrings.subscription
import typings.socketclusterServer.socketclusterServerStrings.unauthenticated
import typings.socketclusterServer.socketclusterServerStrings.unsubscription
import typings.socketclusterServer.socketclusterServerStrings.warning
import typings.std.Error
import typings.ws.anon.Origin
import typings.ws.mod.ClientOptions
import typings.ws.mod.VerifyClientCallbackAsync
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serverMod {
  
  @JSImport("socketcluster-server/server", JSImport.Namespace)
  @js.native
  class ^ () extends AGServer {
    def this(options: AGServerOptions) = this()
  }
  
  @js.native
  trait AGServer
    extends typings.asyncStreamEmitter.mod.^[js.Any] {
    
    val MIDDLEWARE_HANDSHAKE: handshake = js.native
    
    val MIDDLEWARE_INBOUND: inbound = js.native
    
    val MIDDLEWARE_INBOUND_RAW: inboundRaw = js.native
    
    val MIDDLEWARE_OUTBOUND: outbound = js.native
    
    val SYMBOL_MIDDLEWARE_HANDSHAKE_STREAM: js.Symbol = js.native
    
    var ackTimeout: Double = js.native
    
    var allowClientPublish: Boolean = js.native
    
    var auth: SCAuthEngine = js.native
    
    var brokerEngine: typings.agSimpleBroker.mod.^ = js.native
    
    var clients: StringDictionary[typings.socketclusterServer.serversocketMod.^] = js.native
    
    var clientsCount: Double = js.native
    
    def close(): js.Promise[Unit] = js.native
    
    var codec: CodecEngine = js.native
    
    var defaultSignatureOptions: Algorithm = js.native
    
    var defaultVerificationOptions: Algorithms = js.native
    
    def emitError(error: Error): Unit = js.native
    
    def emitWarning(warning: Error): Unit = js.native
    
    @JSName("emit")
    def emit_authentication(eventName: authentication, data: AuthenticationData): Unit = js.native
    @JSName("emit")
    def emit_authenticationStateChange(eventName: authenticationStateChange, data: AuthStateChangeData): Unit = js.native
    @JSName("emit")
    def emit_badSocketAuthToken(eventName: badSocketAuthToken, data: BadSocketAuthTokenData): Unit = js.native
    @JSName("emit")
    def emit_closure(eventName: closure, data: ClosureData): Unit = js.native
    @JSName("emit")
    def emit_connection(eventName: connection, data: ConnectionData): Unit = js.native
    @JSName("emit")
    def emit_connectionAbort(eventName: connectionAbort, data: ConnectionAbortData): Unit = js.native
    @JSName("emit")
    def emit_deauthentication(eventName: deauthentication, data: DeauthenticationData): Unit = js.native
    @JSName("emit")
    def emit_disconnection(eventName: disconnection, data: DisconnectionData): Unit = js.native
    @JSName("emit")
    def emit_error(eventName: error, data: typings.socketclusterServer.anon.Error): Unit = js.native
    @JSName("emit")
    def emit_handshake(eventName: handshake, data: Socket): Unit = js.native
    @JSName("emit")
    def emit_subscription(eventName: subscription, data: SubscriptionData): Unit = js.native
    @JSName("emit")
    def emit_unsubscription(eventName: unsubscription, data: UnsubscriptionData): Unit = js.native
    @JSName("emit")
    def emit_warning(eventName: warning, data: Warning): Unit = js.native
    
    var exchange: SimpleExchange = js.native
    
    def generateId(): String = js.native
    
    def getPath(): String = js.native
    
    var handshakeTimeout: Double = js.native
    
    def hasMiddleware(`type`: Middlewares): Boolean = js.native
    
    var httpServer: Server = js.native
    
    var isReady: Boolean = js.native
    
    @JSName("listener")
    def listener_authentication(eventName: authentication): typings.consumableStream.mod.^[AuthenticationData] = js.native
    @JSName("listener")
    def listener_authenticationStateChange(eventName: authenticationStateChange): typings.consumableStream.mod.^[AuthStateChangeData] = js.native
    @JSName("listener")
    def listener_badSocketAuthToken(eventName: badSocketAuthToken): typings.consumableStream.mod.^[BadSocketAuthTokenData] = js.native
    @JSName("listener")
    def listener_closure(eventName: closure): typings.consumableStream.mod.^[ClosureData] = js.native
    @JSName("listener")
    def listener_connection(eventName: connection): typings.consumableStream.mod.^[ConnectionData] = js.native
    @JSName("listener")
    def listener_connectionAbort(eventName: connectionAbort): typings.consumableStream.mod.^[ConnectionAbortData] = js.native
    @JSName("listener")
    def listener_deauthentication(eventName: deauthentication): typings.consumableStream.mod.^[DeauthenticationData] = js.native
    @JSName("listener")
    def listener_disconnection(eventName: disconnection): typings.consumableStream.mod.^[DisconnectionData] = js.native
    @JSName("listener")
    def listener_error(eventName: error): typings.consumableStream.mod.^[typings.socketclusterServer.anon.Error] = js.native
    @JSName("listener")
    def listener_handshake(eventName: handshake): typings.consumableStream.mod.^[Socket] = js.native
    @JSName("listener")
    def listener_subscription(eventName: subscription): typings.consumableStream.mod.^[SubscriptionData] = js.native
    @JSName("listener")
    def listener_unsubscription(eventName: unsubscription): typings.consumableStream.mod.^[UnsubscriptionData] = js.native
    @JSName("listener")
    def listener_warning(eventName: warning): typings.consumableStream.mod.^[Warning] = js.native
    
    var middlewareEmitFailures: Boolean = js.native
    
    var options: AGServerOptions = js.native
    
    var origins: String = js.native
    
    var pendingClients: StringDictionary[typings.socketclusterServer.serversocketMod.^] = js.native
    
    var pendingClientsCount: Double = js.native
    
    var perMessageDeflate: js.UndefOr[Boolean | js.Object] = js.native
    
    var pingInterval: Double = js.native
    
    var pingTimeout: Double = js.native
    
    var pingTimeoutDisabled: Boolean = js.native
    
    var protocolVersion: `1` | `2` = js.native
    
    def removeMiddleware(`type`: Middlewares): Unit = js.native
    
    def setAuthEngine(authEngine: SCAuthEngine): Unit = js.native
    
    def setCodecEngine(codecEngine: CodecEngine): Unit = js.native
    
    @JSName("setMiddleware")
    def setMiddleware_handshake(`type`: handshake, middleware: handshakeMiddlewareFunction): Unit = js.native
    @JSName("setMiddleware")
    def setMiddleware_inbound(`type`: inbound, middleware: inboundMiddlewareFunction): Unit = js.native
    @JSName("setMiddleware")
    def setMiddleware_inboundRaw(`type`: inboundRaw, middleware: inboundRawMiddlewareFunction): Unit = js.native
    @JSName("setMiddleware")
    def setMiddleware_outbound(`type`: outbound, middleware: outboundMiddlewareFunction): Unit = js.native
    
    var signatureKey: js.UndefOr[Secret] = js.native
    
    var socketChannelLimit: js.UndefOr[Double] = js.native
    
    var strictHandshake: Boolean = js.native
    
    var verificationKey: js.UndefOr[Secret] = js.native
    
    def verifyHandshake(
      info: Origin,
      callback: js.Function4[
          /* res */ Boolean, 
          /* code */ js.UndefOr[Double], 
          /* message */ js.UndefOr[String], 
          /* headers */ js.UndefOr[OutgoingHttpHeaders], 
          Unit
        ]
    ): Unit = js.native
    @JSName("verifyHandshake")
    var verifyHandshake_Original: VerifyClientCallbackAsync = js.native
    
    var wsServer: typings.ws.mod.Server = js.native
  }
  
  trait AGServerOptions
    extends StObject
       with /* additionalOptions */ StringDictionary[js.Any] {
    
    // In milliseconds, the timeout for receiving a response
    // when using invoke() or invokePublish().
    var ackTimeout: js.UndefOr[Double] = js.undefined
    
    // Whether or not clients are allowed to publish messages
    // to channels.
    var allowClientPublish: js.UndefOr[Boolean] = js.undefined
    
    // The algorithm to use to sign and verify JWT tokens.
    var authAlgorithm: js.UndefOr[String] = js.undefined
    
    // The default expiry for auth tokens in seconds
    var authDefaultExpiry: js.UndefOr[Double] = js.undefined
    
    var authEngine: js.UndefOr[SCAuthEngine] = js.undefined
    
    // The key which SC will use to encrypt/decrypt authTokens,
    // defaults to a 256 bits cryptographically random hex
    // string. The default JWT algorithm used is 'HS256'.
    // If you want to use RSA or ECDSA, you should provide an
    // authPrivateKey and authPublicKey instead of authKey.
    var authKey: js.UndefOr[Secret] = js.undefined
    
    // If using an RSA or ECDSA algorithm to sign the
    // authToken, you will need to provide an authPrivateKey
    // and authPublicKey in PEM format (string or Buffer).
    var authPrivateKey: js.UndefOr[Secret] = js.undefined
    
    var authPublicKey: js.UndefOr[Secret] = js.undefined
    
    var authVerifyAlgorithms: js.UndefOr[js.Array[String]] = js.undefined
    
    // If batchOnHandshake is true, this lets you specify
    // the size of each batch in milliseconds.
    var batchInterval: js.UndefOr[Double] = js.undefined
    
    // Whether or not to batch all socket messages
    // for some time immediately after completing
    // a handshake. This can be useful in failure-recovery
    // scenarios (e.g. batch resubscribe).
    var batchOnHandshake: js.UndefOr[Boolean] = js.undefined
    
    // If batchOnHandshake is true, this lets you specify
    // How long to enable batching (in milliseconds) following
    // a successful socket handshake.
    var batchOnHandshakeDuration: js.UndefOr[Double] = js.undefined
    
    var cloneData: js.UndefOr[Boolean] = js.undefined
    
    var codecEngine: js.UndefOr[CodecEngine] = js.undefined
    
    // In milliseconds - If the socket handshake hasn't been
    // completed before this timeout is reached, the new
    // connection attempt will be terminated.
    var handshakeTimeout: js.UndefOr[Double] = js.undefined
    
    // An instance of a Node.js HTTP server.
    // https://nodejs.org/api/http.html#http_class_http_server
    // This option should not be set if the server is created
    // with socketClusterServer.attach(...).
    var httpServer: js.UndefOr[Server] = js.undefined
    
    // Whether or not an error should be emitted on
    // the socket whenever an action is blocked by a
    // middleware function
    var middlewareEmitFailures: js.UndefOr[Boolean] = js.undefined
    
    // Origins which are allowed to connect to the server.
    var origins: js.UndefOr[String] = js.undefined
    
    // The URL path reserved by SocketCluster clients to
    // interact with the server.
    var path: js.UndefOr[String] = js.undefined
    
    // perMessageDeflate compression. Note that this option is
    // passed directly to the wsEngine's Server object.
    // So if you're using 'ws' as the engine, you can pass an
    // object instead of a boolean.
    // Note that by default, per-message deflate only kicks in
    // for messages > 1024 bytes.
    var perMessageDeflate: js.UndefOr[Boolean | js.Object] = js.undefined
    
    // The interval in milliseconds on which to
    // send a ping to the client to check that
    // it is still alive.
    var pingInterval: js.UndefOr[Double] = js.undefined
    
    // How many milliseconds to wait without receiving a ping
    // before closing the socket.
    var pingTimeout: js.UndefOr[Double] = js.undefined
    
    // Can be 1 or 2. Version 1 is for maximum backwards
    // compatibility with SocketCluster clients.
    var protocolVersion: js.UndefOr[`1` | `2`] = js.undefined
    
    // The maximum number of unique channels which a single
    // socket can subscribe to.
    var socketChannelLimit: js.UndefOr[Double] = js.undefined
    
    // Lets you specify the default cleanup behaviour for
    // when a socket becomes disconnected.
    // Can be either 'kill' or 'close'. Kill mode means
    // that all of the socket's streams will be killed and
    // so consumption will stop immediately.
    // Close mode means that consumers on the socket will
    // be able to finish processing their stream backlogs
    // bebfore they are ended.
    var socketStreamCleanupMode: js.UndefOr[kill | close] = js.undefined
    
    // This can be the name of an npm module or a path to a
    // Node.js module to use as the WebSocket server engine.
    var wsEngine: js.UndefOr[js.Any] = js.undefined
    
    // Custom options to pass to the wsEngine when it is being
    // instantiated.
    var wsEngineServerOptions: js.UndefOr[ClientOptions] = js.undefined
  }
  object AGServerOptions {
    
    inline def apply(): AGServerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AGServerOptions]
    }
    
    extension [Self <: AGServerOptions](x: Self) {
      
      inline def setAckTimeout(value: Double): Self = StObject.set(x, "ackTimeout", value.asInstanceOf[js.Any])
      
      inline def setAckTimeoutUndefined: Self = StObject.set(x, "ackTimeout", js.undefined)
      
      inline def setAllowClientPublish(value: Boolean): Self = StObject.set(x, "allowClientPublish", value.asInstanceOf[js.Any])
      
      inline def setAllowClientPublishUndefined: Self = StObject.set(x, "allowClientPublish", js.undefined)
      
      inline def setAuthAlgorithm(value: String): Self = StObject.set(x, "authAlgorithm", value.asInstanceOf[js.Any])
      
      inline def setAuthAlgorithmUndefined: Self = StObject.set(x, "authAlgorithm", js.undefined)
      
      inline def setAuthDefaultExpiry(value: Double): Self = StObject.set(x, "authDefaultExpiry", value.asInstanceOf[js.Any])
      
      inline def setAuthDefaultExpiryUndefined: Self = StObject.set(x, "authDefaultExpiry", js.undefined)
      
      inline def setAuthEngine(value: SCAuthEngine): Self = StObject.set(x, "authEngine", value.asInstanceOf[js.Any])
      
      inline def setAuthEngineUndefined: Self = StObject.set(x, "authEngine", js.undefined)
      
      inline def setAuthKey(value: Secret): Self = StObject.set(x, "authKey", value.asInstanceOf[js.Any])
      
      inline def setAuthKeyUndefined: Self = StObject.set(x, "authKey", js.undefined)
      
      inline def setAuthPrivateKey(value: Secret): Self = StObject.set(x, "authPrivateKey", value.asInstanceOf[js.Any])
      
      inline def setAuthPrivateKeyUndefined: Self = StObject.set(x, "authPrivateKey", js.undefined)
      
      inline def setAuthPublicKey(value: Secret): Self = StObject.set(x, "authPublicKey", value.asInstanceOf[js.Any])
      
      inline def setAuthPublicKeyUndefined: Self = StObject.set(x, "authPublicKey", js.undefined)
      
      inline def setAuthVerifyAlgorithms(value: js.Array[String]): Self = StObject.set(x, "authVerifyAlgorithms", value.asInstanceOf[js.Any])
      
      inline def setAuthVerifyAlgorithmsUndefined: Self = StObject.set(x, "authVerifyAlgorithms", js.undefined)
      
      inline def setAuthVerifyAlgorithmsVarargs(value: String*): Self = StObject.set(x, "authVerifyAlgorithms", js.Array(value :_*))
      
      inline def setBatchInterval(value: Double): Self = StObject.set(x, "batchInterval", value.asInstanceOf[js.Any])
      
      inline def setBatchIntervalUndefined: Self = StObject.set(x, "batchInterval", js.undefined)
      
      inline def setBatchOnHandshake(value: Boolean): Self = StObject.set(x, "batchOnHandshake", value.asInstanceOf[js.Any])
      
      inline def setBatchOnHandshakeDuration(value: Double): Self = StObject.set(x, "batchOnHandshakeDuration", value.asInstanceOf[js.Any])
      
      inline def setBatchOnHandshakeDurationUndefined: Self = StObject.set(x, "batchOnHandshakeDuration", js.undefined)
      
      inline def setBatchOnHandshakeUndefined: Self = StObject.set(x, "batchOnHandshake", js.undefined)
      
      inline def setCloneData(value: Boolean): Self = StObject.set(x, "cloneData", value.asInstanceOf[js.Any])
      
      inline def setCloneDataUndefined: Self = StObject.set(x, "cloneData", js.undefined)
      
      inline def setCodecEngine(value: CodecEngine): Self = StObject.set(x, "codecEngine", value.asInstanceOf[js.Any])
      
      inline def setCodecEngineUndefined: Self = StObject.set(x, "codecEngine", js.undefined)
      
      inline def setHandshakeTimeout(value: Double): Self = StObject.set(x, "handshakeTimeout", value.asInstanceOf[js.Any])
      
      inline def setHandshakeTimeoutUndefined: Self = StObject.set(x, "handshakeTimeout", js.undefined)
      
      inline def setHttpServer(value: Server): Self = StObject.set(x, "httpServer", value.asInstanceOf[js.Any])
      
      inline def setHttpServerUndefined: Self = StObject.set(x, "httpServer", js.undefined)
      
      inline def setMiddlewareEmitFailures(value: Boolean): Self = StObject.set(x, "middlewareEmitFailures", value.asInstanceOf[js.Any])
      
      inline def setMiddlewareEmitFailuresUndefined: Self = StObject.set(x, "middlewareEmitFailures", js.undefined)
      
      inline def setOrigins(value: String): Self = StObject.set(x, "origins", value.asInstanceOf[js.Any])
      
      inline def setOriginsUndefined: Self = StObject.set(x, "origins", js.undefined)
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
      
      inline def setPerMessageDeflate(value: Boolean | js.Object): Self = StObject.set(x, "perMessageDeflate", value.asInstanceOf[js.Any])
      
      inline def setPerMessageDeflateUndefined: Self = StObject.set(x, "perMessageDeflate", js.undefined)
      
      inline def setPingInterval(value: Double): Self = StObject.set(x, "pingInterval", value.asInstanceOf[js.Any])
      
      inline def setPingIntervalUndefined: Self = StObject.set(x, "pingInterval", js.undefined)
      
      inline def setPingTimeout(value: Double): Self = StObject.set(x, "pingTimeout", value.asInstanceOf[js.Any])
      
      inline def setPingTimeoutUndefined: Self = StObject.set(x, "pingTimeout", js.undefined)
      
      inline def setProtocolVersion(value: `1` | `2`): Self = StObject.set(x, "protocolVersion", value.asInstanceOf[js.Any])
      
      inline def setProtocolVersionUndefined: Self = StObject.set(x, "protocolVersion", js.undefined)
      
      inline def setSocketChannelLimit(value: Double): Self = StObject.set(x, "socketChannelLimit", value.asInstanceOf[js.Any])
      
      inline def setSocketChannelLimitUndefined: Self = StObject.set(x, "socketChannelLimit", js.undefined)
      
      inline def setSocketStreamCleanupMode(value: kill | close): Self = StObject.set(x, "socketStreamCleanupMode", value.asInstanceOf[js.Any])
      
      inline def setSocketStreamCleanupModeUndefined: Self = StObject.set(x, "socketStreamCleanupMode", js.undefined)
      
      inline def setWsEngine(value: js.Any): Self = StObject.set(x, "wsEngine", value.asInstanceOf[js.Any])
      
      inline def setWsEngineServerOptions(value: ClientOptions): Self = StObject.set(x, "wsEngineServerOptions", value.asInstanceOf[js.Any])
      
      inline def setWsEngineServerOptionsUndefined: Self = StObject.set(x, "wsEngineServerOptions", js.undefined)
      
      inline def setWsEngineUndefined: Self = StObject.set(x, "wsEngine", js.undefined)
    }
  }
  
  trait AuthStateChangeData
    extends StObject
       with StateChangeData {
    
    var socket: typings.socketclusterServer.serversocketMod.^
  }
  object AuthStateChangeData {
    
    inline def apply(
      newState: authenticated | unauthenticated,
      oldState: authenticated | unauthenticated,
      socket: typings.socketclusterServer.serversocketMod.^
    ): AuthStateChangeData = {
      val __obj = js.Dynamic.literal(newState = newState.asInstanceOf[js.Any], oldState = oldState.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthStateChangeData]
    }
    
    extension [Self <: AuthStateChangeData](x: Self) {
      
      inline def setSocket(value: typings.socketclusterServer.serversocketMod.^): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
    }
  }
  
  trait AuthenticationData
    extends StObject
       with AuthenticateData {
    
    var socket: typings.socketclusterServer.serversocketMod.^
  }
  object AuthenticationData {
    
    inline def apply(socket: typings.socketclusterServer.serversocketMod.^): AuthenticationData = {
      val __obj = js.Dynamic.literal(socket = socket.asInstanceOf[js.Any])
      __obj.asInstanceOf[AuthenticationData]
    }
    
    extension [Self <: AuthenticationData](x: Self) {
      
      inline def setSocket(value: typings.socketclusterServer.serversocketMod.^): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
    }
  }
  
  trait BadSocketAuthTokenData
    extends StObject
       with BadAuthTokenData {
    
    var socket: typings.socketclusterServer.serversocketMod.^
  }
  object BadSocketAuthTokenData {
    
    inline def apply(authError: Error, signedAuthToken: String, socket: typings.socketclusterServer.serversocketMod.^): BadSocketAuthTokenData = {
      val __obj = js.Dynamic.literal(authError = authError.asInstanceOf[js.Any], signedAuthToken = signedAuthToken.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
      __obj.asInstanceOf[BadSocketAuthTokenData]
    }
    
    extension [Self <: BadSocketAuthTokenData](x: Self) {
      
      inline def setSocket(value: typings.socketclusterServer.serversocketMod.^): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
    }
  }
  
  trait ClosureData
    extends StObject
       with CloseData {
    
    var socket: typings.socketclusterServer.serversocketMod.^
  }
  object ClosureData {
    
    inline def apply(code: Double, reason: String, socket: typings.socketclusterServer.serversocketMod.^): ClosureData = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClosureData]
    }
    
    extension [Self <: ClosureData](x: Self) {
      
      inline def setSocket(value: typings.socketclusterServer.serversocketMod.^): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
    }
  }
  
  trait CodecEngine extends StObject {
    
    def decode(input: js.Any): js.Any
    
    def encode(`object`: js.Any): js.Any
  }
  object CodecEngine {
    
    inline def apply(decode: js.Any => js.Any, encode: js.Any => js.Any): CodecEngine = {
      val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), encode = js.Any.fromFunction1(encode))
      __obj.asInstanceOf[CodecEngine]
    }
    
    extension [Self <: CodecEngine](x: Self) {
      
      inline def setDecode(value: js.Any => js.Any): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
      
      inline def setEncode(value: js.Any => js.Any): Self = StObject.set(x, "encode", js.Any.fromFunction1(value))
    }
  }
  
  trait ConnectionAbortData
    extends StObject
       with ConnectAbortData {
    
    var socket: typings.socketclusterServer.serversocketMod.^
  }
  object ConnectionAbortData {
    
    inline def apply(code: Double, reason: String, socket: typings.socketclusterServer.serversocketMod.^): ConnectionAbortData = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionAbortData]
    }
    
    extension [Self <: ConnectionAbortData](x: Self) {
      
      inline def setSocket(value: typings.socketclusterServer.serversocketMod.^): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConnectionData
    extends StObject
       with ConnectData {
    
    var socket: typings.socketclusterServer.serversocketMod.^
  }
  object ConnectionData {
    
    inline def apply(
      id: String,
      isAuthenticated: Boolean,
      pingTimeout: Double,
      socket: typings.socketclusterServer.serversocketMod.^
    ): ConnectionData = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isAuthenticated = isAuthenticated.asInstanceOf[js.Any], pingTimeout = pingTimeout.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionData]
    }
    
    extension [Self <: ConnectionData](x: Self) {
      
      inline def setSocket(value: typings.socketclusterServer.serversocketMod.^): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
    }
  }
  
  trait DeauthenticationData
    extends StObject
       with DeauthenticateData {
    
    var socket: typings.socketclusterServer.serversocketMod.^
  }
  object DeauthenticationData {
    
    inline def apply(socket: typings.socketclusterServer.serversocketMod.^): DeauthenticationData = {
      val __obj = js.Dynamic.literal(socket = socket.asInstanceOf[js.Any])
      __obj.asInstanceOf[DeauthenticationData]
    }
    
    extension [Self <: DeauthenticationData](x: Self) {
      
      inline def setSocket(value: typings.socketclusterServer.serversocketMod.^): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
    }
  }
  
  trait DisconnectionData
    extends StObject
       with DisconnectData {
    
    var socket: typings.socketclusterServer.serversocketMod.^
  }
  object DisconnectionData {
    
    inline def apply(code: Double, reason: String, socket: typings.socketclusterServer.serversocketMod.^): DisconnectionData = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
      __obj.asInstanceOf[DisconnectionData]
    }
    
    extension [Self <: DisconnectionData](x: Self) {
      
      inline def setSocket(value: typings.socketclusterServer.serversocketMod.^): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.socketclusterServer.socketclusterServerStrings.handshake
    - typings.socketclusterServer.socketclusterServerStrings.inboundRaw
    - typings.socketclusterServer.socketclusterServerStrings.inbound
    - typings.socketclusterServer.socketclusterServerStrings.outbound
  */
  trait Middlewares extends StObject
  object Middlewares {
    
    inline def handshake: typings.socketclusterServer.socketclusterServerStrings.handshake = "handshake".asInstanceOf[typings.socketclusterServer.socketclusterServerStrings.handshake]
    
    inline def inbound: typings.socketclusterServer.socketclusterServerStrings.inbound = "inbound".asInstanceOf[typings.socketclusterServer.socketclusterServerStrings.inbound]
    
    inline def inboundRaw: typings.socketclusterServer.socketclusterServerStrings.inboundRaw = "inboundRaw".asInstanceOf[typings.socketclusterServer.socketclusterServerStrings.inboundRaw]
    
    inline def outbound: typings.socketclusterServer.socketclusterServerStrings.outbound = "outbound".asInstanceOf[typings.socketclusterServer.socketclusterServerStrings.outbound]
  }
  
  trait SubscriptionData
    extends StObject
       with SubscribeData {
    
    var socket: typings.socketclusterServer.serversocketMod.^
  }
  object SubscriptionData {
    
    inline def apply(
      channel: String,
      socket: typings.socketclusterServer.serversocketMod.^,
      subscriptionOptions: SubscriptionOptions
    ): SubscriptionData = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any], subscriptionOptions = subscriptionOptions.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubscriptionData]
    }
    
    extension [Self <: SubscriptionData](x: Self) {
      
      inline def setSocket(value: typings.socketclusterServer.serversocketMod.^): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
    }
  }
  
  trait UnsubscriptionData
    extends StObject
       with UnsubscribeData {
    
    var socket: typings.socketclusterServer.serversocketMod.^
  }
  object UnsubscriptionData {
    
    inline def apply(channel: String, socket: typings.socketclusterServer.serversocketMod.^): UnsubscriptionData = {
      val __obj = js.Dynamic.literal(channel = channel.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnsubscriptionData]
    }
    
    extension [Self <: UnsubscriptionData](x: Self) {
      
      inline def setSocket(value: typings.socketclusterServer.serversocketMod.^): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
    }
  }
  
  type handshakeMiddlewareFunction = js.Function1[/* stream */ typings.writableConsumableStream.mod.^[js.Any], Unit]
  
  type inboundMiddlewareFunction = js.Function1[/* stream */ typings.writableConsumableStream.mod.^[js.Any], Unit]
  
  type inboundRawMiddlewareFunction = js.Function1[/* stream */ typings.writableConsumableStream.mod.^[js.Any], Unit]
  
  type outboundMiddlewareFunction = js.Function1[/* stream */ typings.writableConsumableStream.mod.^[js.Any], Unit]
}
