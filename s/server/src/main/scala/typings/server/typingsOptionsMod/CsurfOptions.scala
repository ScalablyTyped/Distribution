package typings.server.typingsOptionsMod

import typings.csurf.csurfMod.CookieOptions
import typings.express.expressMod.Request
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CsurfOptions extends js.Object {
  var cookie: js.UndefOr[CookieOptions | Boolean] = js.undefined
  var ignoreMethods: js.UndefOr[js.Array[String]] = js.undefined
  var sessionKey: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[js.Function1[/* req */ Request[ParamsDictionary], String]] = js.undefined
}

object CsurfOptions {
  @scala.inline
  def apply(
    cookie: CookieOptions | Boolean = null,
    ignoreMethods: js.Array[String] = null,
    sessionKey: String = null,
    value: /* req */ Request[ParamsDictionary] => String = null
  ): CsurfOptions = {
    val __obj = js.Dynamic.literal()
    if (cookie != null) __obj.updateDynamic("cookie")(cookie.asInstanceOf[js.Any])
    if (ignoreMethods != null) __obj.updateDynamic("ignoreMethods")(ignoreMethods)
    if (sessionKey != null) __obj.updateDynamic("sessionKey")(sessionKey)
    if (value != null) __obj.updateDynamic("value")(js.Any.fromFunction1(value))
    __obj.asInstanceOf[CsurfOptions]
  }
}

