package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SecurityGroupIdsSubnetIds extends js.Object {
  var securityGroupIds: js.Array[java.lang.String]
  var subnetIds: js.Array[java.lang.String]
  var vpcId: java.lang.String
}

object Anon_SecurityGroupIdsSubnetIds {
  @scala.inline
  def apply(
    securityGroupIds: js.Array[java.lang.String],
    subnetIds: js.Array[java.lang.String],
    vpcId: java.lang.String
  ): Anon_SecurityGroupIdsSubnetIds = {
    val __obj = js.Dynamic.literal(securityGroupIds = securityGroupIds, subnetIds = subnetIds, vpcId = vpcId)
  
    __obj.asInstanceOf[Anon_SecurityGroupIdsSubnetIds]
  }
}

