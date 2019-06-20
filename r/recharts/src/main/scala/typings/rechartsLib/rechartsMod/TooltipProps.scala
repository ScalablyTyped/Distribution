package typings
package rechartsLib.rechartsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipProps extends Animatable {
  var active: js.UndefOr[scala.Boolean] = js.undefined
  var content: js.UndefOr[
    reactLib.reactMod.ReactElement | reactLib.reactMod.StatelessComponent[_] | ContentRenderer[TooltipProps]
  ] = js.undefined
  var coordinate: js.UndefOr[Coordinate] = js.undefined
  var cursor: js.UndefOr[
    scala.Boolean | js.Object | reactLib.reactMod.ReactElement | reactLib.reactMod.StatelessComponent[_]
  ] = js.undefined
  var filterNull: js.UndefOr[scala.Boolean] = js.undefined
  var formatter: js.UndefOr[TooltipFormatter] = js.undefined
  var itemSorter: js.UndefOr[ItemSorter[TooltipPayload]] = js.undefined
  var itemStyle: js.UndefOr[js.Object] = js.undefined
  var label: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  var labelFormatter: js.UndefOr[LabelFormatter] = js.undefined
  var labelStyle: js.UndefOr[js.Object] = js.undefined
  var offset: js.UndefOr[scala.Double] = js.undefined
  var payload: js.UndefOr[js.Array[TooltipPayload]] = js.undefined
  var position: js.UndefOr[Coordinate] = js.undefined
  var separator: js.UndefOr[java.lang.String] = js.undefined
  var useTranslate3d: js.UndefOr[scala.Boolean] = js.undefined
  var viewBox: js.UndefOr[ViewBox] = js.undefined
  var wrapperStyle: js.UndefOr[js.Object] = js.undefined
}

object TooltipProps {
  @scala.inline
  def apply(
    active: js.UndefOr[scala.Boolean] = js.undefined,
    animationBegin: scala.Int | scala.Double = null,
    animationDuration: scala.Int | scala.Double = null,
    animationEasing: AnimationEasingType = null,
    animationId: scala.Int | scala.Double = null,
    content: reactLib.reactMod.ReactElement | reactLib.reactMod.StatelessComponent[_] | ContentRenderer[TooltipProps] = null,
    coordinate: Coordinate = null,
    cursor: scala.Boolean | js.Object | reactLib.reactMod.ReactElement | reactLib.reactMod.StatelessComponent[_] = null,
    filterNull: js.UndefOr[scala.Boolean] = js.undefined,
    formatter: TooltipFormatter = null,
    isAnimationActive: js.UndefOr[scala.Boolean] = js.undefined,
    isUpdateAnimationActive: js.UndefOr[scala.Boolean] = js.undefined,
    itemSorter: ItemSorter[TooltipPayload] = null,
    itemStyle: js.Object = null,
    label: java.lang.String | scala.Double = null,
    labelFormatter: LabelFormatter = null,
    labelStyle: js.Object = null,
    offset: scala.Int | scala.Double = null,
    onAnimationEnd: RechartsFunction = null,
    onAnimationStart: RechartsFunction = null,
    payload: js.Array[TooltipPayload] = null,
    position: Coordinate = null,
    separator: java.lang.String = null,
    useTranslate3d: js.UndefOr[scala.Boolean] = js.undefined,
    viewBox: ViewBox = null,
    wrapperStyle: js.Object = null
  ): TooltipProps = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(active)) __obj.updateDynamic("active")(active)
    if (animationBegin != null) __obj.updateDynamic("animationBegin")(animationBegin.asInstanceOf[js.Any])
    if (animationDuration != null) __obj.updateDynamic("animationDuration")(animationDuration.asInstanceOf[js.Any])
    if (animationEasing != null) __obj.updateDynamic("animationEasing")(animationEasing)
    if (animationId != null) __obj.updateDynamic("animationId")(animationId.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (coordinate != null) __obj.updateDynamic("coordinate")(coordinate)
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (!js.isUndefined(filterNull)) __obj.updateDynamic("filterNull")(filterNull)
    if (formatter != null) __obj.updateDynamic("formatter")(formatter)
    if (!js.isUndefined(isAnimationActive)) __obj.updateDynamic("isAnimationActive")(isAnimationActive)
    if (!js.isUndefined(isUpdateAnimationActive)) __obj.updateDynamic("isUpdateAnimationActive")(isUpdateAnimationActive)
    if (itemSorter != null) __obj.updateDynamic("itemSorter")(itemSorter)
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelFormatter != null) __obj.updateDynamic("labelFormatter")(labelFormatter)
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(onAnimationEnd)
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(onAnimationStart)
    if (payload != null) __obj.updateDynamic("payload")(payload)
    if (position != null) __obj.updateDynamic("position")(position)
    if (separator != null) __obj.updateDynamic("separator")(separator)
    if (!js.isUndefined(useTranslate3d)) __obj.updateDynamic("useTranslate3d")(useTranslate3d)
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox)
    if (wrapperStyle != null) __obj.updateDynamic("wrapperStyle")(wrapperStyle)
    __obj.asInstanceOf[TooltipProps]
  }
}

