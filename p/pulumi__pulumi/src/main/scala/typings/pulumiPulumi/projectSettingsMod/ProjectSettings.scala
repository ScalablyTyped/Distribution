package typings.pulumiPulumi.projectSettingsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectSettings extends js.Object {
  
  var author: js.UndefOr[String] = js.native
  
  var backend: js.UndefOr[ProjectBackend] = js.native
  
  var config: js.UndefOr[String] = js.native
  
  var description: js.UndefOr[String] = js.native
  
  var license: js.UndefOr[String] = js.native
  
  var main: js.UndefOr[String] = js.native
  
  var name: String = js.native
  
  var runtime: ProjectRuntimeInfo | ProjectRuntime = js.native
  
  var template: js.UndefOr[ProjectTemplate] = js.native
  
  var website: js.UndefOr[String] = js.native
}
object ProjectSettings {
  
  @scala.inline
  def apply(name: String, runtime: ProjectRuntimeInfo | ProjectRuntime): ProjectSettings = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], runtime = runtime.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectSettings]
  }
  
  @scala.inline
  implicit class ProjectSettingsOps[Self <: ProjectSettings] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntime(value: ProjectRuntimeInfo | ProjectRuntime): Self = this.set("runtime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuthor(value: String): Self = this.set("author", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuthor: Self = this.set("author", js.undefined)
    
    @scala.inline
    def setBackend(value: ProjectBackend): Self = this.set("backend", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackend: Self = this.set("backend", js.undefined)
    
    @scala.inline
    def setConfig(value: String): Self = this.set("config", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfig: Self = this.set("config", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setLicense(value: String): Self = this.set("license", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLicense: Self = this.set("license", js.undefined)
    
    @scala.inline
    def setMain(value: String): Self = this.set("main", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMain: Self = this.set("main", js.undefined)
    
    @scala.inline
    def setTemplate(value: ProjectTemplate): Self = this.set("template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTemplate: Self = this.set("template", js.undefined)
    
    @scala.inline
    def setWebsite(value: String): Self = this.set("website", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWebsite: Self = this.set("website", js.undefined)
  }
}
