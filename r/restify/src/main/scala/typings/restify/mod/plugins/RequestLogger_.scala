package typings.restify.mod.plugins

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestLogger_ extends StObject {
  
  var headers: js.UndefOr[js.Any] = js.undefined
  
  var log: js.UndefOr[js.Any] = js.undefined
  
  var properties: js.UndefOr[js.Any] = js.undefined
  
  var serializers: js.UndefOr[js.Any] = js.undefined
}
object RequestLogger_ {
  
  inline def apply(): RequestLogger_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestLogger_]
  }
  
  extension [Self <: RequestLogger_](x: Self) {
    
    inline def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    inline def setLog(value: js.Any): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    inline def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
    
    inline def setProperties(value: js.Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    inline def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    inline def setSerializers(value: js.Any): Self = StObject.set(x, "serializers", value.asInstanceOf[js.Any])
    
    inline def setSerializersUndefined: Self = StObject.set(x, "serializers", js.undefined)
  }
}
