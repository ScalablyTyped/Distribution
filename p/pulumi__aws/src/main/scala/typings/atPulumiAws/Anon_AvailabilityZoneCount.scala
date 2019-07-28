package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AvailabilityZoneCount extends js.Object {
  var availabilityZoneCount: js.UndefOr[Double] = js.undefined
}

object Anon_AvailabilityZoneCount {
  @scala.inline
  def apply(availabilityZoneCount: Int | Double = null): Anon_AvailabilityZoneCount = {
    val __obj = js.Dynamic.literal()
    if (availabilityZoneCount != null) __obj.updateDynamic("availabilityZoneCount")(availabilityZoneCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AvailabilityZoneCount]
  }
}

