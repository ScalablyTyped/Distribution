package typings.pulumiAws.replicationSubnetGroupMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicationSubnetGroupArgs extends js.Object {
  /**
    * The description for the subnet group.
    */
  val replicationSubnetGroupDescription: Input[String] = js.native
  /**
    * The name for the replication subnet group. This value is stored as a lowercase string.
    */
  val replicationSubnetGroupId: Input[String] = js.native
  /**
    * A list of the EC2 subnet IDs for the subnet group.
    */
  val subnetIds: Input[js.Array[Input[String]]] = js.native
  /**
    * A map of tags to assign to the resource.
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}

object ReplicationSubnetGroupArgs {
  @scala.inline
  def apply(
    replicationSubnetGroupDescription: Input[String],
    replicationSubnetGroupId: Input[String],
    subnetIds: Input[js.Array[Input[String]]]
  ): ReplicationSubnetGroupArgs = {
    val __obj = js.Dynamic.literal(replicationSubnetGroupDescription = replicationSubnetGroupDescription.asInstanceOf[js.Any], replicationSubnetGroupId = replicationSubnetGroupId.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationSubnetGroupArgs]
  }
  @scala.inline
  implicit class ReplicationSubnetGroupArgsOps[Self <: ReplicationSubnetGroupArgs] (val x: Self) extends AnyVal {
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
    def setReplicationSubnetGroupDescription(value: Input[String]): Self = this.set("replicationSubnetGroupDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def setReplicationSubnetGroupId(value: Input[String]): Self = this.set("replicationSubnetGroupId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSubnetIdsVarargs(value: Input[String]*): Self = this.set("subnetIds", js.Array(value :_*))
    @scala.inline
    def setSubnetIds(value: Input[js.Array[Input[String]]]): Self = this.set("subnetIds", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
  
}

