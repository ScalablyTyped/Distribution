package typings.seleniumWebdriver.mod

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
  var expiry_IWebDriverCookie: js.UndefOr[Double] = js.undefined
}

object IWebDriverCookie {
  @scala.inline
  def apply(
    name: String,
    value: String,
    domain: String = null,
    expiry: Int | Double = null,
    httpOnly: js.UndefOr[Boolean] = js.undefined,
    path: String = null,
    secure: js.UndefOr[Boolean] = js.undefined
  ): IWebDriverCookie = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (expiry != null) __obj.updateDynamic("expiry")(expiry.asInstanceOf[js.Any])
    if (!js.isUndefined(httpOnly)) __obj.updateDynamic("httpOnly")(httpOnly.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure.asInstanceOf[js.Any])
    __obj.asInstanceOf[IWebDriverCookie]
  }
}

