package typings.reactDropzone.mod

import typings.reactDropzone.reactDropzoneStrings.`file-invalid-type`
import typings.reactDropzone.reactDropzoneStrings.`file-too-large`
import typings.reactDropzone.reactDropzoneStrings.`file-too-small`
import typings.reactDropzone.reactDropzoneStrings.`too-many-files`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FileError extends js.Object {
  
  var code: `file-too-large` | `file-too-small` | `too-many-files` | `file-invalid-type` = js.native
  
  var message: String = js.native
}
object FileError {
  
  @scala.inline
  def apply(
    code: `file-too-large` | `file-too-small` | `too-many-files` | `file-invalid-type`,
    message: String
  ): FileError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileError]
  }
  
  @scala.inline
  implicit class FileErrorOps[Self <: FileError] (val x: Self) extends AnyVal {
    
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
    def setCode(value: `file-too-large` | `file-too-small` | `too-many-files` | `file-invalid-type`): Self = this.set("code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
  }
}
