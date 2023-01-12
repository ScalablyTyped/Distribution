package typings.restify.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MountOptions extends StObject {
  
  var contentType: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var method: String
  
  var name: String
  
  var path: js.UndefOr[String | js.RegExp] = js.undefined
  
  var url: js.UndefOr[String | js.RegExp] = js.undefined
  
  var urlParamPattern: js.UndefOr[js.RegExp] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
  
  var versions: js.UndefOr[js.Array[String]] = js.undefined
}
object MountOptions {
  
  inline def apply(method: String, name: String): MountOptions = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MountOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MountOptions] (val x: Self) extends AnyVal {
    
    inline def setContentType(value: String | js.Array[String]): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    inline def setContentTypeVarargs(value: String*): Self = StObject.set(x, "contentType", js.Array(value*))
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String | js.RegExp): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setUrl(value: String | js.RegExp): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlParamPattern(value: js.RegExp): Self = StObject.set(x, "urlParamPattern", value.asInstanceOf[js.Any])
    
    inline def setUrlParamPatternUndefined: Self = StObject.set(x, "urlParamPattern", js.undefined)
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    inline def setVersions(value: js.Array[String]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    inline def setVersionsUndefined: Self = StObject.set(x, "versions", js.undefined)
    
    inline def setVersionsVarargs(value: String*): Self = StObject.set(x, "versions", js.Array(value*))
  }
}
