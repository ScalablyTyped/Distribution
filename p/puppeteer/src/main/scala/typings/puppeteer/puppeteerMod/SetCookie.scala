package typings.puppeteer.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetCookie extends js.Object {
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
  @scala.inline
  def apply(
    name: String,
    value: String,
    domain: String = null,
    expires: Int | Double = null,
    httpOnly: js.UndefOr[Boolean] = js.undefined,
    path: String = null,
    sameSite: SameSiteSetting = null,
    secure: js.UndefOr[Boolean] = js.undefined,
    session: js.UndefOr[Boolean] = js.undefined,
    url: String = null
  ): SetCookie = {
    val __obj = js.Dynamic.literal(name = name, value = value)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (!js.isUndefined(httpOnly)) __obj.updateDynamic("httpOnly")(httpOnly)
    if (path != null) __obj.updateDynamic("path")(path)
    if (sameSite != null) __obj.updateDynamic("sameSite")(sameSite)
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure)
    if (!js.isUndefined(session)) __obj.updateDynamic("session")(session)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[SetCookie]
  }
}

