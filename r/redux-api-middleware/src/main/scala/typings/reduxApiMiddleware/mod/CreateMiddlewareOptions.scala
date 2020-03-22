package typings.reduxApiMiddleware.mod

import typings.reduxApiMiddleware.FnCall
import typings.std.Response
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateMiddlewareOptions extends js.Object {
  var fetch: js.UndefOr[FnCall] = js.undefined
  var ok: js.UndefOr[js.Function1[/* res */ Response, Boolean]] = js.undefined
}

object CreateMiddlewareOptions {
  @scala.inline
  def apply(fetch: FnCall = null, ok: /* res */ Response => Boolean = null): CreateMiddlewareOptions = {
    val __obj = js.Dynamic.literal()
    if (fetch != null) __obj.updateDynamic("fetch")(fetch.asInstanceOf[js.Any])
    if (ok != null) __obj.updateDynamic("ok")(js.Any.fromFunction1(ok))
    __obj.asInstanceOf[CreateMiddlewareOptions]
  }
}

