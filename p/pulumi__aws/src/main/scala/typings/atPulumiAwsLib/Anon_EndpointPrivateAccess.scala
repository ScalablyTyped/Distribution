package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndpointPrivateAccess extends js.Object {
  var endpointPrivateAccess: js.UndefOr[scala.Boolean] = js.undefined
  var endpointPublicAccess: js.UndefOr[scala.Boolean] = js.undefined
  var securityGroupIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var subnetIds: js.Array[java.lang.String]
  var vpcId: java.lang.String
}

object Anon_EndpointPrivateAccess {
  @scala.inline
  def apply(
    subnetIds: js.Array[java.lang.String],
    vpcId: java.lang.String,
    endpointPrivateAccess: js.UndefOr[scala.Boolean] = js.undefined,
    endpointPublicAccess: js.UndefOr[scala.Boolean] = js.undefined,
    securityGroupIds: js.Array[java.lang.String] = null
  ): Anon_EndpointPrivateAccess = {
    val __obj = js.Dynamic.literal(subnetIds = subnetIds, vpcId = vpcId)
    if (!js.isUndefined(endpointPrivateAccess)) __obj.updateDynamic("endpointPrivateAccess")(endpointPrivateAccess)
    if (!js.isUndefined(endpointPublicAccess)) __obj.updateDynamic("endpointPublicAccess")(endpointPublicAccess)
    if (securityGroupIds != null) __obj.updateDynamic("securityGroupIds")(securityGroupIds)
    __obj.asInstanceOf[Anon_EndpointPrivateAccess]
  }
}

