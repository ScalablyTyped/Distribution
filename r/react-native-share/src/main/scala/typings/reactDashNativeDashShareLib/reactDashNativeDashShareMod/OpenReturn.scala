package typings
package reactDashNativeDashShareLib.reactDashNativeDashShareMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenReturn extends js.Object {
  var app: js.UndefOr[java.lang.String] = js.undefined
  var dismissedAction: js.UndefOr[scala.Boolean] = js.undefined
}

object OpenReturn {
  @scala.inline
  def apply(app: java.lang.String = null, dismissedAction: js.UndefOr[scala.Boolean] = js.undefined): OpenReturn = {
    val __obj = js.Dynamic.literal()
    if (app != null) __obj.updateDynamic("app")(app)
    if (!js.isUndefined(dismissedAction)) __obj.updateDynamic("dismissedAction")(dismissedAction)
    __obj.asInstanceOf[OpenReturn]
  }
}

