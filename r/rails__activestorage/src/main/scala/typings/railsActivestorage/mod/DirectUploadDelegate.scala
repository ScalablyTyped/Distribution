package typings.railsActivestorage.mod

import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DirectUploadDelegate extends js.Object {
  
  var directUploadWillCreateBlobWithXHR: js.UndefOr[js.Function1[/* xhr */ XMLHttpRequest, Unit]] = js.native
  
  var directUploadWillStoreFileWithXHR: js.UndefOr[js.Function1[/* xhr */ XMLHttpRequest, Unit]] = js.native
}
object DirectUploadDelegate {
  
  @scala.inline
  def apply(): DirectUploadDelegate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DirectUploadDelegate]
  }
  
  @scala.inline
  implicit class DirectUploadDelegateOps[Self <: DirectUploadDelegate] (val x: Self) extends AnyVal {
    
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
    def setDirectUploadWillCreateBlobWithXHR(value: /* xhr */ XMLHttpRequest => Unit): Self = this.set("directUploadWillCreateBlobWithXHR", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDirectUploadWillCreateBlobWithXHR: Self = this.set("directUploadWillCreateBlobWithXHR", js.undefined)
    
    @scala.inline
    def setDirectUploadWillStoreFileWithXHR(value: /* xhr */ XMLHttpRequest => Unit): Self = this.set("directUploadWillStoreFileWithXHR", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteDirectUploadWillStoreFileWithXHR: Self = this.set("directUploadWillStoreFileWithXHR", js.undefined)
  }
}
