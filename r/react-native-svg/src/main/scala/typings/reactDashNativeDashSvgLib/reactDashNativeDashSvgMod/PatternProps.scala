package typings
package reactDashNativeDashSvgLib.reactDashNativeDashSvgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PatternProps extends js.Object {
  var height: js.UndefOr[reactDashNativeDashSvgLib.NumberProp] = js.undefined
  var id: java.lang.String
  var patternContentUnits: js.UndefOr[Units] = js.undefined
  var patternTransform: js.UndefOr[reactDashNativeDashSvgLib.ColumnMajorTransformMatrix | java.lang.String] = js.undefined
  var patternUnits: js.UndefOr[Units] = js.undefined
  var preserveAspectRatio: js.UndefOr[java.lang.String] = js.undefined
  var viewBox: js.UndefOr[java.lang.String] = js.undefined
  var width: js.UndefOr[reactDashNativeDashSvgLib.NumberProp] = js.undefined
  var x: js.UndefOr[reactDashNativeDashSvgLib.NumberProp] = js.undefined
  var y: js.UndefOr[reactDashNativeDashSvgLib.NumberProp] = js.undefined
}

object PatternProps {
  @scala.inline
  def apply(
    id: java.lang.String,
    height: reactDashNativeDashSvgLib.NumberProp = null,
    patternContentUnits: Units = null,
    patternTransform: reactDashNativeDashSvgLib.ColumnMajorTransformMatrix | java.lang.String = null,
    patternUnits: Units = null,
    preserveAspectRatio: java.lang.String = null,
    viewBox: java.lang.String = null,
    width: reactDashNativeDashSvgLib.NumberProp = null,
    x: reactDashNativeDashSvgLib.NumberProp = null,
    y: reactDashNativeDashSvgLib.NumberProp = null
  ): PatternProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("id")(id)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (patternContentUnits != null) __obj.updateDynamic("patternContentUnits")(patternContentUnits)
    if (patternTransform != null) __obj.updateDynamic("patternTransform")(patternTransform.asInstanceOf[js.Any])
    if (patternUnits != null) __obj.updateDynamic("patternUnits")(patternUnits)
    if (preserveAspectRatio != null) __obj.updateDynamic("preserveAspectRatio")(preserveAspectRatio)
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatternProps]
  }
}

