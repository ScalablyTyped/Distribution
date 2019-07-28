package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AvailabilityZoneInstanceType extends js.Object {
  var availabilityZone: js.UndefOr[Input[String]] = js.undefined
  var instanceType: js.UndefOr[Input[String]] = js.undefined
  var maxPrice: js.UndefOr[Input[String]] = js.undefined
  var priority: js.UndefOr[Input[Double]] = js.undefined
  var subnetId: js.UndefOr[Input[String]] = js.undefined
  var weightedCapacity: js.UndefOr[Input[Double]] = js.undefined
}

object Anon_AvailabilityZoneInstanceType {
  @scala.inline
  def apply(
    availabilityZone: Input[String] = null,
    instanceType: Input[String] = null,
    maxPrice: Input[String] = null,
    priority: Input[Double] = null,
    subnetId: Input[String] = null,
    weightedCapacity: Input[Double] = null
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

