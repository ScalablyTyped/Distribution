package typings.reactNativeWindowsCli.dependencyConfigMod

import typings.reactNativeWindowsCli.reactNativeWindowsCliStrings.cpp
import typings.reactNativeWindowsCli.reactNativeWindowsCliStrings.cs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ProjectDependency extends js.Object {
  
  var cppHeaders: js.Array[String] = js.native
  
  var cppPackageProviders: js.Array[String] = js.native
  
  var csNamespaces: js.Array[String] = js.native
  
  var csPackageProviders: js.Array[String] = js.native
  
  var directDependency: Boolean = js.native
  
  var projectFile: String = js.native
  
  var projectGuid: String | Null = js.native
  
  var projectLang: cpp | cs | Null = js.native
  
  var projectName: String = js.native
}
object ProjectDependency {
  
  @scala.inline
  def apply(
    cppHeaders: js.Array[String],
    cppPackageProviders: js.Array[String],
    csNamespaces: js.Array[String],
    csPackageProviders: js.Array[String],
    directDependency: Boolean,
    projectFile: String,
    projectName: String
  ): ProjectDependency = {
    val __obj = js.Dynamic.literal(cppHeaders = cppHeaders.asInstanceOf[js.Any], cppPackageProviders = cppPackageProviders.asInstanceOf[js.Any], csNamespaces = csNamespaces.asInstanceOf[js.Any], csPackageProviders = csPackageProviders.asInstanceOf[js.Any], directDependency = directDependency.asInstanceOf[js.Any], projectFile = projectFile.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectDependency]
  }
  
  @scala.inline
  implicit class ProjectDependencyOps[Self <: ProjectDependency] (val x: Self) extends AnyVal {
    
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
    def setCppHeadersVarargs(value: String*): Self = this.set("cppHeaders", js.Array(value :_*))
    
    @scala.inline
    def setCppHeaders(value: js.Array[String]): Self = this.set("cppHeaders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCppPackageProvidersVarargs(value: String*): Self = this.set("cppPackageProviders", js.Array(value :_*))
    
    @scala.inline
    def setCppPackageProviders(value: js.Array[String]): Self = this.set("cppPackageProviders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCsNamespacesVarargs(value: String*): Self = this.set("csNamespaces", js.Array(value :_*))
    
    @scala.inline
    def setCsNamespaces(value: js.Array[String]): Self = this.set("csNamespaces", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCsPackageProvidersVarargs(value: String*): Self = this.set("csPackageProviders", js.Array(value :_*))
    
    @scala.inline
    def setCsPackageProviders(value: js.Array[String]): Self = this.set("csPackageProviders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectDependency(value: Boolean): Self = this.set("directDependency", value.asInstanceOf[js.Any])
    
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
