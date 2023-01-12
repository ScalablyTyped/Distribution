package typings.restify.mod.plugins

import typings.restify.mod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServeStaticFiles_ extends StObject {
  
  var etag: js.UndefOr[String] = js.undefined
  
  var maxAge: js.UndefOr[Double] = js.undefined
  
  var setHeaders: js.UndefOr[js.Function3[/* res */ Response, /* path */ String, /* stat */ Any, Any]] = js.undefined
}
object ServeStaticFiles_ {
  
  inline def apply(): ServeStaticFiles_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServeStaticFiles_]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServeStaticFiles_] (val x: Self) extends AnyVal {
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
    
    inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
    
    inline def setSetHeaders(value: (/* res */ Response, /* path */ String, /* stat */ Any) => Any): Self = StObject.set(x, "setHeaders", js.Any.fromFunction3(value))
    
    inline def setSetHeadersUndefined: Self = StObject.set(x, "setHeaders", js.undefined)
  }
}
