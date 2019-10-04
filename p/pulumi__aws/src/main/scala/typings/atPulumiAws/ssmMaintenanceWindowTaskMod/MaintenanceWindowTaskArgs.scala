package typings.atPulumiAws.ssmMaintenanceWindowTaskMod

import typings.atPulumiAws.typesInputMod.ssmNs.MaintenanceWindowTaskLoggingInfo
import typings.atPulumiAws.typesInputMod.ssmNs.MaintenanceWindowTaskTarget
import typings.atPulumiAws.typesInputMod.ssmNs.MaintenanceWindowTaskTaskInvocationParameters
import typings.atPulumiAws.typesInputMod.ssmNs.MaintenanceWindowTaskTaskParameter
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MaintenanceWindowTaskArgs extends js.Object {
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
  val maxConcurrency: Input[String]
  /**
    * The maximum number of errors allowed before this task stops being scheduled.
    */
  val maxErrors: Input[String]
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
  val serviceRoleArn: Input[String]
  /**
    * The targets (either instances or window target ids). Instances are specified using Key=InstanceIds,Values=instanceid1,instanceid2. Window target ids are specified using Key=WindowTargetIds,Values=window target id1, window target id2.
    */
  val targets: Input[js.Array[Input[MaintenanceWindowTaskTarget]]]
  /**
    * The ARN of the task to execute.
    */
  val taskArn: Input[String]
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
  val taskType: Input[String]
  /**
    * The Id of the maintenance window to register the task with.
    */
  val windowId: Input[String]
}

object MaintenanceWindowTaskArgs {
  @scala.inline
  def apply(
    maxConcurrency: Input[String],
    maxErrors: Input[String],
    serviceRoleArn: Input[String],
    targets: Input[js.Array[Input[MaintenanceWindowTaskTarget]]],
    taskArn: Input[String],
    taskType: Input[String],
    windowId: Input[String],
    description: Input[String] = null,
    loggingInfo: Input[MaintenanceWindowTaskLoggingInfo] = null,
    name: Input[String] = null,
    priority: Input[Double] = null,
    taskInvocationParameters: Input[MaintenanceWindowTaskTaskInvocationParameters] = null,
    taskParameters: Input[js.Array[Input[MaintenanceWindowTaskTaskParameter]]] = null
  ): MaintenanceWindowTaskArgs = {
    val __obj = js.Dynamic.literal(maxConcurrency = maxConcurrency.asInstanceOf[js.Any], maxErrors = maxErrors.asInstanceOf[js.Any], serviceRoleArn = serviceRoleArn.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any], taskArn = taskArn.asInstanceOf[js.Any], taskType = taskType.asInstanceOf[js.Any], windowId = windowId.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (loggingInfo != null) __obj.updateDynamic("loggingInfo")(loggingInfo.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (taskInvocationParameters != null) __obj.updateDynamic("taskInvocationParameters")(taskInvocationParameters.asInstanceOf[js.Any])
    if (taskParameters != null) __obj.updateDynamic("taskParameters")(taskParameters.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaintenanceWindowTaskArgs]
  }
}

