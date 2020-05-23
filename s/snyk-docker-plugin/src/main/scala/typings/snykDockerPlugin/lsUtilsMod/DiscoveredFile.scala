package typings.snykDockerPlugin.lsUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DiscoveredFile extends js.Object {
  var name: String
  var path: String
}

object DiscoveredFile {
  @scala.inline
  def apply(name: String, path: String): DiscoveredFile = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscoveredFile]
  }
}

