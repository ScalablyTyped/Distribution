package typings
package reactDashNativeDashNavigationLib.libDistInterfacesOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OptionsOverlay extends js.Object {
  /**
    * Capture touches outside of the Component View
    */
  var interceptTouchOutside: js.UndefOr[scala.Boolean] = js.undefined
}

object OptionsOverlay {
  @scala.inline
  def apply(interceptTouchOutside: js.UndefOr[scala.Boolean] = js.undefined): OptionsOverlay = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(interceptTouchOutside)) __obj.updateDynamic("interceptTouchOutside")(interceptTouchOutside)
    __obj.asInstanceOf[OptionsOverlay]
  }
}

