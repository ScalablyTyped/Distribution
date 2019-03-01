package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CapacityReservationIdInput extends js.Object {
  var capacityReservationId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_CapacityReservationIdInput {
  @scala.inline
  def apply(capacityReservationId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null): Anon_CapacityReservationIdInput = {
    val __obj = js.Dynamic.literal()
    if (capacityReservationId != null) __obj.updateDynamic("capacityReservationId")(capacityReservationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CapacityReservationIdInput]
  }
}

