package typings.reactNativeCommunityCli.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProjectConfigAndroid extends js.Object {
  var assetsPath: String = js.native
  var buildGradlePath: String = js.native
  var folder: String = js.native
  var isFlat: Boolean = js.native
  var mainFilePath: String = js.native
  var manifestPath: String = js.native
  var packageName: String = js.native
  var settingsGradlePath: String = js.native
  var sourceDir: String = js.native
  var stringsPath: String = js.native
}

object ProjectConfigAndroid {
  @scala.inline
  def apply(
    assetsPath: String,
    buildGradlePath: String,
    folder: String,
    isFlat: Boolean,
    mainFilePath: String,
    manifestPath: String,
    packageName: String,
    settingsGradlePath: String,
    sourceDir: String,
    stringsPath: String
  ): ProjectConfigAndroid = {
    val __obj = js.Dynamic.literal(assetsPath = assetsPath.asInstanceOf[js.Any], buildGradlePath = buildGradlePath.asInstanceOf[js.Any], folder = folder.asInstanceOf[js.Any], isFlat = isFlat.asInstanceOf[js.Any], mainFilePath = mainFilePath.asInstanceOf[js.Any], manifestPath = manifestPath.asInstanceOf[js.Any], packageName = packageName.asInstanceOf[js.Any], settingsGradlePath = settingsGradlePath.asInstanceOf[js.Any], sourceDir = sourceDir.asInstanceOf[js.Any], stringsPath = stringsPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectConfigAndroid]
  }
  @scala.inline
  implicit class ProjectConfigAndroidOps[Self <: ProjectConfigAndroid] (val x: Self) extends AnyVal {
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
    def setAssetsPath(value: String): Self = this.set("assetsPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setBuildGradlePath(value: String): Self = this.set("buildGradlePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setFolder(value: String): Self = this.set("folder", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsFlat(value: Boolean): Self = this.set("isFlat", value.asInstanceOf[js.Any])
    @scala.inline
    def setMainFilePath(value: String): Self = this.set("mainFilePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setManifestPath(value: String): Self = this.set("manifestPath", value.asInstanceOf[js.Any])
    @scala.inline
    def setPackageName(value: String): Self = this.set("packageName", value.asInstanceOf[js.Any])
    @scala.inline
    def setSettingsGradlePath(value: String): Self = this.set("settingsGradlePath", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceDir(value: String): Self = this.set("sourceDir", value.asInstanceOf[js.Any])
    @scala.inline
    def setStringsPath(value: String): Self = this.set("stringsPath", value.asInstanceOf[js.Any])
  }
  
}

