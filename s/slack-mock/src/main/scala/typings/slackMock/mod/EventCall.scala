package typings.slackMock.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventCall[T] extends StObject {
  
  var headers: EventHttpHeaders
  
  var params: T
  
  var statusCode: Double
  
  var url: EventUrl
}
object EventCall {
  
  inline def apply[T](headers: EventHttpHeaders, params: T, statusCode: Double, url: EventUrl): EventCall[T] = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[EventCall[T]]
  }
  
  extension [Self <: EventCall[?], T](x: Self & EventCall[T]) {
    
    inline def setHeaders(value: EventHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setParams(value: T): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: EventUrl): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
