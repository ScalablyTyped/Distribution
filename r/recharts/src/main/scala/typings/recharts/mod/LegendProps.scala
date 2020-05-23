package typings.recharts.mod

import typings.react.mod.ReactElement
import typings.recharts.anon.PartialMargin
import typings.recharts.anon.Width
import typings.recharts.rechartsStrings.bottom
import typings.recharts.rechartsStrings.center
import typings.recharts.rechartsStrings.left
import typings.recharts.rechartsStrings.middle
import typings.recharts.rechartsStrings.right
import typings.recharts.rechartsStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendProps extends js.Object {
  var align: js.UndefOr[left | center | right] = js.undefined
  var chartHeight: js.UndefOr[Double] = js.undefined
  var chartWidth: js.UndefOr[Double] = js.undefined
  var content: js.UndefOr[ReactElement | ContentRenderer[LegendProps]] = js.undefined
  var formatter: js.UndefOr[LegendValueFormatter] = js.undefined
  var height: js.UndefOr[Double] = js.undefined
  var iconSize: js.UndefOr[Double] = js.undefined
  var iconType: js.UndefOr[IconType] = js.undefined
  var layout: js.UndefOr[LayoutType] = js.undefined
  var margin: js.UndefOr[PartialMargin] = js.undefined
  var onBBoxUpdate: js.UndefOr[BBoxUpdateCallback] = js.undefined
  var onClick: js.UndefOr[RechartsFunction] = js.undefined
  var onMouseEnter: js.UndefOr[RechartsFunction] = js.undefined
  var onMouseLeave: js.UndefOr[RechartsFunction] = js.undefined
  var payload: js.UndefOr[js.Array[LegendPayload]] = js.undefined
  var verticalAlign: js.UndefOr[top | middle | bottom] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
  var wrapperStyle: js.UndefOr[js.Object] = js.undefined
}

object LegendProps {
  @scala.inline
  def apply(
    align: left | center | right = null,
    chartHeight: js.UndefOr[Double] = js.undefined,
    chartWidth: js.UndefOr[Double] = js.undefined,
    content: ReactElement | ContentRenderer[LegendProps] = null,
    formatter: (/* value */ js.UndefOr[
      /* import warning: importer.ImportType#apply Failed type conversion: recharts.recharts.LegendPayload['value'] */ js.Any
    ], /* entry */ js.UndefOr[LegendPayload], /* i */ js.UndefOr[Double]) => js.Any = null,
    height: js.UndefOr[Double] = js.undefined,
    iconSize: js.UndefOr[Double] = js.undefined,
    iconType: IconType = null,
    layout: LayoutType = null,
    margin: PartialMargin = null,
    onBBoxUpdate: /* box */ Width => Unit = null,
    onClick: /* repeated */ js.Any => Unit = null,
    onMouseEnter: /* repeated */ js.Any => Unit = null,
    onMouseLeave: /* repeated */ js.Any => Unit = null,
    payload: js.Array[LegendPayload] = null,
    verticalAlign: top | middle | bottom = null,
    width: js.UndefOr[Double] = js.undefined,
    wrapperStyle: js.Object = null
  ): LegendProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (!js.isUndefined(chartHeight)) __obj.updateDynamic("chartHeight")(chartHeight.get.asInstanceOf[js.Any])
    if (!js.isUndefined(chartWidth)) __obj.updateDynamic("chartWidth")(chartWidth.get.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction3(formatter))
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(iconSize)) __obj.updateDynamic("iconSize")(iconSize.get.asInstanceOf[js.Any])
    if (iconType != null) __obj.updateDynamic("iconType")(iconType.asInstanceOf[js.Any])
    if (layout != null) __obj.updateDynamic("layout")(layout.asInstanceOf[js.Any])
    if (margin != null) __obj.updateDynamic("margin")(margin.asInstanceOf[js.Any])
    if (onBBoxUpdate != null) __obj.updateDynamic("onBBoxUpdate")(js.Any.fromFunction1(onBBoxUpdate))
    if (onClick != null) __obj.updateDynamic("onClick")(js.Any.fromFunction1(onClick))
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(js.Any.fromFunction1(onMouseEnter))
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(js.Any.fromFunction1(onMouseLeave))
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    if (wrapperStyle != null) __obj.updateDynamic("wrapperStyle")(wrapperStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegendProps]
  }
}

