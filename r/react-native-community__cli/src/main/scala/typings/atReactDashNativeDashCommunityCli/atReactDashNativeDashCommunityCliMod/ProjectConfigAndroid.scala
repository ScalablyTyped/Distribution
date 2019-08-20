package typings.atReactDashNativeDashCommunityCli.atReactDashNativeDashCommunityCliMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectConfigAndroid extends js.Object {
  var assetsPath: String
  var buildGradlePath: String
  var folder: String
  var isFlat: Boolean
  var mainFilePath: String
  var manifestPath: String
  var packageName: String
  var settingsGradlePath: String
  var sourceDir: String
  var stringsPath: String
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
    val __obj = js.Dynamic.literal(assetsPath = assetsPath, buildGradlePath = buildGradlePath, folder = folder, isFlat = isFlat, mainFilePath = mainFilePath, manifestPath = manifestPath, packageName = packageName, settingsGradlePath = settingsGradlePath, sourceDir = sourceDir, stringsPath = stringsPath)
  
    __obj.asInstanceOf[ProjectConfigAndroid]
  }
}

