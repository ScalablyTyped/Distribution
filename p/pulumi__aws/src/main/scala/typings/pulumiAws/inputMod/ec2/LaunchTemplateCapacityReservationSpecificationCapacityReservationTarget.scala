package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateCapacityReservationSpecificationCapacityReservationTarget extends js.Object {
  /**
    * The ID of the Capacity Reservation to target.
    */
  var capacityReservationId: js.UndefOr[Input[String]] = js.native
}

object LaunchTemplateCapacityReservationSpecificationCapacityReservationTarget {
  @scala.inline
  def apply(capacityReservationId: Input[String] = null): LaunchTemplateCapacityReservationSpecificationCapacityReservationTarget = {
    val __obj = js.Dynamic.literal()
    if (capacityReservationId != null) __obj.updateDynamic("capacityReservationId")(capacityReservationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateCapacityReservationSpecificationCapacityReservationTarget]
  }
}

