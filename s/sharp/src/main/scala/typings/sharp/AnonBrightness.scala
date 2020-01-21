package typings.sharp

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBrightness extends js.Object {
  var brightness: js.UndefOr[Double] = js.undefined
  var hue: js.UndefOr[Double] = js.undefined
  var saturation: js.UndefOr[Double] = js.undefined
}

object AnonBrightness {
  @scala.inline
  def apply(brightness: Int | Double = null, hue: Int | Double = null, saturation: Int | Double = null): AnonBrightness = {
    val __obj = js.Dynamic.literal()
    if (brightness != null) __obj.updateDynamic("brightness")(brightness.asInstanceOf[js.Any])
    if (hue != null) __obj.updateDynamic("hue")(hue.asInstanceOf[js.Any])
    if (saturation != null) __obj.updateDynamic("saturation")(saturation.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBrightness]
  }
}

