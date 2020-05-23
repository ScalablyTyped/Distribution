package typings.slickgrid.Slick.Controls

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlickColumnPickerOptions extends js.Object {
  var fadeSpeed: js.UndefOr[Double] = js.undefined
}

object SlickColumnPickerOptions {
  @scala.inline
  def apply(fadeSpeed: js.UndefOr[Double] = js.undefined): SlickColumnPickerOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fadeSpeed)) __obj.updateDynamic("fadeSpeed")(fadeSpeed.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlickColumnPickerOptions]
  }
}

