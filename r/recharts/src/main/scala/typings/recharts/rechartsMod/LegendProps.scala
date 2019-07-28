package typings.recharts.rechartsMod

import typings.react.reactMod.ReactElement
import typings.recharts.rechartsStrings.bottom
import typings.recharts.rechartsStrings.center
import typings.recharts.rechartsStrings.left
import typings.recharts.rechartsStrings.middle
import typings.recharts.rechartsStrings.right
import typings.recharts.rechartsStrings.top
import typings.std.Partial
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
  var margin: js.UndefOr[Partial[Margin]] = js.undefined
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
    chartHeight: Int | Double = null,
    chartWidth: Int | Double = null,
    content: ReactElement | ContentRenderer[LegendProps] = null,
    formatter: LegendValueFormatter = null,
    height: Int | Double = null,
    iconSize: Int | Double = null,
    iconType: IconType = null,
    layout: LayoutType = null,
    margin: Partial[Margin] = null,
    onBBoxUpdate: BBoxUpdateCallback = null,
    onClick: RechartsFunction = null,
    onMouseEnter: RechartsFunction = null,
    onMouseLeave: RechartsFunction = null,
    payload: js.Array[LegendPayload] = null,
    verticalAlign: top | middle | bottom = null,
    width: Int | Double = null,
    wrapperStyle: js.Object = null
  ): LegendProps = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (chartHeight != null) __obj.updateDynamic("chartHeight")(chartHeight.asInstanceOf[js.Any])
    if (chartWidth != null) __obj.updateDynamic("chartWidth")(chartWidth.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (formatter != null) __obj.updateDynamic("formatter")(formatter)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (iconSize != null) __obj.updateDynamic("iconSize")(iconSize.asInstanceOf[js.Any])
    if (iconType != null) __obj.updateDynamic("iconType")(iconType)
    if (layout != null) __obj.updateDynamic("layout")(layout)
    if (margin != null) __obj.updateDynamic("margin")(margin)
    if (onBBoxUpdate != null) __obj.updateDynamic("onBBoxUpdate")(onBBoxUpdate)
    if (onClick != null) __obj.updateDynamic("onClick")(onClick)
    if (onMouseEnter != null) __obj.updateDynamic("onMouseEnter")(onMouseEnter)
    if (onMouseLeave != null) __obj.updateDynamic("onMouseLeave")(onMouseLeave)
    if (payload != null) __obj.updateDynamic("payload")(payload)
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (wrapperStyle != null) __obj.updateDynamic("wrapperStyle")(wrapperStyle)
    __obj.asInstanceOf[LegendProps]
  }
}

