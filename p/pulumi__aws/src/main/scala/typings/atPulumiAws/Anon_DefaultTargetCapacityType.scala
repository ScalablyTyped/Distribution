package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultTargetCapacityType extends js.Object {
  var defaultTargetCapacityType: String
  var onDemandTargetCapacity: js.UndefOr[Double] = js.undefined
  var spotTargetCapacity: js.UndefOr[Double] = js.undefined
  var totalTargetCapacity: Double
}

object Anon_DefaultTargetCapacityType {
  @scala.inline
  def apply(
    defaultTargetCapacityType: String,
    totalTargetCapacity: Double,
    onDemandTargetCapacity: Int | Double = null,
    spotTargetCapacity: Int | Double = null
  ): Anon_DefaultTargetCapacityType = {
    val __obj = js.Dynamic.literal(defaultTargetCapacityType = defaultTargetCapacityType, totalTargetCapacity = totalTargetCapacity)
    if (onDemandTargetCapacity != null) __obj.updateDynamic("onDemandTargetCapacity")(onDemandTargetCapacity.asInstanceOf[js.Any])
    if (spotTargetCapacity != null) __obj.updateDynamic("spotTargetCapacity")(spotTargetCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DefaultTargetCapacityType]
  }
}

