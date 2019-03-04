package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SecurityGroupIds extends js.Object {
  var securityGroupIds: js.Array[java.lang.String]
  var subnets: js.Array[java.lang.String]
  var vpcId: java.lang.String
}

object Anon_SecurityGroupIds {
  @scala.inline
  def apply(
    securityGroupIds: js.Array[java.lang.String],
    subnets: js.Array[java.lang.String],
    vpcId: java.lang.String
  ): Anon_SecurityGroupIds = {
    val __obj = js.Dynamic.literal(securityGroupIds = securityGroupIds, subnets = subnets, vpcId = vpcId)
  
    __obj.asInstanceOf[Anon_SecurityGroupIds]
  }
}

