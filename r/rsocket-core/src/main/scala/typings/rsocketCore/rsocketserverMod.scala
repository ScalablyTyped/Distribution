package typings.rsocketCore

import typings.rsocketCore.rsocketleaseMod.Leases
import typings.rsocketCore.rsocketserializationMod.PayloadSerializers
import typings.rsocketFlowable.mod.Flowable
import typings.rsocketTypes.reactiveSocketTypesMod.DuplexConnection
import typings.rsocketTypes.reactiveSocketTypesMod.Payload
import typings.rsocketTypes.reactiveSocketTypesMod.ReactiveSocket
import typings.rsocketTypes.reactiveSocketTypesMod.Responder
import typings.std.Error
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rsocketserverMod {
  
  @JSImport("rsocket-core/RSocketServer", JSImport.Default)
  @js.native
  class default[D, M] protected ()
    extends StObject
       with RSocketServer[D, M] {
    def this(config: ServerConfig[D, M]) = this()
    
    /* CompleteClass */
    override def start(): Unit = js.native
    
    /* CompleteClass */
    override def stop(): Unit = js.native
  }
  
  trait RSocketServer[D, M] extends StObject {
    
    def start(): Unit
    
    def stop(): Unit
  }
  object RSocketServer {
    
    @scala.inline
    def apply[D, M](start: () => Unit, stop: () => Unit): RSocketServer[D, M] = {
      val __obj = js.Dynamic.literal(start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[RSocketServer[D, M]]
    }
    
    @scala.inline
    implicit class RSocketServerMutableBuilder[Self <: RSocketServer[?, ?], D, M] (val x: Self & (RSocketServer[D, M])) extends AnyVal {
      
      @scala.inline
      def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    }
  }
  
  trait ServerConfig[D, M] extends StObject {
    
    var errorHandler: js.UndefOr[js.Function1[/* e */ Error, Unit]] = js.undefined
    
    def getRequestHandler(socket: ReactiveSocket[D, M], payload: Payload[D, M]): Partial[Responder[D, M]]
    
    var leases: js.UndefOr[js.Function0[Leases[js.Any]]] = js.undefined
    
    var serializers: js.UndefOr[PayloadSerializers[D, M]] = js.undefined
    
    var transport: TransportServer
  }
  object ServerConfig {
    
    @scala.inline
    def apply[D, M](
      getRequestHandler: (ReactiveSocket[D, M], Payload[D, M]) => Partial[Responder[D, M]],
      transport: TransportServer
    ): ServerConfig[D, M] = {
      val __obj = js.Dynamic.literal(getRequestHandler = js.Any.fromFunction2(getRequestHandler), transport = transport.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerConfig[D, M]]
    }
    
    @scala.inline
    implicit class ServerConfigMutableBuilder[Self <: ServerConfig[?, ?], D, M] (val x: Self & (ServerConfig[D, M])) extends AnyVal {
      
      @scala.inline
      def setErrorHandler(value: /* e */ Error => Unit): Self = StObject.set(x, "errorHandler", js.Any.fromFunction1(value))
      
      @scala.inline
      def setErrorHandlerUndefined: Self = StObject.set(x, "errorHandler", js.undefined)
      
      @scala.inline
      def setGetRequestHandler(value: (ReactiveSocket[D, M], Payload[D, M]) => Partial[Responder[D, M]]): Self = StObject.set(x, "getRequestHandler", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLeases(value: () => Leases[js.Any]): Self = StObject.set(x, "leases", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLeasesUndefined: Self = StObject.set(x, "leases", js.undefined)
      
      @scala.inline
      def setSerializers(value: PayloadSerializers[D, M]): Self = StObject.set(x, "serializers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerializersUndefined: Self = StObject.set(x, "serializers", js.undefined)
      
      @scala.inline
      def setTransport(value: TransportServer): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    }
  }
  
  trait TransportServer extends StObject {
    
    def start(): Flowable[DuplexConnection]
    
    def stop(): Unit
  }
  object TransportServer {
    
    @scala.inline
    def apply(start: () => Flowable[DuplexConnection], stop: () => Unit): TransportServer = {
      val __obj = js.Dynamic.literal(start = js.Any.fromFunction0(start), stop = js.Any.fromFunction0(stop))
      __obj.asInstanceOf[TransportServer]
    }
    
    @scala.inline
    implicit class TransportServerMutableBuilder[Self <: TransportServer] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStart(value: () => Flowable[DuplexConnection]): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStop(value: () => Unit): Self = StObject.set(x, "stop", js.Any.fromFunction0(value))
    }
  }
}
