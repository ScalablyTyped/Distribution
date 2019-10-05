package typings.atPulumiAws.typesOutputMod.autoscaling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecification extends js.Object {
  /**
    * The ID of the launch template. Conflicts with `launchTemplateName`.
    */
  var launchTemplateId: String
  /**
    * The name of the launch template. Conflicts with `launchTemplateId`.
    */
  var launchTemplateName: String
  /**
    * Template version. Can be version number, `$Latest`, or `$Default`. (Default: `$Default`).
    */
  var version: js.UndefOr[String] = js.undefined
}

object GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecification {
  @scala.inline
  def apply(launchTemplateId: String, launchTemplateName: String, version: String = null): GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecification = {
    val __obj = js.Dynamic.literal(launchTemplateId = launchTemplateId, launchTemplateName = launchTemplateName)
    if (version != null) __obj.updateDynamic("version")(version)
    __obj.asInstanceOf[GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecification]
  }
}

