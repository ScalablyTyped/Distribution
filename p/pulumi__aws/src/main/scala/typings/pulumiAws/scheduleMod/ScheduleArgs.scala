package typings.pulumiAws.scheduleMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduleArgs extends js.Object {
  /**
    * The name or Amazon Resource Name (ARN) of the Auto Scaling group.
    */
  val autoscalingGroupName: Input[String] = js.native
  /**
    * The number of EC2 instances that should be running in the group. Default 0.  Set to -1 if you don't want to change the desired capacity at the scheduled time.
    */
  val desiredCapacity: js.UndefOr[Input[Double]] = js.native
  /**
    * The time for this action to end, in "YYYY-MM-DDThh:mm:ssZ" format in UTC/GMT only (for example, 2014-06-01T00:00:00Z ).
    * If you try to schedule your action in the past, Auto Scaling returns an error message.
    */
  val endTime: js.UndefOr[Input[String]] = js.native
  /**
    * The maximum size for the Auto Scaling group. Default 0.
    * Set to -1 if you don't want to change the maximum size at the scheduled time.
    */
  val maxSize: js.UndefOr[Input[Double]] = js.native
  /**
    * The minimum size for the Auto Scaling group. Default 0.
    * Set to -1 if you don't want to change the minimum size at the scheduled time.
    */
  val minSize: js.UndefOr[Input[Double]] = js.native
  /**
    * The time when recurring future actions will start. Start time is specified by the user following the Unix cron syntax format.
    */
  val recurrence: js.UndefOr[Input[String]] = js.native
  /**
    * The name of this scaling action.
    */
  val scheduledActionName: Input[String] = js.native
  /**
    * The time for this action to start, in "YYYY-MM-DDThh:mm:ssZ" format in UTC/GMT only (for example, 2014-06-01T00:00:00Z ).
    * If you try to schedule your action in the past, Auto Scaling returns an error message.
    */
  val startTime: js.UndefOr[Input[String]] = js.native
}

object ScheduleArgs {
  @scala.inline
  def apply(autoscalingGroupName: Input[String], scheduledActionName: Input[String]): ScheduleArgs = {
    val __obj = js.Dynamic.literal(autoscalingGroupName = autoscalingGroupName.asInstanceOf[js.Any], scheduledActionName = scheduledActionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduleArgs]
  }
  @scala.inline
  implicit class ScheduleArgsOps[Self <: ScheduleArgs] (val x: Self) extends AnyVal {
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
    def setScheduledActionName(value: Input[String]): Self = this.set("scheduledActionName", value.asInstanceOf[js.Any])
    @scala.inline
    def setDesiredCapacity(value: Input[Double]): Self = this.set("desiredCapacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDesiredCapacity: Self = this.set("desiredCapacity", js.undefined)
    @scala.inline
    def setEndTime(value: Input[String]): Self = this.set("endTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    @scala.inline
    def setMaxSize(value: Input[Double]): Self = this.set("maxSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxSize: Self = this.set("maxSize", js.undefined)
    @scala.inline
    def setMinSize(value: Input[Double]): Self = this.set("minSize", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinSize: Self = this.set("minSize", js.undefined)
    @scala.inline
    def setRecurrence(value: Input[String]): Self = this.set("recurrence", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecurrence: Self = this.set("recurrence", js.undefined)
    @scala.inline
    def setStartTime(value: Input[String]): Self = this.set("startTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
  }
  
}

