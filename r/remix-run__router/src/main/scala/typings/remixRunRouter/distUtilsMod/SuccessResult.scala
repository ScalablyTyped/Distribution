package typings.remixRunRouter.distUtilsMod

import typings.remixRunRouter.distUtilsMod.ResultType.data
import typings.std.Headers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuccessResult extends StObject {
  
  var data: Any
  
  var headers: js.UndefOr[Headers] = js.undefined
  
  var statusCode: js.UndefOr[Double] = js.undefined
  
  var `type`: data
}
object SuccessResult {
  
  inline def apply(data: Any, `type`: data): SuccessResult = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuccessResult]
  }
  
  extension [Self <: SuccessResult](x: Self) {
    
    inline def setData(value: Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    
    inline def setType(value: data): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
