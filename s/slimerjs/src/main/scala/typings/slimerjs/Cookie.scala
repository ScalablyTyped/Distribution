package typings.slimerjs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cookie extends StObject {
  
  var domain: js.UndefOr[String] = js.undefined
  
  var expires: js.UndefOr[String] = js.undefined
  
  var expiry: Double
  
  var httponly: js.UndefOr[Boolean] = js.undefined
  
  var name: String
  
  var path: String
  
  var secure: js.UndefOr[Boolean] = js.undefined
  
  var value: String
}
object Cookie {
  
  inline def apply(expiry: Double, name: String, path: String, value: String): Cookie = {
    val __obj = js.Dynamic.literal(expiry = expiry.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cookie]
  }
  
  extension [Self <: Cookie](x: Self) {
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setExpires(value: String): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
    
    inline def setExpiry(value: Double): Self = StObject.set(x, "expiry", value.asInstanceOf[js.Any])
    
    inline def setHttponly(value: Boolean): Self = StObject.set(x, "httponly", value.asInstanceOf[js.Any])
    
    inline def setHttponlyUndefined: Self = StObject.set(x, "httponly", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
