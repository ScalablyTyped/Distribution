package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultTargetCapacityType extends js.Object {
  var defaultTargetCapacityType: java.lang.String
  var onDemandTargetCapacity: js.UndefOr[scala.Double] = js.undefined
  var spotTargetCapacity: js.UndefOr[scala.Double] = js.undefined
  var totalTargetCapacity: scala.Double
}

object Anon_DefaultTargetCapacityType {
  @scala.inline
  def apply(
    defaultTargetCapacityType: java.lang.String,
    totalTargetCapacity: scala.Double,
    onDemandTargetCapacity: scala.Int | scala.Double = null,
    spotTargetCapacity: scala.Int | scala.Double = null
  ): Anon_DefaultTargetCapacityType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("defaultTargetCapacityType")(defaultTargetCapacityType)
    __obj.updateDynamic("totalTargetCapacity")(totalTargetCapacity)
    if (onDemandTargetCapacity != null) __obj.updateDynamic("onDemandTargetCapacity")(onDemandTargetCapacity.asInstanceOf[js.Any])
    if (spotTargetCapacity != null) __obj.updateDynamic("spotTargetCapacity")(spotTargetCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DefaultTargetCapacityType]
  }
}

