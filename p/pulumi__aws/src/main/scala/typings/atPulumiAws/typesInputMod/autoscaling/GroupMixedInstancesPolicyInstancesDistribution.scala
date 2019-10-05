package typings.atPulumiAws.typesInputMod.autoscaling

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupMixedInstancesPolicyInstancesDistribution extends js.Object {
  /**
    * Strategy to use when launching on-demand instances. Valid values: `prioritized`. Default: `prioritized`.
    */
  var onDemandAllocationStrategy: js.UndefOr[Input[String]] = js.undefined
  /**
    * Absolute minimum amount of desired capacity that must be fulfilled by on-demand instances. Default: `0`.
    */
  var onDemandBaseCapacity: js.UndefOr[Input[Double]] = js.undefined
  /**
    * Percentage split between on-demand and Spot instances above the base on-demand capacity. Default: `100`.
    */
  var onDemandPercentageAboveBaseCapacity: js.UndefOr[Input[Double]] = js.undefined
  /**
    * How to allocate capacity across the Spot pools. Valid values: `lowest-price`. Default: `lowest-price`.
    */
  var spotAllocationStrategy: js.UndefOr[Input[String]] = js.undefined
  /**
    * Number of Spot pools per availability zone to allocate capacity. EC2 Auto Scaling selects the cheapest Spot pools and evenly allocates Spot capacity across the number of Spot pools that you specify. Default: `2`.
    */
  var spotInstancePools: js.UndefOr[Input[Double]] = js.undefined
  /**
    * Maximum price per unit hour that the user is willing to pay for the Spot instances. Default: an empty string which means the on-demand price.
    */
  var spotMaxPrice: js.UndefOr[Input[String]] = js.undefined
}

object GroupMixedInstancesPolicyInstancesDistribution {
  @scala.inline
  def apply(
    onDemandAllocationStrategy: Input[String] = null,
    onDemandBaseCapacity: Input[Double] = null,
    onDemandPercentageAboveBaseCapacity: Input[Double] = null,
    spotAllocationStrategy: Input[String] = null,
    spotInstancePools: Input[Double] = null,
    spotMaxPrice: Input[String] = null
  ): GroupMixedInstancesPolicyInstancesDistribution = {
    val __obj = js.Dynamic.literal()
    if (onDemandAllocationStrategy != null) __obj.updateDynamic("onDemandAllocationStrategy")(onDemandAllocationStrategy.asInstanceOf[js.Any])
    if (onDemandBaseCapacity != null) __obj.updateDynamic("onDemandBaseCapacity")(onDemandBaseCapacity.asInstanceOf[js.Any])
    if (onDemandPercentageAboveBaseCapacity != null) __obj.updateDynamic("onDemandPercentageAboveBaseCapacity")(onDemandPercentageAboveBaseCapacity.asInstanceOf[js.Any])
    if (spotAllocationStrategy != null) __obj.updateDynamic("spotAllocationStrategy")(spotAllocationStrategy.asInstanceOf[js.Any])
    if (spotInstancePools != null) __obj.updateDynamic("spotInstancePools")(spotInstancePools.asInstanceOf[js.Any])
    if (spotMaxPrice != null) __obj.updateDynamic("spotMaxPrice")(spotMaxPrice.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupMixedInstancesPolicyInstancesDistribution]
  }
}

