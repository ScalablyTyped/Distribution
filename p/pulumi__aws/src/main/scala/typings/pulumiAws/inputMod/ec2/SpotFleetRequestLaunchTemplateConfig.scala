package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SpotFleetRequestLaunchTemplateConfig extends StObject {
  
  /**
    * Launch template specification. See Launch Template Specification below for more details.
    */
  var launchTemplateSpecification: Input[SpotFleetRequestLaunchTemplateConfigLaunchTemplateSpecification]
  
  /**
    * One or more override configurations. See Overrides below for more details.
    */
  var overrides: js.UndefOr[Input[js.Array[Input[SpotFleetRequestLaunchTemplateConfigOverride]]]] = js.undefined
}
object SpotFleetRequestLaunchTemplateConfig {
  
  inline def apply(
    launchTemplateSpecification: Input[SpotFleetRequestLaunchTemplateConfigLaunchTemplateSpecification]
  ): SpotFleetRequestLaunchTemplateConfig = {
    val __obj = js.Dynamic.literal(launchTemplateSpecification = launchTemplateSpecification.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpotFleetRequestLaunchTemplateConfig]
  }
  
  extension [Self <: SpotFleetRequestLaunchTemplateConfig](x: Self) {
    
    inline def setLaunchTemplateSpecification(value: Input[SpotFleetRequestLaunchTemplateConfigLaunchTemplateSpecification]): Self = StObject.set(x, "launchTemplateSpecification", value.asInstanceOf[js.Any])
    
    inline def setOverrides(value: Input[js.Array[Input[SpotFleetRequestLaunchTemplateConfigOverride]]]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setOverridesVarargs(value: Input[SpotFleetRequestLaunchTemplateConfigOverride]*): Self = StObject.set(x, "overrides", js.Array(value :_*))
  }
}
