package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LaunchTemplateId extends js.Object {
  var launchTemplateId: java.lang.String
  var launchTemplateName: java.lang.String
  var version: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_LaunchTemplateId {
  @scala.inline
  def apply(
    launchTemplateId: java.lang.String,
    launchTemplateName: java.lang.String,
    version: java.lang.String = null
  ): Anon_LaunchTemplateId = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("launchTemplateId")(launchTemplateId)
    __obj.updateDynamic("launchTemplateName")(launchTemplateName)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Anon_LaunchTemplateId]
  }
}

