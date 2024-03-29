package typings.pulumiAws.outputMod.ec2

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FleetLaunchTemplateConfig extends StObject {
  
  /**
    * Nested argument containing EC2 Launch Template to use. Defined below.
    */
  var launchTemplateSpecification: FleetLaunchTemplateConfigLaunchTemplateSpecification
  
  /**
    * Nested argument(s) containing parameters to override the same parameters in the Launch Template. Defined below.
    */
  var overrides: js.UndefOr[js.Array[FleetLaunchTemplateConfigOverride]] = js.undefined
}
object FleetLaunchTemplateConfig {
  
  inline def apply(launchTemplateSpecification: FleetLaunchTemplateConfigLaunchTemplateSpecification): FleetLaunchTemplateConfig = {
    val __obj = js.Dynamic.literal(launchTemplateSpecification = launchTemplateSpecification.asInstanceOf[js.Any])
    __obj.asInstanceOf[FleetLaunchTemplateConfig]
  }
  
  extension [Self <: FleetLaunchTemplateConfig](x: Self) {
    
    inline def setLaunchTemplateSpecification(value: FleetLaunchTemplateConfigLaunchTemplateSpecification): Self = StObject.set(x, "launchTemplateSpecification", value.asInstanceOf[js.Any])
    
    inline def setOverrides(value: js.Array[FleetLaunchTemplateConfigOverride]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    inline def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    inline def setOverridesVarargs(value: FleetLaunchTemplateConfigOverride*): Self = StObject.set(x, "overrides", js.Array(value :_*))
  }
}
