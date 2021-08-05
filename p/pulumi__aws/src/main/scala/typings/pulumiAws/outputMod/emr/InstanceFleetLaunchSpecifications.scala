package typings.pulumiAws.outputMod.emr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceFleetLaunchSpecifications extends StObject {
  
  /**
    * Configuration block for on demand instances launch specifications
    */
  var onDemandSpecifications: js.UndefOr[js.Array[InstanceFleetLaunchSpecificationsOnDemandSpecification]] = js.undefined
  
  /**
    * Configuration block for spot instances launch specifications
    */
  var spotSpecifications: js.UndefOr[js.Array[InstanceFleetLaunchSpecificationsSpotSpecification]] = js.undefined
}
object InstanceFleetLaunchSpecifications {
  
  inline def apply(): InstanceFleetLaunchSpecifications = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceFleetLaunchSpecifications]
  }
  
  extension [Self <: InstanceFleetLaunchSpecifications](x: Self) {
    
    inline def setOnDemandSpecifications(value: js.Array[InstanceFleetLaunchSpecificationsOnDemandSpecification]): Self = StObject.set(x, "onDemandSpecifications", value.asInstanceOf[js.Any])
    
    inline def setOnDemandSpecificationsUndefined: Self = StObject.set(x, "onDemandSpecifications", js.undefined)
    
    inline def setOnDemandSpecificationsVarargs(value: InstanceFleetLaunchSpecificationsOnDemandSpecification*): Self = StObject.set(x, "onDemandSpecifications", js.Array(value :_*))
    
    inline def setSpotSpecifications(value: js.Array[InstanceFleetLaunchSpecificationsSpotSpecification]): Self = StObject.set(x, "spotSpecifications", value.asInstanceOf[js.Any])
    
    inline def setSpotSpecificationsUndefined: Self = StObject.set(x, "spotSpecifications", js.undefined)
    
    inline def setSpotSpecificationsVarargs(value: InstanceFleetLaunchSpecificationsSpotSpecification*): Self = StObject.set(x, "spotSpecifications", js.Array(value :_*))
  }
}
