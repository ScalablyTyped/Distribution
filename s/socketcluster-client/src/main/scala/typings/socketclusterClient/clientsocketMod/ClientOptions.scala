package typings.socketclusterClient.clientsocketMod

import org.scalablytyped.runtime.StringDictionary
import typings.socketclusterClient.authMod.AGAuthEngine
import typings.socketclusterServer.serverMod.CodecEngine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientOptions extends StObject {
  
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
  def apply(): ClientOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClientOptions]
  }
  
  @scala.inline
  implicit class ClientOptionsMutableBuilder[Self <: ClientOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAckTimeout(value: Double): Self = StObject.set(x, "ackTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAckTimeoutUndefined: Self = StObject.set(x, "ackTimeout", js.undefined)
    
    @scala.inline
    def setAuthEngine(value: AGAuthEngine): Self = StObject.set(x, "authEngine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthEngineNull: Self = StObject.set(x, "authEngine", null)
    
    @scala.inline
    def setAuthEngineUndefined: Self = StObject.set(x, "authEngine", js.undefined)
    
    @scala.inline
    def setAuthTokenName(value: String): Self = StObject.set(x, "authTokenName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthTokenNameUndefined: Self = StObject.set(x, "authTokenName", js.undefined)
    
    @scala.inline
    def setAutoConnect(value: Boolean): Self = StObject.set(x, "autoConnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoConnectUndefined: Self = StObject.set(x, "autoConnect", js.undefined)
    
    @scala.inline
    def setAutoReconnect(value: Boolean): Self = StObject.set(x, "autoReconnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoReconnectOptions(value: AutoReconnectOptions): Self = StObject.set(x, "autoReconnectOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoReconnectOptionsUndefined: Self = StObject.set(x, "autoReconnectOptions", js.undefined)
    
    @scala.inline
    def setAutoReconnectUndefined: Self = StObject.set(x, "autoReconnect", js.undefined)
    
    @scala.inline
    def setAutoSubscribeOnConnect(value: Boolean): Self = StObject.set(x, "autoSubscribeOnConnect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoSubscribeOnConnectUndefined: Self = StObject.set(x, "autoSubscribeOnConnect", js.undefined)
    
    @scala.inline
    def setBatchInterval(value: Double): Self = StObject.set(x, "batchInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchIntervalUndefined: Self = StObject.set(x, "batchInterval", js.undefined)
    
    @scala.inline
    def setBatchOnHandshake(value: Boolean): Self = StObject.set(x, "batchOnHandshake", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchOnHandshakeDuration(value: Double): Self = StObject.set(x, "batchOnHandshakeDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBatchOnHandshakeDurationUndefined: Self = StObject.set(x, "batchOnHandshakeDuration", js.undefined)
    
    @scala.inline
    def setBatchOnHandshakeUndefined: Self = StObject.set(x, "batchOnHandshake", js.undefined)
    
    @scala.inline
    def setBinaryType(value: String): Self = StObject.set(x, "binaryType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinaryTypeUndefined: Self = StObject.set(x, "binaryType", js.undefined)
    
    @scala.inline
    def setCallIdGenerator(value: () => Double): Self = StObject.set(x, "callIdGenerator", js.Any.fromFunction0(value))
    
    @scala.inline
    def setCallIdGeneratorUndefined: Self = StObject.set(x, "callIdGenerator", js.undefined)
    
    @scala.inline
    def setChannelPrefix(value: String): Self = StObject.set(x, "channelPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChannelPrefixNull: Self = StObject.set(x, "channelPrefix", null)
    
    @scala.inline
    def setChannelPrefixUndefined: Self = StObject.set(x, "channelPrefix", js.undefined)
    
    @scala.inline
    def setClientId(value: String): Self = StObject.set(x, "clientId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientIdUndefined: Self = StObject.set(x, "clientId", js.undefined)
    
    @scala.inline
    def setCloneData(value: Boolean): Self = StObject.set(x, "cloneData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloneDataUndefined: Self = StObject.set(x, "cloneData", js.undefined)
    
    @scala.inline
    def setCodecEngine(value: CodecEngine): Self = StObject.set(x, "codecEngine", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodecEngineNull: Self = StObject.set(x, "codecEngine", null)
    
    @scala.inline
    def setCodecEngineUndefined: Self = StObject.set(x, "codecEngine", js.undefined)
    
    @scala.inline
    def setConnectTimeout(value: Double): Self = StObject.set(x, "connectTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConnectTimeoutUndefined: Self = StObject.set(x, "connectTimeout", js.undefined)
    
    @scala.inline
    def setDisconnectOnUnload(value: Boolean): Self = StObject.set(x, "disconnectOnUnload", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisconnectOnUnloadUndefined: Self = StObject.set(x, "disconnectOnUnload", js.undefined)
    
    @scala.inline
    def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
    
    @scala.inline
    def setHostname(value: String): Self = StObject.set(x, "hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostnameUndefined: Self = StObject.set(x, "hostname", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setPingTimeout(value: Double): Self = StObject.set(x, "pingTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPingTimeoutDisabled(value: Boolean): Self = StObject.set(x, "pingTimeoutDisabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPingTimeoutDisabledUndefined: Self = StObject.set(x, "pingTimeoutDisabled", js.undefined)
    
    @scala.inline
    def setPingTimeoutUndefined: Self = StObject.set(x, "pingTimeout", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
    
    @scala.inline
    def setProtocolScheme(value: String): Self = StObject.set(x, "protocolScheme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolSchemeUndefined: Self = StObject.set(x, "protocolScheme", js.undefined)
    
    @scala.inline
    def setProtocolVersion(value: ProtocolVersions): Self = StObject.set(x, "protocolVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocolVersionUndefined: Self = StObject.set(x, "protocolVersion", js.undefined)
    
    @scala.inline
    def setQuery(value: String | StringDictionary[String]): Self = StObject.set(x, "query", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueryUndefined: Self = StObject.set(x, "query", js.undefined)
    
    @scala.inline
    def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    
    @scala.inline
    def setSocketPath(value: String): Self = StObject.set(x, "socketPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSocketPathUndefined: Self = StObject.set(x, "socketPath", js.undefined)
    
    @scala.inline
    def setSubscriptionRetryOptions(value: js.Object): Self = StObject.set(x, "subscriptionRetryOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubscriptionRetryOptionsNull: Self = StObject.set(x, "subscriptionRetryOptions", null)
    
    @scala.inline
    def setSubscriptionRetryOptionsUndefined: Self = StObject.set(x, "subscriptionRetryOptions", js.undefined)
    
    @scala.inline
    def setTimestampParam(value: String): Self = StObject.set(x, "timestampParam", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampParamUndefined: Self = StObject.set(x, "timestampParam", js.undefined)
    
    @scala.inline
    def setTimestampRequests(value: Boolean): Self = StObject.set(x, "timestampRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestampRequestsUndefined: Self = StObject.set(x, "timestampRequests", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    @scala.inline
    def setWsOptions(value: typings.ws.mod.ClientOptions): Self = StObject.set(x, "wsOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWsOptionsUndefined: Self = StObject.set(x, "wsOptions", js.undefined)
  }
}
