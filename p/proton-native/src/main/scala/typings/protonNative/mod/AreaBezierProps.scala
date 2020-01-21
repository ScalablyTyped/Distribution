package typings.protonNative.mod

import typings.protonNative.AnonH
import typings.protonNative.AnonX
import typings.protonNative.protonNativeStrings.bevel
import typings.protonNative.protonNativeStrings.flat
import typings.protonNative.protonNativeStrings.miter
import typings.protonNative.protonNativeStrings.round
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AreaBezierProps extends AreaBaseProps {
  /**
    * The x coordinate of the curve's control point at the start.
    */
  var cx1: Double | String
  /**
    * The x coordinate of the curve's control point at the end.
    */
  var cx2: Double | String
  /**
    * The y coordinate of the curve's control point at the start.
    */
  var cy1: Double | String
  /**
    * The y coordinate of the curve's control point at the end.
    */
  var cy2: Double | String
  /**
    * The x coordinate of the curve's start point.
    */
  var x1: Double | String
  /**
    * The x coordinate of the curve's end point.
    */
  var x2: Double | String
  /**
    * The y coordinate of the curve's start point.
    */
  var y1: Double | String
  /**
    * The y coordinate of the curve's end point.
    */
  var y2: Double | String
}

object AreaBezierProps {
  @scala.inline
  def apply(
    cx1: Double | String,
    cx2: Double | String,
    cy1: Double | String,
    cy2: Double | String,
    x1: Double | String,
    x2: Double | String,
    y1: Double | String,
    y2: Double | String,
    align: AnonH = null,
    column: Int | Double = null,
    expand: AnonH = null,
    fill: String = null,
    fillOpacity: Int | Double = null,
    label: String = null,
    row: Int | Double = null,
    span: AnonX = null,
    stretchy: js.UndefOr[Boolean] = js.undefined,
    stroke: String = null,
    strokeLinecap: flat | round | bevel = null,
    strokeLinejoin: miter | round | bevel = null,
    strokeMiterlimit: Int | Double = null,
    strokeOpacity: Int | Double = null,
    strokeWidth: Int | Double = null,
    transform: String = null
  ): AreaBezierProps = {
    val __obj = js.Dynamic.literal(cx1 = cx1.asInstanceOf[js.Any], cx2 = cx2.asInstanceOf[js.Any], cy1 = cy1.asInstanceOf[js.Any], cy2 = cy2.asInstanceOf[js.Any], x1 = x1.asInstanceOf[js.Any], x2 = x2.asInstanceOf[js.Any], y1 = y1.asInstanceOf[js.Any], y2 = y2.asInstanceOf[js.Any])
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (expand != null) __obj.updateDynamic("expand")(expand.asInstanceOf[js.Any])
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (row != null) __obj.updateDynamic("row")(row.asInstanceOf[js.Any])
    if (span != null) __obj.updateDynamic("span")(span.asInstanceOf[js.Any])
    if (!js.isUndefined(stretchy)) __obj.updateDynamic("stretchy")(stretchy.asInstanceOf[js.Any])
    if (stroke != null) __obj.updateDynamic("stroke")(stroke.asInstanceOf[js.Any])
    if (strokeLinecap != null) __obj.updateDynamic("strokeLinecap")(strokeLinecap.asInstanceOf[js.Any])
    if (strokeLinejoin != null) __obj.updateDynamic("strokeLinejoin")(strokeLinejoin.asInstanceOf[js.Any])
    if (strokeMiterlimit != null) __obj.updateDynamic("strokeMiterlimit")(strokeMiterlimit.asInstanceOf[js.Any])
    if (strokeOpacity != null) __obj.updateDynamic("strokeOpacity")(strokeOpacity.asInstanceOf[js.Any])
    if (strokeWidth != null) __obj.updateDynamic("strokeWidth")(strokeWidth.asInstanceOf[js.Any])
    if (transform != null) __obj.updateDynamic("transform")(transform.asInstanceOf[js.Any])
    __obj.asInstanceOf[AreaBezierProps]
  }
}

