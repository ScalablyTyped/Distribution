package typings.sqsConsumer

import org.scalablytyped.runtime.StringDictionary
import typings.awsSdkClientSqs.distTypesCommandsReceiveMessageCommandMod.ReceiveMessageCommandOutput
import typings.sqsConsumer.distTypesMod.ConsumerOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distValidationMod {
  
  @JSImport("sqs-consumer/dist/validation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Ensure that the required options have been set.
    * @param options The options that have been set by the application.
    */
  inline def assertOptions(options: ConsumerOptions): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("assertOptions")(options.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  /**
    * Determine if the response from SQS has messages in it.
    * @param response The response from SQS.
    */
  inline def hasMessages(response: ReceiveMessageCommandOutput): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("hasMessages")(response.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def validateOption(option: String, value: Any, allOptions: StringDictionary[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateOption")(option.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allOptions.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def validateOption(option: String, value: Any, allOptions: StringDictionary[Any], strict: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("validateOption")(option.asInstanceOf[js.Any], value.asInstanceOf[js.Any], allOptions.asInstanceOf[js.Any], strict.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
