package typings.signalr

import org.scalablytyped.runtime.StringDictionary
import typings.jquery.JQueryPromise
import typings.signalr.SignalR.AjaxDefaults
import typings.signalr.SignalR.AvailableEvents
import typings.signalr.SignalR.Connection
import typings.signalr.SignalR.ConnectionStates
import typings.signalr.SignalR.Hub.HubCreator
import typings.signalr.SignalR.Hub.Options
import typings.signalr.SignalR.Transports
import typings.signalr.anon.Name
import typings.signalr.signalrInts.`0`
import typings.signalr.signalrInts.`1`
import typings.signalr.signalrInts.`2`
import typings.signalr.signalrInts.`4`
import typings.std.Error
import typings.std.JSON
import typings.std.Location
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SignalR extends StObject {
  
  /**
    * Creates a new SignalR connection for the given url
    *
    * @param url   The URL of the long polling endpoint
    * @param queryString   [Optional] Custom querystring parameters to add to the connection URL. If an object, every non-function member will be added to the querystring. If a string, it's added to the QS as specified.
    * @param logging [Optional] A flag indicating whether connection logging is enabled to the browser console/log. Defaults to false.
    */
  def apply(url: String): Connection = js.native
  def apply(url: String, queryString: String): Connection = js.native
  def apply(url: String, queryString: String, logging: Boolean): Connection = js.native
  def apply(url: String, queryString: js.Object): Connection = js.native
  def apply(url: String, queryString: js.Object, logging: Boolean): Connection = js.native
  def apply(url: String, queryString: Unit, logging: Boolean): Connection = js.native
  
  var ajaxDefaults: AjaxDefaults = js.native
  
  def changeState(connection: Connection, expectedState: Double, newState: Double): Unit = js.native
  
  var connectionState: ConnectionStates = js.native
  
  var events: AvailableEvents = js.native
  
  var hub: typings.signalr.SignalR.Hub.Connection = js.native
  
  def hubConnection(): typings.signalr.SignalR.Hub.Connection = js.native
  def hubConnection(url: String): typings.signalr.SignalR.Hub.Connection = js.native
  def hubConnection(url: String, options: Options): typings.signalr.SignalR.Hub.Connection = js.native
  def hubConnection(url: Unit, options: Options): typings.signalr.SignalR.Hub.Connection = js.native
  @JSName("hubConnection")
  var hubConnection_Original: HubCreator = js.native
  
  def isDisconnecting(connection: Connection): Boolean = js.native
  
  /**
    *   Reinstates the original value of $.connection and returns the signalR object for manual assignment.
    */
  def noConflict(): Connection = js.native
  
  var transports: Transports = js.native
  
  /**
    *   Current SignalR version.
    */
  var version: String = js.native
}
object SignalR {
  
  trait AjaxDefaults extends StObject {
    
    var async: Boolean
    
    var cache: Boolean
    
    var global: Boolean
    
    var processData: Boolean
    
    var timeout: Double
  }
  object AjaxDefaults {
    
    inline def apply(async: Boolean, cache: Boolean, global: Boolean, processData: Boolean, timeout: Double): AjaxDefaults = {
      val __obj = js.Dynamic.literal(async = async.asInstanceOf[js.Any], cache = cache.asInstanceOf[js.Any], global = global.asInstanceOf[js.Any], processData = processData.asInstanceOf[js.Any], timeout = timeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[AjaxDefaults]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AjaxDefaults] (val x: Self) extends AnyVal {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setGlobal(value: Boolean): Self = StObject.set(x, "global", value.asInstanceOf[js.Any])
      
      inline def setProcessData(value: Boolean): Self = StObject.set(x, "processData", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    }
  }
  
  trait AvailableEvents extends StObject {
    
    var onConnectionSlow: String
    
    var onDisconnect: String
    
    var onError: String
    
    var onReceived: String
    
    var onReconnect: String
    
    var onStart: String
    
    var onStarting: String
    
    var onStateChanged: String
  }
  object AvailableEvents {
    
    inline def apply(
      onConnectionSlow: String,
      onDisconnect: String,
      onError: String,
      onReceived: String,
      onReconnect: String,
      onStart: String,
      onStarting: String,
      onStateChanged: String
    ): AvailableEvents = {
      val __obj = js.Dynamic.literal(onConnectionSlow = onConnectionSlow.asInstanceOf[js.Any], onDisconnect = onDisconnect.asInstanceOf[js.Any], onError = onError.asInstanceOf[js.Any], onReceived = onReceived.asInstanceOf[js.Any], onReconnect = onReconnect.asInstanceOf[js.Any], onStart = onStart.asInstanceOf[js.Any], onStarting = onStarting.asInstanceOf[js.Any], onStateChanged = onStateChanged.asInstanceOf[js.Any])
      __obj.asInstanceOf[AvailableEvents]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AvailableEvents] (val x: Self) extends AnyVal {
      
      inline def setOnConnectionSlow(value: String): Self = StObject.set(x, "onConnectionSlow", value.asInstanceOf[js.Any])
      
      inline def setOnDisconnect(value: String): Self = StObject.set(x, "onDisconnect", value.asInstanceOf[js.Any])
      
      inline def setOnError(value: String): Self = StObject.set(x, "onError", value.asInstanceOf[js.Any])
      
      inline def setOnReceived(value: String): Self = StObject.set(x, "onReceived", value.asInstanceOf[js.Any])
      
      inline def setOnReconnect(value: String): Self = StObject.set(x, "onReconnect", value.asInstanceOf[js.Any])
      
      inline def setOnStart(value: String): Self = StObject.set(x, "onStart", value.asInstanceOf[js.Any])
      
      inline def setOnStarting(value: String): Self = StObject.set(x, "onStarting", value.asInstanceOf[js.Any])
      
      inline def setOnStateChanged(value: String): Self = StObject.set(x, "onStateChanged", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Connection extends StObject {
    
    var ajaxDataType: String = js.native
    
    var clientProtocol: String = js.native
    
    /**
      * Adds a callback that will be invoked when the client detects a slow connection
      *
      * @param calback A callback function to execute when the connection is slow
      */
    def connectionSlow(callback: js.Function0[Unit]): Connection = js.native
    
    var contentType: String = js.native
    
    /**
      * Data sent with each request as a query string called "connectionData".
      */
    var data: js.UndefOr[String] = js.native
    
    /**
      * This should be set by the server in response to the negotiate request (30s default)
      */
    var disconnectTimeout: Double = js.native
    
    /**
      * Adds a callback that will be invoked when the client disconnects
      *
      * @param calback A callback function to execute when the connection is broken
      */
    def disconnected(callback: js.Function0[Unit]): Connection = js.native
    
    /**
      * Adds a callback that will be invoked after an error occurs with the connection
      *
      * @param calback A callback function to execute when an error occurs on the connection
      */
    def error(callback: js.Function1[/* error */ ConnectionError, Unit]): Connection = js.native
    
    var hub: typings.signalr.SignalR.Hub.Connection = js.native
    
    var id: String = js.native
    
    /**
      * Checks if url is cross domain
      *
      * @param url The base URL
      * @param against An optional argument to compare the URL against, if not specified it will be set to window.location. If specified it must contain a protocol and a host property.
      */
    def isCrossDomain(url: String): Boolean = js.native
    def isCrossDomain(url: String, against: SimplifyLocation): Boolean = js.native
    def isCrossDomain(url: String, against: Location): Boolean = js.native
    
    var json: JSON = js.native
    
    /**
      * Warn user of slow connection if we breach the X% mark of the keep alive timeout
      */
    var keepAliveWarnAt: Double = js.native
    
    var lastError: ConnectionError = js.native
    
    def log(msg: String): Connection = js.native
    
    var logging: Boolean = js.native
    
    var qs: String | js.Object = js.native
    
    /**
      * Adds a callback that will be invoked after anything is received over the connection
      *
      * @param calback A callback function to execute when any data is received on the connection
      */
    def received(callback: js.Function1[/* data */ Any, Unit]): Connection = js.native
    
    var reconnectDelay: Double = js.native
    
    /**
      * This should be set by the server in response to the negotiate request
      */
    var reconnectWindow: Double = js.native
    
    /**
      * Adds a callback that will be invoked when the underlying transport reconnects
      *
      * @param calback A callback function to execute when the connection is restored
      */
    def reconnected(callback: js.Function0[Unit]): Connection = js.native
    
    /**
      * Adds a callback that will be invoked when the underlying transport begins reconnecting
      *
      * @param calback A callback function to execute when the connection enters a reconnecting state
      */
    def reconnecting(callback: js.Function0[Unit]): Connection = js.native
    
    var resources: Resources = js.native
    
    /**
      * Sends data over the connection
      *
      * @param options Options map
      * @param calback The data to send over the connection
      */
    def send(data: String): Connection = js.native
    
    /**
      * Starts the connection
      */
    def start(): JQueryPromise[Any] = js.native
    /**
      * Starts the connection
      *
      * @param callback A callback function to execute when the connection has started
      */
    def start(callback: js.Function0[Unit]): JQueryPromise[Any] = js.native
    /**
      * Starts the connection
      *
      * @param options Options map
      */
    def start(options: ConnectionOptions): JQueryPromise[Any] = js.native
    /**
      * Starts the connection
      *
      * @param options Options map
      * @param calback A callback function to execute when the connection has started
      */
    def start(options: ConnectionOptions, callback: js.Function0[Unit]): JQueryPromise[Any] = js.native
    
    /**
      * Adds a callback that will be invoked before anything is sent over the connection
      *
      * @param calback A callback function to execute before the connection is fully instantiated.
      */
    def starting(callback: js.Function0[Unit]): Connection = js.native
    
    var state: Double = js.native
    
    /**
      * Adds a callback that will be invoked when the connection state changes
      *
      * @param calback A callback function to execute when the connection state changes
      */
    def stateChanged(callback: js.Function1[/* change */ StateChanged, Unit]): Connection = js.native
    
    /**
      * Stops listening
      *
      * @param async Whether or not to asynchronously abort the connection
      * @param notifyServer Whether we want to notify the server that we are aborting the connection
      */
    def stop(): Connection = js.native
    def stop(async: Boolean): Connection = js.native
    def stop(async: Boolean, notifyServer: Boolean): Connection = js.native
    def stop(async: Unit, notifyServer: Boolean): Connection = js.native
    
    /**
      * Data sent with each request as a query string called "connectionToken".
      */
    var token: js.UndefOr[String] = js.native
    
    var transportConnectTimeout: Double = js.native
    
    var url: String = js.native
  }
  
  trait ConnectionError
    extends StObject
       with Error {
    
    var context: ConnectionErrorContext
    
    var source: js.UndefOr[String] = js.undefined
    
    var transport: js.UndefOr[String] = js.undefined
  }
  object ConnectionError {
    
    inline def apply(context: ConnectionErrorContext, message: String, name: String): ConnectionError = {
      val __obj = js.Dynamic.literal(context = context.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionError]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConnectionError] (val x: Self) extends AnyVal {
      
      inline def setContext(value: ConnectionErrorContext): Self = StObject.set(x, "context", value.asInstanceOf[js.Any])
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      inline def setTransport(value: String): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
      
      inline def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
    }
  }
  
  trait ConnectionErrorContext extends StObject {
    
    var readyState: Double
    
    var responseText: String
    
    var status: Double
    
    var statusText: String
  }
  object ConnectionErrorContext {
    
    inline def apply(readyState: Double, responseText: String, status: Double, statusText: String): ConnectionErrorContext = {
      val __obj = js.Dynamic.literal(readyState = readyState.asInstanceOf[js.Any], responseText = responseText.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], statusText = statusText.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionErrorContext]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConnectionErrorContext] (val x: Self) extends AnyVal {
      
      inline def setReadyState(value: Double): Self = StObject.set(x, "readyState", value.asInstanceOf[js.Any])
      
      inline def setResponseText(value: String): Self = StObject.set(x, "responseText", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
    }
  }
  
  trait ConnectionOptions extends StObject {
    
    var callback: js.UndefOr[js.Function] = js.undefined
    
    var jsonp: js.UndefOr[Boolean] = js.undefined
    
    var pingInterval: js.UndefOr[Double] = js.undefined
    
    var transport: js.UndefOr[String | js.Array[String] | Transport] = js.undefined
    
    var waitForPageLoad: js.UndefOr[Boolean] = js.undefined
    
    var withCredentials: js.UndefOr[Boolean] = js.undefined
  }
  object ConnectionOptions {
    
    inline def apply(): ConnectionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ConnectionOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConnectionOptions] (val x: Self) extends AnyVal {
      
      inline def setCallback(value: js.Function): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setJsonp(value: Boolean): Self = StObject.set(x, "jsonp", value.asInstanceOf[js.Any])
      
      inline def setJsonpUndefined: Self = StObject.set(x, "jsonp", js.undefined)
      
      inline def setPingInterval(value: Double): Self = StObject.set(x, "pingInterval", value.asInstanceOf[js.Any])
      
      inline def setPingIntervalUndefined: Self = StObject.set(x, "pingInterval", js.undefined)
      
      inline def setTransport(value: String | js.Array[String] | Transport): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
      
      inline def setTransportUndefined: Self = StObject.set(x, "transport", js.undefined)
      
      inline def setTransportVarargs(value: String*): Self = StObject.set(x, "transport", js.Array(value*))
      
      inline def setWaitForPageLoad(value: Boolean): Self = StObject.set(x, "waitForPageLoad", value.asInstanceOf[js.Any])
      
      inline def setWaitForPageLoadUndefined: Self = StObject.set(x, "waitForPageLoad", js.undefined)
      
      inline def setWithCredentials(value: Boolean): Self = StObject.set(x, "withCredentials", value.asInstanceOf[js.Any])
      
      inline def setWithCredentialsUndefined: Self = StObject.set(x, "withCredentials", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.signalr.signalrInts.`0`
    - typings.signalr.signalrInts.`1`
    - typings.signalr.signalrInts.`2`
    - typings.signalr.signalrInts.`4`
  */
  trait ConnectionState extends StObject
  object ConnectionState {
    
    inline def Connected: `1` = 1.asInstanceOf[`1`]
    
    inline def Connecting: `0` = 0.asInstanceOf[`0`]
    
    inline def Disconnected: `4` = 4.asInstanceOf[`4`]
    
    inline def Reconnecting: `2` = 2.asInstanceOf[`2`]
  }
  
  trait ConnectionStates extends StObject {
    
    var connected: Double
    
    var connecting: Double
    
    var disconnected: Double
    
    var reconnecting: Double
  }
  object ConnectionStates {
    
    inline def apply(connected: Double, connecting: Double, disconnected: Double, reconnecting: Double): ConnectionStates = {
      val __obj = js.Dynamic.literal(connected = connected.asInstanceOf[js.Any], connecting = connecting.asInstanceOf[js.Any], disconnected = disconnected.asInstanceOf[js.Any], reconnecting = reconnecting.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionStates]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ConnectionStates] (val x: Self) extends AnyVal {
      
      inline def setConnected(value: Double): Self = StObject.set(x, "connected", value.asInstanceOf[js.Any])
      
      inline def setConnecting(value: Double): Self = StObject.set(x, "connecting", value.asInstanceOf[js.Any])
      
      inline def setDisconnected(value: Double): Self = StObject.set(x, "disconnected", value.asInstanceOf[js.Any])
      
      inline def setReconnecting(value: Double): Self = StObject.set(x, "reconnecting", value.asInstanceOf[js.Any])
    }
  }
  
  object Hub {
    
    trait ClientHubInvocation extends StObject {
      
      var Args: String
      
      var Hub: String
      
      var Method: String
      
      var State: String
    }
    object ClientHubInvocation {
      
      inline def apply(Args: String, Hub: String, Method: String, State: String): ClientHubInvocation = {
        val __obj = js.Dynamic.literal(Args = Args.asInstanceOf[js.Any], Hub = Hub.asInstanceOf[js.Any], Method = Method.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any])
        __obj.asInstanceOf[ClientHubInvocation]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: ClientHubInvocation] (val x: Self) extends AnyVal {
        
        inline def setArgs(value: String): Self = StObject.set(x, "Args", value.asInstanceOf[js.Any])
        
        inline def setHub(value: String): Self = StObject.set(x, "Hub", value.asInstanceOf[js.Any])
        
        inline def setMethod(value: String): Self = StObject.set(x, "Method", value.asInstanceOf[js.Any])
        
        inline def setState(value: String): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
      }
    }
    
    @js.native
    trait Connection
      extends StObject
         with typings.signalr.SignalR.Connection {
      
      /**
        * Creates a new proxy object for the given hub connection that can be used to invoke
        * methods on server hubs and handle client method invocation requests from the server.
        *
        * @param hubName The name of the hub on the server to create the proxy for.
        */
      def createHubProxy(hubName: String): Proxy = js.native
      
      var proxies: StringDictionary[Any] = js.native
      
      var transport: Name = js.native
    }
    
    type HubCreator = js.Function2[
        /* url */ js.UndefOr[String], 
        /* options */ js.UndefOr[Options], 
        typings.signalr.SignalR.Hub.Connection
      ]
    
    trait IHub extends StObject {
      
      def start(): Unit
    }
    object IHub {
      
      inline def apply(start: () => Unit): IHub = {
        val __obj = js.Dynamic.literal(start = js.Any.fromFunction0(start))
        __obj.asInstanceOf[IHub]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: IHub] (val x: Self) extends AnyVal {
        
        inline def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
      }
    }
    
    trait Options extends StObject {
      
      var logging: js.UndefOr[Boolean] = js.undefined
      
      var qs: js.UndefOr[String] = js.undefined
      
      var useDefaultPath: js.UndefOr[Boolean] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        inline def setLogging(value: Boolean): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
        
        inline def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
        
        inline def setQs(value: String): Self = StObject.set(x, "qs", value.asInstanceOf[js.Any])
        
        inline def setQsUndefined: Self = StObject.set(x, "qs", js.undefined)
        
        inline def setUseDefaultPath(value: Boolean): Self = StObject.set(x, "useDefaultPath", value.asInstanceOf[js.Any])
        
        inline def setUseDefaultPathUndefined: Self = StObject.set(x, "useDefaultPath", js.undefined)
      }
    }
    
    @js.native
    trait Proxy extends StObject {
      
      var connection: typings.signalr.SignalR.Hub.Connection = js.native
      
      def hasSubscriptions(): Boolean = js.native
      
      var hubName: String = js.native
      
      def init(connection: typings.signalr.SignalR.Hub.Connection, hubName: String): Unit = js.native
      
      /**
        * Invokes a server hub method with the given arguments.
        *
        * @param methodName The name of the server hub method.
        */
      def invoke(methodName: String, args: Any*): JQueryPromise[Any] = js.native
      
      /**
        * Removes the callback invocation request from the server hub for the given event name.
        *
        * @param eventName The name of the hub event to unregister the callback for.
        * @param callback [Optional] The callback to unregister. If not provided, all callbacks previously registered under that event name will be unregistered.
        */
      def off(eventName: String): Proxy = js.native
      def off(eventName: String, callback: js.Function1[/* repeated */ Any, Unit]): Proxy = js.native
      
      /**
        * Wires up a callback to be invoked when a invocation request is received from the server hub.
        *
        * @param eventName The name of the hub event to register the callback for.
        * @param callback The callback to be invoked.
        */
      def on(eventName: String, callback: js.Function1[/* repeated */ Any, Unit]): Proxy = js.native
      
      var state: Any = js.native
    }
  }
  
  trait Resources extends StObject {
    
    var errorDuringStartRequest: String
    
    var errorOnNegotiate: String
    
    var errorParsingNegotiateResponse: String
    
    var errorParsingStartResponse: String
    
    var eventSourceError: String
    
    var eventSourceFailedToConnect: String
    
    var invalidStartResponse: String
    
    var longPollFailed: String
    
    var noConnectionTransport: String
    
    var noTransportOnInit: String
    
    var nojQuery: String
    
    var parseFailed: String
    
    var pingServerFailed: String
    
    var pingServerFailedInvalidResponse: String
    
    var pingServerFailedParse: String
    
    var pingServerFailedStatusCode: String
    
    var protocolIncompatible: String
    
    var reconnectTimeout: String
    
    var reconnectWindowTimeout: String
    
    var sendFailed: String
    
    var stoppedDuringStartRequest: String
    
    var stoppedWhileLoading: String
    
    var stoppedWhileNegotiating: String
    
    var webSocketClosed: String
    
    var webSocketsInvalidState: String
  }
  object Resources {
    
    inline def apply(
      errorDuringStartRequest: String,
      errorOnNegotiate: String,
      errorParsingNegotiateResponse: String,
      errorParsingStartResponse: String,
      eventSourceError: String,
      eventSourceFailedToConnect: String,
      invalidStartResponse: String,
      longPollFailed: String,
      noConnectionTransport: String,
      noTransportOnInit: String,
      nojQuery: String,
      parseFailed: String,
      pingServerFailed: String,
      pingServerFailedInvalidResponse: String,
      pingServerFailedParse: String,
      pingServerFailedStatusCode: String,
      protocolIncompatible: String,
      reconnectTimeout: String,
      reconnectWindowTimeout: String,
      sendFailed: String,
      stoppedDuringStartRequest: String,
      stoppedWhileLoading: String,
      stoppedWhileNegotiating: String,
      webSocketClosed: String,
      webSocketsInvalidState: String
    ): Resources = {
      val __obj = js.Dynamic.literal(errorDuringStartRequest = errorDuringStartRequest.asInstanceOf[js.Any], errorOnNegotiate = errorOnNegotiate.asInstanceOf[js.Any], errorParsingNegotiateResponse = errorParsingNegotiateResponse.asInstanceOf[js.Any], errorParsingStartResponse = errorParsingStartResponse.asInstanceOf[js.Any], eventSourceError = eventSourceError.asInstanceOf[js.Any], eventSourceFailedToConnect = eventSourceFailedToConnect.asInstanceOf[js.Any], invalidStartResponse = invalidStartResponse.asInstanceOf[js.Any], longPollFailed = longPollFailed.asInstanceOf[js.Any], noConnectionTransport = noConnectionTransport.asInstanceOf[js.Any], noTransportOnInit = noTransportOnInit.asInstanceOf[js.Any], nojQuery = nojQuery.asInstanceOf[js.Any], parseFailed = parseFailed.asInstanceOf[js.Any], pingServerFailed = pingServerFailed.asInstanceOf[js.Any], pingServerFailedInvalidResponse = pingServerFailedInvalidResponse.asInstanceOf[js.Any], pingServerFailedParse = pingServerFailedParse.asInstanceOf[js.Any], pingServerFailedStatusCode = pingServerFailedStatusCode.asInstanceOf[js.Any], protocolIncompatible = protocolIncompatible.asInstanceOf[js.Any], reconnectTimeout = reconnectTimeout.asInstanceOf[js.Any], reconnectWindowTimeout = reconnectWindowTimeout.asInstanceOf[js.Any], sendFailed = sendFailed.asInstanceOf[js.Any], stoppedDuringStartRequest = stoppedDuringStartRequest.asInstanceOf[js.Any], stoppedWhileLoading = stoppedWhileLoading.asInstanceOf[js.Any], stoppedWhileNegotiating = stoppedWhileNegotiating.asInstanceOf[js.Any], webSocketClosed = webSocketClosed.asInstanceOf[js.Any], webSocketsInvalidState = webSocketsInvalidState.asInstanceOf[js.Any])
      __obj.asInstanceOf[Resources]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Resources] (val x: Self) extends AnyVal {
      
      inline def setErrorDuringStartRequest(value: String): Self = StObject.set(x, "errorDuringStartRequest", value.asInstanceOf[js.Any])
      
      inline def setErrorOnNegotiate(value: String): Self = StObject.set(x, "errorOnNegotiate", value.asInstanceOf[js.Any])
      
      inline def setErrorParsingNegotiateResponse(value: String): Self = StObject.set(x, "errorParsingNegotiateResponse", value.asInstanceOf[js.Any])
      
      inline def setErrorParsingStartResponse(value: String): Self = StObject.set(x, "errorParsingStartResponse", value.asInstanceOf[js.Any])
      
      inline def setEventSourceError(value: String): Self = StObject.set(x, "eventSourceError", value.asInstanceOf[js.Any])
      
      inline def setEventSourceFailedToConnect(value: String): Self = StObject.set(x, "eventSourceFailedToConnect", value.asInstanceOf[js.Any])
      
      inline def setInvalidStartResponse(value: String): Self = StObject.set(x, "invalidStartResponse", value.asInstanceOf[js.Any])
      
      inline def setLongPollFailed(value: String): Self = StObject.set(x, "longPollFailed", value.asInstanceOf[js.Any])
      
      inline def setNoConnectionTransport(value: String): Self = StObject.set(x, "noConnectionTransport", value.asInstanceOf[js.Any])
      
      inline def setNoTransportOnInit(value: String): Self = StObject.set(x, "noTransportOnInit", value.asInstanceOf[js.Any])
      
      inline def setNojQuery(value: String): Self = StObject.set(x, "nojQuery", value.asInstanceOf[js.Any])
      
      inline def setParseFailed(value: String): Self = StObject.set(x, "parseFailed", value.asInstanceOf[js.Any])
      
      inline def setPingServerFailed(value: String): Self = StObject.set(x, "pingServerFailed", value.asInstanceOf[js.Any])
      
      inline def setPingServerFailedInvalidResponse(value: String): Self = StObject.set(x, "pingServerFailedInvalidResponse", value.asInstanceOf[js.Any])
      
      inline def setPingServerFailedParse(value: String): Self = StObject.set(x, "pingServerFailedParse", value.asInstanceOf[js.Any])
      
      inline def setPingServerFailedStatusCode(value: String): Self = StObject.set(x, "pingServerFailedStatusCode", value.asInstanceOf[js.Any])
      
      inline def setProtocolIncompatible(value: String): Self = StObject.set(x, "protocolIncompatible", value.asInstanceOf[js.Any])
      
      inline def setReconnectTimeout(value: String): Self = StObject.set(x, "reconnectTimeout", value.asInstanceOf[js.Any])
      
      inline def setReconnectWindowTimeout(value: String): Self = StObject.set(x, "reconnectWindowTimeout", value.asInstanceOf[js.Any])
      
      inline def setSendFailed(value: String): Self = StObject.set(x, "sendFailed", value.asInstanceOf[js.Any])
      
      inline def setStoppedDuringStartRequest(value: String): Self = StObject.set(x, "stoppedDuringStartRequest", value.asInstanceOf[js.Any])
      
      inline def setStoppedWhileLoading(value: String): Self = StObject.set(x, "stoppedWhileLoading", value.asInstanceOf[js.Any])
      
      inline def setStoppedWhileNegotiating(value: String): Self = StObject.set(x, "stoppedWhileNegotiating", value.asInstanceOf[js.Any])
      
      inline def setWebSocketClosed(value: String): Self = StObject.set(x, "webSocketClosed", value.asInstanceOf[js.Any])
      
      inline def setWebSocketsInvalidState(value: String): Self = StObject.set(x, "webSocketsInvalidState", value.asInstanceOf[js.Any])
    }
  }
  
  trait SimplifyLocation extends StObject {
    
    var host: String
    
    var protocol: String
  }
  object SimplifyLocation {
    
    inline def apply(host: String, protocol: String): SimplifyLocation = {
      val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
      __obj.asInstanceOf[SimplifyLocation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SimplifyLocation] (val x: Self) extends AnyVal {
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
    }
  }
  
  trait StateChanged extends StObject {
    
    var newState: Double
    
    var oldState: Double
  }
  object StateChanged {
    
    inline def apply(newState: Double, oldState: Double): StateChanged = {
      val __obj = js.Dynamic.literal(newState = newState.asInstanceOf[js.Any], oldState = oldState.asInstanceOf[js.Any])
      __obj.asInstanceOf[StateChanged]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StateChanged] (val x: Self) extends AnyVal {
      
      inline def setNewState(value: Double): Self = StObject.set(x, "newState", value.asInstanceOf[js.Any])
      
      inline def setOldState(value: Double): Self = StObject.set(x, "oldState", value.asInstanceOf[js.Any])
    }
  }
  
  trait Transport extends StObject {
    
    def abort(connection: Connection, async: Boolean): Unit
    
    def lostConnection(connection: Connection): Unit
    
    var name: String
    
    def reconnect(connection: Connection): Unit
    
    def send(connection: Connection, data: Any): Unit
    
    def start(
      connection: Connection,
      onSuccess: js.Function0[Unit],
      onFailed: js.Function1[/* error */ js.UndefOr[ConnectionError], Unit]
    ): Unit
    
    def stop(connection: Connection): Unit
    
    def supportsKeepAlive(): Boolean
  }
  object Transport {
    
    inline def apply(
      abort: (Connection, Boolean) => Unit,
      lostConnection: Connection => Unit,
      name: String,
      reconnect: Connection => Unit,
      send: (Connection, Any) => Unit,
      start: (Connection, js.Function0[Unit], js.Function1[/* error */ js.UndefOr[ConnectionError], Unit]) => Unit,
      stop: Connection => Unit,
      supportsKeepAlive: () => Boolean
    ): Transport = {
      val __obj = js.Dynamic.literal(abort = js.Any.fromFunction2(abort), lostConnection = js.Any.fromFunction1(lostConnection), name = name.asInstanceOf[js.Any], reconnect = js.Any.fromFunction1(reconnect), send = js.Any.fromFunction2(send), start = js.Any.fromFunction3(start), stop = js.Any.fromFunction1(stop), supportsKeepAlive = js.Any.fromFunction0(supportsKeepAlive))
      __obj.asInstanceOf[Transport]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Transport] (val x: Self) extends AnyVal {
      
      inline def setAbort(value: (Connection, Boolean) => Unit): Self = StObject.set(x, "abort", js.Any.fromFunction2(value))
      
      inline def setLostConnection(value: Connection => Unit): Self = StObject.set(x, "lostConnection", js.Any.fromFunction1(value))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setReconnect(value: Connection => Unit): Self = StObject.set(x, "reconnect", js.Any.fromFunction1(value))
      
      inline def setSend(value: (Connection, Any) => Unit): Self = StObject.set(x, "send", js.Any.fromFunction2(value))
      
      inline def setStart(
        value: (Connection, js.Function0[Unit], js.Function1[/* error */ js.UndefOr[ConnectionError], Unit]) => Unit
      ): Self = StObject.set(x, "start", js.Any.fromFunction3(value))
      
      inline def setStop(value: Connection => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction1(value))
      
      inline def setSupportsKeepAlive(value: () => Boolean): Self = StObject.set(x, "supportsKeepAlive", js.Any.fromFunction0(value))
    }
  }
  
  trait Transports extends StObject {
    
    var foreverFrame: Transport
    
    var longPolling: Transport
    
    var serverSentEvents: Transport
    
    var webSockets: Transport
  }
  object Transports {
    
    inline def apply(
      foreverFrame: Transport,
      longPolling: Transport,
      serverSentEvents: Transport,
      webSockets: Transport
    ): Transports = {
      val __obj = js.Dynamic.literal(foreverFrame = foreverFrame.asInstanceOf[js.Any], longPolling = longPolling.asInstanceOf[js.Any], serverSentEvents = serverSentEvents.asInstanceOf[js.Any], webSockets = webSockets.asInstanceOf[js.Any])
      __obj.asInstanceOf[Transports]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Transports] (val x: Self) extends AnyVal {
      
      inline def setForeverFrame(value: Transport): Self = StObject.set(x, "foreverFrame", value.asInstanceOf[js.Any])
      
      inline def setLongPolling(value: Transport): Self = StObject.set(x, "longPolling", value.asInstanceOf[js.Any])
      
      inline def setServerSentEvents(value: Transport): Self = StObject.set(x, "serverSentEvents", value.asInstanceOf[js.Any])
      
      inline def setWebSockets(value: Transport): Self = StObject.set(x, "webSockets", value.asInstanceOf[js.Any])
    }
  }
}
