package typings.reactNativeWindowsCli.projectConfigMod

import typings.reactNativeWindowsCli.reactNativeWindowsCliStrings.cpp
import typings.reactNativeWindowsCli.reactNativeWindowsCliStrings.cs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Project extends js.Object {
  
  var projectFile: String = js.native
  
  var projectGuid: String | Null = js.native
  
  var projectLang: cpp | cs | Null = js.native
  
  var projectName: String = js.native
}
object Project {
  
  @scala.inline
  def apply(projectFile: String, projectName: String): Project = {
    val __obj = js.Dynamic.literal(projectFile = projectFile.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Project]
  }
  
  @scala.inline
  implicit class ProjectOps[Self <: Project] (val x: Self) extends AnyVal {
    
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
    def setProjectFile(value: String): Self = this.set("projectFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectName(value: String): Self = this.set("projectName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectGuid(value: String): Self = this.set("projectGuid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectGuidNull: Self = this.set("projectGuid", null)
    
    @scala.inline
    def setProjectLang(value: cpp | cs): Self = this.set("projectLang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectLangNull: Self = this.set("projectLang", null)
  }
}
