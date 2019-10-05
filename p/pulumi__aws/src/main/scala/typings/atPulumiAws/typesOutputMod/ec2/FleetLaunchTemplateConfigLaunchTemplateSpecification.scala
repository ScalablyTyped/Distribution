package typings.atPulumiAws.typesOutputMod.ec2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FleetLaunchTemplateConfigLaunchTemplateSpecification extends js.Object {
  /**
    * ID of the launch template.
    */
  var launchTemplateId: js.UndefOr[String] = js.undefined
  /**
    * Name of the launch template.
    */
  var launchTemplateName: js.UndefOr[String] = js.undefined
  /**
    * Version number of the launch template.
    */
  var version: String
}

object FleetLaunchTemplateConfigLaunchTemplateSpecification {
  @scala.inline
  def apply(version: String, launchTemplateId: String = null, launchTemplateName: String = null): FleetLaunchTemplateConfigLaunchTemplateSpecification = {
    val __obj = js.Dynamic.literal(version = version)
    if (launchTemplateId != null) __obj.updateDynamic("launchTemplateId")(launchTemplateId)
    if (launchTemplateName != null) __obj.updateDynamic("launchTemplateName")(launchTemplateName)
    __obj.asInstanceOf[FleetLaunchTemplateConfigLaunchTemplateSpecification]
  }
}

