package typings
package reactDashColorLib.libComponentsCommonColorWrapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InjectedColorProps extends js.Object {
  var hex: js.UndefOr[java.lang.String] = js.undefined
  var hsl: js.UndefOr[reactDashColorLib.reactDashColorMod.HSLColor] = js.undefined
  var onChange: js.UndefOr[ColorWrapChangeHandler] = js.undefined
  var rgb: js.UndefOr[reactDashColorLib.reactDashColorMod.RGBColor] = js.undefined
}

object InjectedColorProps {
  @scala.inline
  def apply(
    hex: java.lang.String = null,
    hsl: reactDashColorLib.reactDashColorMod.HSLColor = null,
    onChange: ColorWrapChangeHandler = null,
    rgb: reactDashColorLib.reactDashColorMod.RGBColor = null
  ): InjectedColorProps = {
    val __obj = js.Dynamic.literal()
    if (hex != null) __obj.updateDynamic("hex")(hex)
    if (hsl != null) __obj.updateDynamic("hsl")(hsl)
    if (onChange != null) __obj.updateDynamic("onChange")(onChange)
    if (rgb != null) __obj.updateDynamic("rgb")(rgb)
    __obj.asInstanceOf[InjectedColorProps]
  }
}

