package typings.randomcolor.mod

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

trait RandomColorOptionsMultiple extends RandomColorOptionsSingle {
  var count: Double
}

object RandomColorOptionsMultiple {
  @scala.inline
  def apply(
    count: Double,
    alpha: js.UndefOr[Double] = js.undefined,
    format: hsvArray | hslArray | hsl | hsla | rgbArray | rgb | rgba | hex = null,
    hue: Double | String = null,
    luminosity: bright | light | dark | random = null,
    seed: Double | String = null
  ): RandomColorOptionsMultiple = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    if (!js.isUndefined(alpha)) __obj.updateDynamic("alpha")(alpha.get.asInstanceOf[js.Any])
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (hue != null) __obj.updateDynamic("hue")(hue.asInstanceOf[js.Any])
    if (luminosity != null) __obj.updateDynamic("luminosity")(luminosity.asInstanceOf[js.Any])
    if (seed != null) __obj.updateDynamic("seed")(seed.asInstanceOf[js.Any])
    __obj.asInstanceOf[RandomColorOptionsMultiple]
  }
}

