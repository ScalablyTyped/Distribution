package typings
package reduxDashApiDashMiddlewareLib.reduxDashApiDashMiddlewareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RSAARequestTypeDescriptor[S, P, M] extends js.Object {
  var meta: js.UndefOr[js.Function2[/* action */ RSAAAction[_, _, _], /* state */ S, M]] = js.undefined
  var payload: js.UndefOr[js.Function2[/* action */ RSAAAction[_, _, _], /* state */ S, P]] = js.undefined
  var `type`: java.lang.String | js.Symbol
}

object RSAARequestTypeDescriptor {
  @scala.inline
  def apply[S, P, M](
    `type`: java.lang.String | js.Symbol,
    meta: (/* action */ RSAAAction[_, _, _], /* state */ S) => M = null,
    payload: (/* action */ RSAAAction[_, _, _], /* state */ S) => P = null
  ): RSAARequestTypeDescriptor[S, P, M] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(js.Any.fromFunction2(meta))
    if (payload != null) __obj.updateDynamic("payload")(js.Any.fromFunction2(payload))
    __obj.asInstanceOf[RSAARequestTypeDescriptor[S, P, M]]
  }
}

