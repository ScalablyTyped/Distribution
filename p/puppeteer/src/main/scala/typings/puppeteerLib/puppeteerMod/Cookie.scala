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

