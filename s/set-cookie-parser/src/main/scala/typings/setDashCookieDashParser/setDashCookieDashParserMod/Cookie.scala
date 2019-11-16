package typings.setDashCookieDashParser.setDashCookieDashParserMod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cookie extends js.Object {
  var domain: js.UndefOr[String] = js.undefined
  var expires: js.UndefOr[Date] = js.undefined
  var httpOnly: js.UndefOr[Boolean] = js.undefined
  var maxAge: js.UndefOr[Double] = js.undefined
  var name: String
  var path: js.UndefOr[String] = js.undefined
  var sameSite: js.UndefOr[String] = js.undefined
  var secure: js.UndefOr[Boolean] = js.undefined
  var value: String
}

object Cookie {
  @scala.inline
  def apply(
    name: String,
    value: String,
    domain: String = null,
    expires: Date = null,
    httpOnly: js.UndefOr[Boolean] = js.undefined,
    maxAge: Int | Double = null,
    path: String = null,
    sameSite: String = null,
    secure: js.UndefOr[Boolean] = js.undefined
  ): Cookie = {
    val __obj = js.Dynamic.literal(name = name, value = value)
    if (domain != null) __obj.updateDynamic("domain")(domain)
    if (expires != null) __obj.updateDynamic("expires")(expires)
    if (!js.isUndefined(httpOnly)) __obj.updateDynamic("httpOnly")(httpOnly)
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path)
    if (sameSite != null) __obj.updateDynamic("sameSite")(sameSite)
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure)
    __obj.asInstanceOf[Cookie]
  }
}

