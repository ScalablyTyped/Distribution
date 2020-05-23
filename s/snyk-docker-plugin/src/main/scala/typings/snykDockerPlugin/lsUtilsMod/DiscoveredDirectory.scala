package typings.snykDockerPlugin.lsUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiscoveredDirectory extends js.Object {
  var files: js.Array[DiscoveredFile]
  var name: String
  var subDirs: js.Array[DiscoveredDirectory]
}

object DiscoveredDirectory {
  @scala.inline
  def apply(files: js.Array[DiscoveredFile], name: String, subDirs: js.Array[DiscoveredDirectory]): DiscoveredDirectory = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], subDirs = subDirs.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscoveredDirectory]
  }
}

