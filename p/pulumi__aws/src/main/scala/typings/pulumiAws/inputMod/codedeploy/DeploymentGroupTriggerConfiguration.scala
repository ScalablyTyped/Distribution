package typings.pulumiAws.inputMod.codedeploy

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentGroupTriggerConfiguration extends js.Object {
  /**
    * The event type or types for which notifications are triggered. Some values that are supported: `DeploymentStart`, `DeploymentSuccess`, `DeploymentFailure`, `DeploymentStop`, `DeploymentRollback`, `InstanceStart`, `InstanceSuccess`, `InstanceFailure`.  See [the CodeDeploy documentation](http://docs.aws.amazon.com/codedeploy/latest/userguide/monitoring-sns-event-notifications-create-trigger.html) for all possible values.
    */
  var triggerEvents: Input[js.Array[Input[String]]] = js.native
  /**
    * The name of the notification trigger.
    */
  var triggerName: Input[String] = js.native
  /**
    * The ARN of the SNS topic through which notifications are sent.
    */
  var triggerTargetArn: Input[String] = js.native
}

object DeploymentGroupTriggerConfiguration {
  @scala.inline
  def apply(
    triggerEvents: Input[js.Array[Input[String]]],
    triggerName: Input[String],
    triggerTargetArn: Input[String]
  ): DeploymentGroupTriggerConfiguration = {
    val __obj = js.Dynamic.literal(triggerEvents = triggerEvents.asInstanceOf[js.Any], triggerName = triggerName.asInstanceOf[js.Any], triggerTargetArn = triggerTargetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentGroupTriggerConfiguration]
  }
  @scala.inline
  implicit class DeploymentGroupTriggerConfigurationOps[Self <: DeploymentGroupTriggerConfiguration] (val x: Self) extends AnyVal {
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
    def setTriggerEventsVarargs(value: Input[String]*): Self = this.set("triggerEvents", js.Array(value :_*))
    @scala.inline
    def setTriggerEvents(value: Input[js.Array[Input[String]]]): Self = this.set("triggerEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def setTriggerName(value: Input[String]): Self = this.set("triggerName", value.asInstanceOf[js.Any])
    @scala.inline
    def setTriggerTargetArn(value: Input[String]): Self = this.set("triggerTargetArn", value.asInstanceOf[js.Any])
  }
  
}

