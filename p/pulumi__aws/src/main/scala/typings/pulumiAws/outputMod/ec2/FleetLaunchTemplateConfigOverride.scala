package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FleetLaunchTemplateConfigOverride extends StObject {
  
  /**
    * Availability Zone in which to launch the instances.
    */
  var availabilityZone: js.UndefOr[String] = js.undefined
  
  /**
    * Instance type.
    */
  var instanceType: js.UndefOr[String] = js.undefined
  
  /**
    * Maximum price per unit hour that you are willing to pay for a Spot Instance.
    */
  var maxPrice: js.UndefOr[String] = js.undefined
  
  /**
    * Priority for the launch template override. If `onDemandOptions` `allocationStrategy` is set to `prioritized`, EC2 Fleet uses priority to determine which launch template override to use first in fulfilling On-Demand capacity. The highest priority is launched first. The lower the number, the higher the priority. If no number is set, the launch template override has the lowest priority. Valid values are whole numbers starting at 0.
    */
  var priority: js.UndefOr[Double] = js.undefined
  
  /**
    * ID of the subnet in which to launch the instances.
    */
  var subnetId: js.UndefOr[String] = js.undefined
  
  /**
    * Number of units provided by the specified instance type.
    */
  var weightedCapacity: js.UndefOr[Double] = js.undefined
}
object FleetLaunchTemplateConfigOverride {
  
  @scala.inline
  def apply(): FleetLaunchTemplateConfigOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FleetLaunchTemplateConfigOverride]
  }
  
  @scala.inline
  implicit class FleetLaunchTemplateConfigOverrideMutableBuilder[Self <: FleetLaunchTemplateConfigOverride] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAvailabilityZone(value: String): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAvailabilityZoneUndefined: Self = StObject.set(x, "availabilityZone", js.undefined)
    
    @scala.inline
    def setInstanceType(value: String): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypeUndefined: Self = StObject.set(x, "instanceType", js.undefined)
    
    @scala.inline
    def setMaxPrice(value: String): Self = StObject.set(x, "maxPrice", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxPriceUndefined: Self = StObject.set(x, "maxPrice", js.undefined)
    
    @scala.inline
    def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
    
    @scala.inline
    def setSubnetId(value: String): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdUndefined: Self = StObject.set(x, "subnetId", js.undefined)
    
    @scala.inline
    def setWeightedCapacity(value: Double): Self = StObject.set(x, "weightedCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWeightedCapacityUndefined: Self = StObject.set(x, "weightedCapacity", js.undefined)
  }
}
