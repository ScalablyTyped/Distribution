package typings.socketclusterClient

import typings.node.NodeJS.Timer
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
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transportMod {
  
  @JSImport("socketcluster-client/lib/transport", JSImport.Namespace)
  @js.native
  class ^ protected () extends AGTransport {
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
      wsOptions: js.UndefOr[scala.Nothing],
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
    def close(code: js.UndefOr[scala.Nothing], reason: String): Unit = js.native
    def close(code: Double): Unit = js.native
    def close(code: Double, reason: String): Unit = js.native
    
    var codec: CodecEngine = js.native
    
    var connectTimeout: Double = js.native
    
    def decode(message: js.Any): js.Any = js.native
    
    def encode(`object`: js.Any): js.Any = js.native
    
    def flushBatch(): Unit = js.native
    
    def invoke[T](event: String, data: T, options: InvokeOptions): js.Promise[T] = js.native
    
    def invokeRaw(event: String, data: js.Any, options: InvokeOptions): Double | Null = js.native
    def invokeRaw(event: String, data: js.Any, options: InvokeOptions, callback: EventObjectCallback): Double | Null = js.native
    
    var isBufferingBatch: Boolean = js.native
    
    var options: ClientOptions = js.native
    
    var pingTimeout: Double = js.native
    
    var pingTimeoutDisabled: Boolean = js.native
    
    var protocolVersion: ProtocolVersions = js.native
    
    def send(data: js.Any): Unit = js.native
    
    def sendObject(`object`: js.Any): Unit = js.native
    
    def serializeObject(`object`: js.Any): js.Any = js.native
    
    var socket: typings.ws.mod.^ = js.native
    
    def startBatch(): Unit = js.native
    
    var state: States = js.native
    
    def transmit(event: String, data: js.Any, options: TransmitOptions): js.Promise[Unit] = js.native
    
    def transmitObject(eventObject: EventObject): Double | Null = js.native
    
    def uri(): String = js.native
    
    var wsOptions: js.UndefOr[typings.ws.mod.ClientOptions] = js.native
  }
  
  @js.native
  trait EventObject extends StObject {
    
    var callback: js.UndefOr[EventObjectCallback] = js.native
    
    var cid: js.UndefOr[Double] = js.native
    
    var data: js.Any = js.native
    
    var event: String = js.native
    
    var timeout: js.UndefOr[Timer] = js.native
  }
  object EventObject {
    
    @scala.inline
    def apply(data: js.Any, event: String): EventObject = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventObject]
    }
    
    @scala.inline
    implicit class EventObjectMutableBuilder[Self <: EventObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: (/* error */ Error, /* eventObject */ EventObject) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      @scala.inline
      def setCid(value: Double): Self = StObject.set(x, "cid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCidUndefined: Self = StObject.set(x, "cid", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeout(value: Timer): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  type EventObjectCallback = js.Function2[/* error */ Error, /* eventObject */ EventObject, Unit]
  
  @js.native
  trait InvokeOptions extends StObject {
    
    var ackTimeout: js.UndefOr[Double] = js.native
    
    var force: js.UndefOr[Boolean] = js.native
    
    var noTimeout: js.UndefOr[Boolean] = js.native
  }
  object InvokeOptions {
    
    @scala.inline
    def apply(): InvokeOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[InvokeOptions]
    }
    
    @scala.inline
    implicit class InvokeOptionsMutableBuilder[Self <: InvokeOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAckTimeout(value: Double): Self = StObject.set(x, "ackTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAckTimeoutUndefined: Self = StObject.set(x, "ackTimeout", js.undefined)
      
      @scala.inline
      def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
      
      @scala.inline
      def setNoTimeout(value: Boolean): Self = StObject.set(x, "noTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoTimeoutUndefined: Self = StObject.set(x, "noTimeout", js.undefined)
    }
  }
  
  @js.native
  trait OnCloseValue extends StObject {
    
    var code: Double = js.native
    
    var reason: String = js.native
  }
  object OnCloseValue {
    
    @scala.inline
    def apply(code: Double, reason: String): OnCloseValue = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnCloseValue]
    }
    
    @scala.inline
    implicit class OnCloseValueMutableBuilder[Self <: OnCloseValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OnErrorValue extends StObject {
    
    var error: Error = js.native
  }
  object OnErrorValue {
    
    @scala.inline
    def apply(error: Error): OnErrorValue = {
      val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnErrorValue]
    }
    
    @scala.inline
    implicit class OnErrorValueMutableBuilder[Self <: OnErrorValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setError(value: Error): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OnEventValue extends StObject {
    
    var data: js.Any = js.native
    
    var event: String = js.native
  }
  object OnEventValue {
    
    @scala.inline
    def apply(data: js.Any, event: String): OnEventValue = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnEventValue]
    }
    
    @scala.inline
    implicit class OnEventValueMutableBuilder[Self <: OnEventValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OnInboundInvokeValue extends StObject {
    
    var data: js.Any = js.native
    
    var procedure: String = js.native
  }
  object OnInboundInvokeValue {
    
    @scala.inline
    def apply(data: js.Any, procedure: String): OnInboundInvokeValue = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], procedure = procedure.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnInboundInvokeValue]
    }
    
    @scala.inline
    implicit class OnInboundInvokeValueMutableBuilder[Self <: OnInboundInvokeValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProcedure(value: String): Self = StObject.set(x, "procedure", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OnInboundTransmitValue extends StObject {
    
    var data: js.Any = js.native
    
    var event: String = js.native
  }
  object OnInboundTransmitValue {
    
    @scala.inline
    def apply(data: js.Any, event: String): OnInboundTransmitValue = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], event = event.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnInboundTransmitValue]
    }
    
    @scala.inline
    implicit class OnInboundTransmitValueMutableBuilder[Self <: OnInboundTransmitValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OnOpenAbortValue extends StObject {
    
    var code: Double = js.native
    
    var reason: String = js.native
  }
  object OnOpenAbortValue {
    
    @scala.inline
    def apply(code: Double, reason: String): OnOpenAbortValue = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], reason = reason.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnOpenAbortValue]
    }
    
    @scala.inline
    implicit class OnOpenAbortValueMutableBuilder[Self <: OnOpenAbortValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait OnOpenValue extends StObject {
    
    var authToken: AuthToken | Null = js.native
    
    var id: String = js.native
    
    var isAuthenticated: Boolean = js.native
    
    var pingTimeout: Double = js.native
  }
  object OnOpenValue {
    
    @scala.inline
    def apply(id: String, isAuthenticated: Boolean, pingTimeout: Double): OnOpenValue = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isAuthenticated = isAuthenticated.asInstanceOf[js.Any], pingTimeout = pingTimeout.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnOpenValue]
    }
    
    @scala.inline
    implicit class OnOpenValueMutableBuilder[Self <: OnOpenValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAuthToken(value: AuthToken): Self = StObject.set(x, "authToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAuthTokenNull: Self = StObject.set(x, "authToken", null)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsAuthenticated(value: Boolean): Self = StObject.set(x, "isAuthenticated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPingTimeout(value: Double): Self = StObject.set(x, "pingTimeout", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait TransmitOptions extends StObject {
    
    var force: js.UndefOr[Boolean] = js.native
  }
  object TransmitOptions {
    
    @scala.inline
    def apply(): TransmitOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransmitOptions]
    }
    
    @scala.inline
    implicit class TransmitOptionsMutableBuilder[Self <: TransmitOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setForceUndefined: Self = StObject.set(x, "force", js.undefined)
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
