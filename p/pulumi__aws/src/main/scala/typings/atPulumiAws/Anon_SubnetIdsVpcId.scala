package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SubnetIdsVpcId extends js.Object {
  var subnetIds: Input[js.Array[Input[String]]]
  var vpcId: Input[String]
}

object Anon_SubnetIdsVpcId {
  @scala.inline
  def apply(subnetIds: Input[js.Array[Input[String]]], vpcId: Input[String]): Anon_SubnetIdsVpcId = {
    val __obj = js.Dynamic.literal(subnetIds = subnetIds.asInstanceOf[js.Any], vpcId = vpcId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_SubnetIdsVpcId]
  }
}

