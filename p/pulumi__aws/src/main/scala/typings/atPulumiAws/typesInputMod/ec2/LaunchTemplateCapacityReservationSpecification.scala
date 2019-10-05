package typings.atPulumiAws.typesInputMod.ec2

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LaunchTemplateCapacityReservationSpecification extends js.Object {
  var capacityReservationPreference: js.UndefOr[Input[String]] = js.undefined
  var capacityReservationTarget: js.UndefOr[Input[LaunchTemplateCapacityReservationSpecificationCapacityReservationTarget]] = js.undefined
}

object LaunchTemplateCapacityReservationSpecification {
  @scala.inline
  def apply(
    capacityReservationPreference: Input[String] = null,
    capacityReservationTarget: Input[LaunchTemplateCapacityReservationSpecificationCapacityReservationTarget] = null
  ): LaunchTemplateCapacityReservationSpecification = {
    val __obj = js.Dynamic.literal()
    if (capacityReservationPreference != null) __obj.updateDynamic("capacityReservationPreference")(capacityReservationPreference.asInstanceOf[js.Any])
    if (capacityReservationTarget != null) __obj.updateDynamic("capacityReservationTarget")(capacityReservationTarget.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateCapacityReservationSpecification]
  }
}

