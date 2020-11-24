package typings.pulumiPulumi.projectSettingsMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectTemplate extends js.Object {
  
  var config: js.UndefOr[StringDictionary[ProjectTemplateConfigValue]] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var important: js.UndefOr[Boolean] = js.native
  
  var quickstart: js.UndefOr[String] = js.native
}
object ProjectTemplate {
  
  @scala.inline
  def apply(): ProjectTemplate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProjectTemplate]
  }
  
  @scala.inline
  implicit class ProjectTemplateOps[Self <: ProjectTemplate] (val x: Self) extends AnyVal {
    
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
    def setConfig(value: StringDictionary[ProjectTemplateConfigValue]): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setImportant(value: Boolean): Self = this.set("important", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImportant: Self = this.set("important", js.undefined)
    
    @scala.inline
    def setQuickstart(value: String): Self = this.set("quickstart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteQuickstart: Self = this.set("quickstart", js.undefined)
  }
}
