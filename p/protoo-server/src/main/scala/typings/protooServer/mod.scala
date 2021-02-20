package typings.protooServer

import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.Server
import typings.node.netMod.Socket
import typings.protooServer.protooServerBooleans.`true`
import typings.protooServer.protooServerStrings.close
import typings.protooServer.protooServerStrings.connectionrequest
import typings.protooServer.protooServerStrings.notification
import typings.protooServer.protooServerStrings.request
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("protoo-server", "Room")
  @js.native
  class Room () extends StObject {
    
    def close(): Unit = js.native
    
    var closed: Boolean = js.native
    
    def createPeer(peerId: String, transport: WebSocketTransport): js.Promise[Peer] = js.native
    
    def getPeer(peerId: String): Peer = js.native
    
    def hasPeer(peerId: String): Boolean = js.native
    
    @JSName("on")
    def on_close(eventType: close, callback: EmptyCb): Unit = js.native
    
    var peers: js.Array[Peer] = js.native
  }
  
  @JSImport("protoo-server", "WebSocketServer")
  @js.native
  class WebSocketServer protected () extends StObject {
    def this(server: Server) = this()
    def this(server: typings.node.httpsMod.Server) = this()
    def this(server: Server, options: WebSocketServerOptions) = this()
    def this(server: typings.node.httpsMod.Server, options: WebSocketServerOptions) = this()
    
    @JSName("on")
    def on_connectionrequest(eventType: connectionrequest, callback: ConnectionRequestCb): Unit = js.native
    
    def stop(): Unit = js.native
  }
  
  @JSImport("protoo-server", "version")
  @js.native
  val version: String = js.native
  
  type AcceptFn = js.Function1[/* data */ js.Any, Unit]
  
  type ConnectionRequestAcceptFn = js.Function0[WebSocketTransport]
  
  type ConnectionRequestCb = js.Function3[
    /* info */ ConnectionRequestInfo, 
    /* accept */ ConnectionRequestAcceptFn, 
    /* reject */ ConnectionRequestRejectFn, 
    Unit
  ]
  
  @js.native
  trait ConnectionRequestInfo extends StObject {
    
    var origin: String = js.native
    
    var request: IncomingMessage = js.native
    
    var socket: Socket = js.native
  }
  object ConnectionRequestInfo {
    
    @scala.inline
    def apply(origin: String, request: IncomingMessage, socket: Socket): ConnectionRequestInfo = {
      val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionRequestInfo]
    }
    
    @scala.inline
    implicit class ConnectionRequestInfoMutableBuilder[Self <: ConnectionRequestInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest(value: IncomingMessage): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSocket(value: Socket): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
    }
  }
  
  type ConnectionRequestRejectFn = (js.Function2[/* code */ Double, /* reason */ String, Unit]) with (js.Function1[/* error */ Error, Unit])
  
  type EmptyCb = js.Function0[Unit]
  
  type NotificationCb = js.Function1[/* notification */ ProtooNotification, Unit]
  
  @js.native
  trait Peer extends StObject {
    
    def close(): Unit = js.native
    
    var closed: Boolean = js.native
    
    var data: js.Any = js.native
    
    val id: String = js.native
    
    def notify(method: String): js.Promise[Unit] = js.native
    def notify(method: String, data: js.Any): js.Promise[Unit] = js.native
    
    @JSName("on")
    def on_close(eventType: close, callback: EmptyCb): Unit = js.native
    @JSName("on")
    def on_notification(eventType: notification, callback: NotificationCb): Unit = js.native
    @JSName("on")
    def on_request(eventType: request, callback: RequestCb): Unit = js.native
    
    def request(method: String): js.Promise[ProotooResponse] = js.native
    def request(method: String, data: js.Any): js.Promise[ProotooResponse] = js.native
  }
  
  @js.native
  trait ProotooResponse extends StObject {
    
    var data: js.UndefOr[js.Any] = js.native
    
    var errorCode: js.UndefOr[Double] = js.native
    
    var errorReason: js.UndefOr[String] = js.native
    
    var id: Double = js.native
    
    var ok: Boolean = js.native
    
    var response: `true` = js.native
  }
  object ProotooResponse {
    
    @scala.inline
    def apply(id: Double, ok: Boolean, response: `true`): ProotooResponse = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], response = response.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProotooResponse]
    }
    
    @scala.inline
    implicit class ProotooResponseMutableBuilder[Self <: ProotooResponse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
      
      @scala.inline
      def setErrorReason(value: String): Self = StObject.set(x, "errorReason", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorReasonUndefined: Self = StObject.set(x, "errorReason", js.undefined)
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOk(value: Boolean): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse(value: `true`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ProtooNotification extends StObject {
    
    var data: js.Any = js.native
    
    var method: String = js.native
    
    var notification: `true` = js.native
  }
  object ProtooNotification {
    
    @scala.inline
    def apply(data: js.Any, method: String, notification: `true`): ProtooNotification = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], notification = notification.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProtooNotification]
    }
    
    @scala.inline
    implicit class ProtooNotificationMutableBuilder[Self <: ProtooNotification] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotification(value: `true`): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ProtooRequest extends StObject {
    
    var data: js.Any = js.native
    
    var id: Double = js.native
    
    var method: String = js.native
    
    var request: `true` = js.native
  }
  object ProtooRequest {
    
    @scala.inline
    def apply(data: js.Any, id: Double, method: String, request: `true`): ProtooRequest = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProtooRequest]
    }
    
    @scala.inline
    implicit class ProtooRequestMutableBuilder[Self <: ProtooRequest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequest(value: `true`): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
  
  type RejectFn = (js.Function1[/* errorCode */ js.UndefOr[Error], Unit]) with (js.Function2[/* errorCode */ Double, /* errorReason */ Error | String, Unit])
  
  type RequestCb = js.Function3[/* request */ ProtooRequest, /* accept */ AcceptFn, /* reject */ RejectFn, Unit]
  
  /* Inlined std.Pick<websocket.websocket.IServerConfig, std.Exclude<keyof websocket.websocket.IServerConfig, 'httpServer'>> */
  @js.native
  trait WebSocketServerOptions extends StObject {
    
    var assembleFragments: js.UndefOr[Boolean] = js.native
    
    var autoAcceptConnections: js.UndefOr[Boolean] = js.native
    
    var closeTimeout: js.UndefOr[Double] = js.native
    
    var disableNagleAlgorithm: js.UndefOr[Boolean] = js.native
    
    var dropConnectionOnKeepaliveTimeout: js.UndefOr[Boolean] = js.native
    
    var fragmentOutgoingMessages: js.UndefOr[Boolean] = js.native
    
    var fragmentationThreshold: js.UndefOr[Double] = js.native
    
    var ignoreXForwardedFor: js.UndefOr[Boolean] = js.native
    
    var keepalive: js.UndefOr[Boolean] = js.native
    
    var keepaliveGracePeriod: js.UndefOr[Double] = js.native
    
    var keepaliveInterval: js.UndefOr[Double] = js.native
    
    var maxReceivedFrameSize: js.UndefOr[Double] = js.native
    
    var maxReceivedMessageSize: js.UndefOr[Double] = js.native
    
    var useNativeKeepalive: js.UndefOr[Boolean] = js.native
  }
  object WebSocketServerOptions {
    
    @scala.inline
    def apply(): WebSocketServerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebSocketServerOptions]
    }
    
    @scala.inline
    implicit class WebSocketServerOptionsMutableBuilder[Self <: WebSocketServerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAssembleFragments(value: Boolean): Self = StObject.set(x, "assembleFragments", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAssembleFragmentsUndefined: Self = StObject.set(x, "assembleFragments", js.undefined)
      
      @scala.inline
      def setAutoAcceptConnections(value: Boolean): Self = StObject.set(x, "autoAcceptConnections", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoAcceptConnectionsUndefined: Self = StObject.set(x, "autoAcceptConnections", js.undefined)
      
      @scala.inline
      def setCloseTimeout(value: Double): Self = StObject.set(x, "closeTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCloseTimeoutUndefined: Self = StObject.set(x, "closeTimeout", js.undefined)
      
      @scala.inline
      def setDisableNagleAlgorithm(value: Boolean): Self = StObject.set(x, "disableNagleAlgorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableNagleAlgorithmUndefined: Self = StObject.set(x, "disableNagleAlgorithm", js.undefined)
      
      @scala.inline
      def setDropConnectionOnKeepaliveTimeout(value: Boolean): Self = StObject.set(x, "dropConnectionOnKeepaliveTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDropConnectionOnKeepaliveTimeoutUndefined: Self = StObject.set(x, "dropConnectionOnKeepaliveTimeout", js.undefined)
      
      @scala.inline
      def setFragmentOutgoingMessages(value: Boolean): Self = StObject.set(x, "fragmentOutgoingMessages", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFragmentOutgoingMessagesUndefined: Self = StObject.set(x, "fragmentOutgoingMessages", js.undefined)
      
      @scala.inline
      def setFragmentationThreshold(value: Double): Self = StObject.set(x, "fragmentationThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFragmentationThresholdUndefined: Self = StObject.set(x, "fragmentationThreshold", js.undefined)
      
      @scala.inline
      def setIgnoreXForwardedFor(value: Boolean): Self = StObject.set(x, "ignoreXForwardedFor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreXForwardedForUndefined: Self = StObject.set(x, "ignoreXForwardedFor", js.undefined)
      
      @scala.inline
      def setKeepalive(value: Boolean): Self = StObject.set(x, "keepalive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepaliveGracePeriod(value: Double): Self = StObject.set(x, "keepaliveGracePeriod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepaliveGracePeriodUndefined: Self = StObject.set(x, "keepaliveGracePeriod", js.undefined)
      
      @scala.inline
      def setKeepaliveInterval(value: Double): Self = StObject.set(x, "keepaliveInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeepaliveIntervalUndefined: Self = StObject.set(x, "keepaliveInterval", js.undefined)
      
      @scala.inline
      def setKeepaliveUndefined: Self = StObject.set(x, "keepalive", js.undefined)
      
      @scala.inline
      def setMaxReceivedFrameSize(value: Double): Self = StObject.set(x, "maxReceivedFrameSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxReceivedFrameSizeUndefined: Self = StObject.set(x, "maxReceivedFrameSize", js.undefined)
      
      @scala.inline
      def setMaxReceivedMessageSize(value: Double): Self = StObject.set(x, "maxReceivedMessageSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxReceivedMessageSizeUndefined: Self = StObject.set(x, "maxReceivedMessageSize", js.undefined)
      
      @scala.inline
      def setUseNativeKeepalive(value: Boolean): Self = StObject.set(x, "useNativeKeepalive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseNativeKeepaliveUndefined: Self = StObject.set(x, "useNativeKeepalive", js.undefined)
    }
  }
  
  @js.native
  trait WebSocketTransport extends StObject {
    
    def close(): Unit = js.native
    
    var closed: Boolean = js.native
    
    def send(message: js.Any): js.Promise[Unit] = js.native
  }
  object WebSocketTransport {
    
    @scala.inline
    def apply(close: () => Unit, closed: Boolean, send: js.Any => js.Promise[Unit]): WebSocketTransport = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), closed = closed.asInstanceOf[js.Any], send = js.Any.fromFunction1(send))
      __obj.asInstanceOf[WebSocketTransport]
    }
    
    @scala.inline
    implicit class WebSocketTransportMutableBuilder[Self <: WebSocketTransport] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      @scala.inline
      def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSend(value: js.Any => js.Promise[Unit]): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
    }
  }
}
