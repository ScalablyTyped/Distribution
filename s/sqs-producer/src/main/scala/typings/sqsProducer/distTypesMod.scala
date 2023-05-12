package typings.sqsProducer

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientSqs.distTypesModelsModels0Mod.MessageAttributeValue
import typings.awsSdkClientSqs.mod.SQSClient
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesMod {
  
  trait Message extends StObject {
    
    var body: String
    
    var deduplicationId: js.UndefOr[String] = js.undefined
    
    var delaySeconds: js.UndefOr[Double] = js.undefined
    
    var groupId: js.UndefOr[String] = js.undefined
    
    var id: String
    
    var messageAttributes: js.UndefOr[StringDictionary[MessageAttributeValue]] = js.undefined
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
      
      inline def setMessageAttributes(value: StringDictionary[MessageAttributeValue]): Self = StObject.set(x, "messageAttributes", value.asInstanceOf[js.Any])
      
      inline def setMessageAttributesUndefined: Self = StObject.set(x, "messageAttributes", js.undefined)
    }
  }
  
  trait ProducerOptions extends StObject {
    
    var batchSize: js.UndefOr[Double] = js.undefined
    
    var queueUrl: String
    
    var region: js.UndefOr[String] = js.undefined
    
    var sqs: js.UndefOr[SQSClient] = js.undefined
  }
  object ProducerOptions {
    
    inline def apply(queueUrl: String): ProducerOptions = {
      val __obj = js.Dynamic.literal(queueUrl = queueUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProducerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ProducerOptions] (val x: Self) extends AnyVal {
      
      inline def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
      
      inline def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
      
      inline def setQueueUrl(value: String): Self = StObject.set(x, "queueUrl", value.asInstanceOf[js.Any])
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setSqs(value: SQSClient): Self = StObject.set(x, "sqs", value.asInstanceOf[js.Any])
      
      inline def setSqsUndefined: Self = StObject.set(x, "sqs", js.undefined)
    }
  }
}
