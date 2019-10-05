package typings.recharts.rechartsMod

import typings.react.reactMod.ReactElement
import typings.react.reactMod.ReactNode
import typings.react.reactMod.StatelessComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TooltipProps extends Animatable {
  var active: js.UndefOr[Boolean] = js.undefined
  var content: js.UndefOr[ReactElement | StatelessComponent[_] | ContentRenderer[TooltipProps]] = js.undefined
  var contentStyle: js.UndefOr[js.Object] = js.undefined
  var coordinate: js.UndefOr[Coordinate] = js.undefined
  var cursor: js.UndefOr[Boolean | js.Object | ReactElement | StatelessComponent[_]] = js.undefined
  var filterNull: js.UndefOr[Boolean] = js.undefined
  var formatter: js.UndefOr[TooltipFormatter] = js.undefined
  var itemSorter: js.UndefOr[ItemSorter[TooltipPayload]] = js.undefined
  var itemStyle: js.UndefOr[js.Object] = js.undefined
  var label: js.UndefOr[String | Double] = js.undefined
  var labelFormatter: js.UndefOr[LabelFormatter] = js.undefined
  var labelStyle: js.UndefOr[js.Object] = js.undefined
  var offset: js.UndefOr[Double] = js.undefined
  var payload: js.UndefOr[js.Array[TooltipPayload]] = js.undefined
  var position: js.UndefOr[Coordinate] = js.undefined
  var separator: js.UndefOr[String] = js.undefined
  var useTranslate3d: js.UndefOr[Boolean] = js.undefined
  var viewBox: js.UndefOr[ViewBox] = js.undefined
  var wrapperStyle: js.UndefOr[js.Object] = js.undefined
}

object TooltipProps {
  @scala.inline
  def apply(
    active: js.UndefOr[Boolean] = js.undefined,
    animationBegin: Int | Double = null,
    animationDuration: Int | Double = null,
    animationEasing: AnimationEasingType = null,
    animationId: Int | Double = null,
    content: ReactElement | StatelessComponent[_] | ContentRenderer[TooltipProps] = null,
    contentStyle: js.Object = null,
    coordinate: Coordinate = null,
    cursor: Boolean | js.Object | ReactElement | StatelessComponent[_] = null,
    filterNull: js.UndefOr[Boolean] = js.undefined,
    formatter: (/* value */ String | Double | (js.Array[String | Double]), /* name */ String, /* entry */ TooltipPayload, /* index */ Double) => ReactNode = null,
    isAnimationActive: js.UndefOr[Boolean] = js.undefined,
    isUpdateAnimationActive: js.UndefOr[Boolean] = js.undefined,
    itemSorter: (TooltipPayload, TooltipPayload) => Double = null,
    itemStyle: js.Object = null,
    label: String | Double = null,
    labelFormatter: /* label */ String | Double => ReactNode = null,
    labelStyle: js.Object = null,
    offset: Int | Double = null,
    onAnimationEnd: /* repeated */ js.Any => Unit = null,
    onAnimationStart: /* repeated */ js.Any => Unit = null,
    payload: js.Array[TooltipPayload] = null,
    position: Coordinate = null,
    separator: String = null,
    useTranslate3d: js.UndefOr[Boolean] = js.undefined,
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
    if (contentStyle != null) __obj.updateDynamic("contentStyle")(contentStyle)
    if (coordinate != null) __obj.updateDynamic("coordinate")(coordinate)
    if (cursor != null) __obj.updateDynamic("cursor")(cursor.asInstanceOf[js.Any])
    if (!js.isUndefined(filterNull)) __obj.updateDynamic("filterNull")(filterNull)
    if (formatter != null) __obj.updateDynamic("formatter")(js.Any.fromFunction4(formatter))
    if (!js.isUndefined(isAnimationActive)) __obj.updateDynamic("isAnimationActive")(isAnimationActive)
    if (!js.isUndefined(isUpdateAnimationActive)) __obj.updateDynamic("isUpdateAnimationActive")(isUpdateAnimationActive)
    if (itemSorter != null) __obj.updateDynamic("itemSorter")(js.Any.fromFunction2(itemSorter))
    if (itemStyle != null) __obj.updateDynamic("itemStyle")(itemStyle)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (labelFormatter != null) __obj.updateDynamic("labelFormatter")(js.Any.fromFunction1(labelFormatter))
    if (labelStyle != null) __obj.updateDynamic("labelStyle")(labelStyle)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onAnimationEnd != null) __obj.updateDynamic("onAnimationEnd")(js.Any.fromFunction1(onAnimationEnd))
    if (onAnimationStart != null) __obj.updateDynamic("onAnimationStart")(js.Any.fromFunction1(onAnimationStart))
    if (payload != null) __obj.updateDynamic("payload")(payload)
    if (position != null) __obj.updateDynamic("position")(position)
    if (separator != null) __obj.updateDynamic("separator")(separator)
    if (!js.isUndefined(useTranslate3d)) __obj.updateDynamic("useTranslate3d")(useTranslate3d)
    if (viewBox != null) __obj.updateDynamic("viewBox")(viewBox)
    if (wrapperStyle != null) __obj.updateDynamic("wrapperStyle")(wrapperStyle)
    __obj.asInstanceOf[TooltipProps]
  }
}

