package typings
package slickgridLib.SlickNs.ControlsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlickColumnPickerOptions extends js.Object {
  var fadeSpeed: js.UndefOr[scala.Double] = js.undefined
}

object SlickColumnPickerOptions {
  @scala.inline
  def apply(fadeSpeed: scala.Int | scala.Double = null): SlickColumnPickerOptions = {
    val __obj = js.Dynamic.literal()
    if (fadeSpeed != null) __obj.updateDynamic("fadeSpeed")(fadeSpeed.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlickColumnPickerOptions]
  }
}

