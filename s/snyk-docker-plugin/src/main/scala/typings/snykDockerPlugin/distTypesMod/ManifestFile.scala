package typings.snykDockerPlugin.distTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ManifestFile extends js.Object {
  var contents: String
  var name: String
  var path: String
}

object ManifestFile {
  @scala.inline
  def apply(contents: String, name: String, path: String): ManifestFile = {
    val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[ManifestFile]
  }
}

