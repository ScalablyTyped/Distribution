package typings.sharepoint.SP

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestInfo extends StObject {
  
  var binaryStringRequestBody: js.UndefOr[Boolean] = js.undefined
  
  /** Currently need fix to get ginary response. Details: http:// techmikael.blogspot.ru/2013/07/how-to-copy-files-between-sites-using.html */
  var binaryStringResponseBody: js.UndefOr[Boolean] = js.undefined
  
  /** Can be string or bytearray depending on binaryStringRequestBody field */
  var body: js.UndefOr[String | js.typedarray.Uint8Array] = js.undefined
  
  var error: js.UndefOr[
    js.Function3[
      /* response */ ResponseInfo, 
      /* error */ RequestExecutorErrors, 
      /* statusText */ String, 
      Unit
    ]
  ] = js.undefined
  
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var method: js.UndefOr[String] = js.undefined
  
  var state: js.UndefOr[Any] = js.undefined
  
  var success: js.UndefOr[js.Function1[/* response */ ResponseInfo, Unit]] = js.undefined
  
  var timeout: js.UndefOr[Double] = js.undefined
  
  var url: String
}
object RequestInfo {
  
  inline def apply(url: String): RequestInfo = {
    val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestInfo]
  }
  
  extension [Self <: RequestInfo](x: Self) {
    
    inline def setBinaryStringRequestBody(value: Boolean): Self = StObject.set(x, "binaryStringRequestBody", value.asInstanceOf[js.Any])
    
    inline def setBinaryStringRequestBodyUndefined: Self = StObject.set(x, "binaryStringRequestBody", js.undefined)
    
    inline def setBinaryStringResponseBody(value: Boolean): Self = StObject.set(x, "binaryStringResponseBody", value.asInstanceOf[js.Any])
    
    inline def setBinaryStringResponseBodyUndefined: Self = StObject.set(x, "binaryStringResponseBody", js.undefined)
    
    inline def setBody(value: String | js.typedarray.Uint8Array): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setError(
      value: (/* response */ ResponseInfo, /* error */ RequestExecutorErrors, /* statusText */ String) => Unit
    ): Self = StObject.set(x, "error", js.Any.fromFunction3(value))
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
    
    inline def setState(value: Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setSuccess(value: /* response */ ResponseInfo => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    
    inline def setSuccessUndefined: Self = StObject.set(x, "success", js.undefined)
    
    inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
    
    inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
