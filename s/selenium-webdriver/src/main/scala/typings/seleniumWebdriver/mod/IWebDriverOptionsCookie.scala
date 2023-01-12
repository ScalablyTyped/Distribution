package typings.seleniumWebdriver.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWebDriverOptionsCookie extends StObject {
  
  /**
    * The domain the cookie is visible to. Defaults to the current browsing
    * context's document's URL when adding a cookie.
    */
  var domain: js.UndefOr[String] = js.undefined
  
  /**
    * When the cookie expires.
    *
    * When {@linkplain Options#addCookie() adding a cookie}, this may be
    * specified in _seconds_ since Unix epoch (January 1, 1970). The expiry will
    * default to 20 years in the future if omitted.
    *
    * The expiry is always returned in seconds since epoch when
    * {@linkplain Options#getCookies() retrieving cookies} from the browser.
    *
    * @type {(!Date|number|undefined)}
    */
  var expiry: js.UndefOr[Double | js.Date] = js.undefined
  
  /**
    * Whether the cookie is an HTTP only cookie. Defaults to false when adding a
    * new cookie.
    */
  var httpOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The name of the cookie.
    */
  var name: String
  
  /**
    * The cookie path. Defaults to "/" when adding a cookie.
    */
  var path: js.UndefOr[String] = js.undefined
  
  /**
    * Whether the cookie is a secure cookie. Defaults to false when adding a new
    * cookie.
    */
  var secure: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The cookie value.
    */
  var value: String
}
object IWebDriverOptionsCookie {
  
  inline def apply(name: String, value: String): IWebDriverOptionsCookie = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebDriverOptionsCookie]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IWebDriverOptionsCookie] (val x: Self) extends AnyVal {
    
    inline def setDomain(value: String): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
    
    inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
    
    inline def setExpiry(value: Double | js.Date): Self = StObject.set(x, "expiry", value.asInstanceOf[js.Any])
    
    inline def setExpiryUndefined: Self = StObject.set(x, "expiry", js.undefined)
    
    inline def setHttpOnly(value: Boolean): Self = StObject.set(x, "httpOnly", value.asInstanceOf[js.Any])
    
    inline def setHttpOnlyUndefined: Self = StObject.set(x, "httpOnly", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
    
    inline def setSecure(value: Boolean): Self = StObject.set(x, "secure", value.asInstanceOf[js.Any])
    
    inline def setSecureUndefined: Self = StObject.set(x, "secure", js.undefined)
    
    inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
