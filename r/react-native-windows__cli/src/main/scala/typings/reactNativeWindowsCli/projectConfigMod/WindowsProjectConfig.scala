package typings.reactNativeWindowsCli.projectConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowsProjectConfig extends js.Object {
  
  var folder: String = js.native
  
  var project: Project = js.native
  
  var solutionFile: String = js.native
  
  var sourceDir: String = js.native
}
object WindowsProjectConfig {
  
  @scala.inline
  def apply(folder: String, project: Project, solutionFile: String, sourceDir: String): WindowsProjectConfig = {
    val __obj = js.Dynamic.literal(folder = folder.asInstanceOf[js.Any], project = project.asInstanceOf[js.Any], solutionFile = solutionFile.asInstanceOf[js.Any], sourceDir = sourceDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowsProjectConfig]
  }
  
  @scala.inline
  implicit class WindowsProjectConfigOps[Self <: WindowsProjectConfig] (val x: Self) extends AnyVal {
    
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
    def setFolder(value: String): Self = this.set("folder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProject(value: Project): Self = this.set("project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSolutionFile(value: String): Self = this.set("solutionFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceDir(value: String): Self = this.set("sourceDir", value.asInstanceOf[js.Any])
  }
}
