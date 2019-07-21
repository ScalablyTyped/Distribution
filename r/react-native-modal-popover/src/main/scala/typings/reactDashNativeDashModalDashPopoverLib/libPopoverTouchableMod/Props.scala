package typings
package reactDashNativeDashModalDashPopoverLib.libPopoverTouchableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Props extends js.Object {
  var onPopoverDisplayed: js.UndefOr[js.Function0[_]] = js.undefined
}

object Props {
  @scala.inline
  def apply(onPopoverDisplayed: () => _ = null): Props = {
    val __obj = js.Dynamic.literal()
    if (onPopoverDisplayed != null) __obj.updateDynamic("onPopoverDisplayed")(js.Any.fromFunction0(onPopoverDisplayed))
    __obj.asInstanceOf[Props]
  }
}

