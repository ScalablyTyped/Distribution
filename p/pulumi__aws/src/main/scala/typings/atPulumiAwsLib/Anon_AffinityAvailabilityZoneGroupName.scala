package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AffinityAvailabilityZoneGroupName extends js.Object {
  var affinity: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var availabilityZone: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var groupName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var hostId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var spreadDomain: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var tenancy: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_AffinityAvailabilityZoneGroupName {
  @scala.inline
  def apply(
    affinity: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    availabilityZone: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    groupName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    hostId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    spreadDomain: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    tenancy: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_AffinityAvailabilityZoneGroupName = {
    val __obj = js.Dynamic.literal()
    if (affinity != null) __obj.updateDynamic("affinity")(affinity.asInstanceOf[js.Any])
    if (availabilityZone != null) __obj.updateDynamic("availabilityZone")(availabilityZone.asInstanceOf[js.Any])
    if (groupName != null) __obj.updateDynamic("groupName")(groupName.asInstanceOf[js.Any])
    if (hostId != null) __obj.updateDynamic("hostId")(hostId.asInstanceOf[js.Any])
    if (spreadDomain != null) __obj.updateDynamic("spreadDomain")(spreadDomain.asInstanceOf[js.Any])
    if (tenancy != null) __obj.updateDynamic("tenancy")(tenancy.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AffinityAvailabilityZoneGroupName]
  }
}

