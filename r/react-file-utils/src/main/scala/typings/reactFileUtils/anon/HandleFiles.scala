package typings.reactFileUtils.anon

import typings.reactFileUtils.mod.FileUpload
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HandleFiles extends js.Object {
  
  var handleFiles: js.UndefOr[js.Function1[/* files */ js.Array[File], Unit]] = js.native
  
  var handleRemove: js.UndefOr[js.Function1[/* id */ String, Unit]] = js.native
  
  var handleRetry: js.UndefOr[js.Function1[/* id */ String, Unit]] = js.native
  
  var uploads: js.UndefOr[js.Array[FileUpload]] = js.native
}
object HandleFiles {
  
  @scala.inline
  def apply(): HandleFiles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HandleFiles]
  }
  
  @scala.inline
  implicit class HandleFilesOps[Self <: HandleFiles] (val x: Self) extends AnyVal {
    
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
    def setHandleFiles(value: /* files */ js.Array[File] => Unit): Self = this.set("handleFiles", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHandleFiles: Self = this.set("handleFiles", js.undefined)
    
    @scala.inline
    def setHandleRemove(value: /* id */ String => Unit): Self = this.set("handleRemove", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHandleRemove: Self = this.set("handleRemove", js.undefined)
    
    @scala.inline
    def setHandleRetry(value: /* id */ String => Unit): Self = this.set("handleRetry", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteHandleRetry: Self = this.set("handleRetry", js.undefined)
    
    @scala.inline
    def setUploadsVarargs(value: FileUpload*): Self = this.set("uploads", js.Array(value :_*))
    
    @scala.inline
    def setUploads(value: js.Array[FileUpload]): Self = this.set("uploads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUploads: Self = this.set("uploads", js.undefined)
  }
}
