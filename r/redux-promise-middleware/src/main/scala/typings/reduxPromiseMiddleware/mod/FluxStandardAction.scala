package typings.reduxPromiseMiddleware.mod

import typings.redux.mod.Action
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FluxStandardAction
  extends Action[js.Any] {
  var error: js.UndefOr[Boolean] = js.undefined
  var meta: js.UndefOr[js.Any] = js.undefined
  var payload: js.UndefOr[js.Any] = js.undefined
}

object FluxStandardAction {
  @scala.inline
  def apply(
    `type`: js.Any,
    error: js.UndefOr[Boolean] = js.undefined,
    meta: js.Any = null,
    payload: js.Any = null
  ): FluxStandardAction = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(error)) __obj.updateDynamic("error")(error.get.asInstanceOf[js.Any])
    if (meta != null) __obj.updateDynamic("meta")(meta.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    __obj.asInstanceOf[FluxStandardAction]
  }
}

