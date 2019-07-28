package typings.puppeteer.puppeteerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Cookie extends js.Object {
  /** The cookie domain. */
  var domain: String
  /** The cookie Unix expiration time in seconds. */
  var expires: Double
  /** The cookie http only flag. */
  var httpOnly: Boolean
  /** The cookie name. */
  var name: String
  /** The cookie path. */
  var path: String
  /** The cookie same site definition. */
  var sameSite: SameSiteSetting
  /** The cookie secure flag. */
  var secure: Boolean
  /** The session cookie flag. */
  var session: Boolean
  /** The cookie size */
  var size: Double
  /** The cookie value. */
  var value: String
}

object Cookie {
  @scala.inline
  def apply(
    domain: String,
    expires: Double,
    httpOnly: Boolean,
    name: String,
    path: String,
    sameSite: SameSiteSetting,
    secure: Boolean,
    session: Boolean,
    size: Double,
    value: String
  ): Cookie = {
    val __obj = js.Dynamic.literal(domain = domain, expires = expires, httpOnly = httpOnly, name = name, path = path, sameSite = sameSite, secure = secure, session = session, size = size, value = value)
  
    __obj.asInstanceOf[Cookie]
  }
}

