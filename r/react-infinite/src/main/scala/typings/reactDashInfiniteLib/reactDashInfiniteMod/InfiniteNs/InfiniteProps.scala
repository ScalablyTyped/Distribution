package typings
package reactDashInfiniteLib.reactDashInfiniteMod.InfiniteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfiniteProps
  extends reactLib.reactMod.ReactNs.Props[reactDashInfiniteLib.reactDashInfiniteMod.Infinite] {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var containerHeight: js.UndefOr[scala.Double] = js.undefined
  var displayBottomUpwards: js.UndefOr[scala.Boolean] = js.undefined
  var elementHeight: scala.Double | js.Array[scala.Double]
  var handleScroll: js.UndefOr[js.Function1[/* node */ reactLib.reactMod.ReactNs.ReactElement, scala.Unit]] = js.undefined
  var infiniteLoadBeginBottomOffset: js.UndefOr[scala.Double] = js.undefined
  var infiniteLoadBeginEdgeOffset: js.UndefOr[scala.Double] = js.undefined
  var isInfiniteLoading: js.UndefOr[scala.Boolean] = js.undefined
  var loadingSpinnerDelegate: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement] = js.undefined
  var onInfiniteLoad: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  var preloadAdditionalHeight: js.UndefOr[scala.Double | js.Object] = js.undefined
  var preloadBatchSize: js.UndefOr[scala.Double | js.Object] = js.undefined
  var timeScrollStateLastsForAfterUserScrolls: js.UndefOr[scala.Double] = js.undefined
  var useWindowAsScrollContainer: js.UndefOr[scala.Boolean] = js.undefined
}

