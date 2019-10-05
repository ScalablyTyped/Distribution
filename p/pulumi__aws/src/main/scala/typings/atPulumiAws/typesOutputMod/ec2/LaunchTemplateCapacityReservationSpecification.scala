package typings.atPulumiAws.typesOutputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchTemplateCapacityReservationSpecification extends js.Object {
  var capacityReservationPreference: js.UndefOr[String] = js.undefined
  var capacityReservationTarget: js.UndefOr[LaunchTemplateCapacityReservationSpecificationCapacityReservationTarget] = js.undefined
}

object LaunchTemplateCapacityReservationSpecification {
  @scala.inline
  def apply(
    capacityReservationPreference: String = null,
    capacityReservationTarget: LaunchTemplateCapacityReservationSpecificationCapacityReservationTarget = null
  ): LaunchTemplateCapacityReservationSpecification = {
    val __obj = js.Dynamic.literal()
    if (capacityReservationPreference != null) __obj.updateDynamic("capacityReservationPreference")(capacityReservationPreference)
    if (capacityReservationTarget != null) __obj.updateDynamic("capacityReservationTarget")(capacityReservationTarget)
    __obj.asInstanceOf[LaunchTemplateCapacityReservationSpecification]
  }
}

