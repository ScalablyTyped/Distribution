package typings
package reactDashInfiniteDashScrollerLib.reactDashInfiniteDashScrollerMod.InfiniteScrollNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
     * <InfiniteScroll /> properties.
     */

trait InfiniteScrollProps
  extends reactLib.reactMod.ReactNs.HTMLProps[InfiniteScroll] {
  /**
           * Name of the element that the component should render as.
           * Defaults to 'div'.
           */
  var element: js.UndefOr[java.lang.String] = js.undefined
  /**
           * Override method to return a different scroll listener if it's not the immediate parent of InfiniteScroll.
           */
  var getScrollParent: js.UndefOr[js.Function0[reactLib.HTMLElement | scala.Null]] = js.undefined
  /**
           * Whether there are more items to be loaded. Event listeners are removed if false.
           * Defaults to false.
           */
  var hasMore: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Whether the component should load the first set of items.
           * Defaults to true.
           */
  var initialLoad: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Whether new items should be loaded when user scrolls to the top of the scrollable area.
           * Default to false.
           */
  var isReverse: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Loader component for indicating "loading more".
           */
  var loader: js.UndefOr[reactLib.reactMod.ReactNs.ReactElement[_]] = js.undefined
  /**
           * The number of the first page to load, with the default of 0, the first page is 1.
           * Defaults to 0.
           */
  var pageStart: js.UndefOr[scala.Double] = js.undefined
  /**
           * The distance in pixels before the end of the items that will trigger a call to loadMore.
           * Defaults to 250.
           */
  var threshold: js.UndefOr[scala.Double] = js.undefined
  /**
           * Proxy to the useCapture option of the added event listeners.
           * Defaults to false.
           */
  var useCapture: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * Add scroll listeners to the window, or else, the component's parentNode.
           * Defaults to true.
           */
  var useWindow: js.UndefOr[scala.Boolean] = js.undefined
  /**
           * A callback for when more items are requested by the user.
           * Page param is next page index.
           */
  def loadMore(page: scala.Double): scala.Unit
}

