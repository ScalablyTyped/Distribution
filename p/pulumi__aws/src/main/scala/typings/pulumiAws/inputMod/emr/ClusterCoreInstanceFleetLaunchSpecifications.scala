package typings.pulumiAws.inputMod.emr

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClusterCoreInstanceFleetLaunchSpecifications extends StObject {
  
  /**
    * Configuration block for on demand instances launch specifications
    */
  var onDemandSpecifications: js.UndefOr[
    Input[
      js.Array[Input[ClusterCoreInstanceFleetLaunchSpecificationsOnDemandSpecification]]
    ]
  ] = js.native
  
  /**
    * Configuration block for spot instances launch specifications
    */
  var spotSpecifications: js.UndefOr[
    Input[js.Array[Input[ClusterCoreInstanceFleetLaunchSpecificationsSpotSpecification]]]
  ] = js.native
}
object ClusterCoreInstanceFleetLaunchSpecifications {
  
  @scala.inline
  def apply(): ClusterCoreInstanceFleetLaunchSpecifications = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterCoreInstanceFleetLaunchSpecifications]
  }
  
  @scala.inline
  implicit class ClusterCoreInstanceFleetLaunchSpecificationsMutableBuilder[Self <: ClusterCoreInstanceFleetLaunchSpecifications] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnDemandSpecifications(
      value: Input[
          js.Array[Input[ClusterCoreInstanceFleetLaunchSpecificationsOnDemandSpecification]]
        ]
    ): Self = StObject.set(x, "onDemandSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDemandSpecificationsUndefined: Self = StObject.set(x, "onDemandSpecifications", js.undefined)
    
    @scala.inline
    def setOnDemandSpecificationsVarargs(value: Input[ClusterCoreInstanceFleetLaunchSpecificationsOnDemandSpecification]*): Self = StObject.set(x, "onDemandSpecifications", js.Array(value :_*))
    
    @scala.inline
    def setSpotSpecifications(value: Input[js.Array[Input[ClusterCoreInstanceFleetLaunchSpecificationsSpotSpecification]]]): Self = StObject.set(x, "spotSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpotSpecificationsUndefined: Self = StObject.set(x, "spotSpecifications", js.undefined)
    
    @scala.inline
    def setSpotSpecificationsVarargs(value: Input[ClusterCoreInstanceFleetLaunchSpecificationsSpotSpecification]*): Self = StObject.set(x, "spotSpecifications", js.Array(value :_*))
  }
}
