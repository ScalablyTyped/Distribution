package typings.pulumiAws.inputMod.lex

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IntentFulfillmentActivityCodeHook extends StObject {
  
  /**
    * The version of the request-response that you want Amazon Lex to use
    * to invoke your Lambda function. For more information, see
    * [Using Lambda Functions](https://docs.aws.amazon.com/lex/latest/dg/using-lambda.html). Must be less than or equal to 5 characters in length.
    */
  var messageVersion: Input[String]
  
  /**
    * The Amazon Resource Name (ARN) of the Lambda function.
    */
  var uri: Input[String]
}
object IntentFulfillmentActivityCodeHook {
  
  inline def apply(messageVersion: Input[String], uri: Input[String]): IntentFulfillmentActivityCodeHook = {
    val __obj = js.Dynamic.literal(messageVersion = messageVersion.asInstanceOf[js.Any], uri = uri.asInstanceOf[js.Any])
    __obj.asInstanceOf[IntentFulfillmentActivityCodeHook]
  }
  
  extension [Self <: IntentFulfillmentActivityCodeHook](x: Self) {
    
    inline def setMessageVersion(value: Input[String]): Self = StObject.set(x, "messageVersion", value.asInstanceOf[js.Any])
    
    inline def setUri(value: Input[String]): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
  }
}
