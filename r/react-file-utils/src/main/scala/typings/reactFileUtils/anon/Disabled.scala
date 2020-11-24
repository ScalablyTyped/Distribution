package typings.reactFileUtils.anon

import typings.reactFileUtils.mod.ImageUpload
import typings.std.File
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Disabled extends js.Object {
  
  var disabled: js.UndefOr[Boolean] = js.native
  
  /**
    * A callback to call with newly selected files
    * If this is not provided no 'ThumbnailPlaceholder' will be displayed
    */
  var handleFiles: js.UndefOr[js.Function1[/* files */ js.Array[File], Unit]] = js.native
  
  /** A callback to call when the remove icon is clicked */
  var handleRemove: js.UndefOr[js.Function1[/* id */ String, Unit]] = js.native
  
  /** A callback to call when the retry icon is clicked */
  var handleRetry: js.UndefOr[js.Function1[/* id */ String, Unit]] = js.native
  
  /** The list of image uploads that should be displayed */
  var imageUploads: js.UndefOr[js.Array[ImageUpload]] = js.native
  
  /** Allow drag 'n' drop (or selection from the file dialog) of multiple files */
  var multiple: js.UndefOr[Boolean] = js.native
}
object Disabled {
  
  @scala.inline
  def apply(): Disabled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Disabled]
  }
  
  @scala.inline
  implicit class DisabledOps[Self <: Disabled] (val x: Self) extends AnyVal {
    
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
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    
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
    def setImageUploadsVarargs(value: ImageUpload*): Self = this.set("imageUploads", js.Array(value :_*))
    
    @scala.inline
    def setImageUploads(value: js.Array[ImageUpload]): Self = this.set("imageUploads", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageUploads: Self = this.set("imageUploads", js.undefined)
    
    @scala.inline
    def setMultiple(value: Boolean): Self = this.set("multiple", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMultiple: Self = this.set("multiple", js.undefined)
  }
}
