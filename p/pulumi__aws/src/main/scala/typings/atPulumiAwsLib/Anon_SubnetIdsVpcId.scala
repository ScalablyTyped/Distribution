package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SubnetIdsVpcId extends js.Object {
  var subnetIds: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  var vpcId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_SubnetIdsVpcId {
  @scala.inline
  def apply(
    subnetIds: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]],
    vpcId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): Anon_SubnetIdsVpcId = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("subnetIds")(subnetIds.asInstanceOf[js.Any])
    __obj.updateDynamic("vpcId")(vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_SubnetIdsVpcId]
  }
}

