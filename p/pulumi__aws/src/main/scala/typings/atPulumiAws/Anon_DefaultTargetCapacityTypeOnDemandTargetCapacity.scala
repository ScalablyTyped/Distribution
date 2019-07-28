package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DefaultTargetCapacityTypeOnDemandTargetCapacity extends js.Object {
  var defaultTargetCapacityType: Input[String]
  var onDemandTargetCapacity: js.UndefOr[Input[Double]] = js.undefined
  var spotTargetCapacity: js.UndefOr[Input[Double]] = js.undefined
  var totalTargetCapacity: Input[Double]
}

object Anon_DefaultTargetCapacityTypeOnDemandTargetCapacity {
  @scala.inline
  def apply(
    defaultTargetCapacityType: Input[String],
    totalTargetCapacity: Input[Double],
    onDemandTargetCapacity: Input[Double] = null,
    spotTargetCapacity: Input[Double] = null
  ): Anon_DefaultTargetCapacityTypeOnDemandTargetCapacity = {
    val __obj = js.Dynamic.literal(defaultTargetCapacityType = defaultTargetCapacityType.asInstanceOf[js.Any], totalTargetCapacity = totalTargetCapacity.asInstanceOf[js.Any])
    if (onDemandTargetCapacity != null) __obj.updateDynamic("onDemandTargetCapacity")(onDemandTargetCapacity.asInstanceOf[js.Any])
    if (spotTargetCapacity != null) __obj.updateDynamic("spotTargetCapacity")(spotTargetCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_DefaultTargetCapacityTypeOnDemandTargetCapacity]
  }
}

