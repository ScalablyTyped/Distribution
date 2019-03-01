package typings
package reactDashIntlDashReduxLib.reactDashIntlDashReduxMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IntlAction
  extends reduxLib.reduxMod.Action[js.Any] {
  var payload: js.UndefOr[IntlState] = js.undefined
}

object IntlAction {
  @scala.inline
  def apply(`type`: js.Any, payload: IntlState = null): IntlAction = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    if (payload != null) __obj.updateDynamic("payload")(payload)
    __obj.asInstanceOf[IntlAction]
  }
}

