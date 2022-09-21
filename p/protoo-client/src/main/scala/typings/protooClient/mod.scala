package typings.protooClient

import typings.protooClient.anon.ClientConfig
import typings.protooClient.protooClientBooleans.`true`
import typings.protooClient.protooClientStrings.close
import typings.protooClient.protooClientStrings.disconnected
import typings.protooClient.protooClientStrings.failed
import typings.protooClient.protooClientStrings.notification
import typings.protooClient.protooClientStrings.open
import typings.protooClient.protooClientStrings.request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("protoo-client", "Peer")
  @js.native
  open class Peer protected () extends StObject {
    def this(transport: WebSocketTransport) = this()
    
    def close(): Unit = js.native
    
    val closed: Boolean = js.native
    
    val connected: Boolean = js.native
    
    var data: Any = js.native
    
    def notify(method: String): js.Promise[Any] = js.native
    def notify(method: String, data: Any): js.Promise[Any] = js.native
    
    def on(evt: open | disconnected | close, handler: js.Function0[Any]): Unit = js.native
    @JSName("on")
    def on_failed(evt: failed, handler: js.Function1[/* currentAttempt */ Double, Any]): Unit = js.native
    @JSName("on")
    def on_notification(evt: notification, handler: js.Function1[/* notif */ ProtooNotification, Any]): Unit = js.native
    @JSName("on")
    def on_request(
      evt: request,
      handler: js.Function3[
          /* request */ ProtooRequest, 
          /* accept */ js.Function1[/* data */ js.UndefOr[ProtooResponse], Unit], 
          /* reject */ js.Function2[
            /* error */ js.UndefOr[js.Error | Double], 
            /* errorReason */ js.UndefOr[String], 
            Unit
          ], 
          Any
        ]
    ): Unit = js.native
    
    def request(method: String): js.Promise[Any] = js.native
    def request(method: String, data: Any): js.Promise[Any] = js.native
  }
  
  @JSImport("protoo-client", "WebSocketTransport")
  @js.native
  open class WebSocketTransport protected () extends StObject {
    def this(url: String) = this()
    def this(url: String, options: ClientConfig) = this()
    
    def close(): Unit = js.native
    
    val closed: Boolean = js.native
    
    def send(message: Any): js.Promise[Unit] = js.native
  }
  
  trait ProtooNotification extends StObject {
    
    var data: js.UndefOr[Any] = js.undefined
    
    var method: String
    
    var notification: `true`
  }
  object ProtooNotification {
    
    inline def apply(method: String): ProtooNotification = {
      val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], notification = true)
      __obj.asInstanceOf[ProtooNotification]
    }
    
    extension [Self <: ProtooNotification](x: Self) {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setNotification(value: `true`): Self = StObject.set(x, "notification", value.asInstanceOf[js.Any])
    }
  }
  
  trait ProtooRequest extends StObject {
    
    var data: js.UndefOr[Any] = js.undefined
    
    var id: Double
    
    var method: String
    
    var request: `true`
  }
  object ProtooRequest {
    
    inline def apply(id: Double, method: String): ProtooRequest = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any], request = true)
      __obj.asInstanceOf[ProtooRequest]
    }
    
    extension [Self <: ProtooRequest](x: Self) {
      
      inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setRequest(value: `true`): Self = StObject.set(x, "request", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.protooClient.anon.Data
    - typings.protooClient.anon.ErrorCode
  */
  trait ProtooResponse extends StObject
  object ProtooResponse {
    
    inline def Data(data: Any, id: Double): typings.protooClient.anon.Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ok = true, response = true)
      __obj.asInstanceOf[typings.protooClient.anon.Data]
    }
    
    inline def ErrorCode(errorCode: Double, errorReason: String, id: Double): typings.protooClient.anon.ErrorCode = {
      val __obj = js.Dynamic.literal(errorCode = errorCode.asInstanceOf[js.Any], errorReason = errorReason.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ok = false, response = true)
      __obj.asInstanceOf[typings.protooClient.anon.ErrorCode]
    }
  }
}
