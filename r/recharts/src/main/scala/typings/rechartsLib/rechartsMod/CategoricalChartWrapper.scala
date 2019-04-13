package typings
package rechartsLib.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CategoricalChartWrapper[L] extends js.Object {
  var barCategoryGap: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var barGap: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var barSize: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var children: js.UndefOr[reactLib.reactMod.ReactNode | js.Array[reactLib.reactMod.ReactNode]] = js.undefined
  var className: js.UndefOr[java.lang.String] = js.undefined
  var compact: js.UndefOr[scala.Boolean] = js.undefined
  var data: js.UndefOr[js.Array[js.Object]] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var layout: js.UndefOr[L] = js.undefined
  var margin: js.UndefOr[stdLib.Partial[Margin]] = js.undefined
  var maxBarSize: js.UndefOr[scala.Double] = js.undefined
  var onClick: js.UndefOr[RechartsFunction] = js.undefined
  var onMouseDown: js.UndefOr[RechartsFunction] = js.undefined
  var onMouseEnter: js.UndefOr[RechartsFunction] = js.undefined
  var onMouseLeave: js.UndefOr[RechartsFunction] = js.undefined
  var onMouseMove: js.UndefOr[RechartsFunction] = js.undefined
  var onMouseUp: js.UndefOr[RechartsFunction] = js.undefined
  var reverseStackOrder: js.UndefOr[scala.Boolean] = js.undefined
  var stackOffset: js.UndefOr[StackOffsetType] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
  var syncId: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var throttleDelay: js.UndefOr[scala.Double] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
}

object CategoricalChartWrapper {
  @scala.inline
  def apply[L](
    barCategoryGap: scala.Double | java.lang.String = null,
    barGap: scala.Double | java.lang.String = null,
    barSize: scala.Double | java.lang.String = null,
    children: reactLib.reactMod.ReactNode | js.Array[reactLib.reactMod.ReactNode] = null,
    className: java.lang.String = null,
    compact: js.UndefOr[scala.Boolean] = js.undefined,
    data: js.Array[js.Object] = null,
    height: scala.Int | scala.Double = null,
    layout: L = null,
    margin: stdLib.Partial[Margin] = null,
    maxBarSize: scala.Int | scala.Double = null,
    onClick: RechartsFunction = null,
    onMouseDown: RechartsFunction = null,
    onMouseEnter: RechartsFunction = null,
    onMouseLeave: RechartsFunction = null,
    onMouseMove: RechartsFunction = null,
    onMouseUp: RechartsFunction = null,
    reverseStackOrder: js.UndefOr[scala.Boolean] = js.undefined,
    stackOffset: StackOffsetType = null,
    style: js.Object = null,
    syncId: java.lang.String | scala.Double = null,
    throttleDelay: scala.Int | scala.Double = null,
    width: scala.Int | scala.Double = null
  ): CategoricalChartWrapper[L] = {
    val __obj = js.Dynamic.literal()
    if (barCategoryGap != null) __obj.updateDynamic("barCategoryGap")(barCategoryGap.asInstanceOf[js.Any])
    if (barGap != null) __obj.updateDynamic("barGap")(barGap.asInstanceOf[js.Any])
    if (barSize != null) __obj.updateDynamic("barSize")(barSize.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(compact)) __obj.updateDynamic("compact")(compact)
    if (data != null) __obj.updateDynamic("data")(data)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (maxBarSize != null) __obj.updateDynamic("maxBarSize")(maxBarSize.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onMouseDown != null) __obj.updateDynamic("onMouseDown")(onMouseDown)
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter)
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave)
    if (onMouseMove != null) __obj.updateDynamic("onMouseMove")(onMouseMove)
    if (onMouseUp != null) __obj.updateDynamic("onMouseUp")(onMouseUp)
    if (!js.isUndefined(reverseStackOrder)) __obj.updateDynamic("reverseStackOrder")(reverseStackOrder)
    if (stackOffset != null) __obj.updateDynamic("stackOffset")(stackOffset)
    if (style != null) __obj.updateDynamic("style")(style)
    if (syncId != null) __obj.updateDynamic("syncId")(syncId.asInstanceOf[js.Any])
    if (throttleDelay != null) __obj.updateDynamic("throttleDelay")(throttleDelay.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[CategoricalChartWrapper[L]]
  }
}

