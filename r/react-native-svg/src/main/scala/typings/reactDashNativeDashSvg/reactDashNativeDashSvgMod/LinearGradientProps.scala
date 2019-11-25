package typings.reactDashNativeDashSvg.reactDashNativeDashSvgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LinearGradientProps extends js.Object {
  var gradientTransform: js.UndefOr[ColumnMajorTransformMatrix | String] = js.undefined
  var gradientUnits: js.UndefOr[Units] = js.undefined
  var id: js.UndefOr[String] = js.undefined
  var x1: js.UndefOr[NumberProp] = js.undefined
  var x2: js.UndefOr[NumberProp] = js.undefined
  var y1: js.UndefOr[NumberProp] = js.undefined
  var y2: js.UndefOr[NumberProp] = js.undefined
}

object LinearGradientProps {
  @scala.inline
  def apply(
    gradientTransform: ColumnMajorTransformMatrix | String = null,
    gradientUnits: Units = null,
    id: String = null,
    x1: NumberProp = null,
    x2: NumberProp = null,
    y1: NumberProp = null,
    y2: NumberProp = null
  ): LinearGradientProps = {
    val __obj = js.Dynamic.literal()
    if (gradientTransform != null) __obj.updateDynamic("gradientTransform")(gradientTransform.asInstanceOf[js.Any])
    if (gradientUnits != null) __obj.updateDynamic("gradientUnits")(gradientUnits.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (x1 != null) __obj.updateDynamic("x1")(x1.asInstanceOf[js.Any])
    if (x2 != null) __obj.updateDynamic("x2")(x2.asInstanceOf[js.Any])
    if (y1 != null) __obj.updateDynamic("y1")(y1.asInstanceOf[js.Any])
    if (y2 != null) __obj.updateDynamic("y2")(y2.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinearGradientProps]
  }
}

