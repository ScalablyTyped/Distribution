package typings.sharepoint.SP

import org.scalablytyped.runtime.StringDictionary
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseInfo extends StObject {
  
  var allResponseHeaders: js.UndefOr[String] = js.undefined
  
  /** Can be string or bytearray depending on request.binaryStringResponseBody field */
  var body: js.UndefOr[String | Uint8Array] = js.undefined
  
  var contentType: js.UndefOr[String] = js.undefined
  
  var headers: js.UndefOr[StringDictionary[String]] = js.undefined
  
  var responseAvailable: Boolean
  
  var state: js.UndefOr[js.Any] = js.undefined
  
  var statusCode: js.UndefOr[Double] = js.undefined
  
  var statusText: js.UndefOr[String] = js.undefined
}
object ResponseInfo {
  
  inline def apply(responseAvailable: Boolean): ResponseInfo = {
    val __obj = js.Dynamic.literal(responseAvailable = responseAvailable.asInstanceOf[js.Any])
    __obj.asInstanceOf[ResponseInfo]
  }
  
  extension [Self <: ResponseInfo](x: Self) {
    
    inline def setAllResponseHeaders(value: String): Self = StObject.set(x, "allResponseHeaders", value.asInstanceOf[js.Any])
    
    inline def setAllResponseHeadersUndefined: Self = StObject.set(x, "allResponseHeaders", js.undefined)
    
    inline def setBody(value: String | Uint8Array): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
    
    inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
    
    inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setHeaders(value: StringDictionary[String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setResponseAvailable(value: Boolean): Self = StObject.set(x, "responseAvailable", value.asInstanceOf[js.Any])
    
    inline def setState(value: js.Any): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    
    inline def setStatusText(value: String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
    
    inline def setStatusTextUndefined: Self = StObject.set(x, "statusText", js.undefined)
  }
}
