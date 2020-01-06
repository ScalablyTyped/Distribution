package typings.atPulumiAws.typesOutputMod.autoscaling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupMixedInstancesPolicyLaunchTemplateOverride extends js.Object {
  /**
    * Override the instance type in the Launch Template.
    */
  var instanceType: js.UndefOr[String] = js.native
  /**
    * The number of capacity units, which gives the instance type a proportional weight to other instance types.
    */
  var weightedCapacity: js.UndefOr[String] = js.native
}

object GroupMixedInstancesPolicyLaunchTemplateOverride {
  @scala.inline
  def apply(instanceType: String = null, weightedCapacity: String = null): GroupMixedInstancesPolicyLaunchTemplateOverride = {
    val __obj = js.Dynamic.literal()
    if (instanceType != null) __obj.updateDynamic("instanceType")(instanceType.asInstanceOf[js.Any])
    if (weightedCapacity != null) __obj.updateDynamic("weightedCapacity")(weightedCapacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupMixedInstancesPolicyLaunchTemplateOverride]
  }
}

