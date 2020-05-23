package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FleetTargetCapacitySpecification extends js.Object {
  /**
    * Default target capacity type. Valid values: `on-demand`, `spot`.
    */
  var defaultTargetCapacityType: String = js.native
  /**
    * The number of On-Demand units to request.
    */
  var onDemandTargetCapacity: js.UndefOr[Double] = js.native
  /**
    * The number of Spot units to request.
    */
  var spotTargetCapacity: js.UndefOr[Double] = js.native
  /**
    * The number of units to request, filled using `defaultTargetCapacityType`.
    */
  var totalTargetCapacity: Double = js.native
}

object FleetTargetCapacitySpecification {
  @scala.inline
  def apply(
    defaultTargetCapacityType: String,
    totalTargetCapacity: Double,
    onDemandTargetCapacity: js.UndefOr[Double] = js.undefined,
    spotTargetCapacity: js.UndefOr[Double] = js.undefined
  ): FleetTargetCapacitySpecification = {
    val __obj = js.Dynamic.literal(defaultTargetCapacityType = defaultTargetCapacityType.asInstanceOf[js.Any], totalTargetCapacity = totalTargetCapacity.asInstanceOf[js.Any])
    if (!js.isUndefined(onDemandTargetCapacity)) __obj.updateDynamic("onDemandTargetCapacity")(onDemandTargetCapacity.get.asInstanceOf[js.Any])
    if (!js.isUndefined(spotTargetCapacity)) __obj.updateDynamic("spotTargetCapacity")(spotTargetCapacity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FleetTargetCapacitySpecification]
  }
}

