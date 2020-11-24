package typings.reactNativeWindowsCli.dependencyConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NuGetPackageDependency extends js.Object {
  
  var cppHeaders: js.Array[String] = js.native
  
  var cppPackageProviders: js.Array[String] = js.native
  
  var csNamespaces: js.Array[String] = js.native
  
  var csPackageProviders: js.Array[String] = js.native
  
  var packageName: String = js.native
  
  var packageVersion: String = js.native
}
object NuGetPackageDependency {
  
  @scala.inline
  def apply(
    cppHeaders: js.Array[String],
    cppPackageProviders: js.Array[String],
    csNamespaces: js.Array[String],
    csPackageProviders: js.Array[String],
    packageName: String,
    packageVersion: String
  ): NuGetPackageDependency = {
    val __obj = js.Dynamic.literal(cppHeaders = cppHeaders.asInstanceOf[js.Any], cppPackageProviders = cppPackageProviders.asInstanceOf[js.Any], csNamespaces = csNamespaces.asInstanceOf[js.Any], csPackageProviders = csPackageProviders.asInstanceOf[js.Any], packageName = packageName.asInstanceOf[js.Any], packageVersion = packageVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[NuGetPackageDependency]
  }
  
  @scala.inline
  implicit class NuGetPackageDependencyOps[Self <: NuGetPackageDependency] (val x: Self) extends AnyVal {
    
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
    def setPackageName(value: String): Self = this.set("packageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageVersion(value: String): Self = this.set("packageVersion", value.asInstanceOf[js.Any])
  }
}
