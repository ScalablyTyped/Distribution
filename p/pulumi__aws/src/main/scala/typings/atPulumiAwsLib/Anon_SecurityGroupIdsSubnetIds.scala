package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_SecurityGroupIdsSubnetIds extends js.Object {
  var securityGroupIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var subnetIds: js.Array[java.lang.String]
  var vpcId: java.lang.String
}

object Anon_SecurityGroupIdsSubnetIds {
  @scala.inline
  def apply(
    subnetIds: js.Array[java.lang.String],
    vpcId: java.lang.String,
    securityGroupIds: js.Array[java.lang.String] = null
  ): Anon_SecurityGroupIdsSubnetIds = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("subnetIds")(subnetIds)
    __obj.updateDynamic("vpcId")(vpcId)
    if (securityGroupIds != null) __obj.updateDynamic("securityGroupIds")(securityGroupIds)
    __obj.asInstanceOf[Anon_SecurityGroupIdsSubnetIds]
  }
}

