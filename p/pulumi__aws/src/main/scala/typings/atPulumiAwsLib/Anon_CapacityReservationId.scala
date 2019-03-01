package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CapacityReservationId extends js.Object {
  var capacityReservationId: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_CapacityReservationId {
  @scala.inline
  def apply(capacityReservationId: java.lang.String = null): Anon_CapacityReservationId = {
    val __obj = js.Dynamic.literal()
    if (capacityReservationId != null) __obj.updateDynamic("capacityReservationId")(capacityReservationId)
    __obj.asInstanceOf[Anon_CapacityReservationId]
  }
}

