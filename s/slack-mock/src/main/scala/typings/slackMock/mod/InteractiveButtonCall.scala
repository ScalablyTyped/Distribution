package typings.slackMock.mod

import typings.nock.mod.ReplyHeaderValue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InteractiveButtonCall[T] extends StObject {
  
  var headers: InteractiveButtonHttpHeaders
  
  var params: T
  
  var statusCode: Double
  
  var `type`: InteractiveButtonCallType
  
  var url: InteractiveButtonUrl
}
object InteractiveButtonCall {
  
  inline def apply[T](
    headers: InteractiveButtonHttpHeaders,
    params: T,
    statusCode: Double,
    `type`: InteractiveButtonCallType,
    url: InteractiveButtonUrl
  ): InteractiveButtonCall[T] = {
    val __obj = js.Dynamic.literal(headers = headers.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], statusCode = statusCode.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InteractiveButtonCall[T]]
  }
  
  extension [Self <: InteractiveButtonCall[?], T](x: Self & InteractiveButtonCall[T]) {
    
    inline def setHeaders(value: InteractiveButtonHttpHeaders): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersVarargs(value: ReplyHeaderValue*): Self = StObject.set(x, "headers", js.Array(value :_*))
    
    inline def setParams(value: T): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setType(value: InteractiveButtonCallType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: InteractiveButtonUrl): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
  }
}
