package typings.sqsProducer

import typings.awsSdk.mod.SQS
import typings.awsSdk.sqsMod.SendMessageBatchResultEntryList
import typings.sqsProducer.typesMod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object producerMod {
  
  @JSImport("sqs-producer/dist/producer", "Producer")
  @js.native
  open class Producer protected () extends StObject {
    def this(options: ProducerOptions) = this()
    
    var batchSize: Double = js.native
    
    def queueSize(): js.Promise[Double] = js.native
    
    var queueUrl: String = js.native
    
    var region: js.UndefOr[String] = js.native
    
    def send(messages: String): js.Promise[SendMessageBatchResultEntryList] = js.native
    def send(messages: js.Array[String | Message]): js.Promise[SendMessageBatchResultEntryList] = js.native
    def send(messages: Message): js.Promise[SendMessageBatchResultEntryList] = js.native
    
    /* private */ var sendBatch: Any = js.native
    
    var sqs: SQS = js.native
    
    /* private */ var validate: Any = js.native
  }
  /* static members */
  object Producer {
    
    @JSImport("sqs-producer/dist/producer", "Producer")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(options: ProducerOptions): Producer = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[Producer]
  }
  
  trait ProducerOptions extends StObject {
    
    var batchSize: js.UndefOr[Double] = js.undefined
    
    var queueUrl: js.UndefOr[String] = js.undefined
    
    var region: js.UndefOr[String] = js.undefined
    
    var sqs: js.UndefOr[SQS] = js.undefined
  }
  object ProducerOptions {
    
    inline def apply(): ProducerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ProducerOptions]
    }
    
    extension [Self <: ProducerOptions](x: Self) {
      
      inline def setBatchSize(value: Double): Self = StObject.set(x, "batchSize", value.asInstanceOf[js.Any])
      
      inline def setBatchSizeUndefined: Self = StObject.set(x, "batchSize", js.undefined)
      
      inline def setQueueUrl(value: String): Self = StObject.set(x, "queueUrl", value.asInstanceOf[js.Any])
      
      inline def setQueueUrlUndefined: Self = StObject.set(x, "queueUrl", js.undefined)
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
      
      inline def setSqs(value: SQS): Self = StObject.set(x, "sqs", value.asInstanceOf[js.Any])
      
      inline def setSqsUndefined: Self = StObject.set(x, "sqs", js.undefined)
    }
  }
}
