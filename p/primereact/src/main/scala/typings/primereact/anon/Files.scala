package typings.primereact.anon

import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Files extends js.Object {
  var files: js.Any = js.native
  var xhr: XMLHttpRequest = js.native
}

object Files {
  @scala.inline
  def apply(files: js.Any, xhr: XMLHttpRequest): Files = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], xhr = xhr.asInstanceOf[js.Any])
    __obj.asInstanceOf[Files]
  }
  @scala.inline
  implicit class FilesOps[Self <: Files] (val x: Self) extends AnyVal {
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
    def setFiles(value: js.Any): Self = this.set("files", value.asInstanceOf[js.Any])
    @scala.inline
    def setXhr(value: XMLHttpRequest): Self = this.set("xhr", value.asInstanceOf[js.Any])
  }
  
}

