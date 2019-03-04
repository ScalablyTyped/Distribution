package typings
package atPulumiAwsLib.autoscalingScheduleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScheduleArgs extends js.Object {
  /**
    * The name or Amazon Resource Name (ARN) of the Auto Scaling group.
    */
  val autoscalingGroupName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The number of EC2 instances that should be running in the group. Default 0.  Set to -1 if you don't want to change the desired capacity at the scheduled time.
    */
  val desiredCapacity: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * The time for this action to end, in "YYYY-MM-DDThh:mm:ssZ" format in UTC/GMT only (for example, 2014-06-01T00:00:00Z ).
    * If you try to schedule your action in the past, Auto Scaling returns an error message.
    */
  val endTime: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The maximum size for the Auto Scaling group. Default 0.
    * Set to -1 if you don't want to change the maximum size at the scheduled time.
    */
  val maxSize: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * The minimum size for the Auto Scaling group. Default 0.
    * Set to -1 if you don't want to change the minimum size at the scheduled time.
    */
  val minSize: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  /**
    * The time when recurring future actions will start. Start time is specified by the user following the Unix cron syntax format.
    */
  val recurrence: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name of this scaling action.
    */
  val scheduledActionName: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  /**
    * The time for this action to start, in "YYYY-MM-DDThh:mm:ssZ" format in UTC/GMT only (for example, 2014-06-01T00:00:00Z ).
    * If you try to schedule your action in the past, Auto Scaling returns an error message.
    */
  val startTime: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object ScheduleArgs {
  @scala.inline
  def apply(
    autoscalingGroupName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    scheduledActionName: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    desiredCapacity: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    endTime: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    maxSize: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    minSize: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    recurrence: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    startTime: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): ScheduleArgs = {
    val __obj = js.Dynamic.literal(autoscalingGroupName = autoscalingGroupName.asInstanceOf[js.Any], scheduledActionName = scheduledActionName.asInstanceOf[js.Any])
    if (desiredCapacity != null) __obj.updateDynamic("desiredCapacity")(desiredCapacity.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    if (minSize != null) __obj.updateDynamic("minSize")(minSize.asInstanceOf[js.Any])
    if (recurrence != null) __obj.updateDynamic("recurrence")(recurrence.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduleArgs]
  }
}

