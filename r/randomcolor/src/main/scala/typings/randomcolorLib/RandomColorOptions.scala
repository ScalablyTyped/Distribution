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

