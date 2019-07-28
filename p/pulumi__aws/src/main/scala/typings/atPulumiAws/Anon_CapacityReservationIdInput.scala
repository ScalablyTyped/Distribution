package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CapacityReservationIdInput extends js.Object {
  var capacityReservationId: js.UndefOr[Input[String]] = js.undefined
}

object Anon_CapacityReservationIdInput {
  @scala.inline
  def apply(capacityReservationId: Input[String] = null): Anon_CapacityReservationIdInput = {
    val __obj = js.Dynamic.literal()
    if (capacityReservationId != null) __obj.updateDynamic("capacityReservationId")(capacityReservationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CapacityReservationIdInput]
  }
}

