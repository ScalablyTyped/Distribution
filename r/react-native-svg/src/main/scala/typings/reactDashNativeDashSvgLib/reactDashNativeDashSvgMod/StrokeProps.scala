package typings
package reactDashNativeDashSvgLib.reactDashNativeDashSvgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrokeProps extends js.Object {
  var stroke: js.UndefOr[
    reactDashNativeDashSvgLib.int32ARGBColor | reactDashNativeDashSvgLib.rgbaArray | java.lang.String
  ] = js.undefined
  var strokeDasharray: js.UndefOr[
    js.Array[reactDashNativeDashSvgLib.NumberProp] | reactDashNativeDashSvgLib.NumberProp
  ] = js.undefined
  var strokeDashoffset: js.UndefOr[reactDashNativeDashSvgLib.NumberProp] = js.undefined
  var strokeLinecap: js.UndefOr[Linecap] = js.undefined
  var strokeLinejoin: js.UndefOr[Linejoin] = js.undefined
  var strokeMiterlimit: js.UndefOr[reactDashNativeDashSvgLib.NumberProp] = js.undefined
  var strokeOpacity: js.UndefOr[reactDashNativeDashSvgLib.NumberProp] = js.undefined
  var strokeWidth: js.UndefOr[reactDashNativeDashSvgLib.NumberProp] = js.undefined
}

object StrokeProps {
  @scala.inline
  def apply(
    stroke: reactDashNativeDashSvgLib.int32ARGBColor | reactDashNativeDashSvgLib.rgbaArray | java.lang.String = null,
    strokeDasharray: js.Array[reactDashNativeDashSvgLib.NumberProp] | reactDashNativeDashSvgLib.NumberProp = null,
    strokeDashoffset: reactDashNativeDashSvgLib.NumberProp = null,
    strokeLinecap: Linecap = null,
    strokeLinejoin: Linejoin = null,
    strokeMiterlimit: reactDashNativeDashSvgLib.NumberProp = null,
    strokeOpacity: reactDashNativeDashSvgLib.NumberProp = null,
    strokeWidth: reactDashNativeDashSvgLib.NumberProp = null
  ): StrokeProps = {
    val __obj = js.Dynamic.literal()
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (strokeDasharray != null) __obj.updateDynamic("strokeDasharray")(strokeDasharray.asInstanceOf[js.Any])
    if (strokeDashoffset != null) __obj.updateDynamic("strokeDashoffset")(strokeDashoffset.asInstanceOf[js.Any])
    if (strokeLinecap != null) __obj.updateDynamic("strokeLinecap")(strokeLinecap)
    if (strokeLinejoin != null) __obj.updateDynamic("strokeLinejoin")(strokeLinejoin)
    if (strokeMiterlimit != null) __obj.updateDynamic("strokeMiterlimit")(strokeMiterlimit.asInstanceOf[js.Any])
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrokeProps]
  }
}

