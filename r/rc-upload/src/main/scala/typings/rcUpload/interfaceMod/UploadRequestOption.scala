package typings.rcUpload.interfaceMod

import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.std.XMLHttpRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UploadRequestOption[T] extends js.Object {
  
  var action: String = js.native
  
  var data: js.UndefOr[js.Object] = js.native
  
  var file: RcFile = js.native
  
  var filename: js.UndefOr[String] = js.native
  
  var headers: js.UndefOr[UploadRequestHeader] = js.native
  
  var method: UploadRequestMethod = js.native
  
  var onError: js.UndefOr[
    js.Function2[
      /* event */ UploadRequestError | ProgressEvent[EventTarget], 
      /* body */ js.UndefOr[T], 
      Unit
    ]
  ] = js.native
  
  var onProgress: js.UndefOr[js.Function1[/* event */ UploadProgressEvent, Unit]] = js.native
  
  var onSuccess: js.UndefOr[js.Function2[/* body */ T, /* xhr */ XMLHttpRequest, Unit]] = js.native
  
  var withCredentials: js.UndefOr[Boolean] = js.native
}
object UploadRequestOption {
  
  @scala.inline
  def apply[T](action: String, file: RcFile, method: UploadRequestMethod): UploadRequestOption[T] = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], file = file.asInstanceOf[js.Any], method = method.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadRequestOption[T]]
  }
  
  @scala.inline
  implicit class UploadRequestOptionOps[Self <: UploadRequestOption[_], T] (val x: Self with UploadRequestOption[T]) extends AnyVal {
    
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
    def setAction(value: String): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFile(value: RcFile): Self = this.set("file", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethod(value: UploadRequestMethod): Self = this.set("method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: js.Object): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setFilename(value: String): Self = this.set("filename", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilename: Self = this.set("filename", js.undefined)
    
    @scala.inline
    def setHeaders(value: UploadRequestHeader): Self = this.set("headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeaders: Self = this.set("headers", js.undefined)
    
    @scala.inline
    def setOnError(
      value: (/* event */ UploadRequestError | ProgressEvent[EventTarget], /* body */ js.UndefOr[T]) => Unit
    ): Self = this.set("onError", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnError: Self = this.set("onError", js.undefined)
    
    @scala.inline
    def setOnProgress(value: /* event */ UploadProgressEvent => Unit): Self = this.set("onProgress", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnProgress: Self = this.set("onProgress", js.undefined)
    
    @scala.inline
    def setOnSuccess(value: (/* body */ T, /* xhr */ XMLHttpRequest) => Unit): Self = this.set("onSuccess", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnSuccess: Self = this.set("onSuccess", js.undefined)
    
    @scala.inline
    def setWithCredentials(value: Boolean): Self = this.set("withCredentials", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithCredentials: Self = this.set("withCredentials", js.undefined)
  }
}
