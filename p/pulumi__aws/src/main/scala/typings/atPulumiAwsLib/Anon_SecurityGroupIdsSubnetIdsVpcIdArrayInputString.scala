package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SecurityGroupIdsSubnetIdsVpcIdArrayInputString extends js.Object {
  var securityGroupIds: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  var subnetIds: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  var vpcId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_SecurityGroupIdsSubnetIdsVpcIdArrayInputString {
  @scala.inline
  def apply(
    securityGroupIds: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]],
    subnetIds: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]],
    vpcId: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): Anon_SecurityGroupIdsSubnetIdsVpcIdArrayInputString = {
    val __obj = js.Dynamic.literal(securityGroupIds = securityGroupIds.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_SecurityGroupIdsSubnetIdsVpcIdArrayInputString]
  }
}

