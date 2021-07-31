package typings.restify.mod

import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MountOptions extends StObject {
  
  var contentType: js.UndefOr[String | js.Array[String]] = js.undefined
  
  var method: String
  
  var name: String
  
  var path: js.UndefOr[String | RegExp] = js.undefined
  
  var url: js.UndefOr[String | RegExp] = js.undefined
  
  var urlParamPattern: js.UndefOr[RegExp] = js.undefined
  
  var version: js.UndefOr[String] = js.undefined
  
  var versions: js.UndefOr[js.Array[String]] = js.undefined
}
object MountOptions {
  
  @scala.inline
  def apply(method: String, name: String): MountOptions = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[MountOptions]
  }
  
  @scala.inline
  implicit class MountOptionsMutableBuilder[Self <: MountOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContentType(value: String | js.Array[String]): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
    
    @scala.inline
    def setContentTypeVarargs(value: String*): Self = StObject.set(x, "contentType", js.Array(value :_*))
    
    @scala.inline
    def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String | RegExp): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    @scala.inline
    def setUrl(value: String | RegExp): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlParamPattern(value: RegExp): Self = StObject.set(x, "urlParamPattern", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlParamPatternUndefined: Self = StObject.set(x, "urlParamPattern", js.undefined)
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    @scala.inline
    def setVersion(value: String): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    
    @scala.inline
    def setVersions(value: js.Array[String]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVersionsUndefined: Self = StObject.set(x, "versions", js.undefined)
    
    @scala.inline
    def setVersionsVarargs(value: String*): Self = StObject.set(x, "versions", js.Array(value :_*))
  }
}
