package typings.pulumiAws.applicationloadbalancingTargetGroupAttachmentMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TargetGroupAttachmentState extends js.Object {
  /**
    * The Availability Zone where the IP address of the target is to be registered. If the private ip address is outside of the VPC scope, this value must be set to 'all'.
    */
  val availabilityZone: js.UndefOr[Input[String]] = js.native
  /**
    * The port on which targets receive traffic.
    */
  val port: js.UndefOr[Input[Double]] = js.native
  /**
    * The ARN of the target group with which to register targets
    */
  val targetGroupArn: js.UndefOr[Input[String]] = js.native
  /**
    * The ID of the target. This is the Instance ID for an instance, or the container ID for an ECS container. If the target type is ip, specify an IP address. If the target type is lambda, specify the arn of lambda.
    */
  val targetId: js.UndefOr[Input[String]] = js.native
}

object TargetGroupAttachmentState {
  @scala.inline
  def apply(): TargetGroupAttachmentState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TargetGroupAttachmentState]
  }
  @scala.inline
  implicit class TargetGroupAttachmentStateOps[Self <: TargetGroupAttachmentState] (val x: Self) extends AnyVal {
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
    def setAvailabilityZone(value: Input[String]): Self = this.set("availabilityZone", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailabilityZone: Self = this.set("availabilityZone", js.undefined)
    @scala.inline
    def setPort(value: Input[Double]): Self = this.set("port", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    @scala.inline
    def setTargetGroupArn(value: Input[String]): Self = this.set("targetGroupArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetGroupArn: Self = this.set("targetGroupArn", js.undefined)
    @scala.inline
    def setTargetId(value: Input[String]): Self = this.set("targetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetId: Self = this.set("targetId", js.undefined)
  }
  
}

