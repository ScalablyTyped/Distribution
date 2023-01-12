package typings.sqsProducer

import typings.awsSdk.clientsSqsMod.MessageBodyAttributeMap
import typings.awsSdk.clientsSqsMod.SendMessageBatchRequestEntry
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  @JSImport("sqs-producer/dist/types", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toEntry(message: String): SendMessageBatchRequestEntry = ^.asInstanceOf[js.Dynamic].applyDynamic("toEntry")(message.asInstanceOf[js.Any]).asInstanceOf[SendMessageBatchRequestEntry]
  inline def toEntry(message: Message): SendMessageBatchRequestEntry = ^.asInstanceOf[js.Dynamic].applyDynamic("toEntry")(message.asInstanceOf[js.Any]).asInstanceOf[SendMessageBatchRequestEntry]
  
  trait Message extends StObject {
    
    var body: String
    
    var deduplicationId: js.UndefOr[String] = js.undefined
    
    var delaySeconds: js.UndefOr[Double] = js.undefined
    
    var groupId: js.UndefOr[String] = js.undefined
    
    var id: String
    
    var messageAttributes: js.UndefOr[MessageBodyAttributeMap] = js.undefined
  }
  object Message {
    
    inline def apply(body: String, id: String): Message = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Message] (val x: Self) extends AnyVal {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setDeduplicationId(value: String): Self = StObject.set(x, "deduplicationId", value.asInstanceOf[js.Any])
      
      inline def setDeduplicationIdUndefined: Self = StObject.set(x, "deduplicationId", js.undefined)
      
      inline def setDelaySeconds(value: Double): Self = StObject.set(x, "delaySeconds", value.asInstanceOf[js.Any])
      
      inline def setDelaySecondsUndefined: Self = StObject.set(x, "delaySeconds", js.undefined)
      
      inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
      
      inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMessageAttributes(value: MessageBodyAttributeMap): Self = StObject.set(x, "messageAttributes", value.asInstanceOf[js.Any])
      
      inline def setMessageAttributesUndefined: Self = StObject.set(x, "messageAttributes", js.undefined)
    }
  }
}
