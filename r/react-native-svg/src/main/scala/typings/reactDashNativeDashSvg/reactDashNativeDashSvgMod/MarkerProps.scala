package typings.reactDashNativeDashSvg.reactDashNativeDashSvgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MarkerProps extends js.Object {
  var id: js.UndefOr[String] = js.undefined
  var markerHeight: js.UndefOr[NumberProp] = js.undefined
  var markerUnits: js.UndefOr[MarkerUnits] = js.undefined
  var markerWidth: js.UndefOr[NumberProp] = js.undefined
  var orient: js.UndefOr[Orient | NumberProp] = js.undefined
  var preserveAspectRatio: js.UndefOr[String] = js.undefined
  var refX: js.UndefOr[NumberProp] = js.undefined
  var refY: js.UndefOr[NumberProp] = js.undefined
  var viewBox: js.UndefOr[String] = js.undefined
}

object MarkerProps {
  @scala.inline
  def apply(
    id: String = null,
    markerHeight: NumberProp = null,
    markerUnits: MarkerUnits = null,
    markerWidth: NumberProp = null,
    orient: Orient | NumberProp = null,
    preserveAspectRatio: String = null,
    refX: NumberProp = null,
    refY: NumberProp = null,
    viewBox: String = null
  ): MarkerProps = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (markerHeight != null) __obj.updateDynamic("markerHeight")(markerHeight.asInstanceOf[js.Any])
    if (markerUnits != null) __obj.updateDynamic("markerUnits")(markerUnits.asInstanceOf[js.Any])
    if (markerWidth != null) __obj.updateDynamic("markerWidth")(markerWidth.asInstanceOf[js.Any])
    if (orient != null) __obj.updateDynamic("orient")(orient.asInstanceOf[js.Any])
    if (preserveAspectRatio != null) __obj.updateDynamic("preserveAspectRatio")(preserveAspectRatio.asInstanceOf[js.Any])
    if (refX != null) __obj.updateDynamic("refX")(refX.asInstanceOf[js.Any])
    if (refY != null) __obj.updateDynamic("refY")(refY.asInstanceOf[js.Any])
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox.asInstanceOf[js.Any])
    __obj.asInstanceOf[MarkerProps]
  }
}

