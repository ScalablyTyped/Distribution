package typings.atPulumiAws.typesOutputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FleetTargetCapacitySpecification extends js.Object {
  /**
    * Default target capacity type. Valid values: `on-demand`, `spot`.
    */
  var defaultTargetCapacityType: String
  /**
    * The number of On-Demand units to request.
    */
  var onDemandTargetCapacity: js.UndefOr[Double] = js.undefined
  /**
    * The number of Spot units to request.
    */
  var spotTargetCapacity: js.UndefOr[Double] = js.undefined
  /**
    * The number of units to request, filled using `defaultTargetCapacityType`.
    */
  var totalTargetCapacity: Double
}

object FleetTargetCapacitySpecification {
  @scala.inline
  def apply(
    defaultTargetCapacityType: String,
    totalTargetCapacity: Double,
    onDemandTargetCapacity: Int | Double = null,
    spotTargetCapacity: Int | Double = null
  ): FleetTargetCapacitySpecification = {
    val __obj = js.Dynamic.literal(defaultTargetCapacityType = defaultTargetCapacityType, totalTargetCapacity = totalTargetCapacity)
    if (onDemandTargetCapacity != null) __obj.updateDynamic("onDemandTargetCapacity")(onDemandTargetCapacity.asInstanceOf[js.Any])
    if (spotTargetCapacity != null) __obj.updateDynamic("spotTargetCapacity")(spotTargetCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[FleetTargetCapacitySpecification]
  }
}

