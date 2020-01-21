package typings.reactNativeCommunityCli.mod

import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectParamsIOS extends js.Object {
  var libraryFolder: js.UndefOr[String] = js.undefined
  var plist: js.Array[_]
  var podspecPath: js.UndefOr[String] = js.undefined
  var project: js.UndefOr[String] = js.undefined
  var scriptPhases: Record[String, String]
  var sharedLibraries: js.UndefOr[js.Array[String]] = js.undefined
}

object ProjectParamsIOS {
  @scala.inline
  def apply(
    plist: js.Array[_],
    scriptPhases: Record[String, String],
    libraryFolder: String = null,
    podspecPath: String = null,
    project: String = null,
    sharedLibraries: js.Array[String] = null
  ): ProjectParamsIOS = {
    val __obj = js.Dynamic.literal(plist = plist.asInstanceOf[js.Any], scriptPhases = scriptPhases.asInstanceOf[js.Any])
    if (libraryFolder != null) __obj.updateDynamic("libraryFolder")(libraryFolder.asInstanceOf[js.Any])
    if (podspecPath != null) __obj.updateDynamic("podspecPath")(podspecPath.asInstanceOf[js.Any])
    if (project != null) __obj.updateDynamic("project")(project.asInstanceOf[js.Any])
    if (sharedLibraries != null) __obj.updateDynamic("sharedLibraries")(sharedLibraries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectParamsIOS]
  }
}

