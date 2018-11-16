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

