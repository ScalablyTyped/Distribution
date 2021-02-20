package typings.sockjs

import org.scalablytyped.runtime.StringDictionary
import typings.node.NodeJS.ReadWriteStream
import typings.node.eventsMod.global.NodeJS.EventEmitter
import typings.sockjs.anon.Address
import typings.sockjs.sockjsStrings.close
import typings.sockjs.sockjsStrings.connection
import typings.sockjs.sockjsStrings.data
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sockjs", "createServer")
  @js.native
  def createServer(): Server = js.native
  @JSImport("sockjs", "createServer")
  @js.native
  def createServer(options: ServerOptions): Server = js.native
  
  @js.native
  trait Connection extends ReadWriteStream {
    
    var address: StringDictionary[Address] = js.native
    
    def close(): Boolean = js.native
    def close(code: js.UndefOr[scala.Nothing], reason: String): Boolean = js.native
    def close(code: String): Boolean = js.native
    def close(code: String, reason: String): Boolean = js.native
    
    def destroy(): Unit = js.native
    
    var headers: StringDictionary[String] = js.native
    
    var id: String = js.native
    
    def on(event: String, listener: js.Function): this.type = js.native
    @JSName("on")
    def on_close(event: close, listener: js.Function0[Unit]): this.type = js.native
    @JSName("on")
    def on_data(event: data, listener: js.Function1[/* message */ String, _]): this.type = js.native
    
    var pathname: String = js.native
    
    var prefix: String = js.native
    
    var protocol: String = js.native
    
    var readyState: Double = js.native
    
    var remoteAddress: String = js.native
    
    var remotePort: Double = js.native
    
    var url: String = js.native
  }
  
  @js.native
  trait Server extends EventEmitter {
    
    def installHandlers(server: typings.node.httpMod.Server): js.Any = js.native
    def installHandlers(server: typings.node.httpMod.Server, options: ServerOptions): js.Any = js.native
    
    def on(event: String, listener: js.Function): this.type = js.native
    @JSName("on")
    def on_connection(event: connection, listener: js.Function1[/* conn */ Connection, _]): this.type = js.native
  }
  
  @js.native
  trait ServerOptions extends StObject {
    
    var disconnect_delay: js.UndefOr[Double] = js.native
    
    var heartbeat_delay: js.UndefOr[Double] = js.native
    
    var jsessionid: js.UndefOr[js.Any] = js.native
    
    var log: js.UndefOr[js.Function2[/* severity */ String, /* message */ String, Unit]] = js.native
    
    var prefix: js.UndefOr[String] = js.native
    
    var response_limit: js.UndefOr[Double] = js.native
    
    var sockjs_url: js.UndefOr[String] = js.native
    
    var websocket: js.UndefOr[Boolean] = js.native
  }
  object ServerOptions {
    
    @scala.inline
    def apply(): ServerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServerOptions]
    }
    
    @scala.inline
    implicit class ServerOptionsMutableBuilder[Self <: ServerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDisconnect_delay(value: Double): Self = StObject.set(x, "disconnect_delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisconnect_delayUndefined: Self = StObject.set(x, "disconnect_delay", js.undefined)
      
      @scala.inline
      def setHeartbeat_delay(value: Double): Self = StObject.set(x, "heartbeat_delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeartbeat_delayUndefined: Self = StObject.set(x, "heartbeat_delay", js.undefined)
      
      @scala.inline
      def setJsessionid(value: js.Any): Self = StObject.set(x, "jsessionid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setJsessionidUndefined: Self = StObject.set(x, "jsessionid", js.undefined)
      
      @scala.inline
      def setLog(value: (/* severity */ String, /* message */ String) => Unit): Self = StObject.set(x, "log", js.Any.fromFunction2(value))
      
      @scala.inline
      def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setResponse_limit(value: Double): Self = StObject.set(x, "response_limit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponse_limitUndefined: Self = StObject.set(x, "response_limit", js.undefined)
      
      @scala.inline
      def setSockjs_url(value: String): Self = StObject.set(x, "sockjs_url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSockjs_urlUndefined: Self = StObject.set(x, "sockjs_url", js.undefined)
      
      @scala.inline
      def setWebsocket(value: Boolean): Self = StObject.set(x, "websocket", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWebsocketUndefined: Self = StObject.set(x, "websocket", js.undefined)
    }
  }
}
