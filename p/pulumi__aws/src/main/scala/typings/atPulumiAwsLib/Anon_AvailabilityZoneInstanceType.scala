package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AvailabilityZoneInstanceType extends js.Object {
  var availabilityZone: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var instanceType: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var maxPrice: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var priority: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var subnetId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var weightedCapacity: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
}

object Anon_AvailabilityZoneInstanceType {
  @scala.inline
  def apply(
    availabilityZone: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    instanceType: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    maxPrice: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    priority: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    subnetId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    weightedCapacity: atPulumiPulumiLib.outputMod.Input[scala.Double] = null
  ): Anon_AvailabilityZoneInstanceType = {
    val __obj = js.Dynamic.literal()
    if (availabilityZone != null) __obj.updateDynamic("availabilityZone")(availabilityZone.asInstanceOf[js.Any])
    if (instanceType != null) __obj.updateDynamic("instanceType")(instanceType.asInstanceOf[js.Any])
    if (maxPrice != null) __obj.updateDynamic("maxPrice")(maxPrice.asInstanceOf[js.Any])
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (subnetId != null) __obj.updateDynamic("subnetId")(subnetId.asInstanceOf[js.Any])
    if (weightedCapacity != null) __obj.updateDynamic("weightedCapacity")(weightedCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AvailabilityZoneInstanceType]
  }
}

