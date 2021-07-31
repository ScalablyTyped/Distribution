package typings.pulumiAws.outputMod.emr

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterMasterInstanceFleetLaunchSpecifications extends StObject {
  
  /**
    * Configuration block for on demand instances launch specifications
    */
  var onDemandSpecifications: js.UndefOr[js.Array[ClusterMasterInstanceFleetLaunchSpecificationsOnDemandSpecification]] = js.undefined
  
  /**
    * Configuration block for spot instances launch specifications
    */
  var spotSpecifications: js.UndefOr[js.Array[ClusterMasterInstanceFleetLaunchSpecificationsSpotSpecification]] = js.undefined
}
object ClusterMasterInstanceFleetLaunchSpecifications {
  
  @scala.inline
  def apply(): ClusterMasterInstanceFleetLaunchSpecifications = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterMasterInstanceFleetLaunchSpecifications]
  }
  
  @scala.inline
  implicit class ClusterMasterInstanceFleetLaunchSpecificationsMutableBuilder[Self <: ClusterMasterInstanceFleetLaunchSpecifications] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnDemandSpecifications(value: js.Array[ClusterMasterInstanceFleetLaunchSpecificationsOnDemandSpecification]): Self = StObject.set(x, "onDemandSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDemandSpecificationsUndefined: Self = StObject.set(x, "onDemandSpecifications", js.undefined)
    
    @scala.inline
    def setOnDemandSpecificationsVarargs(value: ClusterMasterInstanceFleetLaunchSpecificationsOnDemandSpecification*): Self = StObject.set(x, "onDemandSpecifications", js.Array(value :_*))
    
    @scala.inline
    def setSpotSpecifications(value: js.Array[ClusterMasterInstanceFleetLaunchSpecificationsSpotSpecification]): Self = StObject.set(x, "spotSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpotSpecificationsUndefined: Self = StObject.set(x, "spotSpecifications", js.undefined)
    
    @scala.inline
    def setSpotSpecificationsVarargs(value: ClusterMasterInstanceFleetLaunchSpecificationsSpotSpecification*): Self = StObject.set(x, "spotSpecifications", js.Array(value :_*))
  }
}
