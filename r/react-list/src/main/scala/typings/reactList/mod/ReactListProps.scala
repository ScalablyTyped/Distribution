package typings.reactList.mod

import typings.react.mod.Key
import typings.react.mod.LegacyRef
import typings.react.mod.Props
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactList.reactListStrings.x
import typings.reactList.reactListStrings.y
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
    initialIndex: js.UndefOr[Double] = js.undefined,
    itemRenderer: (/* index */ Double, /* key */ Double | String) => Element = null,
    itemSizeEstimator: (/* index */ Double, /* cache */ js.Object) => Double = null,
    itemSizeGetter: /* index */ Double => Double = null,
    itemsRenderer: (/* items */ js.Array[Element], /* ref */ String) => Element = null,
    key: Key = null,
    length: js.UndefOr[Double] = js.undefined,
    minSize: js.UndefOr[Double] = js.undefined,
    pageSize: js.UndefOr[Double] = js.undefined,
    ref: js.UndefOr[Null | LegacyRef[ReactList]] = js.undefined,
    scrollParentGetter: () => Element = null,
    threshold: js.UndefOr[Double] = js.undefined,
    `type`: String = null,
    useStaticSize: js.UndefOr[Boolean] = js.undefined,
    useTranslate3d: js.UndefOr[Boolean] = js.undefined
  ): ReactListProps = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (!js.isUndefined(initialIndex)) __obj.updateDynamic("initialIndex")(initialIndex.get.asInstanceOf[js.Any])
    if (itemRenderer != null) __obj.updateDynamic("itemRenderer")(js.Any.fromFunction2(itemRenderer))
    if (itemSizeEstimator != null) __obj.updateDynamic("itemSizeEstimator")(js.Any.fromFunction2(itemSizeEstimator))
    if (itemSizeGetter != null) __obj.updateDynamic("itemSizeGetter")(js.Any.fromFunction1(itemSizeGetter))
    if (itemsRenderer != null) __obj.updateDynamic("itemsRenderer")(js.Any.fromFunction2(itemsRenderer))
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minSize)) __obj.updateDynamic("minSize")(minSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(pageSize)) __obj.updateDynamic("pageSize")(pageSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (scrollParentGetter != null) __obj.updateDynamic("scrollParentGetter")(js.Any.fromFunction0(scrollParentGetter))
    if (!js.isUndefined(threshold)) __obj.updateDynamic("threshold")(threshold.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(useStaticSize)) __obj.updateDynamic("useStaticSize")(useStaticSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(useTranslate3d)) __obj.updateDynamic("useTranslate3d")(useTranslate3d.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactListProps]
  }
}

