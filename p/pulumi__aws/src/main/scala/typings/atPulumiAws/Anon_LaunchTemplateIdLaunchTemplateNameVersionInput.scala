package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LaunchTemplateIdLaunchTemplateNameVersionInput extends js.Object {
  var launchTemplateId: js.UndefOr[Input[String]] = js.undefined
  var launchTemplateName: js.UndefOr[Input[String]] = js.undefined
  var version: Input[String]
}

object Anon_LaunchTemplateIdLaunchTemplateNameVersionInput {
  @scala.inline
  def apply(
    version: Input[String],
    launchTemplateId: Input[String] = null,
    launchTemplateName: Input[String] = null
  ): Anon_LaunchTemplateIdLaunchTemplateNameVersionInput = {
    val __obj = js.Dynamic.literal(version = version.asInstanceOf[js.Any])
    if (launchTemplateId != null) __obj.updateDynamic("launchTemplateId")(launchTemplateId.asInstanceOf[js.Any])
    if (launchTemplateName != null) __obj.updateDynamic("launchTemplateName")(launchTemplateName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_LaunchTemplateIdLaunchTemplateNameVersionInput]
  }
}

