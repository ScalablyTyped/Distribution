package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SecurityGroupIdsSubnetsArray extends js.Object {
  var securityGroupIds: js.Array[String]
  var subnets: js.Array[String]
}

object Anon_SecurityGroupIdsSubnetsArray {
  @scala.inline
  def apply(securityGroupIds: js.Array[String], subnets: js.Array[String]): Anon_SecurityGroupIdsSubnetsArray = {
    val __obj = js.Dynamic.literal(securityGroupIds = securityGroupIds, subnets = subnets)
  
    __obj.asInstanceOf[Anon_SecurityGroupIdsSubnetsArray]
  }
}

