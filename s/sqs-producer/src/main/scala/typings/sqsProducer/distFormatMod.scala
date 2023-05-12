package typings.sqsProducer

import typings.awsSdkClientSqs.distTypesModelsModels0Mod.SendMessageBatchRequestEntry
import typings.sqsProducer.distTypesMod.Message
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFormatMod {
  
  @JSImport("sqs-producer/dist/format", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def toEntry(message: String): SendMessageBatchRequestEntry = ^.asInstanceOf[js.Dynamic].applyDynamic("toEntry")(message.asInstanceOf[js.Any]).asInstanceOf[SendMessageBatchRequestEntry]
  inline def toEntry(message: Message): SendMessageBatchRequestEntry = ^.asInstanceOf[js.Dynamic].applyDynamic("toEntry")(message.asInstanceOf[js.Any]).asInstanceOf[SendMessageBatchRequestEntry]
}
