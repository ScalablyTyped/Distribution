package typings.pulumiAws.outputMod.autoscaling

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GroupMixedInstancesPolicyLaunchTemplate extends js.Object {
  
  /**
    * Nested argument defines the Launch Template. Defined below.
    */
  var launchTemplateSpecification: GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecification = js.native
  
  /**
    * List of nested arguments provides the ability to specify multiple instance types. This will override the same parameter in the launch template. For on-demand instances, Auto Scaling considers the order of preference of instance types to launch based on the order specified in the overrides list. Defined below.
    */
  var overrides: js.UndefOr[js.Array[GroupMixedInstancesPolicyLaunchTemplateOverride]] = js.native
}
object GroupMixedInstancesPolicyLaunchTemplate {
  
  @scala.inline
  def apply(launchTemplateSpecification: GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecification): GroupMixedInstancesPolicyLaunchTemplate = {
    val __obj = js.Dynamic.literal(launchTemplateSpecification = launchTemplateSpecification.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupMixedInstancesPolicyLaunchTemplate]
  }
  
  @scala.inline
  implicit class GroupMixedInstancesPolicyLaunchTemplateOps[Self <: GroupMixedInstancesPolicyLaunchTemplate] (val x: Self) extends AnyVal {
    
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
    def setLaunchTemplateSpecification(value: GroupMixedInstancesPolicyLaunchTemplateLaunchTemplateSpecification): Self = this.set("launchTemplateSpecification", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOverridesVarargs(value: GroupMixedInstancesPolicyLaunchTemplateOverride*): Self = this.set("overrides", js.Array(value :_*))
    
    @scala.inline
    def setOverrides(value: js.Array[GroupMixedInstancesPolicyLaunchTemplateOverride]): Self = this.set("overrides", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOverrides: Self = this.set("overrides", js.undefined)
  }
}
