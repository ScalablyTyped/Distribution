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
import scala.scalajs.js.annotation._

trait AGServerOptions
  extends /* additionalOptions */ StringDictionary[js.Any] {
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
  @scala.inline
  def apply(
    StringDictionary: /* additionalOptions */ StringDictionary[js.Any] = null,
    ackTimeout: Int | Double = null,
    allowClientPublish: js.UndefOr[Boolean] = js.undefined,
    authAlgorithm: String = null,
    authDefaultExpiry: Int | Double = null,
    authEngine: SCAuthEngine = null,
    authKey: Secret = null,
    authPrivateKey: Secret = null,
    authPublicKey: Secret = null,
    authVerifyAlgorithms: js.Array[String] = null,
    batchInterval: Int | Double = null,
    batchOnHandshake: js.UndefOr[Boolean] = js.undefined,
    batchOnHandshakeDuration: Int | Double = null,
    cloneData: js.UndefOr[Boolean] = js.undefined,
    codecEngine: CodecEngine = null,
    handshakeTimeout: Int | Double = null,
    httpServer: Server = null,
    middlewareEmitFailures: js.UndefOr[Boolean] = js.undefined,
    origins: String = null,
    path: String = null,
    perMessageDeflate: Boolean | js.Object = null,
    pingInterval: Int | Double = null,
    pingTimeout: Int | Double = null,
    protocolVersion: `1` | `2` = null,
    socketChannelLimit: Int | Double = null,
    socketStreamCleanupMode: kill | close = null,
    wsEngine: js.Any = null,
    wsEngineServerOptions: ClientOptions = null
  ): AGServerOptions = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (ackTimeout != null) __obj.updateDynamic("ackTimeout")(ackTimeout.asInstanceOf[js.Any])
    if (!js.isUndefined(allowClientPublish)) __obj.updateDynamic("allowClientPublish")(allowClientPublish.asInstanceOf[js.Any])
    if (authAlgorithm != null) __obj.updateDynamic("authAlgorithm")(authAlgorithm.asInstanceOf[js.Any])
    if (authDefaultExpiry != null) __obj.updateDynamic("authDefaultExpiry")(authDefaultExpiry.asInstanceOf[js.Any])
    if (authEngine != null) __obj.updateDynamic("authEngine")(authEngine.asInstanceOf[js.Any])
    if (authKey != null) __obj.updateDynamic("authKey")(authKey.asInstanceOf[js.Any])
    if (authPrivateKey != null) __obj.updateDynamic("authPrivateKey")(authPrivateKey.asInstanceOf[js.Any])
    if (authPublicKey != null) __obj.updateDynamic("authPublicKey")(authPublicKey.asInstanceOf[js.Any])
    if (authVerifyAlgorithms != null) __obj.updateDynamic("authVerifyAlgorithms")(authVerifyAlgorithms.asInstanceOf[js.Any])
    if (batchInterval != null) __obj.updateDynamic("batchInterval")(batchInterval.asInstanceOf[js.Any])
    if (!js.isUndefined(batchOnHandshake)) __obj.updateDynamic("batchOnHandshake")(batchOnHandshake.asInstanceOf[js.Any])
    if (batchOnHandshakeDuration != null) __obj.updateDynamic("batchOnHandshakeDuration")(batchOnHandshakeDuration.asInstanceOf[js.Any])
    if (!js.isUndefined(cloneData)) __obj.updateDynamic("cloneData")(cloneData.asInstanceOf[js.Any])
    if (codecEngine != null) __obj.updateDynamic("codecEngine")(codecEngine.asInstanceOf[js.Any])
    if (handshakeTimeout != null) __obj.updateDynamic("handshakeTimeout")(handshakeTimeout.asInstanceOf[js.Any])
    if (httpServer != null) __obj.updateDynamic("httpServer")(httpServer.asInstanceOf[js.Any])
    if (!js.isUndefined(middlewareEmitFailures)) __obj.updateDynamic("middlewareEmitFailures")(middlewareEmitFailures.asInstanceOf[js.Any])
    if (origins != null) __obj.updateDynamic("origins")(origins.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (perMessageDeflate != null) __obj.updateDynamic("perMessageDeflate")(perMessageDeflate.asInstanceOf[js.Any])
    if (pingInterval != null) __obj.updateDynamic("pingInterval")(pingInterval.asInstanceOf[js.Any])
    if (pingTimeout != null) __obj.updateDynamic("pingTimeout")(pingTimeout.asInstanceOf[js.Any])
    if (protocolVersion != null) __obj.updateDynamic("protocolVersion")(protocolVersion.asInstanceOf[js.Any])
    if (socketChannelLimit != null) __obj.updateDynamic("socketChannelLimit")(socketChannelLimit.asInstanceOf[js.Any])
    if (socketStreamCleanupMode != null) __obj.updateDynamic("socketStreamCleanupMode")(socketStreamCleanupMode.asInstanceOf[js.Any])
    if (wsEngine != null) __obj.updateDynamic("wsEngine")(wsEngine.asInstanceOf[js.Any])
    if (wsEngineServerOptions != null) __obj.updateDynamic("wsEngineServerOptions")(wsEngineServerOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[AGServerOptions]
  }
}

