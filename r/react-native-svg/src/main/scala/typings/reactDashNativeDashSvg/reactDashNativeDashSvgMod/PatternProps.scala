package typings.reactDashNativeDashSvg.reactDashNativeDashSvgMod

import typings.reactDashNativeDashSvg.ColumnMajorTransformMatrix
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PatternProps extends js.Object {
  var height: js.UndefOr[NumberProp] = js.undefined
  var id: String
  var patternContentUnits: js.UndefOr[Units] = js.undefined
  var patternTransform: js.UndefOr[ColumnMajorTransformMatrix | String] = js.undefined
  var patternUnits: js.UndefOr[Units] = js.undefined
  var preserveAspectRatio: js.UndefOr[String] = js.undefined
  var viewBox: js.UndefOr[String] = js.undefined
  var width: js.UndefOr[NumberProp] = js.undefined
  var x: js.UndefOr[NumberProp] = js.undefined
  var y: js.UndefOr[NumberProp] = js.undefined
}

object PatternProps {
  @scala.inline
  def apply(
    id: String,
    height: NumberProp = null,
    patternContentUnits: Units = null,
    patternTransform: ColumnMajorTransformMatrix | String = null,
    patternUnits: Units = null,
    preserveAspectRatio: String = null,
    viewBox: String = null,
    width: NumberProp = null,
    x: NumberProp = null,
    y: NumberProp = null
  ): PatternProps = {
    val __obj = js.Dynamic.literal(id = id)
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

