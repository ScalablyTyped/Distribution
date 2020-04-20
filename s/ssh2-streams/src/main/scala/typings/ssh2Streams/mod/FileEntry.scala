package typings.ssh2Streams.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileEntry extends js.Object {
  var attrs: Attributes
  var filename: String
  var longname: String
}

object FileEntry {
  @scala.inline
  def apply(attrs: Attributes, filename: String, longname: String): FileEntry = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], longname = longname.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileEntry]
  }
}

