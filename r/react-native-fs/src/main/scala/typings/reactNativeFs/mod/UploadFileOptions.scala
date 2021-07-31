package typings.reactNativeFs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UploadFileOptions extends StObject {
  
  // deprecated
  var begin: js.UndefOr[js.Function1[/* res */ UploadBeginCallbackResult, Unit]] = js.undefined
  
  // Default is 'POST', supports 'POST' and 'PUT'
  var beginCallback: js.UndefOr[js.Function1[/* res */ UploadBeginCallbackResult, Unit]] = js.undefined
  
  // URL to upload file to
  var binaryStreamOnly: js.UndefOr[Boolean] = js.undefined
  
  // An object of headers to be passed to the server
  var fields: js.UndefOr[Fields] = js.undefined
  
  // Allow for binary data stream for file to be uploaded without extra headers, Default is 'false'
  var files: js.Array[UploadFileItem]
  
  // An array of objects with the file information to be uploaded.
  var headers: js.UndefOr[Headers] = js.undefined
  
  // An object of fields to be passed to the server
  var method: js.UndefOr[String] = js.undefined
  
  var progress: js.UndefOr[js.Function1[/* res */ UploadProgressCallbackResult, Unit]] = js.undefined
  
  // deprecated
  var progressCallback: js.UndefOr[js.Function1[/* res */ UploadProgressCallbackResult, Unit]] = js.undefined
  
  var toUrl: String
}
object UploadFileOptions {
  
  @scala.inline
  def apply(files: js.Array[UploadFileItem], toUrl: String): UploadFileOptions = {
    val __obj = js.Dynamic.literal(files = files.asInstanceOf[js.Any], toUrl = toUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[UploadFileOptions]
  }
  
  @scala.inline
  implicit class UploadFileOptionsMutableBuilder[Self <: UploadFileOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBegin(value: /* res */ UploadBeginCallbackResult => Unit): Self = StObject.set(x, "begin", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeginCallback(value: /* res */ UploadBeginCallbackResult => Unit): Self = StObject.set(x, "beginCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setBeginCallbackUndefined: Self = StObject.set(x, "beginCallback", js.undefined)
    
    @scala.inline
    def setBeginUndefined: Self = StObject.set(x, "begin", js.undefined)
    
    @scala.inline
    def setBinaryStreamOnly(value: Boolean): Self = StObject.set(x, "binaryStreamOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinaryStreamOnlyUndefined: Self = StObject.set(x, "binaryStreamOnly", js.undefined)
    
    @scala.inline
    def setFields(value: Fields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
    
    @scala.inline
    def setFiles(value: js.Array[UploadFileItem]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFilesVarargs(value: UploadFileItem*): Self = StObject.set(x, "files", js.Array(value :_*))
    
    @scala.inline
    def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setProgress(value: /* res */ UploadProgressCallbackResult => Unit): Self = StObject.set(x, "progress", js.Any.fromFunction1(value))
    
    @scala.inline
    def setProgressCallback(value: /* res */ UploadProgressCallbackResult => Unit): Self = StObject.set(x, "progressCallback", js.Any.fromFunction1(value))
    
    @scala.inline
    def setProgressCallbackUndefined: Self = StObject.set(x, "progressCallback", js.undefined)
    
    @scala.inline
    def setProgressUndefined: Self = StObject.set(x, "progress", js.undefined)
    
    @scala.inline
    def setToUrl(value: String): Self = StObject.set(x, "toUrl", value.asInstanceOf[js.Any])
  }
}
