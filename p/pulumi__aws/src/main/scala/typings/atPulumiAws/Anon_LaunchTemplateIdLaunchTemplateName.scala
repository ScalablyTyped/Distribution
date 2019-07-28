package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LaunchTemplateIdLaunchTemplateName extends js.Object {
  var launchTemplateId: js.UndefOr[Input[String]] = js.undefined
  var launchTemplateName: js.UndefOr[Input[String]] = js.undefined
  var version: js.UndefOr[Input[String]] = js.undefined
}

object Anon_LaunchTemplateIdLaunchTemplateName {
  @scala.inline
  def apply(
    launchTemplateId: Input[String] = null,
    launchTemplateName: Input[String] = null,
    version: Input[String] = null
  ): Anon_LaunchTemplateIdLaunchTemplateName = {
    val __obj = js.Dynamic.literal()
    if (launchTemplateId != null) __obj.updateDynamic("launchTemplateId")(launchTemplateId.asInstanceOf[js.Any])
    if (launchTemplateName != null) __obj.updateDynamic("launchTemplateName")(launchTemplateName.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_LaunchTemplateIdLaunchTemplateName]
  }
}

