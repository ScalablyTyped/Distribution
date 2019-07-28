package typings.ssh2DashStreams.ssh2DashStreamsMod

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
    val __obj = js.Dynamic.literal(attrs = attrs, filename = filename, longname = longname)
  
    __obj.asInstanceOf[FileEntry]
  }
}

