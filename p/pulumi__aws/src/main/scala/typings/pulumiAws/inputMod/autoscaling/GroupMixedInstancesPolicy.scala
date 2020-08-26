package typings.pulumiAws.inputMod.autoscaling

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupMixedInstancesPolicy extends js.Object {
  /**
    * Nested argument containing settings on how to mix on-demand and Spot instances in the Auto Scaling group. Defined below.
    */
  var instancesDistribution: js.UndefOr[Input[GroupMixedInstancesPolicyInstancesDistribution]] = js.native
  /**
    * Nested argument containing launch template settings along with the overrides to specify multiple instance types and weights. Defined below.
    */
  var launchTemplate: Input[GroupMixedInstancesPolicyLaunchTemplate] = js.native
}

object GroupMixedInstancesPolicy {
  @scala.inline
  def apply(launchTemplate: Input[GroupMixedInstancesPolicyLaunchTemplate]): GroupMixedInstancesPolicy = {
    val __obj = js.Dynamic.literal(launchTemplate = launchTemplate.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupMixedInstancesPolicy]
  }
  @scala.inline
  implicit class GroupMixedInstancesPolicyOps[Self <: GroupMixedInstancesPolicy] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLaunchTemplate(value: Input[GroupMixedInstancesPolicyLaunchTemplate]): Self = this.set("launchTemplate", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstancesDistribution(value: Input[GroupMixedInstancesPolicyInstancesDistribution]): Self = this.set("instancesDistribution", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstancesDistribution: Self = this.set("instancesDistribution", js.undefined)
  }
  
}

