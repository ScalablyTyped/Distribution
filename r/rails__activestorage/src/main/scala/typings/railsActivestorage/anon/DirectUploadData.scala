package typings.railsActivestorage.anon

import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectUploadData extends js.Object {
  
  var directUploadData: Headers = js.native
  
  var file: File = js.native
}
object DirectUploadData {
  
  @scala.inline
  def apply(directUploadData: Headers, file: File): DirectUploadData = {
    val __obj = js.Dynamic.literal(directUploadData = directUploadData.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectUploadData]
  }
  
  @scala.inline
  implicit class DirectUploadDataOps[Self <: DirectUploadData] (val x: Self) extends AnyVal {
    
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
    def setDirectUploadData(value: Headers): Self = this.set("directUploadData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile(value: File): Self = this.set("file", value.asInstanceOf[js.Any])
  }
}
