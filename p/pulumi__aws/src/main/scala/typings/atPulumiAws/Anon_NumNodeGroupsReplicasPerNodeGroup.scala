package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NumNodeGroupsReplicasPerNodeGroup extends js.Object {
  var numNodeGroups: Input[Double]
  var replicasPerNodeGroup: Input[Double]
}

object Anon_NumNodeGroupsReplicasPerNodeGroup {
  @scala.inline
  def apply(numNodeGroups: Input[Double], replicasPerNodeGroup: Input[Double]): Anon_NumNodeGroupsReplicasPerNodeGroup = {
    val __obj = js.Dynamic.literal(numNodeGroups = numNodeGroups.asInstanceOf[js.Any], replicasPerNodeGroup = replicasPerNodeGroup.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_NumNodeGroupsReplicasPerNodeGroup]
  }
}

