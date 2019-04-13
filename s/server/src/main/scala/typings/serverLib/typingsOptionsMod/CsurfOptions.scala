package typings
package serverLib.typingsOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CsurfOptions extends js.Object {
  var cookie: js.UndefOr[csurfLib.csurfMod.CookieOptions | scala.Boolean] = js.undefined
  var ignoreMethods: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var sessionKey: js.UndefOr[java.lang.String] = js.undefined
  var value: js.UndefOr[js.Function1[/* req */ expressLib.expressMod.Request, java.lang.String]] = js.undefined
}

object CsurfOptions {
  @scala.inline
  def apply(
    cookie: csurfLib.csurfMod.CookieOptions | scala.Boolean = null,
    ignoreMethods: js.Array[java.lang.String] = null,
    sessionKey: java.lang.String = null,
    value: /* req */ expressLib.expressMod.Request => java.lang.String = null
  ): CsurfOptions = {
    val __obj = js.Dynamic.literal()
    if (cookie != null) __obj.updateDynamic("cookie")(cookie.asInstanceOf[js.Any])
    if (ignoreMethods != null) __obj.updateDynamic("ignoreMethods")(ignoreMethods)
    if (sessionKey != null) __obj.updateDynamic("sessionKey")(sessionKey)
    if (value != null) __obj.updateDynamic("value")(js.Any.fromFunction1(value))
    __obj.asInstanceOf[CsurfOptions]
  }
}

