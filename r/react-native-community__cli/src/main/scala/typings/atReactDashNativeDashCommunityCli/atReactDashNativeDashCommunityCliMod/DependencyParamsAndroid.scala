package typings.atReactDashNativeDashCommunityCli.atReactDashNativeDashCommunityCliMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DependencyParamsAndroid extends js.Object {
  var manifestPath: js.UndefOr[String] = js.undefined
  var packageImportPath: js.UndefOr[String] = js.undefined
  var packageInstance: js.UndefOr[String] = js.undefined
  var sourceDir: js.UndefOr[String] = js.undefined
}

object DependencyParamsAndroid {
  @scala.inline
  def apply(
    manifestPath: String = null,
    packageImportPath: String = null,
    packageInstance: String = null,
    sourceDir: String = null
  ): DependencyParamsAndroid = {
    val __obj = js.Dynamic.literal()
    if (manifestPath != null) __obj.updateDynamic("manifestPath")(manifestPath)
    if (packageImportPath != null) __obj.updateDynamic("packageImportPath")(packageImportPath)
    if (packageInstance != null) __obj.updateDynamic("packageInstance")(packageInstance)
    if (sourceDir != null) __obj.updateDynamic("sourceDir")(sourceDir)
    __obj.asInstanceOf[DependencyParamsAndroid]
  }
}

