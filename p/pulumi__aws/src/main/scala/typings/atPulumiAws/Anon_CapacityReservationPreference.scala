package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CapacityReservationPreference extends js.Object {
  var capacityReservationPreference: js.UndefOr[String] = js.undefined
  var capacityReservationTarget: js.UndefOr[Anon_CapacityReservationId] = js.undefined
}

object Anon_CapacityReservationPreference {
  @scala.inline
  def apply(
    capacityReservationPreference: String = null,
    capacityReservationTarget: Anon_CapacityReservationId = null
  ): Anon_CapacityReservationPreference = {
    val __obj = js.Dynamic.literal()
    if (capacityReservationPreference != null) __obj.updateDynamic("capacityReservationPreference")(capacityReservationPreference)
    if (capacityReservationTarget != null) __obj.updateDynamic("capacityReservationTarget")(capacityReservationTarget)
    __obj.asInstanceOf[Anon_CapacityReservationPreference]
  }
}

