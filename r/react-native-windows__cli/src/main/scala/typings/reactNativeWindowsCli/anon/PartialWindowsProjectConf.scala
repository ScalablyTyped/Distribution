package typings.reactNativeWindowsCli.anon

import typings.reactNativeWindowsCli.projectConfigMod.Project
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@react-native-windows/cli.@react-native-windows/cli/lib-commonjs/config/projectConfig.WindowsProjectConfig> */
@js.native
trait PartialWindowsProjectConf extends js.Object {
  
  var folder: js.UndefOr[String] = js.native
  
  var project: js.UndefOr[Project] = js.native
  
  var solutionFile: js.UndefOr[String] = js.native
  
  var sourceDir: js.UndefOr[String] = js.native
}
object PartialWindowsProjectConf {
  
  @scala.inline
  def apply(): PartialWindowsProjectConf = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialWindowsProjectConf]
  }
  
  @scala.inline
  implicit class PartialWindowsProjectConfOps[Self <: PartialWindowsProjectConf] (val x: Self) extends AnyVal {
    
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
    def deleteFolder: Self = this.set("folder", js.undefined)
    
    @scala.inline
    def setProject(value: Project): Self = this.set("project", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProject: Self = this.set("project", js.undefined)
    
    @scala.inline
    def setSolutionFile(value: String): Self = this.set("solutionFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSolutionFile: Self = this.set("solutionFile", js.undefined)
    
    @scala.inline
    def setSourceDir(value: String): Self = this.set("sourceDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceDir: Self = this.set("sourceDir", js.undefined)
  }
}
