package typings
package restLib.restMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var cancel: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var canceled: js.UndefOr[scala.Boolean] = js.undefined
  var entity: js.UndefOr[js.Any] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var method: js.UndefOr[java.lang.String] = js.undefined
  var originator: js.UndefOr[js.Function1[/* request */ js.UndefOr[Request], ResponsePromise]] = js.undefined
  var params: js.UndefOr[js.Any] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
}

object Request {
  @scala.inline
  def apply(
    cancel: () => scala.Unit = null,
    canceled: js.UndefOr[scala.Boolean] = js.undefined,
    entity: js.Any = null,
    headers: js.Any = null,
    method: java.lang.String = null,
    originator: /* request */ js.UndefOr[Request] => ResponsePromise = null,
    params: js.Any = null,
    path: java.lang.String = null
  ): Request = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction0(cancel))
    if (!js.isUndefined(canceled)) __obj.updateDynamic("canceled")(canceled)
    if (entity != null) __obj.updateDynamic("entity")(entity)
    if (headers != null) __obj.updateDynamic("headers")(headers)
    if (method != null) __obj.updateDynamic("method")(method)
    if (originator != null) __obj.updateDynamic("originator")(js.Any.fromFunction1(originator))
    if (params != null) __obj.updateDynamic("params")(params)
    if (path != null) __obj.updateDynamic("path")(path)
    __obj.asInstanceOf[Request]
  }
}

