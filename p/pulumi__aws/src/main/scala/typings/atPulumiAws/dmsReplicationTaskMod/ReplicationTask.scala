package typings.atPulumiAws.dmsReplicationTaskMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
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
  val cdcStartTime: Output[js.UndefOr[String]] = js.native
  /**
    * The migration type. Can be one of `full-load | cdc | full-load-and-cdc`.
    */
  val migrationType: Output[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the replication instance.
    */
  val replicationInstanceArn: Output[String] = js.native
  /**
    * The Amazon Resource Name (ARN) for the replication task.
    */
  val replicationTaskArn: Output[String] = js.native
  /**
    * The replication task identifier.
    */
  val replicationTaskId: Output[String] = js.native
  /**
    * An escaped JSON string that contains the task settings. For a complete list of task settings, see [Task Settings for AWS Database Migration Service Tasks](http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TaskSettings.html).
    */
  val replicationTaskSettings: Output[js.UndefOr[String]] = js.native
  /**
    * The Amazon Resource Name (ARN) string that uniquely identifies the source endpoint.
    */
  val sourceEndpointArn: Output[String] = js.native
  /**
    * An escaped JSON string that contains the table mappings. For information on table mapping see [Using Table Mapping with an AWS Database Migration Service Task to Select and Filter Data](http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TableMapping.html)
    */
  val tableMappings: Output[String] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * The Amazon Resource Name (ARN) string that uniquely identifies the target endpoint.
    */
  val targetEndpointArn: Output[String] = js.native
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
    */
  def get(name: String, id: Input[ID]): ReplicationTask = js.native
  def get(name: String, id: Input[ID], state: ReplicationTaskState): ReplicationTask = js.native
  def get(name: String, id: Input[ID], state: ReplicationTaskState, opts: CustomResourceOptions): ReplicationTask = js.native
  /**
    * Returns true if the given object is an instance of ReplicationTask.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/dms/replicationTask.ReplicationTask */ Boolean = js.native
}

