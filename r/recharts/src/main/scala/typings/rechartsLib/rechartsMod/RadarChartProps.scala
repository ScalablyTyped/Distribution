package typings
package rechartsLib.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- rechartsLib.rechartsMod.CategoricalChartWrapper because var conflicts: onClick, onMouseDown, onMouseEnter, onMouseLeave, onMouseMove, onMouseUp. Inlined syncId, compact, width, height, data, layout, stackOffset, throttleDelay, margin, barCategoryGap, barGap, barSize, maxBarSize, style, className, children, reverseStackOrder */ trait RadarChartProps extends EventAttributes {
  var barCategoryGap: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var barGap: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var barSize: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNode | js.Array[reactLib.reactMod.ReactNode]] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var compact: js.UndefOr[scala.Boolean] = js.undefined
  var cx: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var cy: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var data: js.UndefOr[js.Array[js.Object]] = js.undefined
  var endAngle: js.UndefOr[scala.Double] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var innerRadius: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var layout: js.UndefOr[rechartsLib.rechartsLibStrings.centric] = js.undefined
  var margin: js.UndefOr[stdLib.Partial[Margin]] = js.undefined
  var maxBarSize: js.UndefOr[scala.Double] = js.undefined
  var outerRadius: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var reverseStackOrder: js.UndefOr[scala.Boolean] = js.undefined
  var stackOffset: js.UndefOr[StackOffsetType] = js.undefined
  var startAngle: js.UndefOr[scala.Double] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var syncId: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var throttleDelay: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object RadarChartProps {
  @scala.inline
  def apply(
    barCategoryGap: scala.Double | java.lang.String = null,
    barGap: scala.Double | java.lang.String = null,
    barSize: scala.Double | java.lang.String = null,
    children: reactLib.reactMod.ReactNode | js.Array[reactLib.reactMod.ReactNode] = null,
    className: java.lang.String = null,
    compact: js.UndefOr[scala.Boolean] = js.undefined,
    cx: scala.Double | java.lang.String = null,
    cy: scala.Double | java.lang.String = null,
    data: js.Array[js.Object] = null,
    endAngle: scala.Int | scala.Double = null,
    height: scala.Int | scala.Double = null,
    innerRadius: scala.Double | java.lang.String = null,
    layout: rechartsLib.rechartsLibStrings.centric = null,
    margin: stdLib.Partial[Margin] = null,
    maxBarSize: scala.Int | scala.Double = null,
    onClick: RechartsFunction = null,
    onMouseDown: RechartsFunction = null,
    onMouseEnter: RechartsFunction = null,
    onMouseLeave: RechartsFunction = null,
    onMouseMove: RechartsFunction = null,
    onMouseOut: RechartsFunction = null,
    onMouseOver: RechartsFunction = null,
    onMouseUp: RechartsFunction = null,
    onTouchCancel: RechartsFunction = null,
    onTouchEnd: RechartsFunction = null,
    onTouchMove: RechartsFunction = null,
    onTouchStart: RechartsFunction = null,
    outerRadius: scala.Double | java.lang.String = null,
    reverseStackOrder: js.UndefOr[scala.Boolean] = js.undefined,
    stackOffset: StackOffsetType = null,
    startAngle: scala.Int | scala.Double = null,
    style: js.Object = null,
    syncId: java.lang.String | scala.Double = null,
    throttleDelay: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): RadarChartProps = {
    val __obj = js.Dynamic.literal()
    if (barCategoryGap != null) __obj.updateDynamic("barCategoryGap")(barCategoryGap.asInstanceOf[js.Any])
    if (barGap != null) __obj.updateDynamic("barGap")(barGap.asInstanceOf[js.Any])
    if (barSize != null) __obj.updateDynamic("barSize")(barSize.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact)
    if (cx != null) __obj.updateDynamic("cx")(cx.asInstanceOf[js.Any])
    if (cy != null) __obj.updateDynamic("cy")(cy.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data)
    if (endAngle != null) __obj.updateDynamic("endAngle")(endAngle.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (innerRadius != null) __obj.updateDynamic("innerRadius")(innerRadius.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (maxBarSize != null) __obj.updateDynamic("maxBarSize")(maxBarSize.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(onMouseDown)
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter)
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave)
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(onMouseMove)
    if (onMouseOut != null) __obj.updateDynamic("onMouseOut")(onMouseOut)
    if (onMouseOver != null) __obj.updateDynamic("onMouseOver")(onMouseOver)
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(onMouseUp)
    if (onTouchCancel != null) __obj.updateDynamic("onTouchCancel")(onTouchCancel)
    if (onTouchEnd != null) __obj.updateDynamic("onTouchEnd")(onTouchEnd)
    if (onTouchMove != null) __obj.updateDynamic("onTouchMove")(onTouchMove)
    if (onTouchStart != null) __obj.updateDynamic("onTouchStart")(onTouchStart)
    if (outerRadius != null) __obj.updateDynamic("outerRadius")(outerRadius.asInstanceOf[js.Any])
    if (!js.isUndefined(reverseStackOrder)) __obj.updateDynamic("reverseStackOrder")(reverseStackOrder)
    if (stackOffset != null) __obj.updateDynamic("stackOffset")(stackOffset)
    if (startAngle != null) __obj.updateDynamic("startAngle")(startAngle.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (syncId != null) __obj.updateDynamic("syncId")(syncId.asInstanceOf[js.Any])
    if (throttleDelay != null) __obj.updateDynamic("throttleDelay")(throttleDelay.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadarChartProps]
  }
}

