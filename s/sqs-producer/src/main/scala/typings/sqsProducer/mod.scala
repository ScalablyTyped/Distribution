package typings.sqsProducer

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.mod.SQS
import typings.node.Buffer
import typings.sqsProducer.sqsProducerStrings.Binary
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sqs-producer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def create(opts: Options): Producer = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(opts.asInstanceOf[js.Any]).asInstanceOf[Producer]
  
  trait Options extends StObject {
    
    var accessKeyId: js.UndefOr[String] = js.undefined
    
    var batchSize: js.UndefOr[Double] = js.undefined
    
    var queueUrl: String
    
    var region: js.UndefOr[String] = js.undefined
    
    var secretAccessKey: js.UndefOr[String] = js.undefined
    
    var sqs: js.UndefOr[SQS] = js.undefined
  }
  object Options {
    
    inline def apply(queueUrl: String): Options = {
      val __obj = js.Dynamic.literal(queueUrl = queueUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setAccessKeyId(value: String): Self = StObject.set(x, "accessKeyId", value.asInstanceOf[js.Any])
      
      inline def setAccessKeyIdUndefined: Self = StObject.set(x, "accessKeyId", js.undefined)
      
      inline def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
      
      inline def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
      
      inline def setQueueUrl(value: String): Self = StObject.set(x, "queueUrl", value.asInstanceOf[js.Any])
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setSecretAccessKey(value: String): Self = StObject.set(x, "secretAccessKey", value.asInstanceOf[js.Any])
      
      inline def setSecretAccessKeyUndefined: Self = StObject.set(x, "secretAccessKey", js.undefined)
      
      inline def setSqs(value: SQS): Self = StObject.set(x, "sqs", value.asInstanceOf[js.Any])
      
      inline def setSqsUndefined: Self = StObject.set(x, "sqs", js.undefined)
    }
  }
  
  @js.native
  trait Producer extends StObject {
    
    def queueSize(cb: ProducerCallback[Double]): Unit = js.native
    
    def send(messages: String, cb: ProducerCallback[Unit]): Unit = js.native
    def send(messages: js.Array[ProducerMessage | String], cb: ProducerCallback[Unit]): Unit = js.native
    def send(messages: ProducerMessage, cb: ProducerCallback[Unit]): Unit = js.native
  }
  
  type ProducerCallback[T] = js.Function2[/* err */ js.UndefOr[Error], /* data */ js.UndefOr[T], js.Any]
  
  trait ProducerMessage extends StObject {
    
    var body: String
    
    var deduplicationId: js.UndefOr[String] = js.undefined
    
    var delaySeconds: js.UndefOr[Double] = js.undefined
    
    var groupId: js.UndefOr[String] = js.undefined
    
    var id: String
    
    var messageAttributes: js.UndefOr[StringDictionary[ProducerMessageAttribute]] = js.undefined
  }
  object ProducerMessage {
    
    inline def apply(body: String, id: String): ProducerMessage = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProducerMessage]
    }
    
    extension [Self <: ProducerMessage](x: Self) {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setDeduplicationId(value: String): Self = StObject.set(x, "deduplicationId", value.asInstanceOf[js.Any])
      
      inline def setDeduplicationIdUndefined: Self = StObject.set(x, "deduplicationId", js.undefined)
      
      inline def setDelaySeconds(value: Double): Self = StObject.set(x, "delaySeconds", value.asInstanceOf[js.Any])
      
      inline def setDelaySecondsUndefined: Self = StObject.set(x, "delaySeconds", js.undefined)
      
      inline def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
      
      inline def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMessageAttributes(value: StringDictionary[ProducerMessageAttribute]): Self = StObject.set(x, "messageAttributes", value.asInstanceOf[js.Any])
      
      inline def setMessageAttributesUndefined: Self = StObject.set(x, "messageAttributes", js.undefined)
    }
  }
  
  trait ProducerMessageAttribute extends StObject {
    
    var BinaryValue: js.UndefOr[Buffer] = js.undefined
    
    var DataType: typings.sqsProducer.sqsProducerStrings.String | Binary
    
    var StringValue: js.UndefOr[String] = js.undefined
  }
  object ProducerMessageAttribute {
    
    inline def apply(DataType: typings.sqsProducer.sqsProducerStrings.String | Binary): ProducerMessageAttribute = {
      val __obj = js.Dynamic.literal(DataType = DataType.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProducerMessageAttribute]
    }
    
    extension [Self <: ProducerMessageAttribute](x: Self) {
      
      inline def setBinaryValue(value: Buffer): Self = StObject.set(x, "BinaryValue", value.asInstanceOf[js.Any])
      
      inline def setBinaryValueUndefined: Self = StObject.set(x, "BinaryValue", js.undefined)
      
      inline def setDataType(value: typings.sqsProducer.sqsProducerStrings.String | Binary): Self = StObject.set(x, "DataType", value.asInstanceOf[js.Any])
      
      inline def setStringValue(value: String): Self = StObject.set(x, "StringValue", value.asInstanceOf[js.Any])
      
      inline def setStringValueUndefined: Self = StObject.set(x, "StringValue", js.undefined)
    }
  }
}
