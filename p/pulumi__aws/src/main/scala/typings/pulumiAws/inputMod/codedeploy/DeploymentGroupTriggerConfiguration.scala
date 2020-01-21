package typings.pulumiAws.inputMod.codedeploy

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeploymentGroupTriggerConfiguration extends js.Object {
  /**
    * The event type or types for which notifications are triggered. Some values that are supported: `DeploymentStart`, `DeploymentSuccess`, `DeploymentFailure`, `DeploymentStop`, `DeploymentRollback`, `InstanceStart`, `InstanceSuccess`, `InstanceFailure`.  See [the CodeDeploy documentation][1] for all possible values.
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
}

