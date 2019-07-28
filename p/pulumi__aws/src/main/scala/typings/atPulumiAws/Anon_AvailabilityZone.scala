package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AvailabilityZone extends js.Object {
  var availabilityZone: js.UndefOr[String] = js.undefined
  var instanceType: js.UndefOr[String] = js.undefined
  var maxPrice: js.UndefOr[String] = js.undefined
  var priority: js.UndefOr[Double] = js.undefined
  var subnetId: js.UndefOr[String] = js.undefined
  var weightedCapacity: js.UndefOr[Double] = js.undefined
}

object Anon_AvailabilityZone {
  @scala.inline
  def apply(
    availabilityZone: String = null,
    instanceType: String = null,
    maxPrice: String = null,
    priority: Int | Double = null,
    subnetId: String = null,
    weightedCapacity: Int | Double = null
  ): Anon_AvailabilityZone = {
    val __obj = js.Dynamic.literal()
    if (availabilityZone != null) __obj.updateDynamic("availabilityZone")(availabilityZone)
    if (instanceType != null) __obj.updateDynamic("instanceType")(instanceType)
    if (maxPrice != null) __obj.updateDynamic("maxPrice")(maxPrice)
    if (priority != null) __obj.updateDynamic("priority")(priority.asInstanceOf[js.Any])
    if (subnetId != null) __obj.updateDynamic("subnetId")(subnetId)
    if (weightedCapacity != null) __obj.updateDynamic("weightedCapacity")(weightedCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AvailabilityZone]
  }
}

