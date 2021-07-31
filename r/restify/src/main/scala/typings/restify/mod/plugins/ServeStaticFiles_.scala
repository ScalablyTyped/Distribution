package typings.restify.mod.plugins

import typings.restify.mod.Response
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServeStaticFiles_ extends StObject {
  
  var etag: js.UndefOr[String] = js.undefined
  
  var maxAge: js.UndefOr[Double] = js.undefined
  
  var setHeaders: js.UndefOr[js.Function3[/* res */ Response, /* path */ String, /* stat */ js.Any, js.Any]] = js.undefined
}
object ServeStaticFiles_ {
  
  @scala.inline
  def apply(): ServeStaticFiles_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServeStaticFiles_]
  }
  
  @scala.inline
  implicit class ServeStaticFiles_MutableBuilder[Self <: ServeStaticFiles_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    @scala.inline
    def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
    
    @scala.inline
    def setSetHeaders(value: (/* res */ Response, /* path */ String, /* stat */ js.Any) => js.Any): Self = StObject.set(x, "setHeaders", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSetHeadersUndefined: Self = StObject.set(x, "setHeaders", js.undefined)
  }
}
