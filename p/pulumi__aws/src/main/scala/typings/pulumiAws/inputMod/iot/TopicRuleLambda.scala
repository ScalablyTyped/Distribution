package typings.pulumiAws.inputMod.iot

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicRuleLambda extends StObject {
  
  /**
    * The ARN of the Lambda function.
    */
  var functionArn: Input[String]
}
object TopicRuleLambda {
  
  inline def apply(functionArn: Input[String]): TopicRuleLambda = {
    val __obj = js.Dynamic.literal(functionArn = functionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleLambda]
  }
  
  extension [Self <: TopicRuleLambda](x: Self) {
    
    inline def setFunctionArn(value: Input[String]): Self = StObject.set(x, "functionArn", value.asInstanceOf[js.Any])
  }
}
