package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SecurityGroupIdsSubnetIdsVpcIdArray extends js.Object {
  var securityGroupIds: Input[js.Array[Input[String]]]
  var subnetIds: Input[js.Array[Input[String]]]
  var vpcId: Input[String]
}

object Anon_SecurityGroupIdsSubnetIdsVpcIdArray {
  @scala.inline
  def apply(
    securityGroupIds: Input[js.Array[Input[String]]],
    subnetIds: Input[js.Array[Input[String]]],
    vpcId: Input[String]
  ): Anon_SecurityGroupIdsSubnetIdsVpcIdArray = {
    val __obj = js.Dynamic.literal(securityGroupIds = securityGroupIds.asInstanceOf[js.Any], subnetIds = subnetIds.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_SecurityGroupIdsSubnetIdsVpcIdArray]
  }
}

