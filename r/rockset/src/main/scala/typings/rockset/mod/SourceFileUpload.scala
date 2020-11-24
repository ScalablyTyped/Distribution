package typings.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SourceFileUpload extends js.Object {
  
  // name of the file
  var file_name: String = js.native
  
  // size of the file in bytes
  var file_size: Double = js.native
  
  // time of file upload
  var file_upload_time: String = js.native
}
object SourceFileUpload {
  
  @scala.inline
  def apply(file_name: String, file_size: Double, file_upload_time: String): SourceFileUpload = {
    val __obj = js.Dynamic.literal(file_name = file_name.asInstanceOf[js.Any], file_size = file_size.asInstanceOf[js.Any], file_upload_time = file_upload_time.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceFileUpload]
  }
  
  @scala.inline
  implicit class SourceFileUploadOps[Self <: SourceFileUpload] (val x: Self) extends AnyVal {
    
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
    def setFile_name(value: String): Self = this.set("file_name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile_size(value: Double): Self = this.set("file_size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile_upload_time(value: String): Self = this.set("file_upload_time", value.asInstanceOf[js.Any])
  }
}
