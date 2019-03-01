package typings
package randomcolorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RandomColorOptions extends js.Object {
  var alpha: js.UndefOr[scala.Double] = js.undefined
  var count: js.UndefOr[scala.Double] = js.undefined
  var format: js.UndefOr[
    randomcolorLib.randomcolorLibStrings.hsvArray | randomcolorLib.randomcolorLibStrings.hslArray | randomcolorLib.randomcolorLibStrings.hsl | randomcolorLib.randomcolorLibStrings.hsla | randomcolorLib.randomcolorLibStrings.rgbArray | randomcolorLib.randomcolorLibStrings.rgb | randomcolorLib.randomcolorLibStrings.rgba | randomcolorLib.randomcolorLibStrings.hex
  ] = js.undefined
  var hue: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var luminosity: js.UndefOr[
    randomcolorLib.randomcolorLibStrings.bright | randomcolorLib.randomcolorLibStrings.light | randomcolorLib.randomcolorLibStrings.dark | randomcolorLib.randomcolorLibStrings.random
  ] = js.undefined
  var seed: js.UndefOr[scala.Double | java.lang.String] = js.undefined
}

object RandomColorOptions {
  @scala.inline
  def apply(
    alpha: scala.Int | scala.Double = null,
    count: scala.Int | scala.Double = null,
    format: randomcolorLib.randomcolorLibStrings.hsvArray | randomcolorLib.randomcolorLibStrings.hslArray | randomcolorLib.randomcolorLibStrings.hsl | randomcolorLib.randomcolorLibStrings.hsla | randomcolorLib.randomcolorLibStrings.rgbArray | randomcolorLib.randomcolorLibStrings.rgb | randomcolorLib.randomcolorLibStrings.rgba | randomcolorLib.randomcolorLibStrings.hex = null,
    hue: scala.Double | java.lang.String = null,
    luminosity: randomcolorLib.randomcolorLibStrings.bright | randomcolorLib.randomcolorLibStrings.light | randomcolorLib.randomcolorLibStrings.dark | randomcolorLib.randomcolorLibStrings.random = null,
    seed: scala.Double | java.lang.String = null
  ): RandomColorOptions = {
    val __obj = js.Dynamic.literal()
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (hue != null) __obj.updateDynamic("hue")(hue.asInstanceOf[js.Any])
    if (luminosity != null) __obj.updateDynamic("luminosity")(luminosity.asInstanceOf[js.Any])
    if (seed != null) __obj.updateDynamic("seed")(seed.asInstanceOf[js.Any])
    __obj.asInstanceOf[RandomColorOptions]
  }
}

