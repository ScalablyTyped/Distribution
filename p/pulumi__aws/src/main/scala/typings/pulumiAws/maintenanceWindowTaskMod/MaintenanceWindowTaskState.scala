package typings.pulumiAws.maintenanceWindowTaskMod

import typings.pulumiAws.inputMod.ssm.MaintenanceWindowTaskLoggingInfo
import typings.pulumiAws.inputMod.ssm.MaintenanceWindowTaskTarget
import typings.pulumiAws.inputMod.ssm.MaintenanceWindowTaskTaskInvocationParameters
import typings.pulumiAws.inputMod.ssm.MaintenanceWindowTaskTaskParameter
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaintenanceWindowTaskState extends js.Object {
  /**
    * The description of the maintenance window task.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * A structure containing information about an Amazon S3 bucket to write instance-level logs to. Use `taskInvocationParameters` configuration block `runCommandParameters` configuration block `output_s3_*` arguments instead. Conflicts with `taskInvocationParameters`. Documented below.
    *
    * @deprecated use 'task_invocation_parameters' argument instead
    */
  val loggingInfo: js.UndefOr[Input[MaintenanceWindowTaskLoggingInfo]] = js.native
  /**
    * The maximum number of targets this task can be run for in parallel.
    */
  val maxConcurrency: js.UndefOr[Input[String]] = js.native
  /**
    * The maximum number of errors allowed before this task stops being scheduled.
    */
  val maxErrors: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the maintenance window task.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * The priority of the task in the Maintenance Window, the lower the number the higher the priority. Tasks in a Maintenance Window are scheduled in priority order with tasks that have the same priority scheduled in parallel.
    */
  val priority: js.UndefOr[Input[Double]] = js.native
  /**
    * The role that should be assumed when executing the task.
    */
  val serviceRoleArn: js.UndefOr[Input[String]] = js.native
  /**
    * The targets (either instances or window target ids). Instances are specified using Key=InstanceIds,Values=instanceid1,instanceid2. Window target ids are specified using Key=WindowTargetIds,Values=window target id1, window target id2.
    */
  val targets: js.UndefOr[Input[js.Array[Input[MaintenanceWindowTaskTarget]]]] = js.native
  /**
    * The ARN of the task to execute.
    */
  val taskArn: js.UndefOr[Input[String]] = js.native
  /**
    * The parameters for task execution. This argument is conflict with `taskParameters` and `loggingInfo`.
    */
  val taskInvocationParameters: js.UndefOr[Input[MaintenanceWindowTaskTaskInvocationParameters]] = js.native
  /**
    * A structure containing information about parameters required by the particular `taskArn`. Use `parameter` configuration blocks under the `taskInvocationParameters` configuration block instead. Conflicts with `taskInvocationParameters`. Documented below.
    *
    * @deprecated use 'task_invocation_parameters' argument instead
    */
  val taskParameters: js.UndefOr[Input[js.Array[Input[MaintenanceWindowTaskTaskParameter]]]] = js.native
  /**
    * The type of task being registered. The only allowed value is `RUN_COMMAND`.
    */
  val taskType: js.UndefOr[Input[String]] = js.native
  /**
    * The Id of the maintenance window to register the task with.
    */
  val windowId: js.UndefOr[Input[String]] = js.native
}

object MaintenanceWindowTaskState {
  @scala.inline
  def apply(): MaintenanceWindowTaskState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaintenanceWindowTaskState]
  }
  @scala.inline
  implicit class MaintenanceWindowTaskStateOps[Self <: MaintenanceWindowTaskState] (val x: Self) extends AnyVal {
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
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setLoggingInfo(value: Input[MaintenanceWindowTaskLoggingInfo]): Self = this.set("loggingInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoggingInfo: Self = this.set("loggingInfo", js.undefined)
    @scala.inline
    def setMaxConcurrency(value: Input[String]): Self = this.set("maxConcurrency", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxConcurrency: Self = this.set("maxConcurrency", js.undefined)
    @scala.inline
    def setMaxErrors(value: Input[String]): Self = this.set("maxErrors", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxErrors: Self = this.set("maxErrors", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPriority(value: Input[Double]): Self = this.set("priority", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    @scala.inline
    def setServiceRoleArn(value: Input[String]): Self = this.set("serviceRoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteServiceRoleArn: Self = this.set("serviceRoleArn", js.undefined)
    @scala.inline
    def setTargetsVarargs(value: Input[MaintenanceWindowTaskTarget]*): Self = this.set("targets", js.Array(value :_*))
    @scala.inline
    def setTargets(value: Input[js.Array[Input[MaintenanceWindowTaskTarget]]]): Self = this.set("targets", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargets: Self = this.set("targets", js.undefined)
    @scala.inline
    def setTaskArn(value: Input[String]): Self = this.set("taskArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskArn: Self = this.set("taskArn", js.undefined)
    @scala.inline
    def setTaskInvocationParameters(value: Input[MaintenanceWindowTaskTaskInvocationParameters]): Self = this.set("taskInvocationParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskInvocationParameters: Self = this.set("taskInvocationParameters", js.undefined)
    @scala.inline
    def setTaskParametersVarargs(value: Input[MaintenanceWindowTaskTaskParameter]*): Self = this.set("taskParameters", js.Array(value :_*))
    @scala.inline
    def setTaskParameters(value: Input[js.Array[Input[MaintenanceWindowTaskTaskParameter]]]): Self = this.set("taskParameters", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskParameters: Self = this.set("taskParameters", js.undefined)
    @scala.inline
    def setTaskType(value: Input[String]): Self = this.set("taskType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTaskType: Self = this.set("taskType", js.undefined)
    @scala.inline
    def setWindowId(value: Input[String]): Self = this.set("windowId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWindowId: Self = this.set("windowId", js.undefined)
  }
  
}

