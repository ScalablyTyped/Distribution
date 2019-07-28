package typings.atPulumiAws.autoscalingLifecycleHookMod

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LifecycleHookArgs extends js.Object {
  /**
    * The name of the Auto Scaling group to which you want to assign the lifecycle hook
    */
  val autoscalingGroupName: Input[String]
  /**
    * Defines the action the Auto Scaling group should take when the lifecycle hook timeout elapses or if an unexpected failure occurs. The value for this parameter can be either CONTINUE or ABANDON. The default value for this parameter is ABANDON.
    */
  val defaultResult: js.UndefOr[Input[String]] = js.undefined
  /**
    * Defines the amount of time, in seconds, that can elapse before the lifecycle hook times out. When the lifecycle hook times out, Auto Scaling performs the action defined in the DefaultResult parameter
    */
  val heartbeatTimeout: js.UndefOr[Input[Double]] = js.undefined
  /**
    * The instance state to which you want to attach the lifecycle hook. For a list of lifecycle hook types, see [describe-lifecycle-hook-types](https://docs.aws.amazon.com/cli/latest/reference/autoscaling/describe-lifecycle-hook-types.html#examples)
    */
  val lifecycleTransition: Input[String]
  /**
    * The name of the lifecycle hook.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * Contains additional information that you want to include any time Auto Scaling sends a message to the notification target.
    */
  val notificationMetadata: js.UndefOr[Input[String]] = js.undefined
  /**
    * The ARN of the notification target that Auto Scaling will use to notify you when an instance is in the transition state for the lifecycle hook. This ARN target can be either an SQS queue or an SNS topic.
    */
  val notificationTargetArn: js.UndefOr[Input[String]] = js.undefined
  /**
    * The ARN of the IAM role that allows the Auto Scaling group to publish to the specified notification target.
    */
  val roleArn: js.UndefOr[Input[String]] = js.undefined
}

object LifecycleHookArgs {
  @scala.inline
  def apply(
    autoscalingGroupName: Input[String],
    lifecycleTransition: Input[String],
    defaultResult: Input[String] = null,
    heartbeatTimeout: Input[Double] = null,
    name: Input[String] = null,
    notificationMetadata: Input[String] = null,
    notificationTargetArn: Input[String] = null,
    roleArn: Input[String] = null
  ): LifecycleHookArgs = {
    val __obj = js.Dynamic.literal(autoscalingGroupName = autoscalingGroupName.asInstanceOf[js.Any], lifecycleTransition = lifecycleTransition.asInstanceOf[js.Any])
    if (defaultResult != null) __obj.updateDynamic("defaultResult")(defaultResult.asInstanceOf[js.Any])
    if (heartbeatTimeout != null) __obj.updateDynamic("heartbeatTimeout")(heartbeatTimeout.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (notificationMetadata != null) __obj.updateDynamic("notificationMetadata")(notificationMetadata.asInstanceOf[js.Any])
    if (notificationTargetArn != null) __obj.updateDynamic("notificationTargetArn")(notificationTargetArn.asInstanceOf[js.Any])
    if (roleArn != null) __obj.updateDynamic("roleArn")(roleArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[LifecycleHookArgs]
  }
}

