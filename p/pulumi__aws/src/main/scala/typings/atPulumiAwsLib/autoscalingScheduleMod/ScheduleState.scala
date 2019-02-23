package typings
package atPulumiAwsLib.autoscalingScheduleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScheduleState extends js.Object {
  /**
    * The ARN assigned by AWS to the autoscaling schedule.
    */
  val arn: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The name or Amazon Resource Name (ARN) of the Auto Scaling group.
    */
  val autoscalingGroupName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
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
  val scheduledActionName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * The time for this action to start, in "YYYY-MM-DDThh:mm:ssZ" format in UTC/GMT only (for example, 2014-06-01T00:00:00Z ).
    * If you try to schedule your action in the past, Auto Scaling returns an error message.
    */
  val startTime: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

