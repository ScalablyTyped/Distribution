package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OnDemandAllocationStrategyOnDemandBaseCapacity extends js.Object {
  var onDemandAllocationStrategy: js.UndefOr[Input[String]] = js.undefined
  var onDemandBaseCapacity: js.UndefOr[Input[Double]] = js.undefined
  var onDemandPercentageAboveBaseCapacity: js.UndefOr[Input[Double]] = js.undefined
  var spotAllocationStrategy: js.UndefOr[Input[String]] = js.undefined
  var spotInstancePools: js.UndefOr[Input[Double]] = js.undefined
  var spotMaxPrice: js.UndefOr[Input[String]] = js.undefined
}

object Anon_OnDemandAllocationStrategyOnDemandBaseCapacity {
  @scala.inline
  def apply(
    onDemandAllocationStrategy: Input[String] = null,
    onDemandBaseCapacity: Input[Double] = null,
    onDemandPercentageAboveBaseCapacity: Input[Double] = null,
    spotAllocationStrategy: Input[String] = null,
    spotInstancePools: Input[Double] = null,
    spotMaxPrice: Input[String] = null
  ): Anon_OnDemandAllocationStrategyOnDemandBaseCapacity = {
    val __obj = js.Dynamic.literal()
    if (onDemandAllocationStrategy != null) __obj.updateDynamic("onDemandAllocationStrategy")(onDemandAllocationStrategy.asInstanceOf[js.Any])
    if (onDemandBaseCapacity != null) __obj.updateDynamic("onDemandBaseCapacity")(onDemandBaseCapacity.asInstanceOf[js.Any])
    if (onDemandPercentageAboveBaseCapacity != null) __obj.updateDynamic("onDemandPercentageAboveBaseCapacity")(onDemandPercentageAboveBaseCapacity.asInstanceOf[js.Any])
    if (spotAllocationStrategy != null) __obj.updateDynamic("spotAllocationStrategy")(spotAllocationStrategy.asInstanceOf[js.Any])
    if (spotInstancePools != null) __obj.updateDynamic("spotInstancePools")(spotInstancePools.asInstanceOf[js.Any])
    if (spotMaxPrice != null) __obj.updateDynamic("spotMaxPrice")(spotMaxPrice.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_OnDemandAllocationStrategyOnDemandBaseCapacity]
  }
}

