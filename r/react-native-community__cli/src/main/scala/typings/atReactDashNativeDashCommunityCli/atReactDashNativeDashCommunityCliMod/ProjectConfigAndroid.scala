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
    val __obj = js.Dynamic.literal(assetsPath = assetsPath.asInstanceOf[js.Any], buildGradlePath = buildGradlePath.asInstanceOf[js.Any], folder = folder.asInstanceOf[js.Any], isFlat = isFlat.asInstanceOf[js.Any], mainFilePath = mainFilePath.asInstanceOf[js.Any], manifestPath = manifestPath.asInstanceOf[js.Any], packageName = packageName.asInstanceOf[js.Any], settingsGradlePath = settingsGradlePath.asInstanceOf[js.Any], sourceDir = sourceDir.asInstanceOf[js.Any], stringsPath = stringsPath.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ProjectConfigAndroid]
  }
}

