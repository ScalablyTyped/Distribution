package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FleetTargetCapacitySpecification extends StObject {
  
  /**
    * Default target capacity type. Valid values: `on-demand`, `spot`.
    */
  var defaultTargetCapacityType: String
  
  /**
    * The number of On-Demand units to request.
    */
  var onDemandTargetCapacity: js.UndefOr[Double] = js.undefined
  
  /**
    * The number of Spot units to request.
    */
  var spotTargetCapacity: js.UndefOr[Double] = js.undefined
  
  /**
    * The number of units to request, filled using `defaultTargetCapacityType`.
    */
  var totalTargetCapacity: Double
}
object FleetTargetCapacitySpecification {
  
  @scala.inline
  def apply(defaultTargetCapacityType: String, totalTargetCapacity: Double): FleetTargetCapacitySpecification = {
    val __obj = js.Dynamic.literal(defaultTargetCapacityType = defaultTargetCapacityType.asInstanceOf[js.Any], totalTargetCapacity = totalTargetCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[FleetTargetCapacitySpecification]
  }
  
  @scala.inline
  implicit class FleetTargetCapacitySpecificationMutableBuilder[Self <: FleetTargetCapacitySpecification] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefaultTargetCapacityType(value: String): Self = StObject.set(x, "defaultTargetCapacityType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDemandTargetCapacity(value: Double): Self = StObject.set(x, "onDemandTargetCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDemandTargetCapacityUndefined: Self = StObject.set(x, "onDemandTargetCapacity", js.undefined)
    
    @scala.inline
    def setSpotTargetCapacity(value: Double): Self = StObject.set(x, "spotTargetCapacity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpotTargetCapacityUndefined: Self = StObject.set(x, "spotTargetCapacity", js.undefined)
    
    @scala.inline
    def setTotalTargetCapacity(value: Double): Self = StObject.set(x, "totalTargetCapacity", value.asInstanceOf[js.Any])
  }
}
