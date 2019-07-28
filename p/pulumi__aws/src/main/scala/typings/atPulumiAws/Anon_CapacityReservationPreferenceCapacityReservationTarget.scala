package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CapacityReservationPreferenceCapacityReservationTarget extends js.Object {
  var capacityReservationPreference: js.UndefOr[Input[String]] = js.undefined
  var capacityReservationTarget: js.UndefOr[Input[Anon_CapacityReservationIdInput]] = js.undefined
}

object Anon_CapacityReservationPreferenceCapacityReservationTarget {
  @scala.inline
  def apply(
    capacityReservationPreference: Input[String] = null,
    capacityReservationTarget: Input[Anon_CapacityReservationIdInput] = null
  ): Anon_CapacityReservationPreferenceCapacityReservationTarget = {
    val __obj = js.Dynamic.literal()
    if (capacityReservationPreference != null) __obj.updateDynamic("capacityReservationPreference")(capacityReservationPreference.asInstanceOf[js.Any])
    if (capacityReservationTarget != null) __obj.updateDynamic("capacityReservationTarget")(capacityReservationTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CapacityReservationPreferenceCapacityReservationTarget]
  }
}

