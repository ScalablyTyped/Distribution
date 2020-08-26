package typings.pulumiAws.outputMod.autoscaling

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
  def apply(): GroupMixedInstancesPolicyLaunchTemplateOverride = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GroupMixedInstancesPolicyLaunchTemplateOverride]
  }
  @scala.inline
  implicit class GroupMixedInstancesPolicyLaunchTemplateOverrideOps[Self <: GroupMixedInstancesPolicyLaunchTemplateOverride] (val x: Self) extends AnyVal {
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
    def setInstanceType(value: String): Self = this.set("instanceType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInstanceType: Self = this.set("instanceType", js.undefined)
    @scala.inline
    def setWeightedCapacity(value: String): Self = this.set("weightedCapacity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeightedCapacity: Self = this.set("weightedCapacity", js.undefined)
  }
  
}

