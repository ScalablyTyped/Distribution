package typings.pulumiAws.replicationTaskMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicationTaskState extends js.Object {
  /**
    * The Unix timestamp integer for the start of the Change Data Capture (CDC) operation.
    */
  val cdcStartTime: js.UndefOr[Input[String]] = js.native
  /**
    * The migration type. Can be one of `full-load | cdc | full-load-and-cdc`.
    */
  val migrationType: js.UndefOr[Input[String]] = js.native
  /**
    * The Amazon Resource Name (ARN) of the replication instance.
    */
  val replicationInstanceArn: js.UndefOr[Input[String]] = js.native
  /**
    * The Amazon Resource Name (ARN) for the replication task.
    */
  val replicationTaskArn: js.UndefOr[Input[String]] = js.native
  /**
    * The replication task identifier.
    */
  val replicationTaskId: js.UndefOr[Input[String]] = js.native
  /**
    * An escaped JSON string that contains the task settings. For a complete list of task settings, see [Task Settings for AWS Database Migration Service Tasks](http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TaskSettings.html).
    */
  val replicationTaskSettings: js.UndefOr[Input[String]] = js.native
  /**
    * The Amazon Resource Name (ARN) string that uniquely identifies the source endpoint.
    */
  val sourceEndpointArn: js.UndefOr[Input[String]] = js.native
  /**
    * An escaped JSON string that contains the table mappings. For information on table mapping see [Using Table Mapping with an AWS Database Migration Service Task to Select and Filter Data](http://docs.aws.amazon.com/dms/latest/userguide/CHAP_Tasks.CustomizingTasks.TableMapping.html)
    */
  val tableMappings: js.UndefOr[Input[String]] = js.native
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * The Amazon Resource Name (ARN) string that uniquely identifies the target endpoint.
    */
  val targetEndpointArn: js.UndefOr[Input[String]] = js.native
}

object ReplicationTaskState {
  @scala.inline
  def apply(): ReplicationTaskState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReplicationTaskState]
  }
  @scala.inline
  implicit class ReplicationTaskStateOps[Self <: ReplicationTaskState] (val x: Self) extends AnyVal {
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
    def setCdcStartTime(value: Input[String]): Self = this.set("cdcStartTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCdcStartTime: Self = this.set("cdcStartTime", js.undefined)
    @scala.inline
    def setMigrationType(value: Input[String]): Self = this.set("migrationType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMigrationType: Self = this.set("migrationType", js.undefined)
    @scala.inline
    def setReplicationInstanceArn(value: Input[String]): Self = this.set("replicationInstanceArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicationInstanceArn: Self = this.set("replicationInstanceArn", js.undefined)
    @scala.inline
    def setReplicationTaskArn(value: Input[String]): Self = this.set("replicationTaskArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicationTaskArn: Self = this.set("replicationTaskArn", js.undefined)
    @scala.inline
    def setReplicationTaskId(value: Input[String]): Self = this.set("replicationTaskId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicationTaskId: Self = this.set("replicationTaskId", js.undefined)
    @scala.inline
    def setReplicationTaskSettings(value: Input[String]): Self = this.set("replicationTaskSettings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicationTaskSettings: Self = this.set("replicationTaskSettings", js.undefined)
    @scala.inline
    def setSourceEndpointArn(value: Input[String]): Self = this.set("sourceEndpointArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceEndpointArn: Self = this.set("sourceEndpointArn", js.undefined)
    @scala.inline
    def setTableMappings(value: Input[String]): Self = this.set("tableMappings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTableMappings: Self = this.set("tableMappings", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setTargetEndpointArn(value: Input[String]): Self = this.set("targetEndpointArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetEndpointArn: Self = this.set("targetEndpointArn", js.undefined)
  }
  
}

