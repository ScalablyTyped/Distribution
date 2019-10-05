package typings.atPulumiAws.typesInputMod.ec2

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FleetLaunchTemplateConfigLaunchTemplateSpecification extends js.Object {
  /**
    * ID of the launch template.
    */
  var launchTemplateId: js.UndefOr[Input[String]] = js.undefined
  /**
    * Name of the launch template.
    */
  var launchTemplateName: js.UndefOr[Input[String]] = js.undefined
  /**
    * Version number of the launch template.
    */
  var version: Input[String]
}

object FleetLaunchTemplateConfigLaunchTemplateSpecification {
  @scala.inline
  def apply(
    version: Input[String],
    launchTemplateId: Input[String] = null,
    launchTemplateName: Input[String] = null
  ): FleetLaunchTemplateConfigLaunchTemplateSpecification = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    if (launchTemplateId != null) __obj.updateDynamic("launchTemplateId")(launchTemplateId.asInstanceOf[js.Any])
    if (launchTemplateName != null) __obj.updateDynamic("launchTemplateName")(launchTemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FleetLaunchTemplateConfigLaunchTemplateSpecification]
  }
}

