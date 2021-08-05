package typings.pulumiAws.inputMod.iot

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicRuleErrorActionStepFunctions extends StObject {
  
  /**
    * The prefix used to generate, along with a UUID, the unique state machine execution name.
    */
  var executionNamePrefix: js.UndefOr[Input[String]] = js.undefined
  
  /**
    * The ARN of the IAM role that grants access to start execution of the state machine.
    */
  var roleArn: Input[String]
  
  /**
    * The name of the Step Functions state machine whose execution will be started.
    */
  var stateMachineName: Input[String]
}
object TopicRuleErrorActionStepFunctions {
  
  inline def apply(roleArn: Input[String], stateMachineName: Input[String]): TopicRuleErrorActionStepFunctions = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any], stateMachineName = stateMachineName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleErrorActionStepFunctions]
  }
  
  extension [Self <: TopicRuleErrorActionStepFunctions](x: Self) {
    
    inline def setExecutionNamePrefix(value: Input[String]): Self = StObject.set(x, "executionNamePrefix", value.asInstanceOf[js.Any])
    
    inline def setExecutionNamePrefixUndefined: Self = StObject.set(x, "executionNamePrefix", js.undefined)
    
    inline def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    inline def setStateMachineName(value: Input[String]): Self = StObject.set(x, "stateMachineName", value.asInstanceOf[js.Any])
  }
}
