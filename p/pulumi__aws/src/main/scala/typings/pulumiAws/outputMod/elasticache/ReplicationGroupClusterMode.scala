package typings.pulumiAws.outputMod.elasticache

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReplicationGroupClusterMode extends js.Object {
  /**
    * Specify the number of node groups (shards) for this Redis replication group. Changing this number will trigger an online resizing operation before other settings modifications.
    */
  var numNodeGroups: Double = js.native
  /**
    * Specify the number of replica nodes in each node group. Valid values are 0 to 5. Changing this number will force a new resource.
    */
  var replicasPerNodeGroup: Double = js.native
}

object ReplicationGroupClusterMode {
  @scala.inline
  def apply(numNodeGroups: Double, replicasPerNodeGroup: Double): ReplicationGroupClusterMode = {
    val __obj = js.Dynamic.literal(numNodeGroups = numNodeGroups.asInstanceOf[js.Any], replicasPerNodeGroup = replicasPerNodeGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplicationGroupClusterMode]
  }
  @scala.inline
  implicit class ReplicationGroupClusterModeOps[Self <: ReplicationGroupClusterMode] (val x: Self) extends AnyVal {
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
    def setNumNodeGroups(value: Double): Self = this.set("numNodeGroups", value.asInstanceOf[js.Any])
    @scala.inline
    def setReplicasPerNodeGroup(value: Double): Self = this.set("replicasPerNodeGroup", value.asInstanceOf[js.Any])
  }
  
}

