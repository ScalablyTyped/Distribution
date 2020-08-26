package typings.reactDropzone.mod

import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FileRejection extends js.Object {
  var errors: js.Array[FileError] = js.native
  var file: File = js.native
}

object FileRejection {
  @scala.inline
  def apply(errors: js.Array[FileError], file: File): FileRejection = {
    val __obj = js.Dynamic.literal(errors = errors.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileRejection]
  }
  @scala.inline
  implicit class FileRejectionOps[Self <: FileRejection] (val x: Self) extends AnyVal {
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
    def setErrorsVarargs(value: FileError*): Self = this.set("errors", js.Array(value :_*))
    @scala.inline
    def setErrors(value: js.Array[FileError]): Self = this.set("errors", value.asInstanceOf[js.Any])
    @scala.inline
    def setFile(value: File): Self = this.set("file", value.asInstanceOf[js.Any])
  }
  
}

