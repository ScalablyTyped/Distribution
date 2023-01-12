package typings.protractorHttpMock.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Data[TResponse] extends StObject {
  
  var data: TResponse
  
  var delay: js.UndefOr[Double] = js.undefined
  
  var headers: js.UndefOr[typings.protractorHttpMock.mod.requests.Headers] = js.undefined
  
  var status: js.UndefOr[Double] = js.undefined
}
object Data {
  
  inline def apply[TResponse](data: TResponse): Data[TResponse] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data[TResponse]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Data[?], TResponse] (val x: Self & Data[TResponse]) extends AnyVal {
    
    inline def setData(value: TResponse): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setHeaders(value: typings.protractorHttpMock.mod.requests.Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
