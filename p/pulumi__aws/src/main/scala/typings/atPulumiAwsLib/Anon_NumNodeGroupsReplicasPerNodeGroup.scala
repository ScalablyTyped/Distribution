package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_NumNodeGroupsReplicasPerNodeGroup extends js.Object {
  var numNodeGroups: atPulumiPulumiLib.outputMod.Input[scala.Double]
  var replicasPerNodeGroup: atPulumiPulumiLib.outputMod.Input[scala.Double]
}

object Anon_NumNodeGroupsReplicasPerNodeGroup {
  @scala.inline
  def apply(
    numNodeGroups: atPulumiPulumiLib.outputMod.Input[scala.Double],
    replicasPerNodeGroup: atPulumiPulumiLib.outputMod.Input[scala.Double]
  ): Anon_NumNodeGroupsReplicasPerNodeGroup = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("numNodeGroups")(numNodeGroups.asInstanceOf[js.Any])
    __obj.updateDynamic("replicasPerNodeGroup")(replicasPerNodeGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_NumNodeGroupsReplicasPerNodeGroup]
  }
}

