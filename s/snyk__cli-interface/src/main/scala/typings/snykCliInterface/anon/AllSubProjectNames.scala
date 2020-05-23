package typings.snykCliInterface.anon

import typings.snykCliInterface.pluginMod.VersionBuildInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllSubProjectNames extends js.Object {
  var allSubProjectNames: js.UndefOr[js.Array[String]] = js.undefined
  var versionBuildInfo: js.UndefOr[VersionBuildInfo] = js.undefined
}

object AllSubProjectNames {
  @scala.inline
  def apply(allSubProjectNames: js.Array[String] = null, versionBuildInfo: VersionBuildInfo = null): AllSubProjectNames = {
    val __obj = js.Dynamic.literal()
    if (allSubProjectNames != null) __obj.updateDynamic("allSubProjectNames")(allSubProjectNames.asInstanceOf[js.Any])
    if (versionBuildInfo != null) __obj.updateDynamic("versionBuildInfo")(versionBuildInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllSubProjectNames]
  }
}

