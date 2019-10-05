package typings.atPulumiAws.ssmMaintenanceWindowTaskMod

import typings.atPulumiAws.typesOutputMod.ssm.MaintenanceWindowTaskLoggingInfo
import typings.atPulumiAws.typesOutputMod.ssm.MaintenanceWindowTaskTarget
import typings.atPulumiAws.typesOutputMod.ssm.MaintenanceWindowTaskTaskInvocationParameters
import typings.atPulumiAws.typesOutputMod.ssm.MaintenanceWindowTaskTaskParameter
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
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
  val description: Output[js.UndefOr[String]] = js.native
  /**
    * A structure containing information about an Amazon S3 bucket to write instance-level logs to. Use `taskInvocationParameters` configuration block `runCommandParameters` configuration block `output_s3_*` arguments instead. Conflicts with `taskInvocationParameters`. Documented below.
    */
  val loggingInfo: Output[js.UndefOr[MaintenanceWindowTaskLoggingInfo]] = js.native
  /**
    * The maximum number of targets this task can be run for in parallel.
    */
  val maxConcurrency: Output[String] = js.native
  /**
    * The maximum number of errors allowed before this task stops being scheduled.
    */
  val maxErrors: Output[String] = js.native
  /**
    * The parameter name.
    */
  val name: Output[String] = js.native
  /**
    * The priority of the task in the Maintenance Window, the lower the number the higher the priority. Tasks in a Maintenance Window are scheduled in priority order with tasks that have the same priority scheduled in parallel.
    */
  val priority: Output[js.UndefOr[Double]] = js.native
  /**
    * The IAM service role to assume during task execution.
    */
  val serviceRoleArn: Output[String] = js.native
  /**
    * The targets (either instances or window target ids). Instances are specified using Key=InstanceIds,Values=instanceid1,instanceid2. Window target ids are specified using Key=WindowTargetIds,Values=window target id1, window target id2.
    */
  val targets: Output[js.Array[MaintenanceWindowTaskTarget]] = js.native
  /**
    * The ARN of the task to execute.
    */
  val taskArn: Output[String] = js.native
  /**
    * The parameters for task execution. This argument is conflict with `taskParameters` and `loggingInfo`.
    */
  val taskInvocationParameters: Output[js.UndefOr[MaintenanceWindowTaskTaskInvocationParameters]] = js.native
  /**
    * A structure containing information about parameters required by the particular `taskArn`. Use `parameter` configuration blocks under the `taskInvocationParameters` configuration block instead. Conflicts with `taskInvocationParameters`. Documented below.
    */
  val taskParameters: Output[js.UndefOr[js.Array[MaintenanceWindowTaskTaskParameter]]] = js.native
  /**
    * The type of task being registered. The only allowed value is `RUN_COMMAND`.
    */
  val taskType: Output[String] = js.native
  /**
    * The Id of the maintenance window to register the task with.
    */
  val windowId: Output[String] = js.native
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
  def get(name: String, id: Input[ID]): MaintenanceWindowTask = js.native
  def get(name: String, id: Input[ID], state: MaintenanceWindowTaskState): MaintenanceWindowTask = js.native
  def get(name: String, id: Input[ID], state: MaintenanceWindowTaskState, opts: CustomResourceOptions): MaintenanceWindowTask = js.native
  /**
    * Returns true if the given object is an instance of MaintenanceWindowTask.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/ssm/maintenanceWindowTask.MaintenanceWindowTask */ Boolean = js.native
}

