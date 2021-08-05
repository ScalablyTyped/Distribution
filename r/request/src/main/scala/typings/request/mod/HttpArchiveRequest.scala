package typings.request.mod

import typings.request.anon.MimeType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HttpArchiveRequest extends StObject {
  
  var headers: js.UndefOr[js.Array[NameValuePair]] = js.undefined
  
  var method: js.UndefOr[String] = js.undefined
  
  var postData: js.UndefOr[MimeType] = js.undefined
  
  var url: js.UndefOr[String] = js.undefined
}
object HttpArchiveRequest {
  
  inline def apply(): HttpArchiveRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[HttpArchiveRequest]
  }
  
  extension [Self <: HttpArchiveRequest](x: Self) {
    
    inline def setHeaders(value: js.Array[NameValuePair]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHeadersVarargs(value: NameValuePair*): Self = StObject.set(x, "headers", js.Array(value :_*))
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setPostData(value: MimeType): Self = StObject.set(x, "postData", value.asInstanceOf[js.Any])
    
    inline def setPostDataUndefined: Self = StObject.set(x, "postData", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
