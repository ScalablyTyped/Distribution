package typings.reactNativeNavigation.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverlayOptions extends js.Object {
  /**
    * Control wether this Overlay should handle Keyboard events.
    * Set this to true if your Overlay contains a TextInput.
    */
  var handleKeyboardEvents: js.UndefOr[Boolean] = js.undefined
  /**
    * Capture touches outside of the Component View
    */
  var interceptTouchOutside: js.UndefOr[Boolean] = js.undefined
}

object OverlayOptions {
  @scala.inline
  def apply(
    handleKeyboardEvents: js.UndefOr[Boolean] = js.undefined,
    interceptTouchOutside: js.UndefOr[Boolean] = js.undefined
  ): OverlayOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(handleKeyboardEvents)) __obj.updateDynamic("handleKeyboardEvents")(handleKeyboardEvents.asInstanceOf[js.Any])
    if (!js.isUndefined(interceptTouchOutside)) __obj.updateDynamic("interceptTouchOutside")(interceptTouchOutside.asInstanceOf[js.Any])
    __obj.asInstanceOf[OverlayOptions]
  }
}

