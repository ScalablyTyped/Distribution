package typings.protractorHttpMock.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Delay[TResponse] extends StObject {
  
  var data: TResponse
  
  var delay: js.UndefOr[Double] = js.undefined
  
  var status: js.UndefOr[Double] = js.undefined
}
object Delay {
  
  inline def apply[TResponse](data: TResponse): Delay[TResponse] = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delay[TResponse]]
  }
  
  extension [Self <: Delay[?], TResponse](x: Self & Delay[TResponse]) {
    
    inline def setData(value: TResponse): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
    
    inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
