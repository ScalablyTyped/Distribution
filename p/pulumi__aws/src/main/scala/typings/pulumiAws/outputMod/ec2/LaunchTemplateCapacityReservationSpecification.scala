package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LaunchTemplateCapacityReservationSpecification extends js.Object {
  /**
    * Indicates the instance's Capacity Reservation preferences. Can be `open` or `none`. (Default `none`).
    */
  var capacityReservationPreference: js.UndefOr[String] = js.native
  /**
    * Used to target a specific Capacity Reservation:
    */
  var capacityReservationTarget: js.UndefOr[LaunchTemplateCapacityReservationSpecificationCapacityReservationTarget] = js.native
}

object LaunchTemplateCapacityReservationSpecification {
  @scala.inline
  def apply(): LaunchTemplateCapacityReservationSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LaunchTemplateCapacityReservationSpecification]
  }
  @scala.inline
  implicit class LaunchTemplateCapacityReservationSpecificationOps[Self <: LaunchTemplateCapacityReservationSpecification] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCapacityReservationPreference(value: String): Self = this.set("capacityReservationPreference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapacityReservationPreference: Self = this.set("capacityReservationPreference", js.undefined)
    @scala.inline
    def setCapacityReservationTarget(value: LaunchTemplateCapacityReservationSpecificationCapacityReservationTarget): Self = this.set("capacityReservationTarget", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCapacityReservationTarget: Self = this.set("capacityReservationTarget", js.undefined)
  }
  
}

