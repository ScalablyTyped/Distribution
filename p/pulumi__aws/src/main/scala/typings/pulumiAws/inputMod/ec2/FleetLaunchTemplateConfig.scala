package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FleetLaunchTemplateConfig extends StObject {
  
  /**
    * Nested argument containing EC2 Launch Template to use. Defined below.
    */
  var launchTemplateSpecification: Input[FleetLaunchTemplateConfigLaunchTemplateSpecification] = js.native
  
  /**
    * Nested argument(s) containing parameters to override the same parameters in the Launch Template. Defined below.
    */
  var overrides: js.UndefOr[Input[js.Array[Input[FleetLaunchTemplateConfigOverride]]]] = js.native
}
object FleetLaunchTemplateConfig {
  
  @scala.inline
  def apply(launchTemplateSpecification: Input[FleetLaunchTemplateConfigLaunchTemplateSpecification]): FleetLaunchTemplateConfig = {
    val __obj = js.Dynamic.literal(launchTemplateSpecification = launchTemplateSpecification.asInstanceOf[js.Any])
    __obj.asInstanceOf[FleetLaunchTemplateConfig]
  }
  
  @scala.inline
  implicit class FleetLaunchTemplateConfigMutableBuilder[Self <: FleetLaunchTemplateConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLaunchTemplateSpecification(value: Input[FleetLaunchTemplateConfigLaunchTemplateSpecification]): Self = StObject.set(x, "launchTemplateSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrides(value: Input[js.Array[Input[FleetLaunchTemplateConfigOverride]]]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    @scala.inline
    def setOverridesVarargs(value: Input[FleetLaunchTemplateConfigOverride]*): Self = StObject.set(x, "overrides", js.Array(value :_*))
  }
}
