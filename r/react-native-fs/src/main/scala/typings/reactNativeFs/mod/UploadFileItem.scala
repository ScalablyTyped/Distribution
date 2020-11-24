package typings.reactNativeFs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadFileItem extends js.Object {
  
  // Name of the file, if not defined then filename is used
  var filename: String = js.native
  
  // Name of file
  var filepath: String = js.native
  
  // Path to file
  var filetype: String = js.native
  
  var name: String = js.native
}
object UploadFileItem {
  
  @scala.inline
  def apply(filename: String, filepath: String, filetype: String, name: String): UploadFileItem = {
    val __obj = js.Dynamic.literal(filename = filename.asInstanceOf[js.Any], filepath = filepath.asInstanceOf[js.Any], filetype = filetype.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadFileItem]
  }
  
  @scala.inline
  implicit class UploadFileItemOps[Self <: UploadFileItem] (val x: Self) extends AnyVal {
    
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
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilepath(value: String): Self = this.set("filepath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFiletype(value: String): Self = this.set("filetype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
