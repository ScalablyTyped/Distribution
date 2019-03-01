package typings
package puppeteerLib.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cookie extends js.Object {
  /** The cookie domain. */
  var domain: java.lang.String
  /** The cookie Unix expiration time in seconds. */
  var expires: scala.Double
  /** The cookie http only flag. */
  var httpOnly: scala.Boolean
  /** The cookie name. */
  var name: java.lang.String
  /** The cookie path. */
  var path: java.lang.String
  /** The cookie same site definition. */
  var sameSite: SameSiteSetting
  /** The cookie secure flag. */
  var secure: scala.Boolean
  /** The session cookie flag. */
  var session: scala.Boolean
  /** The cookie size */
  var size: scala.Double
  /** The cookie value. */
  var value: java.lang.String
}

object Cookie {
  @scala.inline
  def apply(
    domain: java.lang.String,
    expires: scala.Double,
    httpOnly: scala.Boolean,
    name: java.lang.String,
    path: java.lang.String,
    sameSite: SameSiteSetting,
    secure: scala.Boolean,
    session: scala.Boolean,
    size: scala.Double,
    value: java.lang.String
  ): Cookie = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("domain")(domain)
    __obj.updateDynamic("expires")(expires)
    __obj.updateDynamic("httpOnly")(httpOnly)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("path")(path)
    __obj.updateDynamic("sameSite")(sameSite)
    __obj.updateDynamic("secure")(secure)
    __obj.updateDynamic("session")(session)
    __obj.updateDynamic("size")(size)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[Cookie]
  }
}

