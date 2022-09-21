package typings.reconnectCore

import typings.backoff.mod.Backoff
import typings.backoff.mod.ExponentialOptions
import typings.node.eventsMod.EventEmitter
import typings.reconnectCore.reconnectCoreStrings.backoff
import typings.reconnectCore.reconnectCoreStrings.connect
import typings.reconnectCore.reconnectCoreStrings.connection
import typings.reconnectCore.reconnectCoreStrings.disconnect
import typings.reconnectCore.reconnectCoreStrings.error
import typings.reconnectCore.reconnectCoreStrings.exponential
import typings.reconnectCore.reconnectCoreStrings.fail
import typings.reconnectCore.reconnectCoreStrings.fibonacci
import typings.reconnectCore.reconnectCoreStrings.reconnect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[ArgType, ConnectionType](cf: ConnectFunction[ArgType, ConnectionType]): CustomModule[ArgType, ConnectionType] = ^.asInstanceOf[js.Dynamic].apply(cf.asInstanceOf[js.Any]).asInstanceOf[CustomModule[ArgType, ConnectionType]]
  
  @JSImport("reconnect-core", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  type ConnectFunction[ArgType, ConnectionType] = js.ThisFunction1[/* this */ Instance[ArgType, ConnectionType], /* opts */ ArgType, ConnectionType]
  
  // TODO: Once DT supports TS 3.0, use new Generic Rest Parameter feature for
  // ArgType.  Current definitions only support one parameter passed to
  // connect() but the library actually allows any number of args.
  type CustomModule[ArgType, ConnectionType] = js.Function2[
    /* opts */ js.UndefOr[ModuleOptions[ConnectionType]], 
    /* cb */ js.UndefOr[js.Function1[/* con */ ConnectionType, Unit]], 
    Instance[ArgType, ConnectionType]
  ]
  
  @js.native
  trait Instance[ArgType, ConnectionType] extends EventEmitter {
    
    def connect(opts: ArgType): this.type = js.native
    
    val connected: Boolean = js.native
    
    def disconnect(): this.type = js.native
    
    def listen(opts: ArgType): this.type = js.native
    
    def on(
      event: connect | connection | error | fail,
      cb: js.Function1[(/* err */ Any) | (/* con */ ConnectionType), Unit]
    ): this.type = js.native
    @JSName("on")
    def on_backoff(
      event: backoff,
      cb: js.Function3[/* n */ Double, /* delay */ Double, /* err */ js.UndefOr[Any], Unit]
    ): this.type = js.native
    @JSName("on")
    def on_disconnect(event: disconnect, cb: js.Function1[/* err */ js.UndefOr[Any], Unit]): this.type = js.native
    @JSName("on")
    def on_reconnect(event: reconnect, cb: js.Function2[/* n */ Double, /* delay */ Double, Unit]): this.type = js.native
    
    var reconnect: Boolean = js.native
    
    def reset(): Unit = js.native
  }
  
  trait ModuleOptions[ConnectionType]
    extends StObject
       with ExponentialOptions {
    
    var failAfter: js.UndefOr[Double] = js.undefined
    
    var immediate: js.UndefOr[Boolean] = js.undefined
    
    var onConnect: js.UndefOr[js.Function1[/* con */ ConnectionType, Unit]] = js.undefined
    
    var strategy: js.UndefOr[fibonacci | exponential | Backoff] = js.undefined
  }
  object ModuleOptions {
    
    inline def apply[ConnectionType](): ModuleOptions[ConnectionType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModuleOptions[ConnectionType]]
    }
    
    extension [Self <: ModuleOptions[?], ConnectionType](x: Self & ModuleOptions[ConnectionType]) {
      
      inline def setFailAfter(value: Double): Self = StObject.set(x, "failAfter", value.asInstanceOf[js.Any])
      
      inline def setFailAfterUndefined: Self = StObject.set(x, "failAfter", js.undefined)
      
      inline def setImmediate(value: Boolean): Self = StObject.set(x, "immediate", value.asInstanceOf[js.Any])
      
      inline def setImmediateUndefined: Self = StObject.set(x, "immediate", js.undefined)
      
      inline def setOnConnect(value: /* con */ ConnectionType => Unit): Self = StObject.set(x, "onConnect", js.Any.fromFunction1(value))
      
      inline def setOnConnectUndefined: Self = StObject.set(x, "onConnect", js.undefined)
      
      inline def setStrategy(value: fibonacci | exponential | Backoff): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      inline def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
    }
  }
}
