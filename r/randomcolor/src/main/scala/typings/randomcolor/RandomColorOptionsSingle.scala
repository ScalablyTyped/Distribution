package typings.randomcolor

import typings.randomcolor.randomcolorStrings.bright
import typings.randomcolor.randomcolorStrings.dark
import typings.randomcolor.randomcolorStrings.hex
import typings.randomcolor.randomcolorStrings.hsl
import typings.randomcolor.randomcolorStrings.hslArray
import typings.randomcolor.randomcolorStrings.hsla
import typings.randomcolor.randomcolorStrings.hsvArray
import typings.randomcolor.randomcolorStrings.light
import typings.randomcolor.randomcolorStrings.random
import typings.randomcolor.randomcolorStrings.rgb
import typings.randomcolor.randomcolorStrings.rgbArray
import typings.randomcolor.randomcolorStrings.rgba
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RandomColorOptionsSingle extends js.Object {
  var alpha: js.UndefOr[Double] = js.undefined
  var format: js.UndefOr[hsvArray | hslArray | hsl | hsla | rgbArray | rgb | rgba | hex] = js.undefined
  var hue: js.UndefOr[Double | String] = js.undefined
  var luminosity: js.UndefOr[bright | light | dark | random] = js.undefined
  var seed: js.UndefOr[Double | String] = js.undefined
}

object RandomColorOptionsSingle {
  @scala.inline
  def apply(
    alpha: Int | Double = null,
    format: hsvArray | hslArray | hsl | hsla | rgbArray | rgb | rgba | hex = null,
    hue: Double | String = null,
    luminosity: bright | light | dark | random = null,
    seed: Double | String = null
  ): RandomColorOptionsSingle = {
    val __obj = js.Dynamic.literal()
    if (alpha != null) __obj.updateDynamic("alpha")(alpha.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (hue != null) __obj.updateDynamic("hue")(hue.asInstanceOf[js.Any])
    if (luminosity != null) __obj.updateDynamic("luminosity")(luminosity.asInstanceOf[js.Any])
    if (seed != null) __obj.updateDynamic("seed")(seed.asInstanceOf[js.Any])
    __obj.asInstanceOf[RandomColorOptionsSingle]
  }
}

