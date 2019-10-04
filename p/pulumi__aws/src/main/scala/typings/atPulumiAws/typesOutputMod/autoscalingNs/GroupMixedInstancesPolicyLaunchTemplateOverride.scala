package typings.atPulumiAws.typesOutputMod.autoscalingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupMixedInstancesPolicyLaunchTemplateOverride extends js.Object {
  /**
    * Override the instance type in the Launch Template.
    */
  var instanceType: js.UndefOr[String] = js.undefined
}

object GroupMixedInstancesPolicyLaunchTemplateOverride {
  @scala.inline
  def apply(instanceType: String = null): GroupMixedInstancesPolicyLaunchTemplateOverride = {
    val __obj = js.Dynamic.literal()
    if (instanceType != null) __obj.updateDynamic("instanceType")(instanceType)
    __obj.asInstanceOf[GroupMixedInstancesPolicyLaunchTemplateOverride]
  }
}

