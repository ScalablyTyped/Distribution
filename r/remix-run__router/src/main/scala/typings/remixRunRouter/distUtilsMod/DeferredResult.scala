package typings.remixRunRouter.distUtilsMod

import typings.remixRunRouter.distUtilsMod.ResultType.deferred
import typings.std.Headers
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeferredResult
  extends StObject
     with DataResult {
  
  var deferredData: DeferredData
  
  var headers: js.UndefOr[Headers] = js.undefined
  
  var statusCode: js.UndefOr[Double] = js.undefined
  
  var `type`: deferred
}
object DeferredResult {
  
  inline def apply(deferredData: DeferredData, `type`: deferred): DeferredResult = {
    val __obj = js.Dynamic.literal(deferredData = deferredData.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeferredResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeferredResult] (val x: Self) extends AnyVal {
    
    inline def setDeferredData(value: DeferredData): Self = StObject.set(x, "deferredData", value.asInstanceOf[js.Any])
    
    inline def setHeaders(value: Headers): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setStatusCode(value: Double): Self = StObject.set(x, "statusCode", value.asInstanceOf[js.Any])
    
    inline def setStatusCodeUndefined: Self = StObject.set(x, "statusCode", js.undefined)
    
    inline def setType(value: deferred): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
