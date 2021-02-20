package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpotFleetRequestLaunchTemplateConfig extends StObject {
  
  /**
    * Launch template specification. See Launch Template Specification below for more details.
    */
  var launchTemplateSpecification: Input[SpotFleetRequestLaunchTemplateConfigLaunchTemplateSpecification] = js.native
  
  /**
    * One or more override configurations. See Overrides below for more details.
    */
  var overrides: js.UndefOr[Input[js.Array[Input[SpotFleetRequestLaunchTemplateConfigOverride]]]] = js.native
}
object SpotFleetRequestLaunchTemplateConfig {
  
  @scala.inline
  def apply(
    launchTemplateSpecification: Input[SpotFleetRequestLaunchTemplateConfigLaunchTemplateSpecification]
  ): SpotFleetRequestLaunchTemplateConfig = {
    val __obj = js.Dynamic.literal(launchTemplateSpecification = launchTemplateSpecification.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpotFleetRequestLaunchTemplateConfig]
  }
  
  @scala.inline
  implicit class SpotFleetRequestLaunchTemplateConfigMutableBuilder[Self <: SpotFleetRequestLaunchTemplateConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLaunchTemplateSpecification(value: Input[SpotFleetRequestLaunchTemplateConfigLaunchTemplateSpecification]): Self = StObject.set(x, "launchTemplateSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverrides(value: Input[js.Array[Input[SpotFleetRequestLaunchTemplateConfigOverride]]]): Self = StObject.set(x, "overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverridesUndefined: Self = StObject.set(x, "overrides", js.undefined)
    
    @scala.inline
    def setOverridesVarargs(value: Input[SpotFleetRequestLaunchTemplateConfigOverride]*): Self = StObject.set(x, "overrides", js.Array(value :_*))
  }
}
