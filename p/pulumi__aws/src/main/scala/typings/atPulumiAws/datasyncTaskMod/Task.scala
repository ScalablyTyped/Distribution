package typings.atPulumiAws.datasyncTaskMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_Atime
import typings.atPulumiAws.arnMod.ARN
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/datasync/task", "Task")
@js.native
class Task protected () extends CustomResource {
  /**
    * Create a Task resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: TaskArgs) = this()
  def this(name: String, args: TaskArgs, opts: CustomResourceOptions) = this()
  /**
    * Amazon Resource Name (ARN) of the DataSync Task.
    */
  val arn: Output[String] = js.native
  /**
    * Amazon Resource Name (ARN) of the CloudWatch Log Group that is used to monitor and log events in the sync task.
    */
  val cloudwatchLogGroupArn: Output[js.UndefOr[ARN]] = js.native
  /**
    * Amazon Resource Name (ARN) of destination DataSync Location.
    */
  val destinationLocationArn: Output[ARN] = js.native
  /**
    * Name of the DataSync Task.
    */
  val name: Output[String] = js.native
  /**
    * Configuration block containing option that controls the default behavior when you start an execution of this DataSync Task. For each individual task execution, you can override these options by specifying an overriding configuration in those executions.
    */
  val options: Output[js.UndefOr[Anon_Atime]] = js.native
  /**
    * Amazon Resource Name (ARN) of source DataSync Location.
    */
  val sourceLocationArn: Output[ARN] = js.native
  /**
    * Key-value pairs of resource tags to assign to the DataSync Task.
    */
  val tags: Output[js.UndefOr[StringDictionary[String]]] = js.native
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
  def get(name: String, id: Input[ID]): Task = js.native
  def get(name: String, id: Input[ID], state: TaskState): Task = js.native
  def get(name: String, id: Input[ID], state: TaskState, opts: CustomResourceOptions): Task = js.native
  /**
    * Returns true if the given object is an instance of Task.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/datasync/task.Task */ Boolean = js.native
}

