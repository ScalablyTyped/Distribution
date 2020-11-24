package typings.pulumiAws.inputMod.ec2

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpotFleetRequestLaunchTemplateConfigLaunchTemplateSpecification extends js.Object {
  
  /**
    * The ID of the launch template. Conflicts with `name`.
    */
  var id: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the launch template. Conflicts with `id`.
    */
  var name: js.UndefOr[Input[String]] = js.native
  
  /**
    * Template version. Unlike the autoscaling equivalent, does not support `$Latest` or `$Default`, so use the launchTemplate resource's attribute, e.g. `"${aws_launch_template.foo.latest_version}"`. It will use the default version if omitted.
    */
  var version: js.UndefOr[Input[String]] = js.native
}
object SpotFleetRequestLaunchTemplateConfigLaunchTemplateSpecification {
  
  @scala.inline
  def apply(): SpotFleetRequestLaunchTemplateConfigLaunchTemplateSpecification = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SpotFleetRequestLaunchTemplateConfigLaunchTemplateSpecification]
  }
  
  @scala.inline
  implicit class SpotFleetRequestLaunchTemplateConfigLaunchTemplateSpecificationOps[Self <: SpotFleetRequestLaunchTemplateConfigLaunchTemplateSpecification] (val x: Self) extends AnyVal {
    
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
    def setId(value: Input[String]): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setVersion(value: Input[String]): Self = this.set("version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVersion: Self = this.set("version", js.undefined)
  }
}
