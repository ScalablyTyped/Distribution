package typings.pulumiAws.attachmentMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AttachmentState extends js.Object {
  /**
    * The ARN of an ALB Target Group.
    */
  val albTargetGroupArn: js.UndefOr[Input[String]] = js.native
  /**
    * Name of ASG to associate with the ELB.
    */
  val autoscalingGroupName: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the ELB.
    */
  val elb: js.UndefOr[Input[String]] = js.native
}

object AttachmentState {
  @scala.inline
  def apply(): AttachmentState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AttachmentState]
  }
  @scala.inline
  implicit class AttachmentStateOps[Self <: AttachmentState] (val x: Self) extends AnyVal {
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
    def setAlbTargetGroupArn(value: Input[String]): Self = this.set("albTargetGroupArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlbTargetGroupArn: Self = this.set("albTargetGroupArn", js.undefined)
    @scala.inline
    def setAutoscalingGroupName(value: Input[String]): Self = this.set("autoscalingGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoscalingGroupName: Self = this.set("autoscalingGroupName", js.undefined)
    @scala.inline
    def setElb(value: Input[String]): Self = this.set("elb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElb: Self = this.set("elb", js.undefined)
  }
  
}

