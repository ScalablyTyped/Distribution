package typings
package reactDashNativeDashSvgLib.reactDashNativeDashSvgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinearGradientProps extends js.Object {
  var gradientUnits: js.UndefOr[Units] = js.undefined
  var id: java.lang.String
  var x1: js.UndefOr[reactDashNativeDashSvgLib.NumberProp] = js.undefined
  var x2: js.UndefOr[reactDashNativeDashSvgLib.NumberProp] = js.undefined
  var y1: js.UndefOr[reactDashNativeDashSvgLib.NumberProp] = js.undefined
  var y2: js.UndefOr[reactDashNativeDashSvgLib.NumberProp] = js.undefined
}

object LinearGradientProps {
  @scala.inline
  def apply(
    id: java.lang.String,
    gradientUnits: Units = null,
    x1: reactDashNativeDashSvgLib.NumberProp = null,
    x2: reactDashNativeDashSvgLib.NumberProp = null,
    y1: reactDashNativeDashSvgLib.NumberProp = null,
    y2: reactDashNativeDashSvgLib.NumberProp = null
  ): LinearGradientProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    if (gradientUnits != null) __obj.updateDynamic("gradientUnits")(gradientUnits)
    if (x1 != null) __obj.updateDynamic("x1")(x1.asInstanceOf[js.Any])
    if (x2 != null) __obj.updateDynamic("x2")(x2.asInstanceOf[js.Any])
    if (y1 != null) __obj.updateDynamic("y1")(y1.asInstanceOf[js.Any])
    if (y2 != null) __obj.updateDynamic("y2")(y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinearGradientProps]
  }
}

