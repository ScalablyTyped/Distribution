package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ResponseInit extends StObject {
  
  /* standard dom */
  var headers: js.UndefOr[HeadersInit] = js.undefined
  
  /* standard dom */
  var status: js.UndefOr[Double] = js.undefined
  
  /* standard dom */
  var statusText: js.UndefOr[java.lang.String] = js.undefined
}
object ResponseInit {
  
  inline def apply(): ResponseInit = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResponseInit]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ResponseInit] (val x: Self) extends AnyVal {
    
    inline def setHeaders(value: HeadersInit): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setHeadersVarargs(value: (js.Tuple2[java.lang.String, java.lang.String])*): Self = StObject.set(x, "headers", js.Array(value*))
    
    inline def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusText(value: java.lang.String): Self = StObject.set(x, "statusText", value.asInstanceOf[js.Any])
    
    inline def setStatusTextUndefined: Self = StObject.set(x, "statusText", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
