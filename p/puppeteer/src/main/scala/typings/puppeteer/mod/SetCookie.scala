package typings.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SetCookie extends StObject {
  
  /** The cookie domain. */
  var domain: js.UndefOr[String] = js.undefined
  
  /** The cookie Unix expiration time in seconds. */
  var expires: js.UndefOr[Double] = js.undefined
  
  /** The cookie http only flag. */
  var httpOnly: js.UndefOr[Boolean] = js.undefined
  
  /** The cookie name. */
  var name: String
  
  /** The cookie path. */
  var path: js.UndefOr[String] = js.undefined
  
  /** The cookie same site definition. */
  var sameSite: js.UndefOr[SameSiteSetting] = js.undefined
  
  /** The cookie secure flag. */
  var secure: js.UndefOr[Boolean] = js.undefined
  
  /** The session cookie flag. */
  var session: js.UndefOr[Boolean] = js.undefined
  
  /** The request-URI to associate with the setting of the cookie. This value can affect the default domain and path values of the created cookie. */
  var url: js.UndefOr[String] = js.undefined
  
  /** The cookie value. */
  var value: String
}
object SetCookie {
  
  inline def apply(name: String, value: String): SetCookie = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetCookie]
  }
  
  extension [Self <: SetCookie](x: Self) {
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
    
    inline def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
    
    inline def setHttpOnlyUndefined: Self = StObject.set(x, "httpOnly", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setSameSite(value: SameSiteSetting): Self = StObject.set(x, "sameSite", value.asInstanceOf[js.Any])
    
    inline def setSameSiteUndefined: Self = StObject.set(x, "sameSite", js.undefined)
    
    inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    
    inline def setSession(value: Boolean): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    
    inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
