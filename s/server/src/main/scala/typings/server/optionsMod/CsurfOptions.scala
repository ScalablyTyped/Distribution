package typings.server.optionsMod

import typings.csurf.mod.CookieOptions
import typings.express.mod.Request_
import typings.expressServeStaticCore.mod.ParamsDictionary
import typings.expressServeStaticCore.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CsurfOptions extends js.Object {
  var cookie: js.UndefOr[CookieOptions | Boolean] = js.undefined
  var ignoreMethods: js.UndefOr[js.Array[String]] = js.undefined
  var sessionKey: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[js.Function1[/* req */ Request_[ParamsDictionary, _, _, Query], String]] = js.undefined
}

object CsurfOptions {
  @scala.inline
  def apply(
    cookie: CookieOptions | Boolean = null,
    ignoreMethods: js.Array[String] = null,
    sessionKey: String = null,
    value: /* req */ Request_[ParamsDictionary, _, _, Query] => String = null
  ): CsurfOptions = {
    val __obj = js.Dynamic.literal()
    if (cookie != null) __obj.updateDynamic("cookie")(cookie.asInstanceOf[js.Any])
    if (ignoreMethods != null) __obj.updateDynamic("ignoreMethods")(ignoreMethods.asInstanceOf[js.Any])
    if (sessionKey != null) __obj.updateDynamic("sessionKey")(sessionKey.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(js.Any.fromFunction1(value))
    __obj.asInstanceOf[CsurfOptions]
  }
}

