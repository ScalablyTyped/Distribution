package typings
package reactDashListLib.reactDashListMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactListProps
  extends reactLib.reactMod.Props[ReactList] {
  var axis: js.UndefOr[
    reactDashListLib.reactDashListLibStrings.x | reactDashListLib.reactDashListLibStrings.y
  ] = js.undefined
  var initialIndex: js.UndefOr[scala.Double] = js.undefined
  var itemRenderer: js.UndefOr[reactDashListLib.ItemRenderer] = js.undefined
  var itemSizeEstimator: js.UndefOr[reactDashListLib.ItemSizeEstimator] = js.undefined
  var itemSizeGetter: js.UndefOr[reactDashListLib.ItemSizeGetter] = js.undefined
  var itemsRenderer: js.UndefOr[reactDashListLib.ItemsRenderer] = js.undefined
  var length: js.UndefOr[scala.Double] = js.undefined
  var minSize: js.UndefOr[scala.Double] = js.undefined
  var pageSize: js.UndefOr[scala.Double] = js.undefined
  var scrollParentGetter: js.UndefOr[reactDashListLib.ScrollParentGetter] = js.undefined
  var threshold: js.UndefOr[scala.Double] = js.undefined
  var `type`: js.UndefOr[java.lang.String] = js.undefined
  var useStaticSize: js.UndefOr[scala.Boolean] = js.undefined
  var useTranslate3d: js.UndefOr[scala.Boolean] = js.undefined
}

object ReactListProps {
  @scala.inline
  def apply(
    axis: reactDashListLib.reactDashListLibStrings.x | reactDashListLib.reactDashListLibStrings.y = null,
    children: reactLib.reactMod.ReactNode = null,
    initialIndex: scala.Int | scala.Double = null,
    itemRenderer: reactDashListLib.ItemRenderer = null,
    itemSizeEstimator: reactDashListLib.ItemSizeEstimator = null,
    itemSizeGetter: reactDashListLib.ItemSizeGetter = null,
    itemsRenderer: reactDashListLib.ItemsRenderer = null,
    key: reactLib.reactMod.Key = null,
    length: scala.Int | scala.Double = null,
    minSize: scala.Int | scala.Double = null,
    pageSize: scala.Int | scala.Double = null,
    ref: reactLib.reactMod.LegacyRef[ReactList] = null,
    scrollParentGetter: reactDashListLib.ScrollParentGetter = null,
    threshold: scala.Int | scala.Double = null,
    `type`: java.lang.String = null,
    useStaticSize: js.UndefOr[scala.Boolean] = js.undefined,
    useTranslate3d: js.UndefOr[scala.Boolean] = js.undefined
  ): ReactListProps = {
    val __obj = js.Dynamic.literal()
    if (axis != null) __obj.updateDynamic("axis")(axis.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (initialIndex != null) __obj.updateDynamic("initialIndex")(initialIndex.asInstanceOf[js.Any])
    if (itemRenderer != null) __obj.updateDynamic("itemRenderer")(itemRenderer)
    if (itemSizeEstimator != null) __obj.updateDynamic("itemSizeEstimator")(itemSizeEstimator)
    if (itemSizeGetter != null) __obj.updateDynamic("itemSizeGetter")(itemSizeGetter)
    if (itemsRenderer != null) __obj.updateDynamic("itemsRenderer")(itemsRenderer)
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (minSize != null) __obj.updateDynamic("minSize")(minSize.asInstanceOf[js.Any])
    if (pageSize != null) __obj.updateDynamic("pageSize")(pageSize.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (scrollParentGetter != null) __obj.updateDynamic("scrollParentGetter")(scrollParentGetter)
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(useStaticSize)) __obj.updateDynamic("useStaticSize")(useStaticSize)
    if (!js.isUndefined(useTranslate3d)) __obj.updateDynamic("useTranslate3d")(useTranslate3d)
    __obj.asInstanceOf[ReactListProps]
  }
}

