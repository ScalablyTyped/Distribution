package typings.reduxDashApiDashMiddleware.reduxDashApiDashMiddlewareMod

import typings.reduxDashApiDashMiddleware.reduxDashApiDashMiddlewareNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RSAASuccessAction[Payload, Meta] extends js.Object {
  var error: js.UndefOr[`true`] = js.undefined
  var meta: js.UndefOr[Meta] = js.undefined
  var payload: Payload | InternalError
  var `type`: String | js.Symbol
}

object RSAASuccessAction {
  @scala.inline
  def apply[Payload, Meta](
    payload: Payload | InternalError,
    `type`: String | js.Symbol,
    error: `true` = null,
    meta: Meta = null
  ): RSAASuccessAction[Payload, Meta] = {
    val __obj = js.Dynamic.literal(payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error)
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[RSAASuccessAction[Payload, Meta]]
  }
}

