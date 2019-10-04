package typings.atPulumiAws.typesOutputMod.autoscalingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupMixedInstancesPolicyLaunchTemplate extends js.Object {
  /**
    * Nested argument defines the Launch Template. Defined below.
    */
  var launchTemplateSpecification: GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecification
  /**
    * List of nested arguments provides the ability to specify multiple instance types. This will override the same parameter in the launch template. For on-demand instances, Auto Scaling considers the order of preference of instance types to launch based on the order specified in the overrides list. Defined below.
    */
  var overrides: js.UndefOr[js.Array[GroupMixedInstancesPolicyLaunchTemplateOverride]] = js.undefined
}

object GroupMixedInstancesPolicyLaunchTemplate {
  @scala.inline
  def apply(
    launchTemplateSpecification: GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecification,
    overrides: js.Array[GroupMixedInstancesPolicyLaunchTemplateOverride] = null
  ): GroupMixedInstancesPolicyLaunchTemplate = {
    val __obj = js.Dynamic.literal(launchTemplateSpecification = launchTemplateSpecification)
    if (overrides != null) __obj.updateDynamic("overrides")(overrides)
    __obj.asInstanceOf[GroupMixedInstancesPolicyLaunchTemplate]
  }
}

