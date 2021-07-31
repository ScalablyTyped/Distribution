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
  
  @scala.inline
  def apply(): RequestLogger_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RequestLogger_]
  }
  
  @scala.inline
  implicit class RequestLogger_MutableBuilder[Self <: RequestLogger_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeaders(value: js.Any): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
    
    @scala.inline
    def setLog(value: js.Any): Self = StObject.set(x, "log", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogUndefined: Self = StObject.set(x, "log", js.undefined)
    
    @scala.inline
    def setProperties(value: js.Any): Self = StObject.set(x, "properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPropertiesUndefined: Self = StObject.set(x, "properties", js.undefined)
    
    @scala.inline
    def setSerializers(value: js.Any): Self = StObject.set(x, "serializers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSerializersUndefined: Self = StObject.set(x, "serializers", js.undefined)
  }
}
