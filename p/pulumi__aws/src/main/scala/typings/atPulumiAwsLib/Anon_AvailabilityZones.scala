package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AvailabilityZones extends js.Object {
  var availabilityZones: js.Array[java.lang.String]
  var securityGroupIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var subnetIds: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var vpcId: java.lang.String
}

object Anon_AvailabilityZones {
  @scala.inline
  def apply(
    availabilityZones: js.Array[java.lang.String],
    vpcId: java.lang.String,
    securityGroupIds: js.Array[java.lang.String] = null,
    subnetIds: js.Array[java.lang.String] = null
  ): Anon_AvailabilityZones = {
    val __obj = js.Dynamic.literal(availabilityZones = availabilityZones, vpcId = vpcId)
    if (securityGroupIds != null) __obj.updateDynamic("securityGroupIds")(securityGroupIds)
    if (subnetIds != null) __obj.updateDynamic("subnetIds")(subnetIds)
    __obj.asInstanceOf[Anon_AvailabilityZones]
  }
}

