package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SecurityGroupIdsSubnetIds extends js.Object {
  var securityGroupIds: js.Array[String]
  var subnetIds: js.Array[String]
  var vpcId: String
}

object Anon_SecurityGroupIdsSubnetIds {
  @scala.inline
  def apply(securityGroupIds: js.Array[String], subnetIds: js.Array[String], vpcId: String): Anon_SecurityGroupIdsSubnetIds = {
    val __obj = js.Dynamic.literal(securityGroupIds = securityGroupIds, subnetIds = subnetIds, vpcId = vpcId)
  
    __obj.asInstanceOf[Anon_SecurityGroupIdsSubnetIds]
  }
}

