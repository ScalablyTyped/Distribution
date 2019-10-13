package typings.reactDashList.reactDashListMod

import typings.react.reactMod.Key
import typings.react.reactMod.LegacyRef
import typings.react.reactMod.Props
import typings.react.reactMod.ReactNode
import typings.react.reactMod._Global_.JSX.Element
import typings.reactDashList.reactDashListStrings.x
import typings.reactDashList.reactDashListStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactListProps extends Props[ReactList] {
  var axis: js.UndefOr[x | y] = js.undefined
  var initialIndex: js.UndefOr[Double] = js.undefined
  var itemRenderer: js.UndefOr[ItemRenderer] = js.undefined
  var itemSizeEstimator: js.UndefOr[ItemSizeEstimator] = js.undefined
  var itemSizeGetter: js.UndefOr[ItemSizeGetter] = js.undefined
  var itemsRenderer: js.UndefOr[ItemsRenderer] = js.undefined
  var length: js.UndefOr[Double] = js.undefined
  var minSize: js.UndefOr[Double] = js.undefined
  var pageSize: js.UndefOr[Double] = js.undefined
  var scrollParentGetter: js.UndefOr[ScrollParentGetter] = js.undefined
  var threshold: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[String] = js.undefined
  var useStaticSize: js.UndefOr[Boolean] = js.undefined
  var useTranslate3d: js.UndefOr[Boolean] = js.undefined
}

object ReactListProps {
  @scala.inline
  def apply(
    axis: x | y = null,
    children: ReactNode = null,
    initialIndex: Int | Double = null,
    itemRenderer: (/* index */ Double, /* key */ Double | String) => Element = null,
    itemSizeEstimator: (/* index */ Double, /* cache */ js.Object) => Double = null,
    itemSizeGetter: /* index */ Double => Double = null,
    itemsRenderer: (/* items */ js.Array[Element], /* ref */ String) => Element = null,
    key: Key = null,
    length: Int | Double = null,
    minSize: Int | Double = null,
    pageSize: Int | Double = null,
    ref: LegacyRef[ReactList] = null,
    scrollParentGetter: () => Element = null,
    threshold: Int | Double = null,
    `type`: String = null,
    useStaticSize: js.UndefOr[Boolean] = js.undefined,
    useTranslate3d: js.UndefOr[Boolean] = js.undefined
  ): ReactListProps = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (initialIndex != null) __obj.updateDynamic("initialIndex")(initialIndex.asInstanceOf[js.Any])
    if (itemRenderer != null) __obj.updateDynamic("itemRenderer")(js.Any.fromFunction2(itemRenderer))
    if (itemSizeEstimator != null) __obj.updateDynamic("itemSizeEstimator")(js.Any.fromFunction2(itemSizeEstimator))
    if (itemSizeGetter != null) __obj.updateDynamic("itemSizeGetter")(js.Any.fromFunction1(itemSizeGetter))
    if (itemsRenderer != null) __obj.updateDynamic("itemsRenderer")(js.Any.fromFunction2(itemsRenderer))
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (minSize != null) __obj.updateDynamic("minSize")(minSize.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (scrollParentGetter != null) __obj.updateDynamic("scrollParentGetter")(js.Any.fromFunction0(scrollParentGetter))
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(useStaticSize)) __obj.updateDynamic("useStaticSize")(useStaticSize)
    if (!js.isUndefined(useTranslate3d)) __obj.updateDynamic("useTranslate3d")(useTranslate3d)
    __obj.asInstanceOf[ReactListProps]
  }
}

