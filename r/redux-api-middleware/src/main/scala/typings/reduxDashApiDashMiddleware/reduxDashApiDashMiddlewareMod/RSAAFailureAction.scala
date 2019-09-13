package typings.reduxDashApiDashMiddleware.reduxDashApiDashMiddlewareMod

import typings.reduxDashApiDashMiddleware.reduxDashApiDashMiddlewareNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RSAAFailureAction[Payload, Meta] extends js.Object {
  var error: `true`
  var meta: js.UndefOr[Meta] = js.undefined
  var payload: InternalError | RequestError | ApiError[Payload]
  var `type`: String | js.Symbol
}

object RSAAFailureAction {
  @scala.inline
  def apply[Payload, Meta](
    error: `true`,
    payload: InternalError | RequestError | ApiError[Payload],
    `type`: String | js.Symbol,
    meta: Meta = null
  ): RSAAFailureAction[Payload, Meta] = {
    val __obj = js.Dynamic.literal(error = error, payload = payload.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    __obj.asInstanceOf[RSAAFailureAction[Payload, Meta]]
  }
}

