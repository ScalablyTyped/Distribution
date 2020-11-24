package typings.reactNativeWindowsCli.dependencyConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowsDependencyConfig extends js.Object {
  
  var folder: String = js.native
  
  var nugetPackages: js.Array[NuGetPackageDependency] = js.native
  
  var projects: js.Array[ProjectDependency] = js.native
  
  var solutionFile: js.UndefOr[String | Null] = js.native
  
  var sourceDir: js.UndefOr[String] = js.native
}
object WindowsDependencyConfig {
  
  @scala.inline
  def apply(
    folder: String,
    nugetPackages: js.Array[NuGetPackageDependency],
    projects: js.Array[ProjectDependency]
  ): WindowsDependencyConfig = {
    val __obj = js.Dynamic.literal(folder = folder.asInstanceOf[js.Any], nugetPackages = nugetPackages.asInstanceOf[js.Any], projects = projects.asInstanceOf[js.Any])
    __obj.asInstanceOf[WindowsDependencyConfig]
  }
  
  @scala.inline
  implicit class WindowsDependencyConfigOps[Self <: WindowsDependencyConfig] (val x: Self) extends AnyVal {
    
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
    def setNugetPackagesVarargs(value: NuGetPackageDependency*): Self = this.set("nugetPackages", js.Array(value :_*))
    
    @scala.inline
    def setNugetPackages(value: js.Array[NuGetPackageDependency]): Self = this.set("nugetPackages", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProjectsVarargs(value: ProjectDependency*): Self = this.set("projects", js.Array(value :_*))
    
    @scala.inline
    def setProjects(value: js.Array[ProjectDependency]): Self = this.set("projects", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSolutionFile(value: String): Self = this.set("solutionFile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSolutionFile: Self = this.set("solutionFile", js.undefined)
    
    @scala.inline
    def setSolutionFileNull: Self = this.set("solutionFile", null)
    
    @scala.inline
    def setSourceDir(value: String): Self = this.set("sourceDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceDir: Self = this.set("sourceDir", js.undefined)
  }
}
