package typings.pulumiAws.outputMod.autoscaling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupMixedInstancesPolicy extends js.Object {
  
  /**
    * Nested argument containing settings on how to mix on-demand and Spot instances in the Auto Scaling group. Defined below.
    */
  var instancesDistribution: GroupMixedInstancesPolicyInstancesDistribution = js.native
  
  /**
    * Nested argument containing launch template settings along with the overrides to specify multiple instance types and weights. Defined below.
    */
  var launchTemplate: GroupMixedInstancesPolicyLaunchTemplate = js.native
}
object GroupMixedInstancesPolicy {
  
  @scala.inline
  def apply(
    instancesDistribution: GroupMixedInstancesPolicyInstancesDistribution,
    launchTemplate: GroupMixedInstancesPolicyLaunchTemplate
  ): GroupMixedInstancesPolicy = {
    val __obj = js.Dynamic.literal(instancesDistribution = instancesDistribution.asInstanceOf[js.Any], launchTemplate = launchTemplate.asInstanceOf[js.Any])
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
    def setInstancesDistribution(value: GroupMixedInstancesPolicyInstancesDistribution): Self = this.set("instancesDistribution", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLaunchTemplate(value: GroupMixedInstancesPolicyLaunchTemplate): Self = this.set("launchTemplate", value.asInstanceOf[js.Any])
  }
}
