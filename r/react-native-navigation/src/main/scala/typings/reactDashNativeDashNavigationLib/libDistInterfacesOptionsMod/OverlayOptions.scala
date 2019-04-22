package typings
package reactDashNativeDashNavigationLib.libDistInterfacesOptionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverlayOptions extends js.Object {
  /**
    * Control wether this Overlay should handle Keyboard events.
    * Set this to true if your Overlay contains a TextInput.
    */
  var handleKeyboardEvents: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Capture touches outside of the Component View
    */
  var interceptTouchOutside: js.UndefOr[scala.Boolean] = js.undefined
}

object OverlayOptions {
  @scala.inline
  def apply(
    handleKeyboardEvents: js.UndefOr[scala.Boolean] = js.undefined,
    interceptTouchOutside: js.UndefOr[scala.Boolean] = js.undefined
  ): OverlayOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(handleKeyboardEvents)) __obj.updateDynamic("handleKeyboardEvents")(handleKeyboardEvents)
    if (!js.isUndefined(interceptTouchOutside)) __obj.updateDynamic("interceptTouchOutside")(interceptTouchOutside)
    __obj.asInstanceOf[OverlayOptions]
  }
}

