package typings.seleniumDashWebdriver.seleniumDashWebdriverMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWebDriverOptionsCookie extends js.Object {
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
  var expiry: js.UndefOr[Double | Date] = js.undefined
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
  @scala.inline
  def apply(
    name: String,
    value: String,
    domain: String = null,
    expiry: Double | Date = null,
    httpOnly: js.UndefOr[Boolean] = js.undefined,
    path: String = null,
    secure: js.UndefOr[Boolean] = js.undefined
  ): IWebDriverOptionsCookie = {
    val __obj = js.Dynamic.literal(name = name, value = value)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (expiry != null) __obj.updateDynamic("expiry")(expiry.asInstanceOf[js.Any])
    if (!js.isUndefined(httpOnly)) __obj.updateDynamic("httpOnly")(httpOnly)
    if (path != null) __obj.updateDynamic("path")(path)
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure)
    __obj.asInstanceOf[IWebDriverOptionsCookie]
  }
}

