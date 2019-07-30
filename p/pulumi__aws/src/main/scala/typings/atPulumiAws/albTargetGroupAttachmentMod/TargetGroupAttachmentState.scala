package typings.atPulumiAws.albTargetGroupAttachmentMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TargetGroupAttachmentState extends js.Object {
  /**
    * The Availability Zone where the IP address of the target is to be registered.
    */
  val availabilityZone: js.UndefOr[Input[String]] = js.undefined
  /**
    * The port on which targets receive traffic.
    */
  val port: js.UndefOr[Input[Double]] = js.undefined
  /**
    * The ARN of the target group with which to register targets
    */
  val targetGroupArn: js.UndefOr[Input[String]] = js.undefined
  /**
    * The ID of the target. This is the Instance ID for an instance, or the container ID for an ECS container. If the target type is ip, specify an IP address. If the target type is lambda, specify the arn of lambda.
    */
  val targetId: js.UndefOr[Input[String]] = js.undefined
}

object TargetGroupAttachmentState {
  @scala.inline
  def apply(
    availabilityZone: Input[String] = null,
    port: Input[Double] = null,
    targetGroupArn: Input[String] = null,
    targetId: Input[String] = null
  ): TargetGroupAttachmentState = {
    val __obj = js.Dynamic.literal()
    if (availabilityZone != null) __obj.updateDynamic("availabilityZone")(availabilityZone.asInstanceOf[js.Any])
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (targetGroupArn != null) __obj.updateDynamic("targetGroupArn")(targetGroupArn.asInstanceOf[js.Any])
    if (targetId != null) __obj.updateDynamic("targetId")(targetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[TargetGroupAttachmentState]
  }
}

