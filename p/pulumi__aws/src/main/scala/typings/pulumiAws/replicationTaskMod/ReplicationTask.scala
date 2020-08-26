package typings.pulumiAws.replicationTaskMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/dms/replicationTask", "ReplicationTask")
@js.native
class ReplicationTask protected () extends CustomResource {
  /**
    * Create a ReplicationTask resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String, args: ReplicationTaskArgs) = this()
  def this(name: String, args: ReplicationTaskArgs, opts: CustomResourceOptions) = this()
  /**
    * The Unix timestamp integer for the start of the Change Data Capture (CDC) operation.
    */
  val cdcStartTime: Output_[js.UndefOr[String]] = js.native
  /**
    * The migration type. Can be one of `full-load | cdc | full-load-and-cdc`.
    */
  val migrationType: Output_[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the replication instance.
    */
  val replicationInstanceArn: Output_[String] = js.native
  /**
    * The Amazon Resource Name (ARN) for the replication task.
    */
  val replicationTaskArn: Output_[String] = js.native
  /**
    * The replication task identifier.
    */
  val replicationTaskId: Output_[String] = js.native
  /**
    * An escaped JSON string that contains the task settings. For a complete list of task settings, see [Task Settings for AWS Database Migration Service Tasks](http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TaskSettings.html).
    */
  val replicationTaskSettings: Output_[js.UndefOr[String]] = js.native
  /**
    * The Amazon Resource Name (ARN) string that uniquely identifies the source endpoint.
    */
  val sourceEndpointArn: Output_[String] = js.native
  /**
    * An escaped JSON string that contains the table mappings. For information on table mapping see [Using Table Mapping with an AWS Database Migration Service Task to Select and Filter Data](http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TableMapping.html)
    */
  val tableMappings: Output_[String] = js.native
  /**
    * A map of tags to assign to the resource.
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  /**
    * The Amazon Resource Name (ARN) string that uniquely identifies the target endpoint.
    */
  val targetEndpointArn: Output_[String] = js.native
}

/* static members */
@JSImport("@pulumi/aws/dms/replicationTask", "ReplicationTask")
@js.native
object ReplicationTask extends js.Object {
  /**
    * Get an existing ReplicationTask resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): ReplicationTask = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): ReplicationTask = js.native
  def get(name: String, id: Input[ID], state: ReplicationTaskState): ReplicationTask = js.native
  def get(name: String, id: Input[ID], state: ReplicationTaskState, opts: CustomResourceOptions): ReplicationTask = js.native
  /**
    * Returns true if the given object is an instance of ReplicationTask.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dms/replicationTask.ReplicationTask */ Boolean = js.native
}

