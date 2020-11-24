package typings.reactNativeFs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadFileOptions extends js.Object {
  
  // deprecated
  var begin: js.UndefOr[js.Function1[/* res */ UploadBeginCallbackResult, Unit]] = js.native
  
  // Default is 'POST', supports 'POST' and 'PUT'
  var beginCallback: js.UndefOr[js.Function1[/* res */ UploadBeginCallbackResult, Unit]] = js.native
  
  // URL to upload file to
  var binaryStreamOnly: js.UndefOr[Boolean] = js.native
  
  // An object of headers to be passed to the server
  var fields: js.UndefOr[Fields] = js.native
  
  // Allow for binary data stream for file to be uploaded without extra headers, Default is 'false'
  var files: js.Array[UploadFileItem] = js.native
  
  // An array of objects with the file information to be uploaded.
  var headers: js.UndefOr[Headers] = js.native
  
  // An object of fields to be passed to the server
  var method: js.UndefOr[String] = js.native
  
  var progress: js.UndefOr[js.Function1[/* res */ UploadProgressCallbackResult, Unit]] = js.native
  
  // deprecated
  var progressCallback: js.UndefOr[js.Function1[/* res */ UploadProgressCallbackResult, Unit]] = js.native
  
  var toUrl: String = js.native
}
object UploadFileOptions {
  
  @scala.inline
  def apply(files: js.Array[UploadFileItem], toUrl: String): UploadFileOptions = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], toUrl = toUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadFileOptions]
  }
  
  @scala.inline
  implicit class UploadFileOptionsOps[Self <: UploadFileOptions] (val x: Self) extends AnyVal {
    
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
    def setFilesVarargs(value: UploadFileItem*): Self = this.set("files", js.Array(value :_*))
    
    @scala.inline
    def setFiles(value: js.Array[UploadFileItem]): Self = this.set("files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToUrl(value: String): Self = this.set("toUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBegin(value: /* res */ UploadBeginCallbackResult => Unit): Self = this.set("begin", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBegin: Self = this.set("begin", js.undefined)
    
    @scala.inline
    def setBeginCallback(value: /* res */ UploadBeginCallbackResult => Unit): Self = this.set("beginCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteBeginCallback: Self = this.set("beginCallback", js.undefined)
    
    @scala.inline
    def setBinaryStreamOnly(value: Boolean): Self = this.set("binaryStreamOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBinaryStreamOnly: Self = this.set("binaryStreamOnly", js.undefined)
    
    @scala.inline
    def setFields(value: Fields): Self = this.set("fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFields: Self = this.set("fields", js.undefined)
    
    @scala.inline
    def setHeaders(value: Headers): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMethod: Self = this.set("method", js.undefined)
    
    @scala.inline
    def setProgress(value: /* res */ UploadProgressCallbackResult => Unit): Self = this.set("progress", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteProgress: Self = this.set("progress", js.undefined)
    
    @scala.inline
    def setProgressCallback(value: /* res */ UploadProgressCallbackResult => Unit): Self = this.set("progressCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteProgressCallback: Self = this.set("progressCallback", js.undefined)
  }
}
