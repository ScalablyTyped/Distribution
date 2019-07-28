package typings.atPulumiAws.autoscalingAttachmentMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentArgs extends js.Object {
  /**
    * The ARN of an ALB Target Group.
    */
  val albTargetGroupArn: js.UndefOr[Input[String]] = js.undefined
  /**
    * Name of ASG to associate with the ELB.
    */
  val autoscalingGroupName: Input[String]
  /**
    * The name of the ELB.
    */
  val elb: js.UndefOr[Input[String]] = js.undefined
}

object AttachmentArgs {
  @scala.inline
  def apply(
    autoscalingGroupName: Input[String],
    albTargetGroupArn: Input[String] = null,
    elb: Input[String] = null
  ): AttachmentArgs = {
    val __obj = js.Dynamic.literal(autoscalingGroupName = autoscalingGroupName.asInstanceOf[js.Any])
    if (albTargetGroupArn != null) __obj.updateDynamic("albTargetGroupArn")(albTargetGroupArn.asInstanceOf[js.Any])
    if (elb != null) __obj.updateDynamic("elb")(elb.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentArgs]
  }
}

