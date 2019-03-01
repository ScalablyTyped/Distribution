package typings
package rechartsLib.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RadialBarChartProps
  extends CategoricalChartWrapper[rechartsLib.rechartsLibStrings.radial] {
  var cx: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var cy: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var endAngle: js.UndefOr[scala.Double] = js.undefined
  var innerRadius: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var outerRadius: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var startAngle: js.UndefOr[scala.Double] = js.undefined
}

object RadialBarChartProps {
  @scala.inline
  def apply(
    barCategoryGap: scala.Double | java.lang.String = null,
    barGap: scala.Double | java.lang.String = null,
    barSize: scala.Double | java.lang.String = null,
    children: reactLib.reactMod.ReactNs.ReactNode | js.Array[reactLib.reactMod.ReactNs.ReactNode] = null,
    className: java.lang.String = null,
    compact: js.UndefOr[scala.Boolean] = js.undefined,
    cx: java.lang.String | scala.Double = null,
    cy: java.lang.String | scala.Double = null,
    data: js.Array[js.Object] = null,
    endAngle: scala.Int | scala.Double = null,
    height: scala.Int | scala.Double = null,
    innerRadius: java.lang.String | scala.Double = null,
    layout: rechartsLib.rechartsLibStrings.radial = null,
    margin: stdLib.Partial[Margin] = null,
    maxBarSize: scala.Int | scala.Double = null,
    onClick: RechartsFunction = null,
    onMouseDown: RechartsFunction = null,
    onMouseEnter: RechartsFunction = null,
    onMouseLeave: RechartsFunction = null,
    onMouseMove: RechartsFunction = null,
    onMouseUp: RechartsFunction = null,
    outerRadius: java.lang.String | scala.Double = null,
    reverseStackOrder: js.UndefOr[scala.Boolean] = js.undefined,
    stackOffset: StackOffsetType = null,
    startAngle: scala.Int | scala.Double = null,
    style: js.Object = null,
    syncId: java.lang.String | scala.Double = null,
    throttleDelay: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): RadialBarChartProps = {
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
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(onMouseUp)
    if (outerRadius != null) __obj.updateDynamic("outerRadius")(outerRadius.asInstanceOf[js.Any])
    if (!js.isUndefined(reverseStackOrder)) __obj.updateDynamic("reverseStackOrder")(reverseStackOrder)
    if (stackOffset != null) __obj.updateDynamic("stackOffset")(stackOffset)
    if (startAngle != null) __obj.updateDynamic("startAngle")(startAngle.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    if (syncId != null) __obj.updateDynamic("syncId")(syncId.asInstanceOf[js.Any])
    if (throttleDelay != null) __obj.updateDynamic("throttleDelay")(throttleDelay.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[RadialBarChartProps]
  }
}

