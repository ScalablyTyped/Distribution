package typings.signalrNoJquery

import org.scalablytyped.runtime.StringDictionary
import typings.signalrNoJquery.anon.Name
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("signalr-no-jquery", "hubConnection")
  @js.native
  def hubConnection(): Connection = js.native
  @JSImport("signalr-no-jquery", "hubConnection")
  @js.native
  def hubConnection(url: js.UndefOr[scala.Nothing], options: Options): Connection = js.native
  @JSImport("signalr-no-jquery", "hubConnection")
  @js.native
  def hubConnection(url: String): Connection = js.native
  @JSImport("signalr-no-jquery", "hubConnection")
  @js.native
  def hubConnection(url: String, options: Options): Connection = js.native
  
  @JSImport("signalr-no-jquery", "signalR")
  @js.native
  def signalR(): js.Any = js.native
  @JSImport("signalr-no-jquery", "signalR")
  @js.native
  def signalR(url: js.UndefOr[scala.Nothing], qs: js.UndefOr[scala.Nothing], logging: js.Any): js.Any = js.native
  @JSImport("signalr-no-jquery", "signalR")
  @js.native
  def signalR(url: js.UndefOr[scala.Nothing], qs: js.Any): js.Any = js.native
  @JSImport("signalr-no-jquery", "signalR")
  @js.native
  def signalR(url: js.UndefOr[scala.Nothing], qs: js.Any, logging: js.Any): js.Any = js.native
  @JSImport("signalr-no-jquery", "signalR")
  @js.native
  def signalR(url: String): js.Any = js.native
  @JSImport("signalr-no-jquery", "signalR")
  @js.native
  def signalR(url: String, qs: js.UndefOr[scala.Nothing], logging: js.Any): js.Any = js.native
  @JSImport("signalr-no-jquery", "signalR")
  @js.native
  def signalR(url: String, qs: js.Any): js.Any = js.native
  @JSImport("signalr-no-jquery", "signalR")
  @js.native
  def signalR(url: String, qs: js.Any, logging: js.Any): js.Any = js.native
  
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
    
    var proxies: StringDictionary[js.Any] = js.native
    
    def reconnecting(callback: js.Function0[Unit]): Unit = js.native
    
    def start(): js.Any = js.native
    def start(options: js.UndefOr[scala.Nothing], callback: js.Function0[Unit]): js.Any = js.native
    def start(options: js.Any): js.Any = js.native
    def start(options: js.Any, callback: js.Function0[Unit]): js.Any = js.native
    
    def stop(): Unit = js.native
    def stop(async: js.UndefOr[scala.Nothing], notifyServer: Boolean): Unit = js.native
    def stop(async: Boolean): Unit = js.native
    def stop(async: Boolean, notifyServer: Boolean): Unit = js.native
    
    var transport: Name = js.native
  }
  
  @js.native
  trait Options extends StObject {
    
    var logging: js.UndefOr[Boolean] = js.native
    
    var qs: js.UndefOr[String] = js.native
    
    var useDefaultPath: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLogging(value: Boolean): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
      
      @scala.inline
      def setQs(value: String): Self = StObject.set(x, "qs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQsUndefined: Self = StObject.set(x, "qs", js.undefined)
      
      @scala.inline
      def setUseDefaultPath(value: Boolean): Self = StObject.set(x, "useDefaultPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseDefaultPathUndefined: Self = StObject.set(x, "useDefaultPath", js.undefined)
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
    def invoke(methodName: String, args: js.Any*): js.Promise[_] = js.native
    
    /**
      * Removes the callback invocation request from the server hub for the given event name.
      *
      * @param eventName The name of the hub event to unregister the callback for.
      * @param callback The callback to be invoked.
      */
    def off(eventName: String): Proxy = js.native
    def off(eventName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): Proxy = js.native
    
    /**
      * Wires up a callback to be invoked when a invocation request is received from the server hub.
      *
      * @param eventName The name of the hub event to register the callback for.
      * @param callback The callback to be invoked.
      */
    def on(eventName: String): Proxy = js.native
    def on(eventName: String, callback: js.Function1[/* repeated */ js.Any, Unit]): Proxy = js.native
    
    var state: js.Any = js.native
  }
  
  type SupportsKeepAliveHandler = js.Function0[Boolean]
}
