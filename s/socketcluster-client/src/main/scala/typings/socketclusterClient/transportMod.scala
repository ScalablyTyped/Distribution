package typings.socketclusterClient

import typings.node.timersMod.global.NodeJS.Timer
import typings.socketclusterClient.authMod.AGAuthEngine
import typings.socketclusterClient.authMod.AuthToken
import typings.socketclusterClient.clientsocketMod.CallIdGenerator
import typings.socketclusterClient.clientsocketMod.ClientOptions
import typings.socketclusterClient.clientsocketMod.ProtocolVersions
import typings.socketclusterClient.clientsocketMod.States
import typings.socketclusterClient.socketclusterClientStrings.closed
import typings.socketclusterClient.socketclusterClientStrings.connecting
import typings.socketclusterClient.socketclusterClientStrings.open
import typings.socketclusterServer.serverMod.CodecEngine
import typings.ws.mod.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transportMod {
  
  @JSImport("socketcluster-client/lib/transport", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with AGTransport {
    def this(authEngine: AGAuthEngine, codecEngine: CodecEngine, options: ClientOptions) = this()
    def this(
      authEngine: AGAuthEngine,
      codecEngine: CodecEngine,
      options: ClientOptions,
      wsOptions: typings.ws.mod.ClientOptions
    ) = this()
    def this(
      authEngine: AGAuthEngine,
      codecEngine: CodecEngine,
      options: ClientOptions,
      wsOptions: Unit,
      handlers: TransportHandlers
    ) = this()
    def this(
      authEngine: AGAuthEngine,
      codecEngine: CodecEngine,
      options: ClientOptions,
      wsOptions: typings.ws.mod.ClientOptions,
      handlers: TransportHandlers
    ) = this()
  }
  
  @js.native
  trait AGTransport extends StObject {
    
    val CLOSED: closed = js.native
    
    val CONNECTING: connecting = js.native
    
    val OPEN: open = js.native
    
    var auth: AGAuthEngine = js.native
    
    var authTokenName: String = js.native
    
    def callIdGenerator(): Double = js.native
    @JSName("callIdGenerator")
    var callIdGenerator_Original: CallIdGenerator = js.native
    
    def cancelBatch(): Unit = js.native
    
    def cancelPendingResponse(cid: Double): Unit = js.native
    
    def clearAllListeners(): Unit = js.native
    
    def close(): Unit = js.native
    def close(code: Double): Unit = js.native
    def close(code: Double, reason: String): Unit = js.native
    def close(code: Unit, reason: String): Unit = js.native
    
    var codec: CodecEngine = js.native
    
    var connectTimeout: Double = js.native
    
    def decode(message: Any): Any = js.native
    
    def encode(`object`: Any): Any = js.native
    
    def flushBatch(): Unit = js.native
    
    def invoke[T](event: String, data: T, options: InvokeOptions): js.Promise[T] = js.native
    
    def invokeRaw(event: String, data: Any, options: InvokeOptions): Double | Null = js.native
    def invokeRaw(event: String, data: Any, options: InvokeOptions, callback: EventObjectCallback): Double | Null = js.native
    
    var isBufferingBatch: Boolean = js.native
    
    var options: ClientOptions = js.native
    
    var pingTimeout: Double = js.native
    
    var pingTimeoutDisabled: Boolean = js.native
    
    var protocolVersion: ProtocolVersions = js.native
    
    def send(data: Any): Unit = js.native
    
    def sendObject(`object`: Any): Unit = js.native
    
    def serializeObject(`object`: Any): Any = js.native
    
    var socket: WebSocket = js.native
    
    def startBatch(): Unit = js.native
    
    var state: States = js.native
    
    def transmit(event: String, data: Any, options: TransmitOptions): js.Promise[Unit] = js.native
    
    def transmitObject(eventObject: EventObject): Double | Null = js.native
    
    def uri(): String = js.native
    
    var wsOptions: js.UndefOr[typings.ws.mod.ClientOptions] = js.native
  }
  
  trait EventObject extends StObject {
    
    var callback: js.UndefOr[EventObjectCallback] = js.undefined
    
    var cid: js.UndefOr[Double] = js.undefined
    
    var data: Any
    
    var event: String
    
    var timeout: js.UndefOr[Timer] = js.undefined
  }
  object EventObject {
    
    inline def apply(data: Any, event: String): EventObject = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventObject]
    }
    
    extension [Self <: EventObject](x: Self) {
      
      inline def setCallback(value: (/* error */ js.Error, /* eventObject */ EventObject) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setCid(value: Double): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
      
      inline def setCidUndefined: Self = StObject.set(x, "cid", js.undefined)
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      inline def setTimeout(value: Timer): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  type EventObjectCallback = js.Function2[/* error */ js.Error, /* eventObject */ EventObject, Unit]
  
  trait InvokeOptions extends StObject {
    
    var ackTimeout: js.UndefOr[Double] = js.undefined
    
    var force: js.UndefOr[Boolean] = js.undefined
    
    var noTimeout: js.UndefOr[Boolean] = js.undefined
  }
  object InvokeOptions {
    
    inline def apply(): InvokeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InvokeOptions]
    }
    
    extension [Self <: InvokeOptions](x: Self) {
      
      inline def setAckTimeout(value: Double): Self = StObject.set(x, "ackTimeout", value.asInstanceOf[js.Any])
      
      inline def setAckTimeoutUndefined: Self = StObject.set(x, "ackTimeout", js.undefined)
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      inline def setNoTimeout(value: Boolean): Self = StObject.set(x, "noTimeout", value.asInstanceOf[js.Any])
      
      inline def setNoTimeoutUndefined: Self = StObject.set(x, "noTimeout", js.undefined)
    }
  }
  
  trait OnCloseValue extends StObject {
    
    var code: Double
    
    var reason: String
  }
  object OnCloseValue {
    
    inline def apply(code: Double, reason: String): OnCloseValue = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnCloseValue]
    }
    
    extension [Self <: OnCloseValue](x: Self) {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    }
  }
  
  trait OnErrorValue extends StObject {
    
    var error: js.Error
  }
  object OnErrorValue {
    
    inline def apply(error: js.Error): OnErrorValue = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnErrorValue]
    }
    
    extension [Self <: OnErrorValue](x: Self) {
      
      inline def setError(value: js.Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  trait OnEventValue extends StObject {
    
    var data: Any
    
    var event: String
  }
  object OnEventValue {
    
    inline def apply(data: Any, event: String): OnEventValue = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnEventValue]
    }
    
    extension [Self <: OnEventValue](x: Self) {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    }
  }
  
  trait OnInboundInvokeValue extends StObject {
    
    var data: Any
    
    var procedure: String
  }
  object OnInboundInvokeValue {
    
    inline def apply(data: Any, procedure: String): OnInboundInvokeValue = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], procedure = procedure.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnInboundInvokeValue]
    }
    
    extension [Self <: OnInboundInvokeValue](x: Self) {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setProcedure(value: String): Self = StObject.set(x, "procedure", value.asInstanceOf[js.Any])
    }
  }
  
  trait OnInboundTransmitValue extends StObject {
    
    var data: Any
    
    var event: String
  }
  object OnInboundTransmitValue {
    
    inline def apply(data: Any, event: String): OnInboundTransmitValue = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnInboundTransmitValue]
    }
    
    extension [Self <: OnInboundTransmitValue](x: Self) {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    }
  }
  
  trait OnOpenAbortValue extends StObject {
    
    var code: Double
    
    var reason: String
  }
  object OnOpenAbortValue {
    
    inline def apply(code: Double, reason: String): OnOpenAbortValue = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnOpenAbortValue]
    }
    
    extension [Self <: OnOpenAbortValue](x: Self) {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    }
  }
  
  trait OnOpenValue extends StObject {
    
    var authToken: AuthToken | Null
    
    var id: String
    
    var isAuthenticated: Boolean
    
    var pingTimeout: Double
  }
  object OnOpenValue {
    
    inline def apply(id: String, isAuthenticated: Boolean, pingTimeout: Double): OnOpenValue = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isAuthenticated = isAuthenticated.asInstanceOf[js.Any], pingTimeout = pingTimeout.asInstanceOf[js.Any], authToken = null)
      __obj.asInstanceOf[OnOpenValue]
    }
    
    extension [Self <: OnOpenValue](x: Self) {
      
      inline def setAuthToken(value: AuthToken): Self = StObject.set(x, "authToken", value.asInstanceOf[js.Any])
      
      inline def setAuthTokenNull: Self = StObject.set(x, "authToken", null)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIsAuthenticated(value: Boolean): Self = StObject.set(x, "isAuthenticated", value.asInstanceOf[js.Any])
      
      inline def setPingTimeout(value: Double): Self = StObject.set(x, "pingTimeout", value.asInstanceOf[js.Any])
    }
  }
  
  trait TransmitOptions extends StObject {
    
    var force: js.UndefOr[Boolean] = js.undefined
  }
  object TransmitOptions {
    
    inline def apply(): TransmitOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransmitOptions]
    }
    
    extension [Self <: TransmitOptions](x: Self) {
      
      inline def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      inline def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
    }
  }
  
  @js.native
  trait TransportHandlers extends StObject {
    
    def onClose(value: OnCloseValue): Unit = js.native
    
    def onError(value: OnErrorValue): Unit = js.native
    
    def onEvent(value: OnEventValue): Unit = js.native
    
    def onInboundInvoke(value: OnInboundInvokeValue): Unit = js.native
    
    def onInboundTransmit(value: OnInboundTransmitValue): Unit = js.native
    
    def onOpen(): Unit = js.native
    def onOpen(value: OnOpenValue): Unit = js.native
    
    def onOpenAbort(value: OnOpenAbortValue): Unit = js.native
  }
}
