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

