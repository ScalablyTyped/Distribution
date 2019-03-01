package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_OnDemandAllocationStrategy extends js.Object {
  var onDemandAllocationStrategy: js.UndefOr[java.lang.String] = js.undefined
  var onDemandBaseCapacity: js.UndefOr[scala.Double] = js.undefined
  var onDemandPercentageAboveBaseCapacity: js.UndefOr[scala.Double] = js.undefined
  var spotAllocationStrategy: js.UndefOr[java.lang.String] = js.undefined
  var spotInstancePools: scala.Double
  var spotMaxPrice: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_OnDemandAllocationStrategy {
  @scala.inline
  def apply(
    spotInstancePools: scala.Double,
    onDemandAllocationStrategy: java.lang.String = null,
    onDemandBaseCapacity: scala.Int | scala.Double = null,
    onDemandPercentageAboveBaseCapacity: scala.Int | scala.Double = null,
    spotAllocationStrategy: java.lang.String = null,
    spotMaxPrice: java.lang.String = null
  ): Anon_OnDemandAllocationStrategy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("spotInstancePools")(spotInstancePools)
    if (onDemandAllocationStrategy != null) __obj.updateDynamic("onDemandAllocationStrategy")(onDemandAllocationStrategy)
    if (onDemandBaseCapacity != null) __obj.updateDynamic("onDemandBaseCapacity")(onDemandBaseCapacity.asInstanceOf[js.Any])
    if (onDemandPercentageAboveBaseCapacity != null) __obj.updateDynamic("onDemandPercentageAboveBaseCapacity")(onDemandPercentageAboveBaseCapacity.asInstanceOf[js.Any])
    if (spotAllocationStrategy != null) __obj.updateDynamic("spotAllocationStrategy")(spotAllocationStrategy)
    if (spotMaxPrice != null) __obj.updateDynamic("spotMaxPrice")(spotMaxPrice)
    __obj.asInstanceOf[Anon_OnDemandAllocationStrategy]
  }
}

