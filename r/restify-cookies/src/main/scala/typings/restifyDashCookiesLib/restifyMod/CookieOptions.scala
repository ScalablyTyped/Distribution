package typings
package restifyDashCookiesLib.restifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CookieOptions extends js.Object {
  var domain: js.UndefOr[java.lang.String] = js.undefined
  var encode: js.UndefOr[js.Function1[/* input */ java.lang.String, java.lang.String]] = js.undefined
  var expires: js.UndefOr[stdLib.Date] = js.undefined
  var httpOnly: js.UndefOr[scala.Boolean] = js.undefined
   // tslint:disable-line:prefer-method-signature
  var maxAge: js.UndefOr[scala.Double] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var sameSite: js.UndefOr[
    scala.Boolean | restifyDashCookiesLib.restifyDashCookiesLibStrings.lax | restifyDashCookiesLib.restifyDashCookiesLibStrings.strict
  ] = js.undefined
  var secure: js.UndefOr[scala.Boolean] = js.undefined
}

object CookieOptions {
  @scala.inline
  def apply(
    domain: java.lang.String = null,
    encode: js.Function1[/* input */ java.lang.String, java.lang.String] = null,
    expires: stdLib.Date = null,
    httpOnly: js.UndefOr[scala.Boolean] = js.undefined,
    maxAge: scala.Int | scala.Double = null,
    path: java.lang.String = null,
    sameSite: scala.Boolean | restifyDashCookiesLib.restifyDashCookiesLibStrings.lax | restifyDashCookiesLib.restifyDashCookiesLibStrings.strict = null,
    secure: js.UndefOr[scala.Boolean] = js.undefined
  ): CookieOptions = {
    val __obj = js.Dynamic.literal()
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (encode != null) __obj.updateDynamic("encode")(encode)
    if (expires != null) __obj.updateDynamic("expires")(expires)
    if (!js.isUndefined(httpOnly)) __obj.updateDynamic("httpOnly")(httpOnly)
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path)
    if (sameSite != null) __obj.updateDynamic("sameSite")(sameSite.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure)
    __obj.asInstanceOf[CookieOptions]
  }
}

