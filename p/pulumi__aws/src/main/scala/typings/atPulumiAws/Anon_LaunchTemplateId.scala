package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LaunchTemplateId extends js.Object {
  var launchTemplateId: String
  var launchTemplateName: String
  var version: js.UndefOr[String] = js.undefined
}

object Anon_LaunchTemplateId {
  @scala.inline
  def apply(launchTemplateId: String, launchTemplateName: String, version: String = null): Anon_LaunchTemplateId = {
    val __obj = js.Dynamic.literal(launchTemplateId = launchTemplateId, launchTemplateName = launchTemplateName)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[Anon_LaunchTemplateId]
  }
}

