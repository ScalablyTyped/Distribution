package typings
package seleniumDashWebdriverLib.seleniumDashWebdriverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IWebDriverCookie extends IWebDriverOptionsCookie {
  /**
    * When the cookie expires.
    *
    * The expiry is always returned in seconds since epoch when
    * {@linkplain Options#getCookies() retrieving cookies} from the browser.
    *
    * @type {(!number|undefined)}
    */
  @JSName("expiry")
  var expiry_IWebDriverCookie: js.UndefOr[scala.Double] = js.undefined
}

object IWebDriverCookie {
  @scala.inline
  def apply(
    name: java.lang.String,
    value: java.lang.String,
    domain: java.lang.String = null,
    expiry: scala.Int | scala.Double = null,
    httpOnly: js.UndefOr[scala.Boolean] = js.undefined,
    path: java.lang.String = null,
    secure: js.UndefOr[scala.Boolean] = js.undefined
  ): IWebDriverCookie = {
    val __obj = js.Dynamic.literal(name = name, value = value)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (expiry != null) __obj.updateDynamic("expiry")(expiry.asInstanceOf[js.Any])
    if (!js.isUndefined(httpOnly)) __obj.updateDynamic("httpOnly")(httpOnly)
    if (path != null) __obj.updateDynamic("path")(path)
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure)
    __obj.asInstanceOf[IWebDriverCookie]
  }
}

