package typings
package rechartsLib.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LegendProps extends js.Object {
  var align: js.UndefOr[
    rechartsLib.rechartsLibStrings.left | rechartsLib.rechartsLibStrings.center | rechartsLib.rechartsLibStrings.right
  ] = js.undefined
  var chartHeight: js.UndefOr[scala.Double] = js.undefined
  var chartWidth: js.UndefOr[scala.Double] = js.undefined
  var content: js.UndefOr[reactLib.reactMod.ReactElement[_] | ContentRenderer[LegendProps]] = js.undefined
  var formatter: js.UndefOr[LegendValueFormatter] = js.undefined
  var height: js.UndefOr[scala.Double] = js.undefined
  var iconSize: js.UndefOr[scala.Double] = js.undefined
  var iconType: js.UndefOr[IconType] = js.undefined
  var layout: js.UndefOr[LayoutType] = js.undefined
  var margin: js.UndefOr[stdLib.Partial[Margin]] = js.undefined
  var onBBoxUpdate: js.UndefOr[BBoxUpdateCallback] = js.undefined
  var onClick: js.UndefOr[RechartsFunction] = js.undefined
  var onMouseEnter: js.UndefOr[RechartsFunction] = js.undefined
  var onMouseLeave: js.UndefOr[RechartsFunction] = js.undefined
  var payload: js.UndefOr[js.Array[LegendPayload]] = js.undefined
  var verticalAlign: js.UndefOr[
    rechartsLib.rechartsLibStrings.top | rechartsLib.rechartsLibStrings.middle | rechartsLib.rechartsLibStrings.bottom
  ] = js.undefined
  var width: js.UndefOr[scala.Double] = js.undefined
  var wrapperStyle: js.UndefOr[js.Object] = js.undefined
}

object LegendProps {
  @scala.inline
  def apply(
    align: rechartsLib.rechartsLibStrings.left | rechartsLib.rechartsLibStrings.center | rechartsLib.rechartsLibStrings.right = null,
    chartHeight: scala.Int | scala.Double = null,
    chartWidth: scala.Int | scala.Double = null,
    content: reactLib.reactMod.ReactElement[_] | ContentRenderer[LegendProps] = null,
    formatter: LegendValueFormatter = null,
    height: scala.Int | scala.Double = null,
    iconSize: scala.Int | scala.Double = null,
    iconType: IconType = null,
    layout: LayoutType = null,
    margin: stdLib.Partial[Margin] = null,
    onBBoxUpdate: BBoxUpdateCallback = null,
    onClick: RechartsFunction = null,
    onMouseEnter: RechartsFunction = null,
    onMouseLeave: RechartsFunction = null,
    payload: js.Array[LegendPayload] = null,
    verticalAlign: rechartsLib.rechartsLibStrings.top | rechartsLib.rechartsLibStrings.middle | rechartsLib.rechartsLibStrings.bottom = null,
    width: scala.Int | scala.Double = null,
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

