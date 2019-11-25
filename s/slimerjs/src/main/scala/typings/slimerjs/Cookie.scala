package typings.slimerjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cookie extends js.Object {
  var domain: js.UndefOr[String] = js.undefined
  var expires: js.UndefOr[String] = js.undefined
  var expiry: Double
  var httponly: js.UndefOr[Boolean] = js.undefined
  var name: String
  var path: String
  var secure: js.UndefOr[Boolean] = js.undefined
  var value: String
}

object Cookie {
  @scala.inline
  def apply(
    expiry: Double,
    name: String,
    path: String,
    value: String,
    domain: String = null,
    expires: String = null,
    httponly: js.UndefOr[Boolean] = js.undefined,
    secure: js.UndefOr[Boolean] = js.undefined
  ): Cookie = {
    val __obj = js.Dynamic.literal(expiry = expiry.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    if (domain != null) __obj.updateDynamic("domain")(domain.asInstanceOf[js.Any])
    if (expires != null) __obj.updateDynamic("expires")(expires.asInstanceOf[js.Any])
    if (!js.isUndefined(httponly)) __obj.updateDynamic("httponly")(httponly.asInstanceOf[js.Any])
    if (!js.isUndefined(secure)) __obj.updateDynamic("secure")(secure.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cookie]
  }
}

