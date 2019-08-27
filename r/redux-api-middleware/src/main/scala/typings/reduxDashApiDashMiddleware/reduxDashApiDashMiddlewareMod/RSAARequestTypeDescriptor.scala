package typings.reduxDashApiDashMiddleware.reduxDashApiDashMiddlewareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RSAARequestTypeDescriptor[S, P, M] extends js.Object {
  var meta: js.UndefOr[(js.Function2[/* action */ RSAAAction[_, _, _], /* state */ S, M]) | M] = js.undefined
  var payload: js.UndefOr[(js.Function2[/* action */ RSAAAction[_, _, _], /* state */ S, P]) | P] = js.undefined
  var `type`: String | js.Symbol
}

object RSAARequestTypeDescriptor {
  @scala.inline
  def apply[S, P, M](
    `type`: String | js.Symbol,
    meta: (js.Function2[/* action */ RSAAAction[_, _, _], /* state */ S, M]) | M = null,
    payload: (js.Function2[/* action */ RSAAAction[_, _, _], /* state */ S, P]) | P = null
  ): RSAARequestTypeDescriptor[S, P, M] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[RSAARequestTypeDescriptor[S, P, M]]
  }
}

