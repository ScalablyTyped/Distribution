package typings.sockjsClient

import typings.sockjsClient.sockjsClientNumbers.`0`
import typings.sockjsClient.sockjsClientNumbers.`1`
import typings.sockjsClient.sockjsClientNumbers.`2`
import typings.sockjsClient.sockjsClientNumbers.`3`
import typings.std.Event
import typings.std.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(url: String): WebSocket = ^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any]).asInstanceOf[WebSocket]
  inline def apply(url: String, _reserved: js.Any): WebSocket = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], _reserved.asInstanceOf[js.Any])).asInstanceOf[WebSocket]
  inline def apply(url: String, _reserved: js.Any, options: Options): WebSocket = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], _reserved.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WebSocket]
  inline def apply(url: String, _reserved: Unit, options: Options): WebSocket = (^.asInstanceOf[js.Dynamic].apply(url.asInstanceOf[js.Any], _reserved.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[WebSocket]
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("sockjs-client", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with WebSocket {
    def this(url: String) = this()
    def this(url: String, _reserved: js.Any) = this()
    def this(url: String, _reserved: js.Any, options: Options) = this()
    def this(url: String, _reserved: Unit, options: Options) = this()
  }
  @JSImport("sockjs-client", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sockjs-client", "CLOSED")
  @js.native
  def CLOSED: CLOSED = js.native
  type CLOSED = `3`
  inline def CLOSED_=(x: CLOSED): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSED")(x.asInstanceOf[js.Any])
  
  @JSImport("sockjs-client", "CLOSING")
  @js.native
  def CLOSING: CLOSING = js.native
  type CLOSING = `2`
  inline def CLOSING_=(x: CLOSING): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CLOSING")(x.asInstanceOf[js.Any])
  
  @JSImport("sockjs-client", "CONNECTING")
  @js.native
  def CONNECTING: CONNECTING = js.native
  type CONNECTING = `0`
  inline def CONNECTING_=(x: CONNECTING): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("CONNECTING")(x.asInstanceOf[js.Any])
  
  @JSImport("sockjs-client", "OPEN")
  @js.native
  def OPEN: OPEN = js.native
  type OPEN = `1`
  inline def OPEN_=(x: OPEN): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("OPEN")(x.asInstanceOf[js.Any])
  
  @js.native
  trait BaseEvent
    extends StObject
       with Event
  
  @js.native
  trait CloseEvent
    extends StObject
       with BaseEvent {
    
    var code: Double = js.native
    
    var reason: String = js.native
    
    var wasClean: Boolean = js.native
  }
  
  @js.native
  trait MessageEvent
    extends StObject
       with BaseEvent {
    
    var data: String = js.native
  }
  
  type OpenEvent = BaseEvent
  
  trait Options extends StObject {
    
    var server: js.UndefOr[String] = js.undefined
    
    var sessionId: js.UndefOr[Double | SessionGenerator] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
    
    var transports: js.UndefOr[String | js.Array[String]] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setServer(value: String): Self = StObject.set(x, "server", value.asInstanceOf[js.Any])
      
      inline def setServerUndefined: Self = StObject.set(x, "server", js.undefined)
      
      inline def setSessionId(value: Double | SessionGenerator): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
      
      inline def setSessionIdFunction0(value: () => String): Self = StObject.set(x, "sessionId", js.Any.fromFunction0(value))
      
      inline def setSessionIdUndefined: Self = StObject.set(x, "sessionId", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
      
      inline def setTransports(value: String | js.Array[String]): Self = StObject.set(x, "transports", value.asInstanceOf[js.Any])
      
      inline def setTransportsUndefined: Self = StObject.set(x, "transports", js.undefined)
      
      inline def setTransportsVarargs(value: String*): Self = StObject.set(x, "transports", js.Array(value :_*))
    }
  }
  
  type SessionGenerator = js.Function0[String]
  
  type State = CONNECTING | OPEN | CLOSING | CLOSED
}
