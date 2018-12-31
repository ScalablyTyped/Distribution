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

