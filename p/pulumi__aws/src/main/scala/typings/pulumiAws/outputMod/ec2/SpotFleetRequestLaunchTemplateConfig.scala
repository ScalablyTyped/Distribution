package typings.pulumiAws.outputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SpotFleetRequestLaunchTemplateConfig extends js.Object {
  /**
    * Launch template specification. See Launch Template Specification below for more details.
    */
  var launchTemplateSpecification: SpotFleetRequestLaunchTemplateConfigLaunchTemplateSpecification = js.native
  /**
    * One or more override configurations. See Overrides below for more details.
    */
  var overrides: js.UndefOr[js.Array[SpotFleetRequestLaunchTemplateConfigOverride]] = js.native
}

object SpotFleetRequestLaunchTemplateConfig {
  @scala.inline
  def apply(launchTemplateSpecification: SpotFleetRequestLaunchTemplateConfigLaunchTemplateSpecification): SpotFleetRequestLaunchTemplateConfig = {
    val __obj = js.Dynamic.literal(launchTemplateSpecification = launchTemplateSpecification.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpotFleetRequestLaunchTemplateConfig]
  }
  @scala.inline
  implicit class SpotFleetRequestLaunchTemplateConfigOps[Self <: SpotFleetRequestLaunchTemplateConfig] (val x: Self) extends AnyVal {
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
    def setLaunchTemplateSpecification(value: SpotFleetRequestLaunchTemplateConfigLaunchTemplateSpecification): Self = this.set("launchTemplateSpecification", value.asInstanceOf[js.Any])
    @scala.inline
    def setOverridesVarargs(value: SpotFleetRequestLaunchTemplateConfigOverride*): Self = this.set("overrides", js.Array(value :_*))
    @scala.inline
    def setOverrides(value: js.Array[SpotFleetRequestLaunchTemplateConfigOverride]): Self = this.set("overrides", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
  }
  
}

