package typings.rsocketCore

import typings.rsocketCore.anon.DataMimeType
import typings.rsocketCore.rsocketleaseMod.Leases
import typings.rsocketCore.rsocketserializationMod.PayloadSerializers
import typings.rsocketFlowable.mod.Single
import typings.rsocketTypes.reactiveSocketTypesMod.DuplexConnection
import typings.rsocketTypes.reactiveSocketTypesMod.ReactiveSocket
import typings.rsocketTypes.reactiveSocketTypesMod.Responder
import typings.std.Error
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rsocketclientMod {
  
  @JSImport("rsocket-core/RSocketClient", JSImport.Default)
  @js.native
  class default[D, M] protected ()
    extends StObject
       with RSocketClient[D, M] {
    def this(config: ClientConfig[D, M]) = this()
    
    /* CompleteClass */
    override def close(): Unit = js.native
    
    /* CompleteClass */
    override def connect(): Single[ReactiveSocket[D, M]] = js.native
  }
  
  trait ClientConfig[D, M] extends StObject {
    
    var errorHandler: js.UndefOr[js.Function1[/* error */ Error, Unit]] = js.undefined
    
    var leases: js.UndefOr[js.Function0[Leases[js.Any]]] = js.undefined
    
    var responder: js.UndefOr[Partial[Responder[D, M]]] = js.undefined
    
    var serializers: js.UndefOr[PayloadSerializers[D, M]] = js.undefined
    
    var setup: DataMimeType[D, M]
    
    var transport: DuplexConnection
  }
  object ClientConfig {
    
    @scala.inline
    def apply[D, M](setup: DataMimeType[D, M], transport: DuplexConnection): ClientConfig[D, M] = {
      val __obj = js.Dynamic.literal(setup = setup.asInstanceOf[js.Any], transport = transport.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientConfig[D, M]]
    }
    
    @scala.inline
    implicit class ClientConfigMutableBuilder[Self <: ClientConfig[?, ?], D, M] (val x: Self & (ClientConfig[D, M])) extends AnyVal {
      
      @scala.inline
      def setErrorHandler(value: /* error */ Error => Unit): Self = StObject.set(x, "errorHandler", js.Any.fromFunction1(value))
      
      @scala.inline
      def setErrorHandlerUndefined: Self = StObject.set(x, "errorHandler", js.undefined)
      
      @scala.inline
      def setLeases(value: () => Leases[js.Any]): Self = StObject.set(x, "leases", js.Any.fromFunction0(value))
      
      @scala.inline
      def setLeasesUndefined: Self = StObject.set(x, "leases", js.undefined)
      
      @scala.inline
      def setResponder(value: Partial[Responder[D, M]]): Self = StObject.set(x, "responder", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponderUndefined: Self = StObject.set(x, "responder", js.undefined)
      
      @scala.inline
      def setSerializers(value: PayloadSerializers[D, M]): Self = StObject.set(x, "serializers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSerializersUndefined: Self = StObject.set(x, "serializers", js.undefined)
      
      @scala.inline
      def setSetup(value: DataMimeType[D, M]): Self = StObject.set(x, "setup", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransport(value: DuplexConnection): Self = StObject.set(x, "transport", value.asInstanceOf[js.Any])
    }
  }
  
  trait RSocketClient[D, M] extends StObject {
    
    def close(): Unit
    
    def connect(): Single[ReactiveSocket[D, M]]
  }
  object RSocketClient {
    
    @scala.inline
    def apply[D, M](close: () => Unit, connect: () => Single[ReactiveSocket[D, M]]): RSocketClient[D, M] = {
      val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close), connect = js.Any.fromFunction0(connect))
      __obj.asInstanceOf[RSocketClient[D, M]]
    }
    
    @scala.inline
    implicit class RSocketClientMutableBuilder[Self <: RSocketClient[?, ?], D, M] (val x: Self & (RSocketClient[D, M])) extends AnyVal {
      
      @scala.inline
      def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
      
      @scala.inline
      def setConnect(value: () => Single[ReactiveSocket[D, M]]): Self = StObject.set(x, "connect", js.Any.fromFunction0(value))
    }
  }
}
