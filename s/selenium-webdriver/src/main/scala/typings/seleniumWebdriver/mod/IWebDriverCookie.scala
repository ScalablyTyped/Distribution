package typings.seleniumWebdriver.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IWebDriverCookie
  extends StObject
     with IWebDriverOptionsCookie {
  
  /**
    * When the cookie expires.
    *
    * The expiry is always returned in seconds since epoch when
    * {@linkplain Options#getCookies() retrieving cookies} from the browser.
    *
    * @type {(!number|undefined)}
    */
  @JSName("expiry")
  var expiry_IWebDriverCookie: js.UndefOr[Double] = js.undefined
}
object IWebDriverCookie {
  
  inline def apply(name: String, value: String): IWebDriverCookie = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebDriverCookie]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IWebDriverCookie] (val x: Self) extends AnyVal {
    
    inline def setExpiry(value: Double): Self = StObject.set(x, "expiry", value.asInstanceOf[js.Any])
    
    inline def setExpiryUndefined: Self = StObject.set(x, "expiry", js.undefined)
  }
}
