package typings.pulumiAws.outputMod.iot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicRuleErrorActionLambda extends StObject {
  
  /**
    * The ARN of the Lambda function.
    */
  var functionArn: String
}
object TopicRuleErrorActionLambda {
  
  inline def apply(functionArn: String): TopicRuleErrorActionLambda = {
    val __obj = js.Dynamic.literal(functionArn = functionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleErrorActionLambda]
  }
  
  extension [Self <: TopicRuleErrorActionLambda](x: Self) {
    
    inline def setFunctionArn(value: String): Self = StObject.set(x, "functionArn", value.asInstanceOf[js.Any])
  }
}
