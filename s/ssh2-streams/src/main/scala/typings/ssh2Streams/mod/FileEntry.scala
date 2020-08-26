package typings.ssh2Streams.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileEntry extends js.Object {
  var attrs: Attributes = js.native
  var filename: String = js.native
  var longname: String = js.native
}

object FileEntry {
  @scala.inline
  def apply(attrs: Attributes, filename: String, longname: String): FileEntry = {
    val __obj = js.Dynamic.literal(attrs = attrs.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], longname = longname.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileEntry]
  }
  @scala.inline
  implicit class FileEntryOps[Self <: FileEntry] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAttrs(value: Attributes): Self = this.set("attrs", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    @scala.inline
    def setLongname(value: String): Self = this.set("longname", value.asInstanceOf[js.Any])
  }
  
}

