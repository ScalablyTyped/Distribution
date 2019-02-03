package typings
package atPulumiAwsLib.datasyncTaskMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/datasync/task", "Task")
@js.native
class Task protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a Task resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String, args: TaskArgs) = this()
  def this(name: java.lang.String, args: TaskArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * Amazon Resource Name (ARN) of the DataSync Task.
    */
  val arn: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * Amazon Resource Name (ARN) of the CloudWatch Log Group that is used to monitor and log events in the sync task.
    */
  val cloudwatchLogGroupArn: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[atPulumiAwsLib.arnMod.ARN]] = js.native
  /**
    * Amazon Resource Name (ARN) of destination DataSync Location.
    */
  val destinationLocationArn: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiAwsLib.arnMod.ARN] = js.native
  /**
    * Name of the DataSync Task.
    */
  val name: atPulumiPulumiLib.atPulumiPulumiMod.Output[java.lang.String] = js.native
  /**
    * Configuration block containing option that controls the default behavior when you start an execution of this DataSync Task. For each individual task execution, you can override these options by specifying an overriding configuration in those executions.
    */
  val options: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[atPulumiAwsLib.Anon_Atime]] = js.native
  /**
    * Amazon Resource Name (ARN) of source DataSync Location.
    */
  val sourceLocationArn: atPulumiPulumiLib.atPulumiPulumiMod.Output[atPulumiAwsLib.arnMod.ARN] = js.native
  /**
    * Key-value pairs of resource tags to assign to the DataSync Task.
    */
  val tags: atPulumiPulumiLib.atPulumiPulumiMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[java.lang.String]]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/datasync/task", "Task")
@js.native
object Task extends js.Object {
  /**
    * Get an existing Task resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.datasyncTaskMod.Task = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.datasyncTaskMod.TaskState
  ): atPulumiAwsLib.datasyncTaskMod.Task = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.resourceMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.datasyncTaskMod.TaskState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.datasyncTaskMod.Task = js.native
}

