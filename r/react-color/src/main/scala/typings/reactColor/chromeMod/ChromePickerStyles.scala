package typings.reactColor.chromeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChromePickerStyles extends js.Object {
  var default: js.UndefOr[ChromePickerDefaultStyles] = js.undefined
  var disableAlpha: js.UndefOr[ChromePickerDisableAlphaStyles] = js.undefined
}

object ChromePickerStyles {
  @scala.inline
  def apply(default: ChromePickerDefaultStyles = null, disableAlpha: ChromePickerDisableAlphaStyles = null): ChromePickerStyles = {
    val __obj = js.Dynamic.literal()
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (disableAlpha != null) __obj.updateDynamic("disableAlpha")(disableAlpha.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChromePickerStyles]
  }
}

