package typings.snykCliInterface.anon

import typings.snykCliInterface.pluginMod.VersionBuildInfo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GradleProjectName extends js.Object {
  var gradleProjectName: js.UndefOr[String] = js.undefined
  var versionBuildInfo: js.UndefOr[VersionBuildInfo] = js.undefined
}

object GradleProjectName {
  @scala.inline
  def apply(gradleProjectName: String = null, versionBuildInfo: VersionBuildInfo = null): GradleProjectName = {
    val __obj = js.Dynamic.literal()
    if (gradleProjectName != null) __obj.updateDynamic("gradleProjectName")(gradleProjectName.asInstanceOf[js.Any])
    if (versionBuildInfo != null) __obj.updateDynamic("versionBuildInfo")(versionBuildInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[GradleProjectName]
  }
}

