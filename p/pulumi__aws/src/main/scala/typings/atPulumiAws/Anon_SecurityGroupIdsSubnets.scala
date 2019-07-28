package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SecurityGroupIdsSubnets extends js.Object {
  var securityGroupIds: Input[js.Array[Input[String]]]
  var subnets: Input[js.Array[Input[String]]]
  var vpcId: Input[String]
}

object Anon_SecurityGroupIdsSubnets {
  @scala.inline
  def apply(
    securityGroupIds: Input[js.Array[Input[String]]],
    subnets: Input[js.Array[Input[String]]],
    vpcId: Input[String]
  ): Anon_SecurityGroupIdsSubnets = {
    val __obj = js.Dynamic.literal(securityGroupIds = securityGroupIds.asInstanceOf[js.Any], subnets = subnets.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_SecurityGroupIdsSubnets]
  }
}

