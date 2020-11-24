package typings.reactNativeCommunityCliTypes.androidMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<@react-native-community/cli-types.@react-native-community/cli-types/build/android.AndroidProjectConfig> */
@js.native
trait AndroidProjectParams extends js.Object {
  
  var appName: js.UndefOr[String] = js.native
  
  var assetsPath: js.UndefOr[String] = js.native
  
  var buildGradlePath: js.UndefOr[String] = js.native
  
  var folder: js.UndefOr[String] = js.native
  
  var isFlat: js.UndefOr[Boolean] = js.native
  
  var mainFilePath: js.UndefOr[String] = js.native
  
  var manifestPath: js.UndefOr[String] = js.native
  
  var packageFolder: js.UndefOr[String] = js.native
  
  var packageName: js.UndefOr[String] = js.native
  
  var settingsGradlePath: js.UndefOr[String] = js.native
  
  var sourceDir: js.UndefOr[String] = js.native
  
  var stringsPath: js.UndefOr[String] = js.native
}
object AndroidProjectParams {
  
  @scala.inline
  def apply(): AndroidProjectParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AndroidProjectParams]
  }
  
  @scala.inline
  implicit class AndroidProjectParamsOps[Self <: AndroidProjectParams] (val x: Self) extends AnyVal {
    
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
    def setAppName(value: String): Self = this.set("appName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAppName: Self = this.set("appName", js.undefined)
    
    @scala.inline
    def setAssetsPath(value: String): Self = this.set("assetsPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAssetsPath: Self = this.set("assetsPath", js.undefined)
    
    @scala.inline
    def setBuildGradlePath(value: String): Self = this.set("buildGradlePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBuildGradlePath: Self = this.set("buildGradlePath", js.undefined)
    
    @scala.inline
    def setFolder(value: String): Self = this.set("folder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFolder: Self = this.set("folder", js.undefined)
    
    @scala.inline
    def setIsFlat(value: Boolean): Self = this.set("isFlat", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsFlat: Self = this.set("isFlat", js.undefined)
    
    @scala.inline
    def setMainFilePath(value: String): Self = this.set("mainFilePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMainFilePath: Self = this.set("mainFilePath", js.undefined)
    
    @scala.inline
    def setManifestPath(value: String): Self = this.set("manifestPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteManifestPath: Self = this.set("manifestPath", js.undefined)
    
    @scala.inline
    def setPackageFolder(value: String): Self = this.set("packageFolder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackageFolder: Self = this.set("packageFolder", js.undefined)
    
    @scala.inline
    def setPackageName(value: String): Self = this.set("packageName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePackageName: Self = this.set("packageName", js.undefined)
    
    @scala.inline
    def setSettingsGradlePath(value: String): Self = this.set("settingsGradlePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSettingsGradlePath: Self = this.set("settingsGradlePath", js.undefined)
    
    @scala.inline
    def setSourceDir(value: String): Self = this.set("sourceDir", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSourceDir: Self = this.set("sourceDir", js.undefined)
    
    @scala.inline
    def setStringsPath(value: String): Self = this.set("stringsPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStringsPath: Self = this.set("stringsPath", js.undefined)
  }
}
