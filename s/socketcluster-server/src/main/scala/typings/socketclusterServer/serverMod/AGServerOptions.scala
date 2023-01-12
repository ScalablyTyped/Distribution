package typings.socketclusterServer.serverMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.jsonwebtoken.mod.Secret
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.Server
import typings.node.httpMod.ServerResponse
import typings.node.nodeColonnetMod.Socket
import typings.socketclusterServer.socketclusterServerInts.`1`
import typings.socketclusterServer.socketclusterServerInts.`2`
import typings.socketclusterServer.socketclusterServerStrings.close
import typings.socketclusterServer.socketclusterServerStrings.kill
import typings.ws.mod.ClientOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AGServerOptions
  extends StObject
     with /* additionalOptions */ StringDictionary[Any] {
  
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
  
  var authEngine: js.UndefOr[AuthEngineType] = js.undefined
  
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
  var httpServer: js.UndefOr[
    Server[
      Instantiable1[/* socket */ Socket, IncomingMessage], 
      Instantiable1[
        /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
        ServerResponse[IncomingMessage]
      ]
    ]
  ] = js.undefined
  
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
  var wsEngine: js.UndefOr[String | typings.socketclusterServer.anon.Server] = js.undefined
  
  // Custom options to pass to the wsEngine when it is being
  // instantiated.
  var wsEngineServerOptions: js.UndefOr[ClientOptions] = js.undefined
}
object AGServerOptions {
  
  inline def apply(): AGServerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AGServerOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AGServerOptions] (val x: Self) extends AnyVal {
    
    inline def setAckTimeout(value: Double): Self = StObject.set(x, "ackTimeout", value.asInstanceOf[js.Any])
    
    inline def setAckTimeoutUndefined: Self = StObject.set(x, "ackTimeout", js.undefined)
    
    inline def setAllowClientPublish(value: Boolean): Self = StObject.set(x, "allowClientPublish", value.asInstanceOf[js.Any])
    
    inline def setAllowClientPublishUndefined: Self = StObject.set(x, "allowClientPublish", js.undefined)
    
    inline def setAuthAlgorithm(value: String): Self = StObject.set(x, "authAlgorithm", value.asInstanceOf[js.Any])
    
    inline def setAuthAlgorithmUndefined: Self = StObject.set(x, "authAlgorithm", js.undefined)
    
    inline def setAuthDefaultExpiry(value: Double): Self = StObject.set(x, "authDefaultExpiry", value.asInstanceOf[js.Any])
    
    inline def setAuthDefaultExpiryUndefined: Self = StObject.set(x, "authDefaultExpiry", js.undefined)
    
    inline def setAuthEngine(value: AuthEngineType): Self = StObject.set(x, "authEngine", value.asInstanceOf[js.Any])
    
    inline def setAuthEngineUndefined: Self = StObject.set(x, "authEngine", js.undefined)
    
    inline def setAuthKey(value: Secret): Self = StObject.set(x, "authKey", value.asInstanceOf[js.Any])
    
    inline def setAuthKeyUndefined: Self = StObject.set(x, "authKey", js.undefined)
    
    inline def setAuthPrivateKey(value: Secret): Self = StObject.set(x, "authPrivateKey", value.asInstanceOf[js.Any])
    
    inline def setAuthPrivateKeyUndefined: Self = StObject.set(x, "authPrivateKey", js.undefined)
    
    inline def setAuthPublicKey(value: Secret): Self = StObject.set(x, "authPublicKey", value.asInstanceOf[js.Any])
    
    inline def setAuthPublicKeyUndefined: Self = StObject.set(x, "authPublicKey", js.undefined)
    
    inline def setAuthVerifyAlgorithms(value: js.Array[String]): Self = StObject.set(x, "authVerifyAlgorithms", value.asInstanceOf[js.Any])
    
    inline def setAuthVerifyAlgorithmsUndefined: Self = StObject.set(x, "authVerifyAlgorithms", js.undefined)
    
    inline def setAuthVerifyAlgorithmsVarargs(value: String*): Self = StObject.set(x, "authVerifyAlgorithms", js.Array(value*))
    
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
    
    inline def setHttpServer(
      value: Server[
          Instantiable1[/* socket */ Socket, IncomingMessage], 
          Instantiable1[
            /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
            ServerResponse[IncomingMessage]
          ]
        ]
    ): Self = StObject.set(x, "httpServer", value.asInstanceOf[js.Any])
    
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
    
    inline def setWsEngine(value: String | typings.socketclusterServer.anon.Server): Self = StObject.set(x, "wsEngine", value.asInstanceOf[js.Any])
    
    inline def setWsEngineServerOptions(value: ClientOptions): Self = StObject.set(x, "wsEngineServerOptions", value.asInstanceOf[js.Any])
    
    inline def setWsEngineServerOptionsUndefined: Self = StObject.set(x, "wsEngineServerOptions", js.undefined)
    
    inline def setWsEngineUndefined: Self = StObject.set(x, "wsEngine", js.undefined)
  }
}
