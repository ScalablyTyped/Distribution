package typings.pulumiAws.maintenanceWindowTaskMod

import typings.pulumiAws.inputMod.ssm.MaintenanceWindowTaskTarget
import typings.pulumiAws.inputMod.ssm.MaintenanceWindowTaskTaskInvocationParameters
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaintenanceWindowTaskArgs extends js.Object {
  
  /**
    * The description of the maintenance window task.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * The maximum number of targets this task can be run for in parallel.
    */
  val maxConcurrency: Input[String] = js.native
  
  /**
    * The maximum number of errors allowed before this task stops being scheduled.
    */
  val maxErrors: Input[String] = js.native
  
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
  val serviceRoleArn: Input[String] = js.native
  
  /**
    * The targets (either instances or window target ids). Instances are specified using Key=InstanceIds,Values=instanceid1,instanceid2. Window target ids are specified using Key=WindowTargetIds,Values=window target id1, window target id2.
    */
  val targets: Input[js.Array[Input[MaintenanceWindowTaskTarget]]] = js.native
  
  /**
    * The ARN of the task to execute.
    */
  val taskArn: Input[String] = js.native
  
  /**
    * Configuration block with parameters for task execution.
    */
  val taskInvocationParameters: js.UndefOr[Input[MaintenanceWindowTaskTaskInvocationParameters]] = js.native
  
  /**
    * The type of task being registered. The only allowed value is `RUN_COMMAND`.
    */
  val taskType: Input[String] = js.native
  
  /**
    * The Id of the maintenance window to register the task with.
    */
  val windowId: Input[String] = js.native
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
    windowId: Input[String]
  ): MaintenanceWindowTaskArgs = {
    val __obj = js.Dynamic.literal(maxConcurrency = maxConcurrency.asInstanceOf[js.Any], maxErrors = maxErrors.asInstanceOf[js.Any], serviceRoleArn = serviceRoleArn.asInstanceOf[js.Any], targets = targets.asInstanceOf[js.Any], taskArn = taskArn.asInstanceOf[js.Any], taskType = taskType.asInstanceOf[js.Any], windowId = windowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MaintenanceWindowTaskArgs]
  }
  
  @scala.inline
  implicit class MaintenanceWindowTaskArgsOps[Self <: MaintenanceWindowTaskArgs] (val x: Self) extends AnyVal {
    
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
    def setMaxConcurrency(value: Input[String]): Self = this.set("maxConcurrency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxErrors(value: Input[String]): Self = this.set("maxErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceRoleArn(value: Input[String]): Self = this.set("serviceRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetsVarargs(value: Input[MaintenanceWindowTaskTarget]*): Self = this.set("targets", js.Array(value :_*))
    
    @scala.inline
    def setTargets(value: Input[js.Array[Input[MaintenanceWindowTaskTarget]]]): Self = this.set("targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskArn(value: Input[String]): Self = this.set("taskArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskType(value: Input[String]): Self = this.set("taskType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowId(value: Input[String]): Self = this.set("windowId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setPriority(value: Input[Double]): Self = this.set("priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePriority: Self = this.set("priority", js.undefined)
    
    @scala.inline
    def setTaskInvocationParameters(value: Input[MaintenanceWindowTaskTaskInvocationParameters]): Self = this.set("taskInvocationParameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaskInvocationParameters: Self = this.set("taskInvocationParameters", js.undefined)
  }
}
