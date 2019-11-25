package typings.rest.restMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Request extends js.Object {
  var cancel: js.UndefOr[js.Function0[Unit]] = js.undefined
  var canceled: js.UndefOr[Boolean] = js.undefined
  var entity: js.UndefOr[js.Any] = js.undefined
  var headers: js.UndefOr[js.Any] = js.undefined
  var method: js.UndefOr[String] = js.undefined
  var mixin: js.UndefOr[js.Any] = js.undefined
  var originator: js.UndefOr[js.Function1[/* request */ js.UndefOr[Request], ResponsePromise]] = js.undefined
  var params: js.UndefOr[js.Any] = js.undefined
  var path: js.UndefOr[String] = js.undefined
}

object Request {
  @scala.inline
  def apply(
    cancel: () => Unit = null,
    canceled: js.UndefOr[Boolean] = js.undefined,
    entity: js.Any = null,
    headers: js.Any = null,
    method: String = null,
    mixin: js.Any = null,
    originator: /* request */ js.UndefOr[Request] => ResponsePromise = null,
    params: js.Any = null,
    path: String = null
  ): Request = {
    val __obj = js.Dynamic.literal()
    if (cancel != null) __obj.updateDynamic("cancel")(js.Any.fromFunction0(cancel))
    if (!js.isUndefined(canceled)) __obj.updateDynamic("canceled")(canceled.asInstanceOf[js.Any])
    if (entity != null) __obj.updateDynamic("entity")(entity.asInstanceOf[js.Any])
    if (headers != null) __obj.updateDynamic("headers")(headers.asInstanceOf[js.Any])
    if (method != null) __obj.updateDynamic("method")(method.asInstanceOf[js.Any])
    if (mixin != null) __obj.updateDynamic("mixin")(mixin.asInstanceOf[js.Any])
    if (originator != null) __obj.updateDynamic("originator")(js.Any.fromFunction1(originator))
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    __obj.asInstanceOf[Request]
  }
}

