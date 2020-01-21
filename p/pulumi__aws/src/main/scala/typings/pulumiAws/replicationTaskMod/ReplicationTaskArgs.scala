package typings.pulumiAws.replicationTaskMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicationTaskArgs extends js.Object {
  /**
    * The Unix timestamp integer for the start of the Change Data Capture (CDC) operation.
    */
  val cdcStartTime: js.UndefOr[Input[String]] = js.native
  /**
    * The migration type. Can be one of `full-load | cdc | full-load-and-cdc`.
    */
  val migrationType: Input[String] = js.native
  /**
    * The Amazon Resource Name (ARN) of the replication instance.
    */
  val replicationInstanceArn: Input[String] = js.native
  /**
    * The replication task identifier.
    */
  val replicationTaskId: Input[String] = js.native
  /**
    * An escaped JSON string that contains the task settings. For a complete list of task settings, see [Task Settings for AWS Database Migration Service Tasks](http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TaskSettings.html).
    */
  val replicationTaskSettings: js.UndefOr[Input[String]] = js.native
  /**
    * The Amazon Resource Name (ARN) string that uniquely identifies the source endpoint.
    */
  val sourceEndpointArn: Input[String] = js.native
  /**
    * An escaped JSON string that contains the table mappings. For information on table mapping see [Using Table Mapping with an AWS Database Migration Service Task to Select and Filter Data](http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TableMapping.html)
    */
  val tableMappings: Input[String] = js.native
  /**
    * A mapping of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * The Amazon Resource Name (ARN) string that uniquely identifies the target endpoint.
    */
  val targetEndpointArn: Input[String] = js.native
}

object ReplicationTaskArgs {
  @scala.inline
  def apply(
    migrationType: Input[String],
    replicationInstanceArn: Input[String],
    replicationTaskId: Input[String],
    sourceEndpointArn: Input[String],
    tableMappings: Input[String],
    targetEndpointArn: Input[String],
    cdcStartTime: Input[String] = null,
    replicationTaskSettings: Input[String] = null,
    tags: Input[StringDictionary[_]] = null
  ): ReplicationTaskArgs = {
    val __obj = js.Dynamic.literal(migrationType = migrationType.asInstanceOf[js.Any], replicationInstanceArn = replicationInstanceArn.asInstanceOf[js.Any], replicationTaskId = replicationTaskId.asInstanceOf[js.Any], sourceEndpointArn = sourceEndpointArn.asInstanceOf[js.Any], tableMappings = tableMappings.asInstanceOf[js.Any], targetEndpointArn = targetEndpointArn.asInstanceOf[js.Any])
    if (cdcStartTime != null) __obj.updateDynamic("cdcStartTime")(cdcStartTime.asInstanceOf[js.Any])
    if (replicationTaskSettings != null) __obj.updateDynamic("replicationTaskSettings")(replicationTaskSettings.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationTaskArgs]
  }
}

