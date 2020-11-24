package typings.pulumiPulumi.projectSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectTemplateConfigValue extends js.Object {
  
  var default: js.UndefOr[String] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var secret: js.UndefOr[Boolean] = js.native
}
object ProjectTemplateConfigValue {
  
  @scala.inline
  def apply(): ProjectTemplateConfigValue = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectTemplateConfigValue]
  }
  
  @scala.inline
  implicit class ProjectTemplateConfigValueOps[Self <: ProjectTemplateConfigValue] (val x: Self) extends AnyVal {
    
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
    def setDefault(value: String): Self = this.set("default", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefault: Self = this.set("default", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setSecret(value: Boolean): Self = this.set("secret", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecret: Self = this.set("secret", js.undefined)
  }
}
