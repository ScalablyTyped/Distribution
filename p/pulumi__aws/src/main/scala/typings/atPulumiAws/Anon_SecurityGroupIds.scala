package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SecurityGroupIds extends js.Object {
  var securityGroupIds: js.Array[String]
  var subnets: js.Array[String]
  var vpcId: String
}

object Anon_SecurityGroupIds {
  @scala.inline
  def apply(securityGroupIds: js.Array[String], subnets: js.Array[String], vpcId: String): Anon_SecurityGroupIds = {
    val __obj = js.Dynamic.literal(securityGroupIds = securityGroupIds, subnets = subnets, vpcId = vpcId)
  
    __obj.asInstanceOf[Anon_SecurityGroupIds]
  }
}

