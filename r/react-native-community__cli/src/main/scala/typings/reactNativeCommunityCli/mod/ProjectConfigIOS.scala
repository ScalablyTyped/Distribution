package typings.reactNativeCommunityCli.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProjectConfigIOS extends js.Object {
  var folder: String
  var libraryFolder: String
  var pbxprojPath: String
  var plist: js.Array[_]
  var podfile: Null
  var podspecPath: Null | String
  var projectName: String
  var projectPath: String
  var sharedLibraries: js.Array[_]
  var sourceDir: String
}

object ProjectConfigIOS {
  @scala.inline
  def apply(
    folder: String,
    libraryFolder: String,
    pbxprojPath: String,
    plist: js.Array[_],
    podfile: Null,
    projectName: String,
    projectPath: String,
    sharedLibraries: js.Array[_],
    sourceDir: String,
    podspecPath: String = null
  ): ProjectConfigIOS = {
    val __obj = js.Dynamic.literal(folder = folder.asInstanceOf[js.Any], libraryFolder = libraryFolder.asInstanceOf[js.Any], pbxprojPath = pbxprojPath.asInstanceOf[js.Any], plist = plist.asInstanceOf[js.Any], podfile = podfile.asInstanceOf[js.Any], projectName = projectName.asInstanceOf[js.Any], projectPath = projectPath.asInstanceOf[js.Any], sharedLibraries = sharedLibraries.asInstanceOf[js.Any], sourceDir = sourceDir.asInstanceOf[js.Any])
    if (podspecPath != null) __obj.updateDynamic("podspecPath")(podspecPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProjectConfigIOS]
  }
}

