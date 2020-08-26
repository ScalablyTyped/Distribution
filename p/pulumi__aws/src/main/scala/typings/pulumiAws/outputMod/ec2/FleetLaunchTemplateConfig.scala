package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FleetLaunchTemplateConfig extends js.Object {
  /**
    * Nested argument containing EC2 Launch Template to use. Defined below.
    */
  var launchTemplateSpecification: FleetLaunchTemplateConfigLaunchTemplateSpecification = js.native
  /**
    * Nested argument(s) containing parameters to override the same parameters in the Launch Template. Defined below.
    */
  var overrides: js.UndefOr[js.Array[FleetLaunchTemplateConfigOverride]] = js.native
}

object FleetLaunchTemplateConfig {
  @scala.inline
  def apply(launchTemplateSpecification: FleetLaunchTemplateConfigLaunchTemplateSpecification): FleetLaunchTemplateConfig = {
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
    def setLaunchTemplateSpecification(value: FleetLaunchTemplateConfigLaunchTemplateSpecification): Self = this.set("launchTemplateSpecification", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverridesVarargs(value: FleetLaunchTemplateConfigOverride*): Self = this.set("overrides", js.Array(value :_*))
    @scala.inline
    def setOverrides(value: js.Array[FleetLaunchTemplateConfigOverride]): Self = this.set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
  }
  
}

