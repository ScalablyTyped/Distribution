package typings.seleniumWebdriver.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IWebDriverOptionsCookie extends js.Object {
  
  /**
    * The domain the cookie is visible to. Defaults to the current browsing
    * context's document's URL when adding a cookie.
    */
  var domain: js.UndefOr[String] = js.native
  
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
  var expiry: js.UndefOr[Double | Date] = js.native
  
  /**
    * Whether the cookie is an HTTP only cookie. Defaults to false when adding a
    * new cookie.
    */
  var httpOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * The name of the cookie.
    */
  var name: String = js.native
  
  /**
    * The cookie path. Defaults to "/" when adding a cookie.
    */
  var path: js.UndefOr[String] = js.native
  
  /**
    * Whether the cookie is a secure cookie. Defaults to false when adding a new
    * cookie.
    */
  var secure: js.UndefOr[Boolean] = js.native
  
  /**
    * The cookie value.
    */
  var value: String = js.native
}
object IWebDriverOptionsCookie {
  
  @scala.inline
  def apply(name: String, value: String): IWebDriverOptionsCookie = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebDriverOptionsCookie]
  }
  
  @scala.inline
  implicit class IWebDriverOptionsCookieOps[Self <: IWebDriverOptionsCookie] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomain(value: String): Self = this.set("domain", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    
    @scala.inline
    def setExpiry(value: Double | Date): Self = this.set("expiry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpiry: Self = this.set("expiry", js.undefined)
    
    @scala.inline
    def setHttpOnly(value: Boolean): Self = this.set("httpOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHttpOnly: Self = this.set("httpOnly", js.undefined)
    
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePath: Self = this.set("path", js.undefined)
    
    @scala.inline
    def setSecure(value: Boolean): Self = this.set("secure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSecure: Self = this.set("secure", js.undefined)
  }
}
