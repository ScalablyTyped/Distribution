package typings.raygun

import typings.node.httpMod.IncomingMessage
import typings.raygun.anon.HttpOptions
import typings.raygun.typesMod.Callback
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object raygunBatchMod {
  
  @JSImport("raygun/build/raygun.batch", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("raygun/build/raygun.batch", "MAX_BATCH_SIZE_BYTES")
  @js.native
  val MAX_BATCH_SIZE_BYTES: /* 1638400 */ Double = js.native
  
  @JSImport("raygun/build/raygun.batch", "MAX_MESSAGES_IN_BATCH")
  @js.native
  val MAX_MESSAGES_IN_BATCH: /* 100 */ Double = js.native
  
  @JSImport("raygun/build/raygun.batch", "RaygunBatchTransport")
  @js.native
  class RaygunBatchTransport protected () extends StObject {
    def this(options: HttpOptions) = this()
    
    /* private */ var batchId: js.Any = js.native
    
    /* private */ var httpOptions: js.Any = js.native
    
    /* private */ var interval: js.Any = js.native
    
    /* private */ var intervalId: js.Any = js.native
    
    /* private */ var messageQueue: js.Any = js.native
    
    /* private */ var process: js.Any = js.native
    
    def send(message: String, callback: Callback[IncomingMessage]): Unit = js.native
    
    def startProcessing(): Unit = js.native
    
    def stopProcessing(): Unit = js.native
  }
  
  inline def prepareBatch(messageQueue: js.Array[MessageAndCallback]): PreparedBatch = ^.asInstanceOf[js.Dynamic].applyDynamic("prepareBatch")(messageQueue.asInstanceOf[js.Any]).asInstanceOf[PreparedBatch]
  
  trait MessageAndCallback extends StObject {
    
    var callback: Callback[IncomingMessage] | Null
    
    var serializedMessage: String
  }
  object MessageAndCallback {
    
    inline def apply(serializedMessage: String): MessageAndCallback = {
      val __obj = js.Dynamic.literal(serializedMessage = serializedMessage.asInstanceOf[js.Any], callback = null)
      __obj.asInstanceOf[MessageAndCallback]
    }
    
    extension [Self <: MessageAndCallback](x: Self) {
      
      inline def setCallback(value: Callback[IncomingMessage]): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      inline def setCallbackFunction1(value: /* t */ IncomingMessage | Null => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      inline def setCallbackFunction2(value: (/* e */ Error | Null, /* t */ IncomingMessage | Null) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackNull: Self = StObject.set(x, "callback", null)
      
      inline def setSerializedMessage(value: String): Self = StObject.set(x, "serializedMessage", value.asInstanceOf[js.Any])
    }
  }
  
  trait PreparedBatch extends StObject {
    
    var callbacks: js.Array[Callback[IncomingMessage]]
    
    var messageCount: Double
    
    var payload: String
  }
  object PreparedBatch {
    
    inline def apply(callbacks: js.Array[Callback[IncomingMessage]], messageCount: Double, payload: String): PreparedBatch = {
      val __obj = js.Dynamic.literal(callbacks = callbacks.asInstanceOf[js.Any], messageCount = messageCount.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreparedBatch]
    }
    
    extension [Self <: PreparedBatch](x: Self) {
      
      inline def setCallbacks(value: js.Array[Callback[IncomingMessage]]): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      inline def setCallbacksVarargs(value: Callback[IncomingMessage]*): Self = StObject.set(x, "callbacks", js.Array(value :_*))
      
      inline def setMessageCount(value: Double): Self = StObject.set(x, "messageCount", value.asInstanceOf[js.Any])
      
      inline def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    }
  }
}
