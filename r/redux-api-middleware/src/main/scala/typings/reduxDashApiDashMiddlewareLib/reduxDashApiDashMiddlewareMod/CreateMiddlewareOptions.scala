package typings
package reduxDashApiDashMiddlewareLib.reduxDashApiDashMiddlewareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateMiddlewareOptions extends js.Object {
  var fetch: js.UndefOr[reduxDashApiDashMiddlewareLib.Fn_Init] = js.undefined
  var ok: js.UndefOr[js.Function1[/* res */ stdLib.Response, scala.Boolean]] = js.undefined
}

object CreateMiddlewareOptions {
  @scala.inline
  def apply(
    fetch: reduxDashApiDashMiddlewareLib.Fn_Init = null,
    ok: /* res */ stdLib.Response => scala.Boolean = null
  ): CreateMiddlewareOptions = {
    val __obj = js.Dynamic.literal()
    if (fetch != null) __obj.updateDynamic("fetch")(fetch)
    if (ok != null) __obj.updateDynamic("ok")(js.Any.fromFunction1(ok))
    __obj.asInstanceOf[CreateMiddlewareOptions]
  }
}

