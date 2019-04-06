package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LaunchTemplateIdLaunchTemplateNameVersion extends js.Object {
  var launchTemplateId: js.UndefOr[java.lang.String] = js.undefined
  var launchTemplateName: js.UndefOr[java.lang.String] = js.undefined
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_LaunchTemplateIdLaunchTemplateNameVersion {
  @scala.inline
  def apply(
    launchTemplateId: java.lang.String = null,
    launchTemplateName: java.lang.String = null,
    version: java.lang.String = null
  ): Anon_LaunchTemplateIdLaunchTemplateNameVersion = {
    val __obj = js.Dynamic.literal()
    if (launchTemplateId != null) __obj.updateDynamic("launchTemplateId")(launchTemplateId)
    if (launchTemplateName != null) __obj.updateDynamic("launchTemplateName")(launchTemplateName)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Anon_LaunchTemplateIdLaunchTemplateNameVersion]
  }
}

