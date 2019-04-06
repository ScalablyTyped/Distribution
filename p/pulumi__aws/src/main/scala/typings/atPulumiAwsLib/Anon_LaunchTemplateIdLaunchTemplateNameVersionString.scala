package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LaunchTemplateIdLaunchTemplateNameVersionString extends js.Object {
  var launchTemplateId: js.UndefOr[java.lang.String] = js.undefined
  var launchTemplateName: js.UndefOr[java.lang.String] = js.undefined
  var version: java.lang.String
}

object Anon_LaunchTemplateIdLaunchTemplateNameVersionString {
  @scala.inline
  def apply(
    version: java.lang.String,
    launchTemplateId: java.lang.String = null,
    launchTemplateName: java.lang.String = null
  ): Anon_LaunchTemplateIdLaunchTemplateNameVersionString = {
    val __obj = js.Dynamic.literal(version = version)
    if (launchTemplateId != null) __obj.updateDynamic("launchTemplateId")(launchTemplateId)
    if (launchTemplateName != null) __obj.updateDynamic("launchTemplateName")(launchTemplateName)
    __obj.asInstanceOf[Anon_LaunchTemplateIdLaunchTemplateNameVersionString]
  }
}

