package typings.atPulumiAws.appautoscalingScheduledActionMod

import typings.atPulumiAws.typesInputMod.appautoscaling.ScheduledActionScalableTargetAction
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScheduledActionArgs extends js.Object {
  /**
    * The date and time for the scheduled action to end. Specify the following format: 2006-01-02T15:04:05Z
    */
  val endTime: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the scheduled action.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * The identifier of the resource associated with the scheduled action. Documentation can be found in the parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_PutScheduledAction.html#ApplicationAutoScaling-PutScheduledAction-request-ResourceId)
    */
  val resourceId: Input[String]
  /**
    * The scalable dimension. Documentation can be found in the parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_PutScheduledAction.html#ApplicationAutoScaling-PutScheduledAction-request-ScalableDimension) Example: ecs:service:DesiredCount
    */
  val scalableDimension: js.UndefOr[Input[String]] = js.undefined
  /**
    * The new minimum and maximum capacity. You can set both values or just one. See below
    */
  val scalableTargetAction: js.UndefOr[Input[ScheduledActionScalableTargetAction]] = js.undefined
  /**
    * The schedule for this action. The following formats are supported: At expressions - at(yyyy-mm-ddThh:mm:ss), Rate expressions - rate(valueunit), Cron expressions - cron(fields). In UTC. Documentation can be found in the parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_PutScheduledAction.html#ApplicationAutoScaling-PutScheduledAction-request-Schedule)
    */
  val schedule: js.UndefOr[Input[String]] = js.undefined
  /**
    * The namespace of the AWS service. Documentation can be found in the parameter at: [AWS Application Auto Scaling API Reference](https://docs.aws.amazon.com/ApplicationAutoScaling/latest/APIReference/API_PutScheduledAction.html#ApplicationAutoScaling-PutScheduledAction-request-ServiceNamespace) Example: ecs
    */
  val serviceNamespace: Input[String]
  /**
    * The date and time for the scheduled action to start. Specify the following format: 2006-01-02T15:04:05Z
    */
  val startTime: js.UndefOr[Input[String]] = js.undefined
}

object ScheduledActionArgs {
  @scala.inline
  def apply(
    resourceId: Input[String],
    serviceNamespace: Input[String],
    endTime: Input[String] = null,
    name: Input[String] = null,
    scalableDimension: Input[String] = null,
    scalableTargetAction: Input[ScheduledActionScalableTargetAction] = null,
    schedule: Input[String] = null,
    startTime: Input[String] = null
  ): ScheduledActionArgs = {
    val __obj = js.Dynamic.literal(resourceId = resourceId.asInstanceOf[js.Any], serviceNamespace = serviceNamespace.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (scalableDimension != null) __obj.updateDynamic("scalableDimension")(scalableDimension.asInstanceOf[js.Any])
    if (scalableTargetAction != null) __obj.updateDynamic("scalableTargetAction")(scalableTargetAction.asInstanceOf[js.Any])
    if (schedule != null) __obj.updateDynamic("schedule")(schedule.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduledActionArgs]
  }
}

