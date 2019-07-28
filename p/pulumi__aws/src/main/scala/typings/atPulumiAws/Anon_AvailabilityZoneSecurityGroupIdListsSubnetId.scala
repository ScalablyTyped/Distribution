package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AvailabilityZoneSecurityGroupIdListsSubnetId extends js.Object {
  var availabilityZone: js.UndefOr[Input[String]] = js.undefined
  var securityGroupIdLists: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  var subnetId: js.UndefOr[Input[String]] = js.undefined
}

object Anon_AvailabilityZoneSecurityGroupIdListsSubnetId {
  @scala.inline
  def apply(
    availabilityZone: Input[String] = null,
    securityGroupIdLists: Input[js.Array[Input[String]]] = null,
    subnetId: Input[String] = null
  ): Anon_AvailabilityZoneSecurityGroupIdListsSubnetId = {
    val __obj = js.Dynamic.literal()
    if (availabilityZone != null) __obj.updateDynamic("availabilityZone")(availabilityZone.asInstanceOf[js.Any])
    if (securityGroupIdLists != null) __obj.updateDynamic("securityGroupIdLists")(securityGroupIdLists.asInstanceOf[js.Any])
    if (subnetId != null) __obj.updateDynamic("subnetId")(subnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AvailabilityZoneSecurityGroupIdListsSubnetId]
  }
}

