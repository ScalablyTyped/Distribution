package typings
package atPulumiAwsLib.autoscalingAttachmentMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentArgs extends js.Object {
  /**
    * The ARN of an ALB Target Group.
    */
  val albTargetGroupArn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Name of ASG to associate with the ELB.
    */
  val autoscalingGroupName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The name of the ELB.
    */
  val elb: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object AttachmentArgs {
  @scala.inline
  def apply(
    autoscalingGroupName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    albTargetGroupArn: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    elb: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): AttachmentArgs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("autoscalingGroupName")(autoscalingGroupName.asInstanceOf[js.Any])
    if (albTargetGroupArn != null) __obj.updateDynamic("albTargetGroupArn")(albTargetGroupArn.asInstanceOf[js.Any])
    if (elb != null) __obj.updateDynamic("elb")(elb.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentArgs]
  }
}

