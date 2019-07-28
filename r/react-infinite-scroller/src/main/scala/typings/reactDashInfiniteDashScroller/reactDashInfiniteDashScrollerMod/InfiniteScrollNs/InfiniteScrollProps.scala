package typings.reactDashInfiniteDashScroller.reactDashInfiniteDashScrollerMod.InfiniteScrollNs

import typings.react.reactMod.HTMLProps
import typings.react.reactMod.ReactElement
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * <InfiniteScroll /> properties.
  */
trait InfiniteScrollProps extends HTMLProps[InfiniteScroll] {
  /**
    * Name of the element that the component should render as.
    * Defaults to 'div'.
    */
  var element: js.UndefOr[String] = js.undefined
  /**
    * Override method to return a different scroll listener if it's not the immediate parent of InfiniteScroll.
    */
  var getScrollParent: js.UndefOr[js.Function0[HTMLElement | Null]] = js.undefined
  /**
    * Whether there are more items to be loaded. Event listeners are removed if false.
    * Defaults to false.
    */
  var hasMore: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether the component should load the first set of items.
    * Defaults to true.
    */
  var initialLoad: js.UndefOr[Boolean] = js.undefined
  /**
    * Whether new items should be loaded when user scrolls to the top of the scrollable area.
    * Default to false.
    */
  var isReverse: js.UndefOr[Boolean] = js.undefined
  /**
    * Loader component for indicating "loading more".
    */
  var loader: js.UndefOr[ReactElement] = js.undefined
  /**
    * The number of the first page to load, with the default of 0, the first page is 1.
    * Defaults to 0.
    */
  var pageStart: js.UndefOr[Double] = js.undefined
  /**
    * The distance in pixels before the end of the items that will trigger a call to loadMore.
    * Defaults to 250.
    */
  var threshold: js.UndefOr[Double] = js.undefined
  /**
    * Proxy to the useCapture option of the added event listeners.
    * Defaults to false.
    */
  var useCapture: js.UndefOr[Boolean] = js.undefined
  /**
    * Add scroll listeners to the window, or else, the component's parentNode.
    * Defaults to true.
    */
  var useWindow: js.UndefOr[Boolean] = js.undefined
  /**
    * A callback for when more items are requested by the user.
    * Page param is next page index.
    */
  def loadMore(page: Double): Unit
}

object InfiniteScrollProps {
  @scala.inline
  def apply(
    loadMore: Double => Unit,
    HTMLProps: HTMLProps[InfiniteScroll] = null,
    element: String = null,
    getScrollParent: () => HTMLElement | Null = null,
    hasMore: js.UndefOr[Boolean] = js.undefined,
    initialLoad: js.UndefOr[Boolean] = js.undefined,
    isReverse: js.UndefOr[Boolean] = js.undefined,
    loader: ReactElement = null,
    pageStart: Int | Double = null,
    threshold: Int | Double = null,
    useCapture: js.UndefOr[Boolean] = js.undefined,
    useWindow: js.UndefOr[Boolean] = js.undefined
  ): InfiniteScrollProps = {
    val __obj = js.Dynamic.literal(loadMore = js.Any.fromFunction1(loadMore))
    js.Dynamic.global.Object.assign(__obj, HTMLProps)
    if (element != null) __obj.updateDynamic("element")(element)
    if (getScrollParent != null) __obj.updateDynamic("getScrollParent")(js.Any.fromFunction0(getScrollParent))
    if (!js.isUndefined(hasMore)) __obj.updateDynamic("hasMore")(hasMore)
    if (!js.isUndefined(initialLoad)) __obj.updateDynamic("initialLoad")(initialLoad)
    if (!js.isUndefined(isReverse)) __obj.updateDynamic("isReverse")(isReverse)
    if (loader != null) __obj.updateDynamic("loader")(loader)
    if (pageStart != null) __obj.updateDynamic("pageStart")(pageStart.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    if (!js.isUndefined(useCapture)) __obj.updateDynamic("useCapture")(useCapture)
    if (!js.isUndefined(useWindow)) __obj.updateDynamic("useWindow")(useWindow)
    __obj.asInstanceOf[InfiniteScrollProps]
  }
}

