package typings
package reduxDashInfiniteDashScrollLib.reduxDashInfiniteDashScrollMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfiniteScrollerProps extends js.Object {
  var children: js.UndefOr[js.Array[reactLib.reactMod.Global.JSXNs.Element]] = js.undefined
  var containerHeight: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  var elementIsScrollable: js.UndefOr[scala.Boolean] = js.undefined
  var hasMore: js.UndefOr[scala.Boolean] = js.undefined
  var holderType: js.UndefOr[java.lang.String] = js.undefined
  var items: js.UndefOr[js.Array[reactLib.reactMod.Global.JSXNs.Element]] = js.undefined
  var loader: js.UndefOr[js.Any] = js.undefined
  var loadingMore: js.UndefOr[scala.Boolean] = js.undefined
  var showLoader: js.UndefOr[scala.Boolean] = js.undefined
  var threshold: js.UndefOr[scala.Double] = js.undefined
  def loadMore(): scala.Unit
}

object InfiniteScrollerProps {
  @scala.inline
  def apply(
    loadMore: js.Function0[scala.Unit],
    children: js.Array[reactLib.reactMod.Global.JSXNs.Element] = null,
    containerHeight: scala.Double | java.lang.String = null,
    elementIsScrollable: js.UndefOr[scala.Boolean] = js.undefined,
    hasMore: js.UndefOr[scala.Boolean] = js.undefined,
    holderType: java.lang.String = null,
    items: js.Array[reactLib.reactMod.Global.JSXNs.Element] = null,
    loader: js.Any = null,
    loadingMore: js.UndefOr[scala.Boolean] = js.undefined,
    showLoader: js.UndefOr[scala.Boolean] = js.undefined,
    threshold: scala.Int | scala.Double = null
  ): InfiniteScrollerProps = {
    val __obj = js.Dynamic.literal(loadMore = loadMore)
    if (children != null) __obj.updateDynamic("children")(children)
    if (containerHeight != null) __obj.updateDynamic("containerHeight")(containerHeight.asInstanceOf[js.Any])
    if (!js.isUndefined(elementIsScrollable)) __obj.updateDynamic("elementIsScrollable")(elementIsScrollable)
    if (!js.isUndefined(hasMore)) __obj.updateDynamic("hasMore")(hasMore)
    if (holderType != null) __obj.updateDynamic("holderType")(holderType)
    if (items != null) __obj.updateDynamic("items")(items)
    if (loader != null) __obj.updateDynamic("loader")(loader)
    if (!js.isUndefined(loadingMore)) __obj.updateDynamic("loadingMore")(loadingMore)
    if (!js.isUndefined(showLoader)) __obj.updateDynamic("showLoader")(showLoader)
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfiniteScrollerProps]
  }
}

