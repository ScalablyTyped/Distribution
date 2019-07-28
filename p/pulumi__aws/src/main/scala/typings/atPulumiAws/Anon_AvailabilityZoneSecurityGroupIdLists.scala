package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AvailabilityZoneSecurityGroupIdLists extends js.Object {
  var availabilityZone: js.UndefOr[String] = js.undefined
  var securityGroupIdLists: js.UndefOr[js.Array[String]] = js.undefined
  var subnetId: js.UndefOr[String] = js.undefined
}

object Anon_AvailabilityZoneSecurityGroupIdLists {
  @scala.inline
  def apply(
    availabilityZone: String = null,
    securityGroupIdLists: js.Array[String] = null,
    subnetId: String = null
  ): Anon_AvailabilityZoneSecurityGroupIdLists = {
    val __obj = js.Dynamic.literal()
    if (availabilityZone != null) __obj.updateDynamic("availabilityZone")(availabilityZone)
    if (securityGroupIdLists != null) __obj.updateDynamic("securityGroupIdLists")(securityGroupIdLists)
    if (subnetId != null) __obj.updateDynamic("subnetId")(subnetId)
    __obj.asInstanceOf[Anon_AvailabilityZoneSecurityGroupIdLists]
  }
}

