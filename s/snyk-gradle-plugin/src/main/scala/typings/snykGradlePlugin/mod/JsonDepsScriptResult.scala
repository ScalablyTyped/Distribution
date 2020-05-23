package typings.snykGradlePlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JsonDepsScriptResult extends js.Object {
  var allSubProjectNames: js.Array[String]
  var defaultProject: String
  var projects: ProjectsDict
  var versionBuildInfo: VersionBuildInfo
}

object JsonDepsScriptResult {
  @scala.inline
  def apply(
    allSubProjectNames: js.Array[String],
    defaultProject: String,
    projects: ProjectsDict,
    versionBuildInfo: VersionBuildInfo
  ): JsonDepsScriptResult = {
    val __obj = js.Dynamic.literal(allSubProjectNames = allSubProjectNames.asInstanceOf[js.Any], defaultProject = defaultProject.asInstanceOf[js.Any], projects = projects.asInstanceOf[js.Any], versionBuildInfo = versionBuildInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[JsonDepsScriptResult]
  }
}

