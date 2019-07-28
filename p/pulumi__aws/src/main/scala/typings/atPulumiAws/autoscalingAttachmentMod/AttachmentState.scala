package typings.atPulumiAws.autoscalingAttachmentMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AttachmentState extends js.Object {
  /**
    * The ARN of an ALB Target Group.
    */
  val albTargetGroupArn: js.UndefOr[Input[String]] = js.undefined
  /**
    * Name of ASG to associate with the ELB.
    */
  val autoscalingGroupName: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the ELB.
    */
  val elb: js.UndefOr[Input[String]] = js.undefined
}

object AttachmentState {
  @scala.inline
  def apply(
    albTargetGroupArn: Input[String] = null,
    autoscalingGroupName: Input[String] = null,
    elb: Input[String] = null
  ): AttachmentState = {
    val __obj = js.Dynamic.literal()
    if (albTargetGroupArn != null) __obj.updateDynamic("albTargetGroupArn")(albTargetGroupArn.asInstanceOf[js.Any])
    if (autoscalingGroupName != null) __obj.updateDynamic("autoscalingGroupName")(autoscalingGroupName.asInstanceOf[js.Any])
    if (elb != null) __obj.updateDynamic("elb")(elb.asInstanceOf[js.Any])
    __obj.asInstanceOf[AttachmentState]
  }
}

