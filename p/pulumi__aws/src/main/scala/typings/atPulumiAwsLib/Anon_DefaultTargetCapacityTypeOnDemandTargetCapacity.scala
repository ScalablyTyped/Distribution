package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultTargetCapacityTypeOnDemandTargetCapacity extends js.Object {
  var defaultTargetCapacityType: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var onDemandTargetCapacity: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var spotTargetCapacity: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var totalTargetCapacity: atPulumiPulumiLib.outputMod.Input[scala.Double]
}

object Anon_DefaultTargetCapacityTypeOnDemandTargetCapacity {
  @scala.inline
  def apply(
    defaultTargetCapacityType: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    totalTargetCapacity: atPulumiPulumiLib.outputMod.Input[scala.Double],
    onDemandTargetCapacity: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    spotTargetCapacity: atPulumiPulumiLib.outputMod.Input[scala.Double] = null
  ): Anon_DefaultTargetCapacityTypeOnDemandTargetCapacity = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("defaultTargetCapacityType")(defaultTargetCapacityType.asInstanceOf[js.Any])
    __obj.updateDynamic("totalTargetCapacity")(totalTargetCapacity.asInstanceOf[js.Any])
    if (onDemandTargetCapacity != null) __obj.updateDynamic("onDemandTargetCapacity")(onDemandTargetCapacity.asInstanceOf[js.Any])
    if (spotTargetCapacity != null) __obj.updateDynamic("spotTargetCapacity")(spotTargetCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DefaultTargetCapacityTypeOnDemandTargetCapacity]
  }
}

