package typings
package atPulumiAwsLib.ssmMaintenanceWindowTaskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/ssm/maintenanceWindowTask", "MaintenanceWindowTask")
@js.native
class MaintenanceWindowTask protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a MaintenanceWindowTask resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: MaintenanceWindowTaskArgs) = this()
  def this(name: java.lang.String, args: MaintenanceWindowTaskArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * The description of the maintenance window task.
    */
  val description: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * A structure containing information about an Amazon S3 bucket to write instance-level logs to. Use `task_invocation_parameters` configuration block `run_command_parameters` configuration block `output_s3_*` arguments instead. Conflicts with `task_invocation_parameters`. Documented below.
    */
  val loggingInfo: atPulumiPulumiLib.outputMod.Output[js.UndefOr[atPulumiAwsLib.Anon_S3BucketNameS3BucketPrefix]] = js.native
  /**
    * The maximum number of targets this task can be run for in parallel.
    */
  val maxConcurrency: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The maximum number of errors allowed before this task stops being scheduled.
    */
  val maxErrors: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The parameter name.
    */
  val name: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The priority of the task in the Maintenance Window, the lower the number the higher the priority. Tasks in a Maintenance Window are scheduled in priority order with tasks that have the same priority scheduled in parallel.
    */
  val priority: atPulumiPulumiLib.outputMod.Output[js.UndefOr[scala.Double]] = js.native
  /**
    * The IAM service role to assume during task execution.
    */
  val serviceRoleArn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The targets (either instances or window target ids). Instances are specified using Key=InstanceIds,Values=instanceid1,instanceid2. Window target ids are specified using Key=WindowTargetIds,Values=window target id1, window target id2.
    */
  val targets: atPulumiPulumiLib.outputMod.Output[js.Array[atPulumiAwsLib.Anon_KeyValues]] = js.native
  /**
    * The ARN of the task to execute.
    */
  val taskArn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The parameters for task execution. This argument is conflict with `task_parameters` and `logging_info`.
    */
  val taskInvocationParameters: atPulumiPulumiLib.outputMod.Output[js.UndefOr[atPulumiAwsLib.Anon_AutomationParameters]] = js.native
  /**
    * A structure containing information about parameters required by the particular `task_arn`. Use `parameter` configuration blocks under the `task_invocation_parameters` configuration block instead. Conflicts with `task_invocation_parameters`. Documented below.
    */
  val taskParameters: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_NameValues]]] = js.native
  /**
    * The type of task being registered. The only allowed value is `RUN_COMMAND`.
    */
  val taskType: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * The Id of the maintenance window to register the task with.
    */
  val windowId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
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
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.ssmMaintenanceWindowTaskMod.MaintenanceWindowTask = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ssmMaintenanceWindowTaskMod.MaintenanceWindowTaskState
  ): atPulumiAwsLib.ssmMaintenanceWindowTaskMod.MaintenanceWindowTask = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.ssmMaintenanceWindowTaskMod.MaintenanceWindowTaskState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.ssmMaintenanceWindowTaskMod.MaintenanceWindowTask = js.native
  /**
    * Returns true if the given object is an instance of MaintenanceWindowTask.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/maintenanceWindowTask.MaintenanceWindowTask */ scala.Boolean = js.native
}

