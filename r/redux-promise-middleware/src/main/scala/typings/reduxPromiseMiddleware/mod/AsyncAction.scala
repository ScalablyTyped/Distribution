package typings.reduxPromiseMiddleware.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncAction extends FluxStandardAction {
  @JSName("payload")
  var payload_AsyncAction: js.UndefOr[AsyncPayload] = js.undefined
}

object AsyncAction {
  @scala.inline
  def apply(
    `type`: js.Any,
    error: js.UndefOr[Boolean] = js.undefined,
    meta: js.Any = null,
    payload: AsyncPayload = null
  ): AsyncAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[AsyncAction]
  }
}

