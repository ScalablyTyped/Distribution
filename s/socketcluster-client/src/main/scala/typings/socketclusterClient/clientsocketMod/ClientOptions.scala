package typings.socketclusterClient.clientsocketMod

import org.scalablytyped.runtime.StringDictionary
import typings.socketclusterClient.authMod.AGAuthEngine
import typings.socketclusterServer.serverMod.CodecEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientOptions extends js.Object {
  // (milliseconds) - This is the timeout for getting a response to a AGClientSocket invoke action.
  var ackTimeout: js.UndefOr[Double] = js.undefined
  // A custom engine to use for storing and loading JWT auth tokens on the client side.
  var authEngine: js.UndefOr[AGAuthEngine | Null] = js.undefined
  // The name of the JWT auth token (provided to the authEngine - By default this is the localStorage variable name); defaults to 'socketcluster.authToken'.
  var authTokenName: js.UndefOr[String] = js.undefined
  // Whether or not to automatically connect the socket as soon as it is created. Default is true.
  var autoConnect: js.UndefOr[Boolean] = js.undefined
  // Whether or not to automatically reconnect the socket when it loses the connection. Default is true.
  var autoReconnect: js.UndefOr[Boolean] = js.undefined
  // Valid properties are: initialDelay (milliseconds), randomness (milliseconds), multiplier (decimal; default is 1.5) and maxDelay (milliseconds).
  var autoReconnectOptions: js.UndefOr[AutoReconnectOptions] = js.undefined
  // This is true by default. If you set this to false, then the socket will not automatically try to subscribe to pending subscriptions on
  // connect - Instead, you will have to manually invoke the processSubscriptions callback from inside the 'connect' event handler on the client side.
  // See AGClientSocket API. This gives you more fine-grained control with regards to when pending subscriptions are processed after the socket
  // connection is established (or re-established).
  var autoSubscribeOnConnect: js.UndefOr[Boolean] = js.undefined
  // The amount of milliseconds to wait before flushing each batch of messages. Defaults to 50.
  var batchInterval: js.UndefOr[Double] = js.undefined
  // Whether or not to start batching messages immediately after the connection handshake completes. This is useful for handling connection recovery
  // when the client tries to resubscribe to a large number of channels in a very short amount of time. Defaults to false.
  var batchOnHandshake: js.UndefOr[Boolean] = js.undefined
  // The amount of time in milliseconds after the handshake completes during which all socket messages will be batched. Defaults to 100.
  var batchOnHandshakeDuration: js.UndefOr[Double] = js.undefined
  // The type to use to represent binary on the client. Defaults to 'arraybuffer'.
  var binaryType: js.UndefOr[String] = js.undefined
  var callIdGenerator: js.UndefOr[CallIdGenerator] = js.undefined
  // A prefix to add to the channel names.
  var channelPrefix: js.UndefOr[String | Null] = js.undefined
  var clientId: js.UndefOr[String] = js.undefined
  // If you set this to true, any data/objects/arrays that you pass to the client socket will be cloned before being sent/queued up. If the socket
  // is disconnected and you emit an event, it will be added to a queue which will be processed upon reconnection. The cloneData option is false
  // by default; this means that if you emit/publish an object and that object changes somewhere else in your code before the queue is processed,
  // then the changed version of that object will be sent out to the server.
  var cloneData: js.UndefOr[Boolean] = js.undefined
  // Lets you set a custom codec engine. This allows you to specify how data gets encoded before being sent over the wire and how it gets decoded
  // once it reaches the other side. The codecEngine must be an object which exposes an encode(object) and a decode(encodedData) function.
  // The encode function can return any data type - Commonly a string or a Buffer/ArrayBuffer. The decode function needs to return a JavaScript
  // object which adheres to the SC protocol. The idea of using a custom codec is that it allows you to compress SocketCluster packets in any format
  // you like (optimized for any use case) - By decoding these packets back into their original protocol form, SocketCluster will be able process
  // them appropriately. Note that if you provide a codecEngine when creating a client socket, you will need to make sure that the server uses the
  // same codec by passing the same engine to the AGServer constructor (using the codecEngine option).
  var codecEngine: js.UndefOr[CodecEngine | Null] = js.undefined
  // (milliseconds)
  var connectTimeout: js.UndefOr[Double] = js.undefined
  // Whether or not a client automatically disconnects on page unload. If enabled, the client will disconnect when a user navigates away from the page.
  // This can happen when a user closes the tab/window, clicks a link to leave the page, or types a new URL into the address bar. Defaults to true.
  var disconnectOnUnload: js.UndefOr[Boolean] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  // Defaults to the current host (read from the URL).
  var hostname: js.UndefOr[String] = js.undefined
  // The URL which SocketCluster uses to make the initial handshake for the WebSocket. Defaults to '/socketcluster/'.
  var path: js.UndefOr[String] = js.undefined
  // pingTimeout will be connectTimeout at the start, but it will be updated with values provided by the 'connect' event.
  var pingTimeout: js.UndefOr[Double] = js.undefined
  var pingTimeoutDisabled: js.UndefOr[Boolean] = js.undefined
  // Defaults to 80 if !secure otherwise defaults to 443.
  var port: js.UndefOr[Double] = js.undefined
  // The protocol scheme for the transport. Defaults to 'ws' or 'wss', depending upon the valur of secure.
  var protocolScheme: js.UndefOr[String] = js.undefined
  var protocolVersion: js.UndefOr[ProtocolVersions] = js.undefined
  // A map of key-value pairs which will be used as query parameters for the initial HTTP handshake which will initiate the WebSocket connection.
  var query: js.UndefOr[String | StringDictionary[String]] = js.undefined
  // Defaults to false.
  var secure: js.UndefOr[Boolean] = js.undefined
  var socketPath: js.UndefOr[String] = js.undefined
  var subscriptionRetryOptions: js.UndefOr[js.Object | Null] = js.undefined
  // The query parameter name to use to hold the timestamp.
  var timestampParam: js.UndefOr[String] = js.undefined
  // Whether or not to add a timestamp to the WebSocket handshake request.
  var timestampRequests: js.UndefOr[Boolean] = js.undefined
  var version: js.UndefOr[String] = js.undefined
  // This object will be passed to the constructor of the ws WebSocket instance.
  var wsOptions: js.UndefOr[typings.ws.mod.ClientOptions] = js.undefined
}

object ClientOptions {
  @scala.inline
  def apply(
    ackTimeout: js.UndefOr[Double] = js.undefined,
    authEngine: js.UndefOr[Null | AGAuthEngine] = js.undefined,
    authTokenName: String = null,
    autoConnect: js.UndefOr[Boolean] = js.undefined,
    autoReconnect: js.UndefOr[Boolean] = js.undefined,
    autoReconnectOptions: AutoReconnectOptions = null,
    autoSubscribeOnConnect: js.UndefOr[Boolean] = js.undefined,
    batchInterval: js.UndefOr[Double] = js.undefined,
    batchOnHandshake: js.UndefOr[Boolean] = js.undefined,
    batchOnHandshakeDuration: js.UndefOr[Double] = js.undefined,
    binaryType: String = null,
    callIdGenerator: () => Double = null,
    channelPrefix: js.UndefOr[Null | String] = js.undefined,
    clientId: String = null,
    cloneData: js.UndefOr[Boolean] = js.undefined,
    codecEngine: js.UndefOr[Null | CodecEngine] = js.undefined,
    connectTimeout: js.UndefOr[Double] = js.undefined,
    disconnectOnUnload: js.UndefOr[Boolean] = js.undefined,
    host: String = null,
    hostname: String = null,
    path: String = null,
    pingTimeout: js.UndefOr[Double] = js.undefined,
    pingTimeoutDisabled: js.UndefOr[Boolean] = js.undefined,
    port: js.UndefOr[Double] = js.undefined,
    protocolScheme: String = null,
    protocolVersion: ProtocolVersions = null,
    query: String | StringDictionary[String] = null,
    secure: js.UndefOr[Boolean] = js.undefined,
    socketPath: String = null,
    subscriptionRetryOptions: js.UndefOr[Null | js.Object] = js.undefined,
    timestampParam: String = null,
    timestampRequests: js.UndefOr[Boolean] = js.undefined,
    version: String = null,
    wsOptions: typings.ws.mod.ClientOptions = null
  ): ClientOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ackTimeout)) __obj.updateDynamic("ackTimeout")(ackTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(authEngine)) __obj.updateDynamic("authEngine")(authEngine.asInstanceOf[js.Any])
    if (authTokenName != null) __obj.updateDynamic("authTokenName")(authTokenName.asInstanceOf[js.Any])
    if (!js.isUndefined(autoConnect)) __obj.updateDynamic("autoConnect")(autoConnect.get.asInstanceOf[js.Any])
    if (!js.isUndefined(autoReconnect)) __obj.updateDynamic("autoReconnect")(autoReconnect.get.asInstanceOf[js.Any])
    if (autoReconnectOptions != null) __obj.updateDynamic("autoReconnectOptions")(autoReconnectOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(autoSubscribeOnConnect)) __obj.updateDynamic("autoSubscribeOnConnect")(autoSubscribeOnConnect.get.asInstanceOf[js.Any])
    if (!js.isUndefined(batchInterval)) __obj.updateDynamic("batchInterval")(batchInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(batchOnHandshake)) __obj.updateDynamic("batchOnHandshake")(batchOnHandshake.get.asInstanceOf[js.Any])
    if (!js.isUndefined(batchOnHandshakeDuration)) __obj.updateDynamic("batchOnHandshakeDuration")(batchOnHandshakeDuration.get.asInstanceOf[js.Any])
    if (binaryType != null) __obj.updateDynamic("binaryType")(binaryType.asInstanceOf[js.Any])
    if (callIdGenerator != null) __obj.updateDynamic("callIdGenerator")(js.Any.fromFunction0(callIdGenerator))
    if (!js.isUndefined(channelPrefix)) __obj.updateDynamic("channelPrefix")(channelPrefix.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (!js.isUndefined(cloneData)) __obj.updateDynamic("cloneData")(cloneData.get.asInstanceOf[js.Any])
    if (!js.isUndefined(codecEngine)) __obj.updateDynamic("codecEngine")(codecEngine.asInstanceOf[js.Any])
    if (!js.isUndefined(connectTimeout)) __obj.updateDynamic("connectTimeout")(connectTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(disconnectOnUnload)) __obj.updateDynamic("disconnectOnUnload")(disconnectOnUnload.get.asInstanceOf[js.Any])
    if (host != null) __obj.updateDynamic("host")(host.asInstanceOf[js.Any])
    if (hostname != null) __obj.updateDynamic("hostname")(hostname.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(pingTimeout)) __obj.updateDynamic("pingTimeout")(pingTimeout.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pingTimeoutDisabled)) __obj.updateDynamic("pingTimeoutDisabled")(pingTimeoutDisabled.get.asInstanceOf[js.Any])
    if (!js.isUndefined(port)) __obj.updateDynamic("port")(port.get.asInstanceOf[js.Any])
    if (protocolScheme != null) __obj.updateDynamic("protocolScheme")(protocolScheme.asInstanceOf[js.Any])
    if (protocolVersion != null) __obj.updateDynamic("protocolVersion")(protocolVersion.asInstanceOf[js.Any])
    if (query != null) __obj.updateDynamic("query")(query.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure.get.asInstanceOf[js.Any])
    if (socketPath != null) __obj.updateDynamic("socketPath")(socketPath.asInstanceOf[js.Any])
    if (!js.isUndefined(subscriptionRetryOptions)) __obj.updateDynamic("subscriptionRetryOptions")(subscriptionRetryOptions.asInstanceOf[js.Any])
    if (timestampParam != null) __obj.updateDynamic("timestampParam")(timestampParam.asInstanceOf[js.Any])
    if (!js.isUndefined(timestampRequests)) __obj.updateDynamic("timestampRequests")(timestampRequests.get.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    if (wsOptions != null) __obj.updateDynamic("wsOptions")(wsOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ClientOptions]
  }
}

