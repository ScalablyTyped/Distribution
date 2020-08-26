package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FleetTargetCapacitySpecification extends js.Object {
  /**
    * Default target capacity type. Valid values: `on-demand`, `spot`.
    */
  var defaultTargetCapacityType: Input[String] = js.native
  /**
    * The number of On-Demand units to request.
    */
  var onDemandTargetCapacity: js.UndefOr[Input[Double]] = js.native
  /**
    * The number of Spot units to request.
    */
  var spotTargetCapacity: js.UndefOr[Input[Double]] = js.native
  /**
    * The number of units to request, filled using `defaultTargetCapacityType`.
    */
  var totalTargetCapacity: Input[Double] = js.native
}

object FleetTargetCapacitySpecification {
  @scala.inline
  def apply(defaultTargetCapacityType: Input[String], totalTargetCapacity: Input[Double]): FleetTargetCapacitySpecification = {
    val __obj = js.Dynamic.literal(defaultTargetCapacityType = defaultTargetCapacityType.asInstanceOf[js.Any], totalTargetCapacity = totalTargetCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[FleetTargetCapacitySpecification]
  }
  @scala.inline
  implicit class FleetTargetCapacitySpecificationOps[Self <: FleetTargetCapacitySpecification] (val x: Self) extends AnyVal {
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
    def setDefaultTargetCapacityType(value: Input[String]): Self = this.set("defaultTargetCapacityType", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotalTargetCapacity(value: Input[Double]): Self = this.set("totalTargetCapacity", value.asInstanceOf[js.Any])
    @scala.inline
    def setOnDemandTargetCapacity(value: Input[Double]): Self = this.set("onDemandTargetCapacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnDemandTargetCapacity: Self = this.set("onDemandTargetCapacity", js.undefined)
    @scala.inline
    def setSpotTargetCapacity(value: Input[Double]): Self = this.set("spotTargetCapacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpotTargetCapacity: Self = this.set("spotTargetCapacity", js.undefined)
  }
  
}

