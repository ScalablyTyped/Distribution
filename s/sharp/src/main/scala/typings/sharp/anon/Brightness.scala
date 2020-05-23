package typings.sharp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Brightness extends js.Object {
  var brightness: js.UndefOr[Double] = js.undefined
  var hue: js.UndefOr[Double] = js.undefined
  var saturation: js.UndefOr[Double] = js.undefined
}

object Brightness {
  @scala.inline
  def apply(
    brightness: js.UndefOr[Double] = js.undefined,
    hue: js.UndefOr[Double] = js.undefined,
    saturation: js.UndefOr[Double] = js.undefined
  ): Brightness = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(brightness)) __obj.updateDynamic("brightness")(brightness.get.asInstanceOf[js.Any])
    if (!js.isUndefined(hue)) __obj.updateDynamic("hue")(hue.get.asInstanceOf[js.Any])
    if (!js.isUndefined(saturation)) __obj.updateDynamic("saturation")(saturation.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Brightness]
  }
}

