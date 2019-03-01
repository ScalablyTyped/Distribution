package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AvailabilityZoneSecurityGroupIdLists extends js.Object {
  var availabilityZone: js.UndefOr[java.lang.String] = js.undefined
  var securityGroupIdLists: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var subnetId: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_AvailabilityZoneSecurityGroupIdLists {
  @scala.inline
  def apply(
    availabilityZone: java.lang.String = null,
    securityGroupIdLists: js.Array[java.lang.String] = null,
    subnetId: java.lang.String = null
  ): Anon_AvailabilityZoneSecurityGroupIdLists = {
    val __obj = js.Dynamic.literal()
    if (availabilityZone != null) __obj.updateDynamic("availabilityZone")(availabilityZone)
    if (securityGroupIdLists != null) __obj.updateDynamic("securityGroupIdLists")(securityGroupIdLists)
    if (subnetId != null) __obj.updateDynamic("subnetId")(subnetId)
    __obj.asInstanceOf[Anon_AvailabilityZoneSecurityGroupIdLists]
  }
}

