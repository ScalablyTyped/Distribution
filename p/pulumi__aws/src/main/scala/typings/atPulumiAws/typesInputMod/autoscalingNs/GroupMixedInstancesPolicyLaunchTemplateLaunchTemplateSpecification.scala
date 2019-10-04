package typings.atPulumiAws.typesInputMod.autoscalingNs

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecification extends js.Object {
  /**
    * The ID of the launch template. Conflicts with `launchTemplateName`.
    */
  var launchTemplateId: js.UndefOr[Input[String]] = js.undefined
  /**
    * The name of the launch template. Conflicts with `launchTemplateId`.
    */
  var launchTemplateName: js.UndefOr[Input[String]] = js.undefined
  /**
    * Template version. Can be version number, `$Latest`, or `$Default`. (Default: `$Default`).
    */
  var version: js.UndefOr[Input[String]] = js.undefined
}

object GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecification {
  @scala.inline
  def apply(
    launchTemplateId: Input[String] = null,
    launchTemplateName: Input[String] = null,
    version: Input[String] = null
  ): GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecification = {
    val __obj = js.Dynamic.literal()
    if (launchTemplateId != null) __obj.updateDynamic("launchTemplateId")(launchTemplateId.asInstanceOf[js.Any])
    if (launchTemplateName != null) __obj.updateDynamic("launchTemplateName")(launchTemplateName.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecification]
  }
}

