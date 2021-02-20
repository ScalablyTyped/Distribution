package typings.sqsProducer

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdk.mod.SQS
import typings.node.Buffer
import typings.sqsProducer.sqsProducerStrings.Binary
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("sqs-producer", "create")
  @js.native
  def create(opts: Options): Producer = js.native
  
  @js.native
  trait Options extends StObject {
    
    var accessKeyId: js.UndefOr[String] = js.native
    
    var batchSize: js.UndefOr[Double] = js.native
    
    var queueUrl: String = js.native
    
    var region: js.UndefOr[String] = js.native
    
    var secretAccessKey: js.UndefOr[String] = js.native
    
    var sqs: js.UndefOr[SQS] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(queueUrl: String): Options = {
      val __obj = js.Dynamic.literal(queueUrl = queueUrl.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessKeyId(value: String): Self = StObject.set(x, "accessKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessKeyIdUndefined: Self = StObject.set(x, "accessKeyId", js.undefined)
      
      @scala.inline
      def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
      
      @scala.inline
      def setQueueUrl(value: String): Self = StObject.set(x, "queueUrl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      @scala.inline
      def setSecretAccessKey(value: String): Self = StObject.set(x, "secretAccessKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecretAccessKeyUndefined: Self = StObject.set(x, "secretAccessKey", js.undefined)
      
      @scala.inline
      def setSqs(value: SQS): Self = StObject.set(x, "sqs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSqsUndefined: Self = StObject.set(x, "sqs", js.undefined)
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
  
  @js.native
  trait ProducerMessage extends StObject {
    
    var body: String = js.native
    
    var deduplicationId: js.UndefOr[String] = js.native
    
    var delaySeconds: js.UndefOr[Double] = js.native
    
    var groupId: js.UndefOr[String] = js.native
    
    var id: String = js.native
    
    var messageAttributes: js.UndefOr[StringDictionary[ProducerMessageAttribute]] = js.native
  }
  object ProducerMessage {
    
    @scala.inline
    def apply(body: String, id: String): ProducerMessage = {
      val __obj = js.Dynamic.literal(body = body.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProducerMessage]
    }
    
    @scala.inline
    implicit class ProducerMessageMutableBuilder[Self <: ProducerMessage] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeduplicationId(value: String): Self = StObject.set(x, "deduplicationId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeduplicationIdUndefined: Self = StObject.set(x, "deduplicationId", js.undefined)
      
      @scala.inline
      def setDelaySeconds(value: Double): Self = StObject.set(x, "delaySeconds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelaySecondsUndefined: Self = StObject.set(x, "delaySeconds", js.undefined)
      
      @scala.inline
      def setGroupId(value: String): Self = StObject.set(x, "groupId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupIdUndefined: Self = StObject.set(x, "groupId", js.undefined)
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageAttributes(value: StringDictionary[ProducerMessageAttribute]): Self = StObject.set(x, "messageAttributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageAttributesUndefined: Self = StObject.set(x, "messageAttributes", js.undefined)
    }
  }
  
  @js.native
  trait ProducerMessageAttribute extends StObject {
    
    var BinaryValue: js.UndefOr[Buffer] = js.native
    
    var DataType: typings.sqsProducer.sqsProducerStrings.String | Binary = js.native
    
    var StringValue: js.UndefOr[String] = js.native
  }
  object ProducerMessageAttribute {
    
    @scala.inline
    def apply(DataType: typings.sqsProducer.sqsProducerStrings.String | Binary): ProducerMessageAttribute = {
      val __obj = js.Dynamic.literal(DataType = DataType.asInstanceOf[js.Any])
      __obj.asInstanceOf[ProducerMessageAttribute]
    }
    
    @scala.inline
    implicit class ProducerMessageAttributeMutableBuilder[Self <: ProducerMessageAttribute] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBinaryValue(value: Buffer): Self = StObject.set(x, "BinaryValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBinaryValueUndefined: Self = StObject.set(x, "BinaryValue", js.undefined)
      
      @scala.inline
      def setDataType(value: typings.sqsProducer.sqsProducerStrings.String | Binary): Self = StObject.set(x, "DataType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringValue(value: String): Self = StObject.set(x, "StringValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStringValueUndefined: Self = StObject.set(x, "StringValue", js.undefined)
    }
  }
}
