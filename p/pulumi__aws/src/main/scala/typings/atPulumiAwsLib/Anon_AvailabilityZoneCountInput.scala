package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AvailabilityZoneCountInput extends js.Object {
  var availabilityZoneCount: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
}

object Anon_AvailabilityZoneCountInput {
  @scala.inline
  def apply(availabilityZoneCount: atPulumiPulumiLib.outputMod.Input[scala.Double] = null): Anon_AvailabilityZoneCountInput = {
    val __obj = js.Dynamic.literal()
    if (availabilityZoneCount != null) __obj.updateDynamic("availabilityZoneCount")(availabilityZoneCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AvailabilityZoneCountInput]
  }
}

