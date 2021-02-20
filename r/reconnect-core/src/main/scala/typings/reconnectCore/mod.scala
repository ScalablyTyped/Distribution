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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("reconnect-core", JSImport.Namespace)
  @js.native
  def apply[ArgType, ConnectionType](cf: ConnectFunction[ArgType, ConnectionType]): CustomModule[ArgType, ConnectionType] = js.native
  
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
    
    @JSName("on")
    def on_backoff(
      event: backoff,
      cb: js.Function3[/* n */ Double, /* delay */ Double, /* err */ js.UndefOr[js.Any], Unit]
    ): this.type = js.native
    @JSName("on")
    def on_connect(event: connect, cb: js.Function1[/* con */ ConnectionType, Unit]): this.type = js.native
    @JSName("on")
    def on_connection(event: connection, cb: js.Function1[/* con */ ConnectionType, Unit]): this.type = js.native
    @JSName("on")
    def on_disconnect(event: disconnect, cb: js.Function1[/* err */ js.UndefOr[js.Any], Unit]): this.type = js.native
    @JSName("on")
    def on_error(event: error, cb: js.Function1[/* err */ js.Any, Unit]): this.type = js.native
    @JSName("on")
    def on_fail(event: fail, cb: js.Function1[/* err */ js.Any, Unit]): this.type = js.native
    @JSName("on")
    def on_reconnect(event: reconnect, cb: js.Function2[/* n */ Double, /* delay */ Double, Unit]): this.type = js.native
    
    var reconnect: Boolean = js.native
    
    def reset(): Unit = js.native
  }
  
  @js.native
  trait ModuleOptions[ConnectionType] extends ExponentialOptions {
    
    var failAfter: js.UndefOr[Double] = js.native
    
    var immediate: js.UndefOr[Boolean] = js.native
    
    var onConnect: js.UndefOr[js.Function1[/* con */ ConnectionType, Unit]] = js.native
    
    var strategy: js.UndefOr[fibonacci | exponential | Backoff] = js.native
  }
  object ModuleOptions {
    
    @scala.inline
    def apply[ConnectionType](): ModuleOptions[ConnectionType] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ModuleOptions[ConnectionType]]
    }
    
    @scala.inline
    implicit class ModuleOptionsMutableBuilder[Self <: ModuleOptions[_], ConnectionType] (val x: Self with ModuleOptions[ConnectionType]) extends AnyVal {
      
      @scala.inline
      def setFailAfter(value: Double): Self = StObject.set(x, "failAfter", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFailAfterUndefined: Self = StObject.set(x, "failAfter", js.undefined)
      
      @scala.inline
      def setImmediate(value: Boolean): Self = StObject.set(x, "immediate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setImmediateUndefined: Self = StObject.set(x, "immediate", js.undefined)
      
      @scala.inline
      def setOnConnect(value: /* con */ ConnectionType => Unit): Self = StObject.set(x, "onConnect", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnConnectUndefined: Self = StObject.set(x, "onConnect", js.undefined)
      
      @scala.inline
      def setStrategy(value: fibonacci | exponential | Backoff): Self = StObject.set(x, "strategy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrategyUndefined: Self = StObject.set(x, "strategy", js.undefined)
    }
  }
}
