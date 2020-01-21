package typings.reactNativeCommunityCli.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectParamsAndroid extends js.Object {
  var assetsPath: js.UndefOr[String] = js.undefined
  var buildGradlePath: js.UndefOr[String] = js.undefined
  var mainFilePath: js.UndefOr[String] = js.undefined
  var manifestPath: js.UndefOr[String] = js.undefined
  var packageFolder: js.UndefOr[String] = js.undefined
  var packageName: js.UndefOr[String] = js.undefined
  var settingsGradlePath: js.UndefOr[String] = js.undefined
  var sourceDir: js.UndefOr[String] = js.undefined
  var stringsPath: js.UndefOr[String] = js.undefined
}

object ProjectParamsAndroid {
  @scala.inline
  def apply(
    assetsPath: String = null,
    buildGradlePath: String = null,
    mainFilePath: String = null,
    manifestPath: String = null,
    packageFolder: String = null,
    packageName: String = null,
    settingsGradlePath: String = null,
    sourceDir: String = null,
    stringsPath: String = null
  ): ProjectParamsAndroid = {
    val __obj = js.Dynamic.literal()
    if (assetsPath != null) __obj.updateDynamic("assetsPath")(assetsPath.asInstanceOf[js.Any])
    if (buildGradlePath != null) __obj.updateDynamic("buildGradlePath")(buildGradlePath.asInstanceOf[js.Any])
    if (mainFilePath != null) __obj.updateDynamic("mainFilePath")(mainFilePath.asInstanceOf[js.Any])
    if (manifestPath != null) __obj.updateDynamic("manifestPath")(manifestPath.asInstanceOf[js.Any])
    if (packageFolder != null) __obj.updateDynamic("packageFolder")(packageFolder.asInstanceOf[js.Any])
    if (packageName != null) __obj.updateDynamic("packageName")(packageName.asInstanceOf[js.Any])
    if (settingsGradlePath != null) __obj.updateDynamic("settingsGradlePath")(settingsGradlePath.asInstanceOf[js.Any])
    if (sourceDir != null) __obj.updateDynamic("sourceDir")(sourceDir.asInstanceOf[js.Any])
    if (stringsPath != null) __obj.updateDynamic("stringsPath")(stringsPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectParamsAndroid]
  }
}

