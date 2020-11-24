package typings.pulumiAws.outputMod.autoscaling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupMixedInstancesPolicyInstancesDistribution extends js.Object {
  
  /**
    * Strategy to use when launching on-demand instances. Valid values: `prioritized`. Default: `prioritized`.
    */
  var onDemandAllocationStrategy: String = js.native
  
  /**
    * Absolute minimum amount of desired capacity that must be fulfilled by on-demand instances. Default: `0`.
    */
  var onDemandBaseCapacity: Double = js.native
  
  /**
    * Percentage split between on-demand and Spot instances above the base on-demand capacity. Default: `0`.
    */
  var onDemandPercentageAboveBaseCapacity: Double = js.native
  
  /**
    * How to allocate capacity across the Spot pools. Valid values: `lowest-price`, `capacity-optimized`. Default: `lowest-price`.
    */
  var spotAllocationStrategy: String = js.native
  
  /**
    * Number of Spot pools per availability zone to allocate capacity. EC2 Auto Scaling selects the cheapest Spot pools and evenly allocates Spot capacity across the number of Spot pools that you specify. Default: `2`.
    */
  var spotInstancePools: Double = js.native
  
  /**
    * Maximum price per unit hour that the user is willing to pay for the Spot instances. Default: an empty string which means the on-demand price.
    */
  var spotMaxPrice: js.UndefOr[String] = js.native
}
object GroupMixedInstancesPolicyInstancesDistribution {
  
  @scala.inline
  def apply(
    onDemandAllocationStrategy: String,
    onDemandBaseCapacity: Double,
    onDemandPercentageAboveBaseCapacity: Double,
    spotAllocationStrategy: String,
    spotInstancePools: Double
  ): GroupMixedInstancesPolicyInstancesDistribution = {
    val __obj = js.Dynamic.literal(onDemandAllocationStrategy = onDemandAllocationStrategy.asInstanceOf[js.Any], onDemandBaseCapacity = onDemandBaseCapacity.asInstanceOf[js.Any], onDemandPercentageAboveBaseCapacity = onDemandPercentageAboveBaseCapacity.asInstanceOf[js.Any], spotAllocationStrategy = spotAllocationStrategy.asInstanceOf[js.Any], spotInstancePools = spotInstancePools.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupMixedInstancesPolicyInstancesDistribution]
  }
  
  @scala.inline
  implicit class GroupMixedInstancesPolicyInstancesDistributionOps[Self <: GroupMixedInstancesPolicyInstancesDistribution] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOnDemandAllocationStrategy(value: String): Self = this.set("onDemandAllocationStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDemandBaseCapacity(value: Double): Self = this.set("onDemandBaseCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDemandPercentageAboveBaseCapacity(value: Double): Self = this.set("onDemandPercentageAboveBaseCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpotAllocationStrategy(value: String): Self = this.set("spotAllocationStrategy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpotInstancePools(value: Double): Self = this.set("spotInstancePools", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpotMaxPrice(value: String): Self = this.set("spotMaxPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSpotMaxPrice: Self = this.set("spotMaxPrice", js.undefined)
  }
}
