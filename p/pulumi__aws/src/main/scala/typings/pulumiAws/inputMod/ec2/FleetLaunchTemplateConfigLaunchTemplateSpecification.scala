package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FleetLaunchTemplateConfigLaunchTemplateSpecification extends js.Object {
  /**
    * ID of the launch template.
    */
  var launchTemplateId: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the launch template.
    */
  var launchTemplateName: js.UndefOr[Input[String]] = js.native
  /**
    * Version number of the launch template.
    */
  var version: Input[String] = js.native
}

object FleetLaunchTemplateConfigLaunchTemplateSpecification {
  @scala.inline
  def apply(version: Input[String]): FleetLaunchTemplateConfigLaunchTemplateSpecification = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    __obj.asInstanceOf[FleetLaunchTemplateConfigLaunchTemplateSpecification]
  }
  @scala.inline
  implicit class FleetLaunchTemplateConfigLaunchTemplateSpecificationOps[Self <: FleetLaunchTemplateConfigLaunchTemplateSpecification] (val x: Self) extends AnyVal {
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
    def setVersion(value: Input[String]): Self = this.set("version", value.asInstanceOf[js.Any])
    @scala.inline
    def setLaunchTemplateId(value: Input[String]): Self = this.set("launchTemplateId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLaunchTemplateId: Self = this.set("launchTemplateId", js.undefined)
    @scala.inline
    def setLaunchTemplateName(value: Input[String]): Self = this.set("launchTemplateName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLaunchTemplateName: Self = this.set("launchTemplateName", js.undefined)
  }
  
}

