package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AvailabilityZoneSecurityGroupIdListsSubnetId extends js.Object {
  var availabilityZone: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var securityGroupIdLists: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ] = js.undefined
  var subnetId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_AvailabilityZoneSecurityGroupIdListsSubnetId {
  @scala.inline
  def apply(
    availabilityZone: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    securityGroupIdLists: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]] = null,
    subnetId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_AvailabilityZoneSecurityGroupIdListsSubnetId = {
    val __obj = js.Dynamic.literal()
    if (availabilityZone != null) __obj.updateDynamic("availabilityZone")(availabilityZone.asInstanceOf[js.Any])
    if (securityGroupIdLists != null) __obj.updateDynamic("securityGroupIdLists")(securityGroupIdLists.asInstanceOf[js.Any])
    if (subnetId != null) __obj.updateDynamic("subnetId")(subnetId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AvailabilityZoneSecurityGroupIdListsSubnetId]
  }
}

