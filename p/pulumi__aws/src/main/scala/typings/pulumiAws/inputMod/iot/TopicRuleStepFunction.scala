package typings.pulumiAws.inputMod.iot

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TopicRuleStepFunction extends js.Object {
  
  /**
    * The prefix used to generate, along with a UUID, the unique state machine execution name.
    */
  var executionNamePrefix: js.UndefOr[Input[String]] = js.native
  
  /**
    * The ARN of the IAM role that grants access to start execution of the state machine.
    */
  var roleArn: Input[String] = js.native
  
  /**
    * The name of the Step Functions state machine whose execution will be started.
    */
  var stateMachineName: Input[String] = js.native
}
object TopicRuleStepFunction {
  
  @scala.inline
  def apply(roleArn: Input[String], stateMachineName: Input[String]): TopicRuleStepFunction = {
    val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any], stateMachineName = stateMachineName.asInstanceOf[js.Any])
    __obj.asInstanceOf[TopicRuleStepFunction]
  }
  
  @scala.inline
  implicit class TopicRuleStepFunctionOps[Self <: TopicRuleStepFunction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRoleArn(value: Input[String]): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateMachineName(value: Input[String]): Self = this.set("stateMachineName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionNamePrefix(value: Input[String]): Self = this.set("executionNamePrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExecutionNamePrefix: Self = this.set("executionNamePrefix", js.undefined)
  }
}
