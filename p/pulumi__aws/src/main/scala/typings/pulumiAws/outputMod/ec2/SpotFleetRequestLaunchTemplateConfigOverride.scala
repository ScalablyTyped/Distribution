package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpotFleetRequestLaunchTemplateConfigOverride extends StObject {
  
  /**
    * The availability zone in which to place the request.
    */
  var availabilityZone: js.UndefOr[String] = js.undefined
  
  /**
    * The type of instance to request.
    */
  var instanceType: js.UndefOr[String] = js.undefined
  
  /**
    * The priority for the launch template override. The lower the number, the higher the priority. If no number is set, the launch template override has the lowest priority.
    */
  var priority: Double
  
  /**
    * The maximum spot bid for this override request.
    */
  var spotPrice: String
  
  /**
    * The subnet in which to launch the requested instance.
    */
  var subnetId: String
  
  /**
    * The capacity added to the fleet by a fulfilled request.
    */
  var weightedCapacity: Double
}
object SpotFleetRequestLaunchTemplateConfigOverride {
  
  inline def apply(priority: Double, spotPrice: String, subnetId: String, weightedCapacity: Double): SpotFleetRequestLaunchTemplateConfigOverride = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any], spotPrice = spotPrice.asInstanceOf[js.Any], subnetId = subnetId.asInstanceOf[js.Any], weightedCapacity = weightedCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpotFleetRequestLaunchTemplateConfigOverride]
  }
  
  extension [Self <: SpotFleetRequestLaunchTemplateConfigOverride](x: Self) {
    
    inline def setAvailabilityZone(value: String): Self = StObject.set(x, "availabilityZone", value.asInstanceOf[js.Any])
    
    inline def setAvailabilityZoneUndefined: Self = StObject.set(x, "availabilityZone", js.undefined)
    
    inline def setInstanceType(value: String): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypeUndefined: Self = StObject.set(x, "instanceType", js.undefined)
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
    
    inline def setSpotPrice(value: String): Self = StObject.set(x, "spotPrice", value.asInstanceOf[js.Any])
    
    inline def setSubnetId(value: String): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
    
    inline def setWeightedCapacity(value: Double): Self = StObject.set(x, "weightedCapacity", value.asInstanceOf[js.Any])
  }
}
