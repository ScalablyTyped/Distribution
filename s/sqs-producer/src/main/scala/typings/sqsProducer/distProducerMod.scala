package typings.sqsProducer

import typings.awsSdkClientSqs.distTypesModelsModels0Mod.SendMessageBatchResultEntry
import typings.awsSdkClientSqs.mod.SQSClient
import typings.sqsProducer.distTypesMod.Message
import typings.sqsProducer.distTypesMod.ProducerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distProducerMod {
  
  @JSImport("sqs-producer/dist/producer", "Producer")
  @js.native
  open class Producer protected () extends StObject {
    def this(options: ProducerOptions) = this()
    
    var batchSize: Double = js.native
    
    def queueSize(): js.Promise[Double] = js.native
    
    var queueUrl: String = js.native
    
    var region: js.UndefOr[String] = js.native
    
    def send(messages: String): js.Promise[js.Array[SendMessageBatchResultEntry]] = js.native
    def send(messages: js.Array[String | Message]): js.Promise[js.Array[SendMessageBatchResultEntry]] = js.native
    def send(messages: Message): js.Promise[js.Array[SendMessageBatchResultEntry]] = js.native
    
    /* private */ var sendBatch: Any = js.native
    
    var sqs: SQSClient = js.native
    
    /* private */ var validate: Any = js.native
  }
  /* static members */
  object Producer {
    
    @JSImport("sqs-producer/dist/producer", "Producer")
    @js.native
    val ^ : js.Any = js.native
    
    inline def create(options: ProducerOptions): Producer = ^.asInstanceOf[js.Dynamic].applyDynamic("create")(options.asInstanceOf[js.Any]).asInstanceOf[Producer]
  }
}
