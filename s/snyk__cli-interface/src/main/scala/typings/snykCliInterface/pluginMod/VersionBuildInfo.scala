package typings.snykCliInterface.pluginMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VersionBuildInfo extends js.Object {
  var gradleVersion: js.UndefOr[String] = js.undefined
  var metaBuildVersion: StringDictionary[String]
}

object VersionBuildInfo {
  @scala.inline
  def apply(metaBuildVersion: StringDictionary[String], gradleVersion: String = null): VersionBuildInfo = {
    val __obj = js.Dynamic.literal(metaBuildVersion = metaBuildVersion.asInstanceOf[js.Any])
    if (gradleVersion != null) __obj.updateDynamic("gradleVersion")(gradleVersion.asInstanceOf[js.Any])
    __obj.asInstanceOf[VersionBuildInfo]
  }
}

