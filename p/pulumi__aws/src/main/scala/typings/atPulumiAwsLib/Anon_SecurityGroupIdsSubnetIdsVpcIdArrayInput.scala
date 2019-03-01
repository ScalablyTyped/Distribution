package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SecurityGroupIdsSubnetIdsVpcIdArrayInput extends js.Object {
  var securityGroupIds: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  var subnetIds: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  var vpcId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_SecurityGroupIdsSubnetIdsVpcIdArrayInput {
  @scala.inline
  def apply(
    securityGroupIds: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]],
    subnetIds: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]],
    vpcId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_SecurityGroupIdsSubnetIdsVpcIdArrayInput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("securityGroupIds")(securityGroupIds.asInstanceOf[js.Any])
    __obj.updateDynamic("subnetIds")(subnetIds.asInstanceOf[js.Any])
    if (vpcId != null) __obj.updateDynamic("vpcId")(vpcId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_SecurityGroupIdsSubnetIdsVpcIdArrayInput]
  }
}

