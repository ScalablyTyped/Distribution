package typings.reactDashNativeDashShare.reactDashNativeDashShareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenReturn extends js.Object {
  var app: js.UndefOr[String] = js.undefined
  var dismissedAction: js.UndefOr[Boolean] = js.undefined
}

object OpenReturn {
  @scala.inline
  def apply(app: String = null, dismissedAction: js.UndefOr[Boolean] = js.undefined): OpenReturn = {
    val __obj = js.Dynamic.literal()
    if (app != null) __obj.updateDynamic("app")(app)
    if (!js.isUndefined(dismissedAction)) __obj.updateDynamic("dismissedAction")(dismissedAction)
    __obj.asInstanceOf[OpenReturn]
  }
}

