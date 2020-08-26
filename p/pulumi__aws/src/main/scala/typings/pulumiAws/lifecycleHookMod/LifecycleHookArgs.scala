package typings.pulumiAws.lifecycleHookMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LifecycleHookArgs extends js.Object {
  /**
    * The name of the Auto Scaling group to which you want to assign the lifecycle hook
    */
  val autoscalingGroupName: Input[String] = js.native
  /**
    * Defines the action the Auto Scaling group should take when the lifecycle hook timeout elapses or if an unexpected failure occurs. The value for this parameter can be either CONTINUE or ABANDON. The default value for this parameter is ABANDON.
    */
  val defaultResult: js.UndefOr[Input[String]] = js.native
  /**
    * Defines the amount of time, in seconds, that can elapse before the lifecycle hook times out. When the lifecycle hook times out, Auto Scaling performs the action defined in the DefaultResult parameter
    */
  val heartbeatTimeout: js.UndefOr[Input[Double]] = js.native
  /**
    * The instance state to which you want to attach the lifecycle hook. For a list of lifecycle hook types, see [describe-lifecycle-hook-types](https://docs.aws.amazon.com/cli/latest/reference/autoscaling/describe-lifecycle-hook-types.html#examples)
    */
  val lifecycleTransition: Input[String] = js.native
  /**
    * The name of the lifecycle hook.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * Contains additional information that you want to include any time Auto Scaling sends a message to the notification target.
    */
  val notificationMetadata: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of the notification target that Auto Scaling will use to notify you when an instance is in the transition state for the lifecycle hook. This ARN target can be either an SQS queue or an SNS topic.
    */
  val notificationTargetArn: js.UndefOr[Input[String]] = js.native
  /**
    * The ARN of the IAM role that allows the Auto Scaling group to publish to the specified notification target.
    */
  val roleArn: js.UndefOr[Input[String]] = js.native
}

object LifecycleHookArgs {
  @scala.inline
  def apply(autoscalingGroupName: Input[String], lifecycleTransition: Input[String]): LifecycleHookArgs = {
    val __obj = js.Dynamic.literal(autoscalingGroupName = autoscalingGroupName.asInstanceOf[js.Any], lifecycleTransition = lifecycleTransition.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecycleHookArgs]
  }
  @scala.inline
  implicit class LifecycleHookArgsOps[Self <: LifecycleHookArgs] (val x: Self) extends AnyVal {
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
    def setAutoscalingGroupName(value: Input[String]): Self = this.set("autoscalingGroupName", value.asInstanceOf[js.Any])
    @scala.inline
    def setLifecycleTransition(value: Input[String]): Self = this.set("lifecycleTransition", value.asInstanceOf[js.Any])
    @scala.inline
    def setDefaultResult(value: Input[String]): Self = this.set("defaultResult", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultResult: Self = this.set("defaultResult", js.undefined)
    @scala.inline
    def setHeartbeatTimeout(value: Input[Double]): Self = this.set("heartbeatTimeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeartbeatTimeout: Self = this.set("heartbeatTimeout", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNotificationMetadata(value: Input[String]): Self = this.set("notificationMetadata", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotificationMetadata: Self = this.set("notificationMetadata", js.undefined)
    @scala.inline
    def setNotificationTargetArn(value: Input[String]): Self = this.set("notificationTargetArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNotificationTargetArn: Self = this.set("notificationTargetArn", js.undefined)
    @scala.inline
    def setRoleArn(value: Input[String]): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRoleArn: Self = this.set("roleArn", js.undefined)
  }
  
}

