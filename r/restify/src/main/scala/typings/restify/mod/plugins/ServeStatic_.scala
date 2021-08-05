package typings.restify.mod.plugins

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServeStatic_ extends StObject {
  
  var default: js.UndefOr[js.Any] = js.undefined
  
  var appendRequestPath: js.UndefOr[Boolean] = js.undefined
  
  var charSet: js.UndefOr[String] = js.undefined
  
  var directory: js.UndefOr[String] = js.undefined
  
  var etag: js.UndefOr[String] = js.undefined
  
  var file: js.UndefOr[String] = js.undefined
  
  var gzip: js.UndefOr[Boolean] = js.undefined
  
  var `match`: js.UndefOr[js.Any] = js.undefined
  
  var maxAge: js.UndefOr[Double] = js.undefined
}
object ServeStatic_ {
  
  inline def apply(): ServeStatic_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ServeStatic_]
  }
  
  extension [Self <: ServeStatic_](x: Self) {
    
    inline def setAppendRequestPath(value: Boolean): Self = StObject.set(x, "appendRequestPath", value.asInstanceOf[js.Any])
    
    inline def setAppendRequestPathUndefined: Self = StObject.set(x, "appendRequestPath", js.undefined)
    
    inline def setCharSet(value: String): Self = StObject.set(x, "charSet", value.asInstanceOf[js.Any])
    
    inline def setCharSetUndefined: Self = StObject.set(x, "charSet", js.undefined)
    
    inline def setDefault(value: js.Any): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    
    inline def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
    
    inline def setDirectory(value: String): Self = StObject.set(x, "directory", value.asInstanceOf[js.Any])
    
    inline def setDirectoryUndefined: Self = StObject.set(x, "directory", js.undefined)
    
    inline def setEtag(value: String): Self = StObject.set(x, "etag", value.asInstanceOf[js.Any])
    
    inline def setEtagUndefined: Self = StObject.set(x, "etag", js.undefined)
    
    inline def setFile(value: String): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
    
    inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
    
    inline def setGzip(value: Boolean): Self = StObject.set(x, "gzip", value.asInstanceOf[js.Any])
    
    inline def setGzipUndefined: Self = StObject.set(x, "gzip", js.undefined)
    
    inline def setMatch(value: js.Any): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
    
    inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
    
    inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
    
    inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
  }
}
