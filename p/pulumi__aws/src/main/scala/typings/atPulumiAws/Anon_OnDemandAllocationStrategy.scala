package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OnDemandAllocationStrategy extends js.Object {
  var onDemandAllocationStrategy: js.UndefOr[String] = js.undefined
  var onDemandBaseCapacity: js.UndefOr[Double] = js.undefined
  var onDemandPercentageAboveBaseCapacity: js.UndefOr[Double] = js.undefined
  var spotAllocationStrategy: js.UndefOr[String] = js.undefined
  var spotInstancePools: Double
  var spotMaxPrice: js.UndefOr[String] = js.undefined
}

object Anon_OnDemandAllocationStrategy {
  @scala.inline
  def apply(
    spotInstancePools: Double,
    onDemandAllocationStrategy: String = null,
    onDemandBaseCapacity: Int | Double = null,
    onDemandPercentageAboveBaseCapacity: Int | Double = null,
    spotAllocationStrategy: String = null,
    spotMaxPrice: String = null
  ): Anon_OnDemandAllocationStrategy = {
    val __obj = js.Dynamic.literal(spotInstancePools = spotInstancePools)
    if (onDemandAllocationStrategy != null) __obj.updateDynamic("onDemandAllocationStrategy")(onDemandAllocationStrategy)
    if (onDemandBaseCapacity != null) __obj.updateDynamic("onDemandBaseCapacity")(onDemandBaseCapacity.asInstanceOf[js.Any])
    if (onDemandPercentageAboveBaseCapacity != null) __obj.updateDynamic("onDemandPercentageAboveBaseCapacity")(onDemandPercentageAboveBaseCapacity.asInstanceOf[js.Any])
    if (spotAllocationStrategy != null) __obj.updateDynamic("spotAllocationStrategy")(spotAllocationStrategy)
    if (spotMaxPrice != null) __obj.updateDynamic("spotMaxPrice")(spotMaxPrice)
    __obj.asInstanceOf[Anon_OnDemandAllocationStrategy]
  }
}

