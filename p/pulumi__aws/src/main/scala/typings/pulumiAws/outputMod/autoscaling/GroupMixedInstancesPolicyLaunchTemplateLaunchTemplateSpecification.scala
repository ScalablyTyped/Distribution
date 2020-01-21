package typings.pulumiAws.outputMod.autoscaling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecification extends js.Object {
  /**
    * The ID of the launch template. Conflicts with `launchTemplateName`.
    */
  var launchTemplateId: String = js.native
  /**
    * The name of the launch template. Conflicts with `launchTemplateId`.
    */
  var launchTemplateName: String = js.native
  /**
    * Template version. Can be version number, `$Latest`, or `$Default`. (Default: `$Default`).
    */
  var version: js.UndefOr[String] = js.native
}

object GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecification {
  @scala.inline
  def apply(launchTemplateId: String, launchTemplateName: String, version: String = null): GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecification = {
    val __obj = js.Dynamic.literal(launchTemplateId = launchTemplateId.asInstanceOf[js.Any], launchTemplateName = launchTemplateName.asInstanceOf[js.Any])
    if (version != null) __obj.updateDynamic("version")(version.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecification]
  }
}

