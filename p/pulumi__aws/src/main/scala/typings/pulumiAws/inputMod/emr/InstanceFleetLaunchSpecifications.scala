package typings.pulumiAws.inputMod.emr

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InstanceFleetLaunchSpecifications extends StObject {
  
  /**
    * Configuration block for on demand instances launch specifications
    */
  var onDemandSpecifications: js.UndefOr[Input[js.Array[Input[InstanceFleetLaunchSpecificationsOnDemandSpecification]]]] = js.undefined
  
  /**
    * Configuration block for spot instances launch specifications
    */
  var spotSpecifications: js.UndefOr[Input[js.Array[Input[InstanceFleetLaunchSpecificationsSpotSpecification]]]] = js.undefined
}
object InstanceFleetLaunchSpecifications {
  
  @scala.inline
  def apply(): InstanceFleetLaunchSpecifications = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InstanceFleetLaunchSpecifications]
  }
  
  @scala.inline
  implicit class InstanceFleetLaunchSpecificationsMutableBuilder[Self <: InstanceFleetLaunchSpecifications] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnDemandSpecifications(value: Input[js.Array[Input[InstanceFleetLaunchSpecificationsOnDemandSpecification]]]): Self = StObject.set(x, "onDemandSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnDemandSpecificationsUndefined: Self = StObject.set(x, "onDemandSpecifications", js.undefined)
    
    @scala.inline
    def setOnDemandSpecificationsVarargs(value: Input[InstanceFleetLaunchSpecificationsOnDemandSpecification]*): Self = StObject.set(x, "onDemandSpecifications", js.Array(value :_*))
    
    @scala.inline
    def setSpotSpecifications(value: Input[js.Array[Input[InstanceFleetLaunchSpecificationsSpotSpecification]]]): Self = StObject.set(x, "spotSpecifications", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpotSpecificationsUndefined: Self = StObject.set(x, "spotSpecifications", js.undefined)
    
    @scala.inline
    def setSpotSpecificationsVarargs(value: Input[InstanceFleetLaunchSpecificationsSpotSpecification]*): Self = StObject.set(x, "spotSpecifications", js.Array(value :_*))
  }
}
