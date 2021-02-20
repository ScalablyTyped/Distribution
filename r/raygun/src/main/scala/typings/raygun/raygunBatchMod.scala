package typings.raygun

import typings.node.httpMod.IncomingMessage
import typings.raygun.anon.HttpOptions
import typings.raygun.typesMod.Callback
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object raygunBatchMod {
  
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
    
    var batchId: js.Any = js.native
    
    var httpOptions: js.Any = js.native
    
    var interval: js.Any = js.native
    
    var intervalId: js.Any = js.native
    
    var messageQueue: js.Any = js.native
    
    var process: js.Any = js.native
    
    def send(message: String, callback: Callback[IncomingMessage]): Unit = js.native
    
    def startProcessing(): Unit = js.native
    
    def stopProcessing(): Unit = js.native
  }
  
  @JSImport("raygun/build/raygun.batch", "prepareBatch")
  @js.native
  def prepareBatch(messageQueue: js.Array[MessageAndCallback]): PreparedBatch = js.native
  
  @js.native
  trait MessageAndCallback extends StObject {
    
    var callback: Callback[IncomingMessage] | Null = js.native
    
    var serializedMessage: String = js.native
  }
  object MessageAndCallback {
    
    @scala.inline
    def apply(serializedMessage: String): MessageAndCallback = {
      val __obj = js.Dynamic.literal(serializedMessage = serializedMessage.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageAndCallback]
    }
    
    @scala.inline
    implicit class MessageAndCallbackMutableBuilder[Self <: MessageAndCallback] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallback(value: Callback[IncomingMessage]): Self = StObject.set(x, "callback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackFunction1(value: /* t */ IncomingMessage | Null => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCallbackFunction2(value: (/* e */ Error | Null, /* t */ IncomingMessage | Null) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCallbackNull: Self = StObject.set(x, "callback", null)
      
      @scala.inline
      def setSerializedMessage(value: String): Self = StObject.set(x, "serializedMessage", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PreparedBatch extends StObject {
    
    var callbacks: js.Array[Callback[IncomingMessage]] = js.native
    
    var messageCount: Double = js.native
    
    var payload: String = js.native
  }
  object PreparedBatch {
    
    @scala.inline
    def apply(callbacks: js.Array[Callback[IncomingMessage]], messageCount: Double, payload: String): PreparedBatch = {
      val __obj = js.Dynamic.literal(callbacks = callbacks.asInstanceOf[js.Any], messageCount = messageCount.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
      __obj.asInstanceOf[PreparedBatch]
    }
    
    @scala.inline
    implicit class PreparedBatchMutableBuilder[Self <: PreparedBatch] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallbacks(value: js.Array[Callback[IncomingMessage]]): Self = StObject.set(x, "callbacks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbacksVarargs(value: Callback[IncomingMessage]*): Self = StObject.set(x, "callbacks", js.Array(value :_*))
      
      @scala.inline
      def setMessageCount(value: Double): Self = StObject.set(x, "messageCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayload(value: String): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    }
  }
}
