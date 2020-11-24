package typings.pulumiAws.inputMod.elasticache

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReplicationGroupClusterMode extends js.Object {
  
  /**
    * Specify the number of node groups (shards) for this Redis replication group. Changing this number will trigger an online resizing operation before other settings modifications.
    */
  var numNodeGroups: Input[Double] = js.native
  
  /**
    * Specify the number of replica nodes in each node group. Valid values are 0 to 5. Changing this number will force a new resource.
    */
  var replicasPerNodeGroup: Input[Double] = js.native
}
object ReplicationGroupClusterMode {
  
  @scala.inline
  def apply(numNodeGroups: Input[Double], replicasPerNodeGroup: Input[Double]): ReplicationGroupClusterMode = {
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
    def setNumNodeGroups(value: Input[Double]): Self = this.set("numNodeGroups", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicasPerNodeGroup(value: Input[Double]): Self = this.set("replicasPerNodeGroup", value.asInstanceOf[js.Any])
  }
}
