package typings.atPulumiAws.ssmMaintenanceWindowTaskMod

import typings.atPulumiAws.typesInputMod.ssm.MaintenanceWindowTaskLoggingInfo
import typings.atPulumiAws.typesInputMod.ssm.MaintenanceWindowTaskTarget
import typings.atPulumiAws.typesInputMod.ssm.MaintenanceWindowTaskTaskInvocationParameters
import typings.atPulumiAws.typesInputMod.ssm.MaintenanceWindowTaskTaskParameter
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaintenanceWindowTaskState extends js.Object {
  /**
    * The description of the maintenance window task.
    */
  val description: js.UndefOr[Input[String]] = js.undefined
  /**
    * A structure containing information about an Amazon S3 bucket to write instance-level logs to. Use `taskInvocationParameters` configuration block `runCommandParameters` configuration block `output_s3_*` arguments instead. Conflicts with `taskInvocationParameters`. Documented below.
    */
  val loggingInfo: js.UndefOr[Input[MaintenanceWindowTaskLoggingInfo]] = js.undefined
  /**
    * The maximum number of targets this task can be run for in parallel.
    */
  val maxConcurrency: js.UndefOr[Input[String]] = js.undefined
  /**
    * The maximum number of errors allowed before this task stops being scheduled.
    */
  val maxErrors: js.UndefOr[Input[String]] = js.undefined
  /**
    * The parameter name.
    */
  val name: js.UndefOr[Input[String]] = js.undefined
  /**
    * The priority of the task in the Maintenance Window, the lower the number the higher the priority. Tasks in a Maintenance Window are scheduled in priority order with tasks that have the same priority scheduled in parallel.
    */
  val priority: js.UndefOr[Input[Double]] = js.undefined
  /**
    * The IAM service role to assume during task execution.
    */
  val serviceRoleArn: js.UndefOr[Input[String]] = js.undefined
  /**
    * The targets (either instances or window target ids). Instances are specified using Key=InstanceIds,Values=instanceid1,instanceid2. Window target ids are specified using Key=WindowTargetIds,Values=window target id1, window target id2.
    */
  val targets: js.UndefOr[Input[js.Array[Input[MaintenanceWindowTaskTarget]]]] = js.undefined
  /**
    * The ARN of the task to execute.
    */
  val taskArn: js.UndefOr[Input[String]] = js.undefined
  /**
    * The parameters for task execution. This argument is conflict with `taskParameters` and `loggingInfo`.
    */
  val taskInvocationParameters: js.UndefOr[Input[MaintenanceWindowTaskTaskInvocationParameters]] = js.undefined
  /**
    * A structure containing information about parameters required by the particular `taskArn`. Use `parameter` configuration blocks under the `taskInvocationParameters` configuration block instead. Conflicts with `taskInvocationParameters`. Documented below.
    */
  val taskParameters: js.UndefOr[Input[js.Array[Input[MaintenanceWindowTaskTaskParameter]]]] = js.undefined
  /**
    * The type of task being registered. The only allowed value is `RUN_COMMAND`.
    */
  val taskType: js.UndefOr[Input[String]] = js.undefined
  /**
    * The Id of the maintenance window to register the task with.
    */
  val windowId: js.UndefOr[Input[String]] = js.undefined
}

object MaintenanceWindowTaskState {
  @scala.inline
  def apply(
    description: Input[String] = null,
    loggingInfo: Input[MaintenanceWindowTaskLoggingInfo] = null,
    maxConcurrency: Input[String] = null,
    maxErrors: Input[String] = null,
    name: Input[String] = null,
    priority: Input[Double] = null,
    serviceRoleArn: Input[String] = null,
    targets: Input[js.Array[Input[MaintenanceWindowTaskTarget]]] = null,
    taskArn: Input[String] = null,
    taskInvocationParameters: Input[MaintenanceWindowTaskTaskInvocationParameters] = null,
    taskParameters: Input[js.Array[Input[MaintenanceWindowTaskTaskParameter]]] = null,
    taskType: Input[String] = null,
    windowId: Input[String] = null
  ): MaintenanceWindowTaskState = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (loggingInfo != null) __obj.updateDynamic("loggingInfo")(loggingInfo.asInstanceOf[js.Any])
    if (maxConcurrency != null) __obj.updateDynamic("maxConcurrency")(maxConcurrency.asInstanceOf[js.Any])
    if (maxErrors != null) __obj.updateDynamic("maxErrors")(maxErrors.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (serviceRoleArn != null) __obj.updateDynamic("serviceRoleArn")(serviceRoleArn.asInstanceOf[js.Any])
    if (targets != null) __obj.updateDynamic("targets")(targets.asInstanceOf[js.Any])
    if (taskArn != null) __obj.updateDynamic("taskArn")(taskArn.asInstanceOf[js.Any])
    if (taskInvocationParameters != null) __obj.updateDynamic("taskInvocationParameters")(taskInvocationParameters.asInstanceOf[js.Any])
    if (taskParameters != null) __obj.updateDynamic("taskParameters")(taskParameters.asInstanceOf[js.Any])
    if (taskType != null) __obj.updateDynamic("taskType")(taskType.asInstanceOf[js.Any])
    if (windowId != null) __obj.updateDynamic("windowId")(windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaintenanceWindowTaskState]
  }
}

