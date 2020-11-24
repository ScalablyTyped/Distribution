package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FleetLaunchTemplateConfig extends js.Object {
  
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
  implicit class FleetLaunchTemplateConfigOps[Self <: FleetLaunchTemplateConfig] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setLaunchTemplateSpecification(value: Input[FleetLaunchTemplateConfigLaunchTemplateSpecification]): Self = this.set("launchTemplateSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverridesVarargs(value: Input[FleetLaunchTemplateConfigOverride]*): Self = this.set("overrides", js.Array(value :_*))
    
    @scala.inline
    def setOverrides(value: Input[js.Array[Input[FleetLaunchTemplateConfigOverride]]]): Self = this.set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
  }
}
