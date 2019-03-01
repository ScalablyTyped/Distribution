package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SecurityGroupIdsSubnetIdsVpcIdArray extends js.Object {
  var securityGroupIds: js.Array[java.lang.String]
  var subnetIds: js.Array[java.lang.String]
  var vpcId: java.lang.String
}

object Anon_SecurityGroupIdsSubnetIdsVpcIdArray {
  @scala.inline
  def apply(
    securityGroupIds: js.Array[java.lang.String],
    subnetIds: js.Array[java.lang.String],
    vpcId: java.lang.String
  ): Anon_SecurityGroupIdsSubnetIdsVpcIdArray = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("securityGroupIds")(securityGroupIds)
    __obj.updateDynamic("subnetIds")(subnetIds)
    __obj.updateDynamic("vpcId")(vpcId)
    __obj.asInstanceOf[Anon_SecurityGroupIdsSubnetIdsVpcIdArray]
  }
}

