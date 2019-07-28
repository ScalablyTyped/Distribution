package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LaunchTemplateIdLaunchTemplateNameVersion extends js.Object {
  var launchTemplateId: js.UndefOr[String] = js.undefined
  var launchTemplateName: js.UndefOr[String] = js.undefined
  var version: js.UndefOr[String] = js.undefined
}

object Anon_LaunchTemplateIdLaunchTemplateNameVersion {
  @scala.inline
  def apply(launchTemplateId: String = null, launchTemplateName: String = null, version: String = null): Anon_LaunchTemplateIdLaunchTemplateNameVersion = {
    val __obj = js.Dynamic.literal()
    if (launchTemplateId != null) __obj.updateDynamic("launchTemplateId")(launchTemplateId)
    if (launchTemplateName != null) __obj.updateDynamic("launchTemplateName")(launchTemplateName)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Anon_LaunchTemplateIdLaunchTemplateNameVersion]
  }
}

