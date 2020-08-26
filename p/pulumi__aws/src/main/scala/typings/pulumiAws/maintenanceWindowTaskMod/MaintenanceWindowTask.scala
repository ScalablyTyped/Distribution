package typings.pulumiAws.maintenanceWindowTaskMod

import typings.pulumiAws.outputMod.ssm.MaintenanceWindowTaskLoggingInfo
import typings.pulumiAws.outputMod.ssm.MaintenanceWindowTaskTarget
import typings.pulumiAws.outputMod.ssm.MaintenanceWindowTaskTaskInvocationParameters
import typings.pulumiAws.outputMod.ssm.MaintenanceWindowTaskTaskParameter
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ssm/maintenanceWindowTask", "MaintenanceWindowTask")
@js.native
class MaintenanceWindowTask protected () extends CustomResource {
  /**
    * Create a MaintenanceWindowTask resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: MaintenanceWindowTaskArgs) = this()
  def this(name: String, args: MaintenanceWindowTaskArgs, opts: CustomResourceOptions) = this()
  /**
    * The description of the maintenance window task.
    */
  val description: Output_[js.UndefOr[String]] = js.native
  /**
    * A structure containing information about an Amazon S3 bucket to write instance-level logs to. Use `taskInvocationParameters` configuration block `runCommandParameters` configuration block `output_s3_*` arguments instead. Conflicts with `taskInvocationParameters`. Documented below.
    *
    * @deprecated use 'task_invocation_parameters' argument instead
    */
  val loggingInfo: Output_[js.UndefOr[MaintenanceWindowTaskLoggingInfo]] = js.native
  /**
    * The maximum number of targets this task can be run for in parallel.
    */
  val maxConcurrency: Output_[String] = js.native
  /**
    * The maximum number of errors allowed before this task stops being scheduled.
    */
  val maxErrors: Output_[String] = js.native
  /**
    * The name of the maintenance window task.
    */
  val name: Output_[String] = js.native
  /**
    * The priority of the task in the Maintenance Window, the lower the number the higher the priority. Tasks in a Maintenance Window are scheduled in priority order with tasks that have the same priority scheduled in parallel.
    */
  val priority: Output_[js.UndefOr[Double]] = js.native
  /**
    * The role that should be assumed when executing the task.
    */
  val serviceRoleArn: Output_[String] = js.native
  /**
    * The targets (either instances or window target ids). Instances are specified using Key=InstanceIds,Values=instanceid1,instanceid2. Window target ids are specified using Key=WindowTargetIds,Values=window target id1, window target id2.
    */
  val targets: Output_[js.Array[MaintenanceWindowTaskTarget]] = js.native
  /**
    * The ARN of the task to execute.
    */
  val taskArn: Output_[String] = js.native
  /**
    * The parameters for task execution. This argument is conflict with `taskParameters` and `loggingInfo`.
    */
  val taskInvocationParameters: Output_[js.UndefOr[MaintenanceWindowTaskTaskInvocationParameters]] = js.native
  /**
    * A structure containing information about parameters required by the particular `taskArn`. Use `parameter` configuration blocks under the `taskInvocationParameters` configuration block instead. Conflicts with `taskInvocationParameters`. Documented below.
    *
    * @deprecated use 'task_invocation_parameters' argument instead
    */
  val taskParameters: Output_[js.UndefOr[js.Array[MaintenanceWindowTaskTaskParameter]]] = js.native
  /**
    * The type of task being registered. The only allowed value is `RUN_COMMAND`.
    */
  val taskType: Output_[String] = js.native
  /**
    * The Id of the maintenance window to register the task with.
    */
  val windowId: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/ssm/maintenanceWindowTask", "MaintenanceWindowTask")
@js.native
object MaintenanceWindowTask extends js.Object {
  /**
    * Get an existing MaintenanceWindowTask resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): MaintenanceWindowTask = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): MaintenanceWindowTask = js.native
  def get(name: String, id: Input[ID], state: MaintenanceWindowTaskState): MaintenanceWindowTask = js.native
  def get(name: String, id: Input[ID], state: MaintenanceWindowTaskState, opts: CustomResourceOptions): MaintenanceWindowTask = js.native
  /**
    * Returns true if the given object is an instance of MaintenanceWindowTask.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/maintenanceWindowTask.MaintenanceWindowTask */ Boolean = js.native
}

