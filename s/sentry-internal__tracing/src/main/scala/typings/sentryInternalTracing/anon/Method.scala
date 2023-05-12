package typings.sentryInternalTracing.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Method extends StObject {
  
  var __span: js.UndefOr[String] = js.undefined
  
  var method: String
  
  var url: String
}
object Method {
  
  inline def apply(method: String, url: String): Method = {
    val __obj = js.Dynamic.literal(method = method.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
    __obj.asInstanceOf[Method]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Method] (val x: Self) extends AnyVal {
    
    inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def set__span(value: String): Self = StObject.set(x, "__span", value.asInstanceOf[js.Any])
    
    inline def set__spanUndefined: Self = StObject.set(x, "__span", js.undefined)
  }
}
