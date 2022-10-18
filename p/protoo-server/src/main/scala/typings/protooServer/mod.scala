package typings.protooServer

import org.scalablytyped.runtime.Instantiable1
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.Server
import typings.node.httpMod.ServerResponse
import typings.node.nodeColonnetMod.Socket
import typings.protooServer.protooServerBooleans.`true`
import typings.protooServer.protooServerStrings.close
import typings.protooServer.protooServerStrings.connectionrequest
import typings.protooServer.protooServerStrings.notification
import typings.protooServer.protooServerStrings.request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("protoo-server", "Room")
  @js.native
  open class Room () extends StObject {
    
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
  open class WebSocketServer protected () extends StObject {
    def this(server: Server[
            Instantiable1[/* socket */ Socket, IncomingMessage], 
            Instantiable1[
              /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
              ServerResponse[IncomingMessage]
            ]
          ]) = this()
    def this(server: typings.node.httpsMod.Server[
            Instantiable1[/* socket */ Socket, typings.node.nodeColonhttpMod.IncomingMessage], 
            Instantiable1[
              /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
              typings.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
            ]
          ]) = this()
    def this(
      server: Server[
            Instantiable1[/* socket */ Socket, IncomingMessage], 
            Instantiable1[
              /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
              ServerResponse[IncomingMessage]
            ]
          ],
      options: WebSocketServerOptions
    ) = this()
    def this(
      server: typings.node.httpsMod.Server[
            Instantiable1[/* socket */ Socket, typings.node.nodeColonhttpMod.IncomingMessage], 
            Instantiable1[
              /* import warning: RewrittenClass.unapply cls was tparam Request */ /* req */ Any, 
              typings.node.nodeColonhttpMod.ServerResponse[IncomingMessage]
            ]
          ],
      options: WebSocketServerOptions
    ) = this()
    
    @JSName("on")
    def on_connectionrequest(eventType: connectionrequest, callback: ConnectionRequestCb): Unit = js.native
    
    def stop(): Unit = js.native
  }
  
  @JSImport("protoo-server", "version")
  @js.native
  val version: String = js.native
  
  type AcceptFn = js.Function1[/* data */ Any, Unit]
  
  type ConnectionRequestAcceptFn = js.Function0[WebSocketTransport]
  
  type ConnectionRequestCb = js.Function3[
    /* info */ ConnectionRequestInfo, 
    /* accept */ ConnectionRequestAcceptFn, 
    /* reject */ ConnectionRequestRejectFn, 
    Unit
  ]
  
  trait ConnectionRequestInfo extends StObject {
    
    var origin: String
    
    var request: IncomingMessage
    
    var socket: typings.node.netMod.Socket
  }
  object ConnectionRequestInfo {
    
    inline def apply(origin: String, request: IncomingMessage, socket: typings.node.netMod.Socket): ConnectionRequestInfo = {
      val __obj = js.Dynamic.literal(origin = origin.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], socket = socket.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectionRequestInfo]
    }
    
    extension [Self <: ConnectionRequestInfo](x: Self) {
      
      inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: IncomingMessage): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
      
      inline def setSocket(value: typings.node.netMod.Socket): Self = StObject.set(x, "socket", value.asInstanceOf[js.Any])
    }
  }
  
  type ConnectionRequestRejectFn = (js.Function2[/* code */ Double, /* reason */ String, Unit]) & (js.Function1[/* error */ js.Error, Unit])
  
  type EmptyCb = js.Function0[Unit]
  
  type NotificationCb = js.Function1[/* notification */ ProtooNotification, Unit]
  
  @js.native
  trait Peer extends StObject {
    
    def close(): Unit = js.native
    
    var closed: Boolean = js.native
    
    var data: Any = js.native
    
    val id: String = js.native
    
    def notify(method: String): js.Promise[Unit] = js.native
    def notify(method: String, data: Any): js.Promise[Unit] = js.native
    
    @JSName("on")
    def on_close(eventType: close, callback: EmptyCb): Unit = js.native
    @JSName("on")
    def on_notification(eventType: notification, callback: NotificationCb): Unit = js.native
    @JSName("on")
    def on_request(eventType: request, callback: RequestCb): Unit = js.native
    
    def request(method: String): js.Promise[ProotooResponse] = js.native
    def request(method: String, data: Any): js.Promise[ProotooResponse] = js.native
  }
  
  trait ProotooResponse extends StObject {
    
    var data: js.UndefOr[Any] = js.undefined
    
    var errorCode: js.UndefOr[Double] = js.undefined
    
    var errorReason: js.UndefOr[String] = js.undefined
    
    var id: Double
    
    var ok: Boolean
    
    var response: `true`
  }
  object ProotooResponse {
    
    inline def apply(id: Double, ok: Boolean): ProotooResponse = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], ok = ok.asInstanceOf[js.Any], response = true)
      __obj.asInstanceOf[ProotooResponse]
    }
    
    extension [Self <: ProotooResponse](x: Self) {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setErrorCode(value: Double): Self = StObject.set(x, "errorCode", value.asInstanceOf[js.Any])
      
      inline def setErrorCodeUndefined: Self = StObject.set(x, "errorCode", js.undefined)
      
      inline def setErrorReason(value: String): Self = StObject.set(x, "errorReason", value.asInstanceOf[js.Any])
      
      inline def setErrorReasonUndefined: Self = StObject.set(x, "errorReason", js.undefined)
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setOk(value: Boolean): Self = StObject.set(x, "ok", value.asInstanceOf[js.Any])
      
      inline def setResponse(value: `true`): Self = StObject.set(x, "response", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProtooNotification extends StObject {
    
    var data: Any
    
    var method: String
    
    var notification: `true`
  }
  object ProtooNotification {
    
    inline def apply(data: Any, method: String): ProtooNotification = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], notification = true)
      __obj.asInstanceOf[ProtooNotification]
    }
    
    extension [Self <: ProtooNotification](x: Self) {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setNotification(value: `true`): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProtooRequest extends StObject {
    
    var data: Any
    
    var id: Double
    
    var method: String
    
    var request: `true`
  }
  object ProtooRequest {
    
    inline def apply(data: Any, id: Double, method: String): ProtooRequest = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], request = true)
      __obj.asInstanceOf[ProtooRequest]
    }
    
    extension [Self <: ProtooRequest](x: Self) {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: `true`): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
  
  type RejectFn = (js.Function1[/* errorCode */ js.UndefOr[js.Error], Unit]) & (js.Function2[/* errorCode */ Double, /* errorReason */ js.Error | String, Unit])
  
  type RequestCb = js.Function3[/* request */ ProtooRequest, /* accept */ AcceptFn, /* reject */ RejectFn, Unit]
  
  /* Inlined std.Pick<websocket.websocket.IServerConfig, std.Exclude<keyof websocket.websocket.IServerConfig, 'httpServer'>> */
  trait WebSocketServerOptions extends StObject {
    
    var assembleFragments: js.UndefOr[Boolean] = js.undefined
    
    var autoAcceptConnections: js.UndefOr[Boolean] = js.undefined
    
    var closeTimeout: js.UndefOr[Double] = js.undefined
    
    var disableNagleAlgorithm: js.UndefOr[Boolean] = js.undefined
    
    var dropConnectionOnKeepaliveTimeout: js.UndefOr[Boolean] = js.undefined
    
    var fragmentOutgoingMessages: js.UndefOr[Boolean] = js.undefined
    
    var fragmentationThreshold: js.UndefOr[Double] = js.undefined
    
    var ignoreXForwardedFor: js.UndefOr[Boolean] = js.undefined
    
    var keepalive: js.UndefOr[Boolean] = js.undefined
    
    var keepaliveGracePeriod: js.UndefOr[Double] = js.undefined
    
    var keepaliveInterval: js.UndefOr[Double] = js.undefined
    
    var maxReceivedFrameSize: js.UndefOr[Double] = js.undefined
    
    var maxReceivedMessageSize: js.UndefOr[Double] = js.undefined
    
    var useNativeKeepalive: js.UndefOr[Boolean] = js.undefined
  }
  object WebSocketServerOptions {
    
    inline def apply(): WebSocketServerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WebSocketServerOptions]
    }
    
    extension [Self <: WebSocketServerOptions](x: Self) {
      
      inline def setAssembleFragments(value: Boolean): Self = StObject.set(x, "assembleFragments", value.asInstanceOf[js.Any])
      
      inline def setAssembleFragmentsUndefined: Self = StObject.set(x, "assembleFragments", js.undefined)
      
      inline def setAutoAcceptConnections(value: Boolean): Self = StObject.set(x, "autoAcceptConnections", value.asInstanceOf[js.Any])
      
      inline def setAutoAcceptConnectionsUndefined: Self = StObject.set(x, "autoAcceptConnections", js.undefined)
      
      inline def setCloseTimeout(value: Double): Self = StObject.set(x, "closeTimeout", value.asInstanceOf[js.Any])
      
      inline def setCloseTimeoutUndefined: Self = StObject.set(x, "closeTimeout", js.undefined)
      
      inline def setDisableNagleAlgorithm(value: Boolean): Self = StObject.set(x, "disableNagleAlgorithm", value.asInstanceOf[js.Any])
      
      inline def setDisableNagleAlgorithmUndefined: Self = StObject.set(x, "disableNagleAlgorithm", js.undefined)
      
      inline def setDropConnectionOnKeepaliveTimeout(value: Boolean): Self = StObject.set(x, "dropConnectionOnKeepaliveTimeout", value.asInstanceOf[js.Any])
      
      inline def setDropConnectionOnKeepaliveTimeoutUndefined: Self = StObject.set(x, "dropConnectionOnKeepaliveTimeout", js.undefined)
      
      inline def setFragmentOutgoingMessages(value: Boolean): Self = StObject.set(x, "fragmentOutgoingMessages", value.asInstanceOf[js.Any])
      
      inline def setFragmentOutgoingMessagesUndefined: Self = StObject.set(x, "fragmentOutgoingMessages", js.undefined)
      
      inline def setFragmentationThreshold(value: Double): Self = StObject.set(x, "fragmentationThreshold", value.asInstanceOf[js.Any])
      
      inline def setFragmentationThresholdUndefined: Self = StObject.set(x, "fragmentationThreshold", js.undefined)
      
      inline def setIgnoreXForwardedFor(value: Boolean): Self = StObject.set(x, "ignoreXForwardedFor", value.asInstanceOf[js.Any])
      
      inline def setIgnoreXForwardedForUndefined: Self = StObject.set(x, "ignoreXForwardedFor", js.undefined)
      
      inline def setKeepalive(value: Boolean): Self = StObject.set(x, "keepalive", value.asInstanceOf[js.Any])
      
      inline def setKeepaliveGracePeriod(value: Double): Self = StObject.set(x, "keepaliveGracePeriod", value.asInstanceOf[js.Any])
      
      inline def setKeepaliveGracePeriodUndefined: Self = StObject.set(x, "keepaliveGracePeriod", js.undefined)
      
      inline def setKeepaliveInterval(value: Double): Self = StObject.set(x, "keepaliveInterval", value.asInstanceOf[js.Any])
      
      inline def setKeepaliveIntervalUndefined: Self = StObject.set(x, "keepaliveInterval", js.undefined)
      
      inline def setKeepaliveUndefined: Self = StObject.set(x, "keepalive", js.undefined)
      
      inline def setMaxReceivedFrameSize(value: Double): Self = StObject.set(x, "maxReceivedFrameSize", value.asInstanceOf[js.Any])
      
      inline def setMaxReceivedFrameSizeUndefined: Self = StObject.set(x, "maxReceivedFrameSize", js.undefined)
      
      inline def setMaxReceivedMessageSize(value: Double): Self = StObject.set(x, "maxReceivedMessageSize", value.asInstanceOf[js.Any])
      
      inline def setMaxReceivedMessageSizeUndefined: Self = StObject.set(x, "maxReceivedMessageSize", js.undefined)
      
      inline def setUseNativeKeepalive(value: Boolean): Self = StObject.set(x, "useNativeKeepalive", value.asInstanceOf[js.Any])
      
      inline def setUseNativeKeepaliveUndefined: Self = StObject.set(x, "useNativeKeepalive", js.undefined)
    }
  }
  
  trait WebSocketTransport extends StObject {
    
    def close(): Unit
    
    var closed: Boolean
    
    def send(message: Any): js.Promise[Unit]
  }
  object WebSocketTransport {
    
    inline def apply(close: () => Unit, closed: Boolean, send: Any => js.Promise[Unit]): WebSocketTransport = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), closed = closed.asInstanceOf[js.Any], send = js.Any.fromFunction1(send))
      __obj.asInstanceOf[WebSocketTransport]
    }
    
    extension [Self <: WebSocketTransport](x: Self) {
      
      inline def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      inline def setClosed(value: Boolean): Self = StObject.set(x, "closed", value.asInstanceOf[js.Any])
      
      inline def setSend(value: Any => js.Promise[Unit]): Self = StObject.set(x, "send", js.Any.fromFunction1(value))
    }
  }
}
