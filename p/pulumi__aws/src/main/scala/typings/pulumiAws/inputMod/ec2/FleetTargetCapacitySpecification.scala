package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FleetTargetCapacitySpecification extends StObject {
  
  /**
    * Default target capacity type. Valid values: `on-demand`, `spot`.
    */
  var defaultTargetCapacityType: Input[String]
  
  /**
    * The number of On-Demand units to request.
    */
  var onDemandTargetCapacity: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * The number of Spot units to request.
    */
  var spotTargetCapacity: js.UndefOr[Input[Double]] = js.undefined
  
  /**
    * The number of units to request, filled using `defaultTargetCapacityType`.
    */
  var totalTargetCapacity: Input[Double]
}
object FleetTargetCapacitySpecification {
  
  inline def apply(defaultTargetCapacityType: Input[String], totalTargetCapacity: Input[Double]): FleetTargetCapacitySpecification = {
    val __obj = js.Dynamic.literal(defaultTargetCapacityType = defaultTargetCapacityType.asInstanceOf[js.Any], totalTargetCapacity = totalTargetCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[FleetTargetCapacitySpecification]
  }
  
  extension [Self <: FleetTargetCapacitySpecification](x: Self) {
    
    inline def setDefaultTargetCapacityType(value: Input[String]): Self = StObject.set(x, "defaultTargetCapacityType", value.asInstanceOf[js.Any])
    
    inline def setOnDemandTargetCapacity(value: Input[Double]): Self = StObject.set(x, "onDemandTargetCapacity", value.asInstanceOf[js.Any])
    
    inline def setOnDemandTargetCapacityUndefined: Self = StObject.set(x, "onDemandTargetCapacity", js.undefined)
    
    inline def setSpotTargetCapacity(value: Input[Double]): Self = StObject.set(x, "spotTargetCapacity", value.asInstanceOf[js.Any])
    
    inline def setSpotTargetCapacityUndefined: Self = StObject.set(x, "spotTargetCapacity", js.undefined)
    
    inline def setTotalTargetCapacity(value: Input[Double]): Self = StObject.set(x, "totalTargetCapacity", value.asInstanceOf[js.Any])
  }
}
