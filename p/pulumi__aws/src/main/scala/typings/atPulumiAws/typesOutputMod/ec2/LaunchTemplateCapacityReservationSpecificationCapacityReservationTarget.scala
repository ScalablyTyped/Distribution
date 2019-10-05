package typings.atPulumiAws.typesOutputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchTemplateCapacityReservationSpecificationCapacityReservationTarget extends js.Object {
  var capacityReservationId: js.UndefOr[String] = js.undefined
}

object LaunchTemplateCapacityReservationSpecificationCapacityReservationTarget {
  @scala.inline
  def apply(capacityReservationId: String = null): LaunchTemplateCapacityReservationSpecificationCapacityReservationTarget = {
    val __obj = js.Dynamic.literal()
    if (capacityReservationId != null) __obj.updateDynamic("capacityReservationId")(capacityReservationId)
    __obj.asInstanceOf[LaunchTemplateCapacityReservationSpecificationCapacityReservationTarget]
  }
}

