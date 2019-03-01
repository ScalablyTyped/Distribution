package typings
package ssh2DashStreamsLib.ssh2DashStreamsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FileEntry extends js.Object {
  var attrs: Attributes
  var filename: java.lang.String
  var longname: java.lang.String
}

object FileEntry {
  @scala.inline
  def apply(attrs: Attributes, filename: java.lang.String, longname: java.lang.String): FileEntry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attrs")(attrs)
    __obj.updateDynamic("filename")(filename)
    __obj.updateDynamic("longname")(longname)
    __obj.asInstanceOf[FileEntry]
  }
}

