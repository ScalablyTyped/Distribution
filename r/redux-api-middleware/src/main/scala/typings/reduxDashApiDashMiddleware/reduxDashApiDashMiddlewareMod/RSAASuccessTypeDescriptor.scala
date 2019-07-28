package typings.reduxDashApiDashMiddleware.reduxDashApiDashMiddlewareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RSAASuccessTypeDescriptor[S, P, M] extends js.Object {
  var meta: js.UndefOr[
    js.Function3[/* action */ RSAAAction[_, _, _], /* state */ S, /* res */ js.Any, M]
  ] = js.undefined
  var payload: js.UndefOr[
    js.Function3[/* action */ RSAAAction[_, _, _], /* state */ S, /* res */ js.Any, P]
  ] = js.undefined
  var `type`: String | js.Symbol
}

object RSAASuccessTypeDescriptor {
  @scala.inline
  def apply[S, P, M](
    `type`: String | js.Symbol,
    meta: (/* action */ RSAAAction[_, _, _], /* state */ S, /* res */ js.Any) => M = null,
    payload: (/* action */ RSAAAction[_, _, _], /* state */ S, /* res */ js.Any) => P = null
  ): RSAASuccessTypeDescriptor[S, P, M] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(js.Any.fromFunction3(meta))
    if (payload != null) __obj.updateDynamic("payload")(js.Any.fromFunction3(payload))
    __obj.asInstanceOf[RSAASuccessTypeDescriptor[S, P, M]]
  }
}

