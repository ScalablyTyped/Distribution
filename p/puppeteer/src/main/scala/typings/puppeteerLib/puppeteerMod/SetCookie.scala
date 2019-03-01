package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetCookie extends js.Object {
  /** The cookie domain. */
  var domain: js.UndefOr[java.lang.String] = js.undefined
  /** The cookie Unix expiration time in seconds. */
  var expires: js.UndefOr[scala.Double] = js.undefined
  /** The cookie http only flag. */
  var httpOnly: js.UndefOr[scala.Boolean] = js.undefined
  /** The cookie name. */
  var name: java.lang.String
  /** The cookie path. */
  var path: js.UndefOr[java.lang.String] = js.undefined
  /** The cookie same site definition. */
  var sameSite: js.UndefOr[SameSiteSetting] = js.undefined
  /** The cookie secure flag. */
  var secure: js.UndefOr[scala.Boolean] = js.undefined
  /** The session cookie flag. */
  var session: js.UndefOr[scala.Boolean] = js.undefined
  /** The request-URI to associate with the setting of the cookie. This value can affect the default domain and path values of the created cookie. */
  var url: js.UndefOr[java.lang.String] = js.undefined
  /** The cookie value. */
  var value: java.lang.String
}

object SetCookie {
  @scala.inline
  def apply(
    name: java.lang.String,
    value: java.lang.String,
    domain: java.lang.String = null,
    expires: scala.Int | scala.Double = null,
    httpOnly: js.UndefOr[scala.Boolean] = js.undefined,
    path: java.lang.String = null,
    sameSite: SameSiteSetting = null,
    secure: js.UndefOr[scala.Boolean] = js.undefined,
    session: js.UndefOr[scala.Boolean] = js.undefined,
    url: java.lang.String = null
  ): SetCookie = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("value")(value)
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

