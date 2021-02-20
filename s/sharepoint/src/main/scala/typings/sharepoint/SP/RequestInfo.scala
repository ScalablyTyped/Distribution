package typings.sharepoint.SP

import org.scalablytyped.runtime.StringDictionary
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestInfo extends StObject {
  
  var binaryStringRequestBody: js.UndefOr[Boolean] = js.native
  
  /** Currently need fix to get ginary response. Details: http:// techmikael.blogspot.ru/2013/07/how-to-copy-files-between-sites-using.html */
  var binaryStringResponseBody: js.UndefOr[Boolean] = js.native
  
  /** Can be string or bytearray depending on binaryStringRequestBody field */
  var body: js.UndefOr[String | Uint8Array] = js.native
  
  var error: js.UndefOr[
    js.Function3[
      /* response */ ResponseInfo, 
      /* error */ RequestExecutorErrors, 
      /* statusText */ String, 
      Unit
    ]
  ] = js.native
  
  var headers: js.UndefOr[StringDictionary[String]] = js.native
  
  var method: js.UndefOr[String] = js.native
  
  var state: js.UndefOr[js.Any] = js.native
  
  var success: js.UndefOr[js.Function1[/* response */ ResponseInfo, Unit]] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
  
  var url: String = js.native
}
object RequestInfo {
  
  @scala.inline
  def apply(url: String): RequestInfo = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestInfo]
  }
  
  @scala.inline
  implicit class RequestInfoMutableBuilder[Self <: RequestInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBinaryStringRequestBody(value: Boolean): Self = StObject.set(x, "binaryStringRequestBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinaryStringRequestBodyUndefined: Self = StObject.set(x, "binaryStringRequestBody", js.undefined)
    
    @scala.inline
    def setBinaryStringResponseBody(value: Boolean): Self = StObject.set(x, "binaryStringResponseBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBinaryStringResponseBodyUndefined: Self = StObject.set(x, "binaryStringResponseBody", js.undefined)
    
    @scala.inline
    def setBody(value: String | Uint8Array): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    @scala.inline
    def setError(
      value: (/* response */ ResponseInfo, /* error */ RequestExecutorErrors, /* statusText */ String) => Unit
    ): Self = StObject.set(x, "error", js.Any.fromFunction3(value))
    
    @scala.inline
    def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    @scala.inline
    def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    @scala.inline
    def setState(value: js.Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    @scala.inline
    def setSuccess(value: /* response */ ResponseInfo => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    @scala.inline
    def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
