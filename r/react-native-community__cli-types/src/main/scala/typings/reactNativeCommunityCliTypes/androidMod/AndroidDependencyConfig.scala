package typings.reactNativeCommunityCliTypes.androidMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AndroidDependencyConfig extends js.Object {
  
  var folder: String = js.native
  
  var manifestPath: String = js.native
  
  var packageImportPath: String = js.native
  
  var packageInstance: String = js.native
  
  var packageName: String = js.native
  
  var sourceDir: String = js.native
}
object AndroidDependencyConfig {
  
  @scala.inline
  def apply(
    folder: String,
    manifestPath: String,
    packageImportPath: String,
    packageInstance: String,
    packageName: String,
    sourceDir: String
  ): AndroidDependencyConfig = {
    val __obj = js.Dynamic.literal(folder = folder.asInstanceOf[js.Any], manifestPath = manifestPath.asInstanceOf[js.Any], packageImportPath = packageImportPath.asInstanceOf[js.Any], packageInstance = packageInstance.asInstanceOf[js.Any], packageName = packageName.asInstanceOf[js.Any], sourceDir = sourceDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[AndroidDependencyConfig]
  }
  
  @scala.inline
  implicit class AndroidDependencyConfigOps[Self <: AndroidDependencyConfig] (val x: Self) extends AnyVal {
    
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
    def setManifestPath(value: String): Self = this.set("manifestPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageImportPath(value: String): Self = this.set("packageImportPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageInstance(value: String): Self = this.set("packageInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPackageName(value: String): Self = this.set("packageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceDir(value: String): Self = this.set("sourceDir", value.asInstanceOf[js.Any])
  }
}
