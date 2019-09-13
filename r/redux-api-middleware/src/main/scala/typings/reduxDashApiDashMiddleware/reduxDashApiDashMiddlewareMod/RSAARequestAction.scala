package typings.reduxDashApiDashMiddleware.reduxDashApiDashMiddlewareMod

import typings.reduxDashApiDashMiddleware.reduxDashApiDashMiddlewareNumbers.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RSAARequestAction[Payload, Meta] extends js.Object {
  var error: js.UndefOr[`true`] = js.undefined
  var meta: js.UndefOr[Meta] = js.undefined
  var payload: js.UndefOr[Payload | InvalidRSAA] = js.undefined
  var `type`: String | js.Symbol
}

object RSAARequestAction {
  @scala.inline
  def apply[Payload, Meta](
    `type`: String | js.Symbol,
    error: `true` = null,
    meta: Meta = null,
    payload: Payload | InvalidRSAA = null
  ): RSAARequestAction[Payload, Meta] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (error != null) __obj.updateDynamic("error")(error)
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[RSAARequestAction[Payload, Meta]]
  }
}

