package typings.puppeteer.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cookie extends StObject {
  
  /** The cookie domain. */
  var domain: String
  
  /** The cookie Unix expiration time in seconds. */
  var expires: Double
  
  /** The cookie http only flag. */
  var httpOnly: Boolean
  
  /** The cookie name. */
  var name: String
  
  /** The cookie path. */
  var path: String
  
  /** The cookie same site definition. */
  var sameSite: SameSiteSetting
  
  /** The cookie secure flag. */
  var secure: Boolean
  
  /** The session cookie flag. */
  var session: Boolean
  
  /** The cookie size */
  var size: Double
  
  /** The cookie value. */
  var value: String
}
object Cookie {
  
  @scala.inline
  def apply(
    domain: String,
    expires: Double,
    httpOnly: Boolean,
    name: String,
    path: String,
    sameSite: SameSiteSetting,
    secure: Boolean,
    session: Boolean,
    size: Double,
    value: String
  ): Cookie = {
    val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], expires = expires.asInstanceOf[js.Any], httpOnly = httpOnly.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], sameSite = sameSite.asInstanceOf[js.Any], secure = secure.asInstanceOf[js.Any], session = session.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cookie]
  }
  
  @scala.inline
  implicit class CookieMutableBuilder[Self <: Cookie] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSameSite(value: SameSiteSetting): Self = StObject.set(x, "sameSite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: Boolean): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
