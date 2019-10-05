package typings.atPulumiAws.typesOutputMod.elasticache

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplicationGroupClusterMode extends js.Object {
  /**
    * Specify the number of node groups (shards) for this Redis replication group. Changing this number will trigger an online resizing operation before other settings modifications.
    */
  var numNodeGroups: Double
  /**
    * Specify the number of replica nodes in each node group. Valid values are 0 to 5. Changing this number will force a new resource.
    */
  var replicasPerNodeGroup: Double
}

object ReplicationGroupClusterMode {
  @scala.inline
  def apply(numNodeGroups: Double, replicasPerNodeGroup: Double): ReplicationGroupClusterMode = {
    val __obj = js.Dynamic.literal(numNodeGroups = numNodeGroups, replicasPerNodeGroup = replicasPerNodeGroup)
  
    __obj.asInstanceOf[ReplicationGroupClusterMode]
  }
}

