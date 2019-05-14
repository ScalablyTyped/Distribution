package typings
package sharpLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Brightness extends js.Object {
  var brightness: js.UndefOr[scala.Double] = js.undefined
  var hue: js.UndefOr[scala.Double] = js.undefined
  var saturation: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Brightness {
  @scala.inline
  def apply(
    brightness: scala.Int | scala.Double = null,
    hue: scala.Int | scala.Double = null,
    saturation: scala.Int | scala.Double = null
  ): Anon_Brightness = {
    val __obj = js.Dynamic.literal()
    if (brightness != null) __obj.updateDynamic("brightness")(brightness.asInstanceOf[js.Any])
    if (hue != null) __obj.updateDynamic("hue")(hue.asInstanceOf[js.Any])
    if (saturation != null) __obj.updateDynamic("saturation")(saturation.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Brightness]
  }
}

