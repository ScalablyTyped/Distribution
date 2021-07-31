package typings.pulumiAws.outputMod.iot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TopicRuleStepFunction extends StObject {
  
  /**
    * The prefix used to generate, along with a UUID, the unique state machine execution name.
    */
  var executionNamePrefix: js.UndefOr[String] = js.undefined
  
  /**
    * The ARN of the IAM role that grants access to start execution of the state machine.
    */
  var roleArn: String
  
  /**
    * The name of the Step Functions state machine whose execution will be started.
    */
  var stateMachineName: String
}
object TopicRuleStepFunction {
  
  @scala.inline
  def apply(roleArn: String, stateMachineName: String): TopicRuleStepFunction = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any], stateMachineName = stateMachineName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleStepFunction]
  }
  
  @scala.inline
  implicit class TopicRuleStepFunctionMutableBuilder[Self <: TopicRuleStepFunction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecutionNamePrefix(value: String): Self = StObject.set(x, "executionNamePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionNamePrefixUndefined: Self = StObject.set(x, "executionNamePrefix", js.undefined)
    
    @scala.inline
    def setRoleArn(value: String): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateMachineName(value: String): Self = StObject.set(x, "stateMachineName", value.asInstanceOf[js.Any])
  }
}
