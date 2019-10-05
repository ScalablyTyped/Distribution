package typings.atPulumiAws.typesInputMod.autoscaling

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GroupMixedInstancesPolicyLaunchTemplateOverride extends js.Object {
  /**
    * Override the instance type in the Launch Template.
    */
  var instanceType: js.UndefOr[Input[String]] = js.undefined
}

object GroupMixedInstancesPolicyLaunchTemplateOverride {
  @scala.inline
  def apply(instanceType: Input[String] = null): GroupMixedInstancesPolicyLaunchTemplateOverride = {
    val __obj = js.Dynamic.literal()
    if (instanceType != null) __obj.updateDynamic("instanceType")(instanceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupMixedInstancesPolicyLaunchTemplateOverride]
  }
}

