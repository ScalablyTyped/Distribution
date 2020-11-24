package typings.socketclusterServer.serverMod

import org.scalablytyped.runtime.StringDictionary
import typings.jsonwebtoken.mod.Secret
import typings.node.httpMod.Server
import typings.scAuth.mod.SCAuthEngine
import typings.socketclusterServer.socketclusterServerNumbers.`1`
import typings.socketclusterServer.socketclusterServerNumbers.`2`
import typings.socketclusterServer.socketclusterServerStrings.close
import typings.socketclusterServer.socketclusterServerStrings.kill
import typings.ws.mod.ClientOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AGServerOptions
  extends /* additionalOptions */ StringDictionary[js.Any] {
  
  // In milliseconds, the timeout for receiving a response
  // when using invoke() or invokePublish().
  var ackTimeout: js.UndefOr[Double] = js.native
  
  // Whether or not clients are allowed to publish messages
  // to channels.
  var allowClientPublish: js.UndefOr[Boolean] = js.native
  
  // The algorithm to use to sign and verify JWT tokens.
  var authAlgorithm: js.UndefOr[String] = js.native
  
  // The default expiry for auth tokens in seconds
  var authDefaultExpiry: js.UndefOr[Double] = js.native
  
  var authEngine: js.UndefOr[SCAuthEngine] = js.native
  
  // The key which SC will use to encrypt/decrypt authTokens,
  // defaults to a 256 bits cryptographically random hex
  // string. The default JWT algorithm used is 'HS256'.
  // If you want to use RSA or ECDSA, you should provide an
  // authPrivateKey and authPublicKey instead of authKey.
  var authKey: js.UndefOr[Secret] = js.native
  
  // If using an RSA or ECDSA algorithm to sign the
  // authToken, you will need to provide an authPrivateKey
  // and authPublicKey in PEM format (string or Buffer).
  var authPrivateKey: js.UndefOr[Secret] = js.native
  
  var authPublicKey: js.UndefOr[Secret] = js.native
  
  var authVerifyAlgorithms: js.UndefOr[js.Array[String]] = js.native
  
  // If batchOnHandshake is true, this lets you specify
  // the size of each batch in milliseconds.
  var batchInterval: js.UndefOr[Double] = js.native
  
  // Whether or not to batch all socket messages
  // for some time immediately after completing
  // a handshake. This can be useful in failure-recovery
  // scenarios (e.g. batch resubscribe).
  var batchOnHandshake: js.UndefOr[Boolean] = js.native
  
  // If batchOnHandshake is true, this lets you specify
  // How long to enable batching (in milliseconds) following
  // a successful socket handshake.
  var batchOnHandshakeDuration: js.UndefOr[Double] = js.native
  
  var cloneData: js.UndefOr[Boolean] = js.native
  
  var codecEngine: js.UndefOr[CodecEngine] = js.native
  
  // In milliseconds - If the socket handshake hasn't been
  // completed before this timeout is reached, the new
  // connection attempt will be terminated.
  var handshakeTimeout: js.UndefOr[Double] = js.native
  
  // An instance of a Node.js HTTP server.
  // https://nodejs.org/api/http.html#http_class_http_server
  // This option should not be set if the server is created
  // with socketClusterServer.attach(...).
  var httpServer: js.UndefOr[Server] = js.native
  
  // Whether or not an error should be emitted on
  // the socket whenever an action is blocked by a
  // middleware function
  var middlewareEmitFailures: js.UndefOr[Boolean] = js.native
  
  // Origins which are allowed to connect to the server.
  var origins: js.UndefOr[String] = js.native
  
  // The URL path reserved by SocketCluster clients to
  // interact with the server.
  var path: js.UndefOr[String] = js.native
  
  // perMessageDeflate compression. Note that this option is
  // passed directly to the wsEngine's Server object.
  // So if you're using 'ws' as the engine, you can pass an
  // object instead of a boolean.
  // Note that by default, per-message deflate only kicks in
  // for messages > 1024 bytes.
  var perMessageDeflate: js.UndefOr[Boolean | js.Object] = js.native
  
  // The interval in milliseconds on which to
  // send a ping to the client to check that
  // it is still alive.
  var pingInterval: js.UndefOr[Double] = js.native
  
  // How many milliseconds to wait without receiving a ping
  // before closing the socket.
  var pingTimeout: js.UndefOr[Double] = js.native
  
  // Can be 1 or 2. Version 1 is for maximum backwards
  // compatibility with SocketCluster clients.
  var protocolVersion: js.UndefOr[`1` | `2`] = js.native
  
  // The maximum number of unique channels which a single
  // socket can subscribe to.
  var socketChannelLimit: js.UndefOr[Double] = js.native
  
  // Lets you specify the default cleanup behaviour for
  // when a socket becomes disconnected.
  // Can be either 'kill' or 'close'. Kill mode means
  // that all of the socket's streams will be killed and
  // so consumption will stop immediately.
  // Close mode means that consumers on the socket will
  // be able to finish processing their stream backlogs
  // bebfore they are ended.
  var socketStreamCleanupMode: js.UndefOr[kill | close] = js.native
  
  // This can be the name of an npm module or a path to a
  // Node.js module to use as the WebSocket server engine.
  var wsEngine: js.UndefOr[js.Any] = js.native
  
  // Custom options to pass to the wsEngine when it is being
  // instantiated.
  var wsEngineServerOptions: js.UndefOr[ClientOptions] = js.native
}
object AGServerOptions {
  
  @scala.inline
  def apply(): AGServerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AGServerOptions]
  }
  
  @scala.inline
  implicit class AGServerOptionsOps[Self <: AGServerOptions] (val x: Self) extends AnyVal {
    
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
    def setAckTimeout(value: Double): Self = this.set("ackTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAckTimeout: Self = this.set("ackTimeout", js.undefined)
    
    @scala.inline
    def setAllowClientPublish(value: Boolean): Self = this.set("allowClientPublish", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAllowClientPublish: Self = this.set("allowClientPublish", js.undefined)
    
    @scala.inline
    def setAuthAlgorithm(value: String): Self = this.set("authAlgorithm", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthAlgorithm: Self = this.set("authAlgorithm", js.undefined)
    
    @scala.inline
    def setAuthDefaultExpiry(value: Double): Self = this.set("authDefaultExpiry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthDefaultExpiry: Self = this.set("authDefaultExpiry", js.undefined)
    
    @scala.inline
    def setAuthEngine(value: SCAuthEngine): Self = this.set("authEngine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthEngine: Self = this.set("authEngine", js.undefined)
    
    @scala.inline
    def setAuthKey(value: Secret): Self = this.set("authKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthKey: Self = this.set("authKey", js.undefined)
    
    @scala.inline
    def setAuthPrivateKey(value: Secret): Self = this.set("authPrivateKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthPrivateKey: Self = this.set("authPrivateKey", js.undefined)
    
    @scala.inline
    def setAuthPublicKey(value: Secret): Self = this.set("authPublicKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthPublicKey: Self = this.set("authPublicKey", js.undefined)
    
    @scala.inline
    def setAuthVerifyAlgorithmsVarargs(value: String*): Self = this.set("authVerifyAlgorithms", js.Array(value :_*))
    
    @scala.inline
    def setAuthVerifyAlgorithms(value: js.Array[String]): Self = this.set("authVerifyAlgorithms", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthVerifyAlgorithms: Self = this.set("authVerifyAlgorithms", js.undefined)
    
    @scala.inline
    def setBatchInterval(value: Double): Self = this.set("batchInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatchInterval: Self = this.set("batchInterval", js.undefined)
    
    @scala.inline
    def setBatchOnHandshake(value: Boolean): Self = this.set("batchOnHandshake", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatchOnHandshake: Self = this.set("batchOnHandshake", js.undefined)
    
    @scala.inline
    def setBatchOnHandshakeDuration(value: Double): Self = this.set("batchOnHandshakeDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatchOnHandshakeDuration: Self = this.set("batchOnHandshakeDuration", js.undefined)
    
    @scala.inline
    def setCloneData(value: Boolean): Self = this.set("cloneData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloneData: Self = this.set("cloneData", js.undefined)
    
    @scala.inline
    def setCodecEngine(value: CodecEngine): Self = this.set("codecEngine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodecEngine: Self = this.set("codecEngine", js.undefined)
    
    @scala.inline
    def setHandshakeTimeout(value: Double): Self = this.set("handshakeTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHandshakeTimeout: Self = this.set("handshakeTimeout", js.undefined)
    
    @scala.inline
    def setHttpServer(value: Server): Self = this.set("httpServer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpServer: Self = this.set("httpServer", js.undefined)
    
    @scala.inline
    def setMiddlewareEmitFailures(value: Boolean): Self = this.set("middlewareEmitFailures", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMiddlewareEmitFailures: Self = this.set("middlewareEmitFailures", js.undefined)
    
    @scala.inline
    def setOrigins(value: String): Self = this.set("origins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrigins: Self = this.set("origins", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setPerMessageDeflate(value: Boolean | js.Object): Self = this.set("perMessageDeflate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePerMessageDeflate: Self = this.set("perMessageDeflate", js.undefined)
    
    @scala.inline
    def setPingInterval(value: Double): Self = this.set("pingInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePingInterval: Self = this.set("pingInterval", js.undefined)
    
    @scala.inline
    def setPingTimeout(value: Double): Self = this.set("pingTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePingTimeout: Self = this.set("pingTimeout", js.undefined)
    
    @scala.inline
    def setProtocolVersion(value: `1` | `2`): Self = this.set("protocolVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocolVersion: Self = this.set("protocolVersion", js.undefined)
    
    @scala.inline
    def setSocketChannelLimit(value: Double): Self = this.set("socketChannelLimit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSocketChannelLimit: Self = this.set("socketChannelLimit", js.undefined)
    
    @scala.inline
    def setSocketStreamCleanupMode(value: kill | close): Self = this.set("socketStreamCleanupMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSocketStreamCleanupMode: Self = this.set("socketStreamCleanupMode", js.undefined)
    
    @scala.inline
    def setWsEngine(value: js.Any): Self = this.set("wsEngine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWsEngine: Self = this.set("wsEngine", js.undefined)
    
    @scala.inline
    def setWsEngineServerOptions(value: ClientOptions): Self = this.set("wsEngineServerOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWsEngineServerOptions: Self = this.set("wsEngineServerOptions", js.undefined)
  }
}
