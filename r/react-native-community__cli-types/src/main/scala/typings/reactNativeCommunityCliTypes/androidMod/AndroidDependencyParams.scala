package typings.reactNativeCommunityCliTypes.androidMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@react-native-community/cli-types.@react-native-community/cli-types/build/android.AndroidDependencyConfig> */
@js.native
trait AndroidDependencyParams extends js.Object {
  
  var folder: js.UndefOr[String] = js.native
  
  var manifestPath: js.UndefOr[String] = js.native
  
  var packageImportPath: js.UndefOr[String] = js.native
  
  var packageInstance: js.UndefOr[String] = js.native
  
  var packageName: js.UndefOr[String] = js.native
  
  var sourceDir: js.UndefOr[String] = js.native
}
object AndroidDependencyParams {
  
  @scala.inline
  def apply(): AndroidDependencyParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidDependencyParams]
  }
  
  @scala.inline
  implicit class AndroidDependencyParamsOps[Self <: AndroidDependencyParams] (val x: Self) extends AnyVal {
    
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
    def setManifestPath(value: String): Self = this.set("manifestPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManifestPath: Self = this.set("manifestPath", js.undefined)
    
    @scala.inline
    def setPackageImportPath(value: String): Self = this.set("packageImportPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackageImportPath: Self = this.set("packageImportPath", js.undefined)
    
    @scala.inline
    def setPackageInstance(value: String): Self = this.set("packageInstance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackageInstance: Self = this.set("packageInstance", js.undefined)
    
    @scala.inline
    def setPackageName(value: String): Self = this.set("packageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackageName: Self = this.set("packageName", js.undefined)
    
    @scala.inline
    def setSourceDir(value: String): Self = this.set("sourceDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceDir: Self = this.set("sourceDir", js.undefined)
  }
}
