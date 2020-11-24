package typings.socketclusterClient.clientsocketMod

import org.scalablytyped.runtime.StringDictionary
import typings.socketclusterClient.authMod.AGAuthEngine
import typings.socketclusterServer.serverMod.CodecEngine
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientOptions extends js.Object {
  
  // (milliseconds) - This is the timeout for getting a response to a AGClientSocket invoke action.
  var ackTimeout: js.UndefOr[Double] = js.native
  
  // A custom engine to use for storing and loading JWT auth tokens on the client side.
  var authEngine: js.UndefOr[AGAuthEngine | Null] = js.native
  
  // The name of the JWT auth token (provided to the authEngine - By default this is the localStorage variable name); defaults to 'socketcluster.authToken'.
  var authTokenName: js.UndefOr[String] = js.native
  
  // Whether or not to automatically connect the socket as soon as it is created. Default is true.
  var autoConnect: js.UndefOr[Boolean] = js.native
  
  // Whether or not to automatically reconnect the socket when it loses the connection. Default is true.
  var autoReconnect: js.UndefOr[Boolean] = js.native
  
  // Valid properties are: initialDelay (milliseconds), randomness (milliseconds), multiplier (decimal; default is 1.5) and maxDelay (milliseconds).
  var autoReconnectOptions: js.UndefOr[AutoReconnectOptions] = js.native
  
  // This is true by default. If you set this to false, then the socket will not automatically try to subscribe to pending subscriptions on
  // connect - Instead, you will have to manually invoke the processSubscriptions callback from inside the 'connect' event handler on the client side.
  // See AGClientSocket API. This gives you more fine-grained control with regards to when pending subscriptions are processed after the socket
  // connection is established (or re-established).
  var autoSubscribeOnConnect: js.UndefOr[Boolean] = js.native
  
  // The amount of milliseconds to wait before flushing each batch of messages. Defaults to 50.
  var batchInterval: js.UndefOr[Double] = js.native
  
  // Whether or not to start batching messages immediately after the connection handshake completes. This is useful for handling connection recovery
  // when the client tries to resubscribe to a large number of channels in a very short amount of time. Defaults to false.
  var batchOnHandshake: js.UndefOr[Boolean] = js.native
  
  // The amount of time in milliseconds after the handshake completes during which all socket messages will be batched. Defaults to 100.
  var batchOnHandshakeDuration: js.UndefOr[Double] = js.native
  
  // The type to use to represent binary on the client. Defaults to 'arraybuffer'.
  var binaryType: js.UndefOr[String] = js.native
  
  var callIdGenerator: js.UndefOr[CallIdGenerator] = js.native
  
  // A prefix to add to the channel names.
  var channelPrefix: js.UndefOr[String | Null] = js.native
  
  var clientId: js.UndefOr[String] = js.native
  
  // If you set this to true, any data/objects/arrays that you pass to the client socket will be cloned before being sent/queued up. If the socket
  // is disconnected and you emit an event, it will be added to a queue which will be processed upon reconnection. The cloneData option is false
  // by default; this means that if you emit/publish an object and that object changes somewhere else in your code before the queue is processed,
  // then the changed version of that object will be sent out to the server.
  var cloneData: js.UndefOr[Boolean] = js.native
  
  // Lets you set a custom codec engine. This allows you to specify how data gets encoded before being sent over the wire and how it gets decoded
  // once it reaches the other side. The codecEngine must be an object which exposes an encode(object) and a decode(encodedData) function.
  // The encode function can return any data type - Commonly a string or a Buffer/ArrayBuffer. The decode function needs to return a JavaScript
  // object which adheres to the SC protocol. The idea of using a custom codec is that it allows you to compress SocketCluster packets in any format
  // you like (optimized for any use case) - By decoding these packets back into their original protocol form, SocketCluster will be able process
  // them appropriately. Note that if you provide a codecEngine when creating a client socket, you will need to make sure that the server uses the
  // same codec by passing the same engine to the AGServer constructor (using the codecEngine option).
  var codecEngine: js.UndefOr[CodecEngine | Null] = js.native
  
  // (milliseconds)
  var connectTimeout: js.UndefOr[Double] = js.native
  
  // Whether or not a client automatically disconnects on page unload. If enabled, the client will disconnect when a user navigates away from the page.
  // This can happen when a user closes the tab/window, clicks a link to leave the page, or types a new URL into the address bar. Defaults to true.
  var disconnectOnUnload: js.UndefOr[Boolean] = js.native
  
  var host: js.UndefOr[String] = js.native
  
  // Defaults to the current host (read from the URL).
  var hostname: js.UndefOr[String] = js.native
  
  // The URL which SocketCluster uses to make the initial handshake for the WebSocket. Defaults to '/socketcluster/'.
  var path: js.UndefOr[String] = js.native
  
  // pingTimeout will be connectTimeout at the start, but it will be updated with values provided by the 'connect' event.
  var pingTimeout: js.UndefOr[Double] = js.native
  
  var pingTimeoutDisabled: js.UndefOr[Boolean] = js.native
  
  // Defaults to 80 if !secure otherwise defaults to 443.
  var port: js.UndefOr[Double] = js.native
  
  // The protocol scheme for the transport. Defaults to 'ws' or 'wss', depending upon the valur of secure.
  var protocolScheme: js.UndefOr[String] = js.native
  
  var protocolVersion: js.UndefOr[ProtocolVersions] = js.native
  
  // A map of key-value pairs which will be used as query parameters for the initial HTTP handshake which will initiate the WebSocket connection.
  var query: js.UndefOr[String | StringDictionary[String]] = js.native
  
  // Defaults to false.
  var secure: js.UndefOr[Boolean] = js.native
  
  var socketPath: js.UndefOr[String] = js.native
  
  var subscriptionRetryOptions: js.UndefOr[js.Object | Null] = js.native
  
  // The query parameter name to use to hold the timestamp.
  var timestampParam: js.UndefOr[String] = js.native
  
  // Whether or not to add a timestamp to the WebSocket handshake request.
  var timestampRequests: js.UndefOr[Boolean] = js.native
  
  var version: js.UndefOr[String] = js.native
  
  // This object will be passed to the constructor of the ws WebSocket instance.
  var wsOptions: js.UndefOr[typings.ws.mod.ClientOptions] = js.native
}
object ClientOptions {
  
  @scala.inline
  def apply(): ClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientOptions]
  }
  
  @scala.inline
  implicit class ClientOptionsOps[Self <: ClientOptions] (val x: Self) extends AnyVal {
    
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
    def setAuthEngine(value: AGAuthEngine): Self = this.set("authEngine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthEngine: Self = this.set("authEngine", js.undefined)
    
    @scala.inline
    def setAuthEngineNull: Self = this.set("authEngine", null)
    
    @scala.inline
    def setAuthTokenName(value: String): Self = this.set("authTokenName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthTokenName: Self = this.set("authTokenName", js.undefined)
    
    @scala.inline
    def setAutoConnect(value: Boolean): Self = this.set("autoConnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoConnect: Self = this.set("autoConnect", js.undefined)
    
    @scala.inline
    def setAutoReconnect(value: Boolean): Self = this.set("autoReconnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoReconnect: Self = this.set("autoReconnect", js.undefined)
    
    @scala.inline
    def setAutoReconnectOptions(value: AutoReconnectOptions): Self = this.set("autoReconnectOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoReconnectOptions: Self = this.set("autoReconnectOptions", js.undefined)
    
    @scala.inline
    def setAutoSubscribeOnConnect(value: Boolean): Self = this.set("autoSubscribeOnConnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoSubscribeOnConnect: Self = this.set("autoSubscribeOnConnect", js.undefined)
    
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
    def setBinaryType(value: String): Self = this.set("binaryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBinaryType: Self = this.set("binaryType", js.undefined)
    
    @scala.inline
    def setCallIdGenerator(value: () => Double): Self = this.set("callIdGenerator", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteCallIdGenerator: Self = this.set("callIdGenerator", js.undefined)
    
    @scala.inline
    def setChannelPrefix(value: String): Self = this.set("channelPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChannelPrefix: Self = this.set("channelPrefix", js.undefined)
    
    @scala.inline
    def setChannelPrefixNull: Self = this.set("channelPrefix", null)
    
    @scala.inline
    def setClientId(value: String): Self = this.set("clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClientId: Self = this.set("clientId", js.undefined)
    
    @scala.inline
    def setCloneData(value: Boolean): Self = this.set("cloneData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloneData: Self = this.set("cloneData", js.undefined)
    
    @scala.inline
    def setCodecEngine(value: CodecEngine): Self = this.set("codecEngine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCodecEngine: Self = this.set("codecEngine", js.undefined)
    
    @scala.inline
    def setCodecEngineNull: Self = this.set("codecEngine", null)
    
    @scala.inline
    def setConnectTimeout(value: Double): Self = this.set("connectTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConnectTimeout: Self = this.set("connectTimeout", js.undefined)
    
    @scala.inline
    def setDisconnectOnUnload(value: Boolean): Self = this.set("disconnectOnUnload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisconnectOnUnload: Self = this.set("disconnectOnUnload", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = this.set("host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHost: Self = this.set("host", js.undefined)
    
    @scala.inline
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostname: Self = this.set("hostname", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setPingTimeout(value: Double): Self = this.set("pingTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePingTimeout: Self = this.set("pingTimeout", js.undefined)
    
    @scala.inline
    def setPingTimeoutDisabled(value: Boolean): Self = this.set("pingTimeoutDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePingTimeoutDisabled: Self = this.set("pingTimeoutDisabled", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setProtocolScheme(value: String): Self = this.set("protocolScheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocolScheme: Self = this.set("protocolScheme", js.undefined)
    
    @scala.inline
    def setProtocolVersion(value: ProtocolVersions): Self = this.set("protocolVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProtocolVersion: Self = this.set("protocolVersion", js.undefined)
    
    @scala.inline
    def setQuery(value: String | StringDictionary[String]): Self = this.set("query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuery: Self = this.set("query", js.undefined)
    
    @scala.inline
    def setSecure(value: Boolean): Self = this.set("secure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecure: Self = this.set("secure", js.undefined)
    
    @scala.inline
    def setSocketPath(value: String): Self = this.set("socketPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSocketPath: Self = this.set("socketPath", js.undefined)
    
    @scala.inline
    def setSubscriptionRetryOptions(value: js.Object): Self = this.set("subscriptionRetryOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubscriptionRetryOptions: Self = this.set("subscriptionRetryOptions", js.undefined)
    
    @scala.inline
    def setSubscriptionRetryOptionsNull: Self = this.set("subscriptionRetryOptions", null)
    
    @scala.inline
    def setTimestampParam(value: String): Self = this.set("timestampParam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestampParam: Self = this.set("timestampParam", js.undefined)
    
    @scala.inline
    def setTimestampRequests(value: Boolean): Self = this.set("timestampRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimestampRequests: Self = this.set("timestampRequests", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
    
    @scala.inline
    def setWsOptions(value: typings.ws.mod.ClientOptions): Self = this.set("wsOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWsOptions: Self = this.set("wsOptions", js.undefined)
  }
}
