package typings.signalrNoJquery

import org.scalablytyped.runtime.StringDictionary
import typings.signalrNoJquery.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("signalr-no-jquery", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hubConnection(): Connection = ^.asInstanceOf[js.Dynamic].applyDynamic("hubConnection")().asInstanceOf[Connection]
  inline def hubConnection(url: String): Connection = ^.asInstanceOf[js.Dynamic].applyDynamic("hubConnection")(url.asInstanceOf[js.Any]).asInstanceOf[Connection]
  inline def hubConnection(url: String, options: Options): Connection = (^.asInstanceOf[js.Dynamic].applyDynamic("hubConnection")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Connection]
  inline def hubConnection(url: Unit, options: Options): Connection = (^.asInstanceOf[js.Dynamic].applyDynamic("hubConnection")(url.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Connection]
  
  inline def signalR(): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("signalR")().asInstanceOf[Any]
  inline def signalR(url: String): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("signalR")(url.asInstanceOf[js.Any]).asInstanceOf[Any]
  inline def signalR(url: String, qs: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("signalR")(url.asInstanceOf[js.Any], qs.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def signalR(url: String, qs: Any, logging: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("signalR")(url.asInstanceOf[js.Any], qs.asInstanceOf[js.Any], logging.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def signalR(url: String, qs: Unit, logging: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("signalR")(url.asInstanceOf[js.Any], qs.asInstanceOf[js.Any], logging.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def signalR(url: Unit, qs: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("signalR")(url.asInstanceOf[js.Any], qs.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def signalR(url: Unit, qs: Any, logging: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("signalR")(url.asInstanceOf[js.Any], qs.asInstanceOf[js.Any], logging.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def signalR(url: Unit, qs: Unit, logging: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("signalR")(url.asInstanceOf[js.Any], qs.asInstanceOf[js.Any], logging.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  @js.native
  trait Connection extends StObject {
    
    /**
      * Creates a new proxy object for the given hub connection that can be used to invoke
      * methods on server hubs and handle client method invocation requests from the server.
      *
      * @param hubName The name of the hub on the server to create the proxy for.
      */
    def createHubProxy(hubName: String): Proxy = js.native
    
    def disconnected(callback: js.Function0[Unit]): Unit = js.native
    
    var id: String = js.native
    
    var proxies: StringDictionary[Any] = js.native
    
    def reconnecting(callback: js.Function0[Unit]): Unit = js.native
    
    def start(): Any = js.native
    def start(options: Any): Any = js.native
    def start(options: Any, callback: js.Function0[Unit]): Any = js.native
    def start(options: Unit, callback: js.Function0[Unit]): Any = js.native
    
    def stop(): Unit = js.native
    def stop(async: Boolean): Unit = js.native
    def stop(async: Boolean, notifyServer: Boolean): Unit = js.native
    def stop(async: Unit, notifyServer: Boolean): Unit = js.native
    
    var transport: Name = js.native
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
    
    var connection: Connection = js.native
    
    def hasSubscriptions(): Boolean = js.native
    
    var hubName: String = js.native
    
    def init(connection: Connection, hubName: String): Unit = js.native
    
    /**
      * Invokes a server hub method with the given arguments.
      *
      * @param methodName The name of the server hub method.
      */
    def invoke(methodName: String, args: Any*): js.Promise[Any] = js.native
    
    /**
      * Removes the callback invocation request from the server hub for the given event name.
      *
      * @param eventName The name of the hub event to unregister the callback for.
      * @param callback The callback to be invoked.
      */
    def off(eventName: String): Proxy = js.native
    def off(eventName: String, callback: js.Function1[/* repeated */ Any, Unit]): Proxy = js.native
    
    /**
      * Wires up a callback to be invoked when a invocation request is received from the server hub.
      *
      * @param eventName The name of the hub event to register the callback for.
      * @param callback The callback to be invoked.
      */
    def on(eventName: String): Proxy = js.native
    def on(eventName: String, callback: js.Function1[/* repeated */ Any, Unit]): Proxy = js.native
    
    var state: Any = js.native
  }
  
  type SupportsKeepAliveHandler = js.Function0[Boolean]
}
