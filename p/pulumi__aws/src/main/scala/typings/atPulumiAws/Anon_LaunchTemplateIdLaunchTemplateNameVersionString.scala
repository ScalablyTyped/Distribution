package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LaunchTemplateIdLaunchTemplateNameVersionString extends js.Object {
  var launchTemplateId: js.UndefOr[String] = js.undefined
  var launchTemplateName: js.UndefOr[String] = js.undefined
  var version: String
}

object Anon_LaunchTemplateIdLaunchTemplateNameVersionString {
  @scala.inline
  def apply(version: String, launchTemplateId: String = null, launchTemplateName: String = null): Anon_LaunchTemplateIdLaunchTemplateNameVersionString = {
    val __obj = js.Dynamic.literal(version = version)
    if (launchTemplateId != null) __obj.updateDynamic("launchTemplateId")(launchTemplateId)
    if (launchTemplateName != null) __obj.updateDynamic("launchTemplateName")(launchTemplateName)
    __obj.asInstanceOf[Anon_LaunchTemplateIdLaunchTemplateNameVersionString]
  }
}

