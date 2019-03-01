package typings
package reactDashInfiniteDashScrollDashComponentLib.reactDashInfiniteDashScrollDashComponentMod.InfiniteScrollNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfiniteScrollProps extends js.Object {
  /**
    * Children component which will be rendered
    */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * Set the length of the data.This will unlock the subsequent calls to next.
    */
  var dataLength: scala.Double
  /**
    * This message is shown to the user when he has seen all the records which means he's at the bottom and hasMore is false
    */
  var endMessage: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * Children is by default assumed to be of type array and it's length is used to determine if loader needs to be shown or not,
    * if your children is not an array, specify this prop to tell if your items are 0 or more.
    */
  var hasChildren: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * It tells the InfiniteScroll component on whether to call next function on reaching the bottom and shows an endMessage to the user
    */
  var hasMore: scala.Boolean
  /**
    * Give only if you want to have a fixed height scrolling content
    */
  var height: js.UndefOr[scala.Double] = js.undefined
  /**
    * Set a scroll y position for the component to render with.
    */
  var initialScrollY: js.UndefOr[scala.Double] = js.undefined
  /**
    * You can send a loader component to show while the component waits for the next load of data. e.g. <h3>Loading...</h3> or any fancy loader element
    */
  var loader: reactLib.reactMod.ReactNs.ReactNode
  /**
    * A function that will listen to the scroll event on the scrolling container. Note that the scroll event is throttled, so you may not receive as many events as you would expect.
    */
  var onScroll: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * To enable Pull Down to Refresh feature
    */
  var pullDownToRefresh: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Any JSX that you want to show the user, default={<h3>Pull down to refresh</h3>}
    */
  var pullDownToRefreshContent: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * Minimum distance the user needs to pull down to trigger the refresh, default=100px
    */
  var pullDownToRefreshThreshold: js.UndefOr[scala.Double] = js.undefined
  /**
    * This function will be called, it should return the fresh data that you want to show the user
    */
  var refreshFunction: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  /**
    * Any JSX that you want to show the user, default={<h3>Release to refresh</h3>}
    */
  var releaseToRefreshContent: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /**
    * A threshold value defining when InfiniteScroll will call next. Default value is 0.8. It means the next will be called when user comes below 80% of the total height.
    * If you pass threshold in pixels (scrollThreshold="200px"), next will be called once you scroll at least (100% - scrollThreshold) pixels down.
    */
  var scrollThreshold: js.UndefOr[scala.Double | java.lang.String] = js.undefined
  /**
    * Reference to a (parent) DOM element that is already providing overflow scrollbars to the InfiniteScroll component.
    * You should provide the id of the DOM node preferably.
    */
  var scrollableTarget: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode | java.lang.String] = js.undefined
  /**
    * Set a scroll y position for the component to render with.
    */
  var style: js.UndefOr[js.Any] = js.undefined
  /**
    * A function which must be called after reaching the bottom. It must trigger some sort of action which fetches the next data.
    * The data is passed as children to the InfiniteScroll component and the data should contain previous items too.
    * e.g. Initial data = [1, 2, 3] and then next load of data should be [1, 2, 3, 4, 5, 6].
    */
  def next(): scala.Unit
}

object InfiniteScrollProps {
  @scala.inline
  def apply(
    dataLength: scala.Double,
    hasMore: scala.Boolean,
    loader: reactLib.reactMod.ReactNs.ReactNode,
    next: js.Function0[scala.Unit],
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    endMessage: reactLib.reactMod.ReactNs.ReactNode = null,
    hasChildren: js.UndefOr[scala.Boolean] = js.undefined,
    height: scala.Int | scala.Double = null,
    initialScrollY: scala.Int | scala.Double = null,
    onScroll: js.Function0[scala.Unit] = null,
    pullDownToRefresh: js.UndefOr[scala.Boolean] = js.undefined,
    pullDownToRefreshContent: reactLib.reactMod.ReactNs.ReactNode = null,
    pullDownToRefreshThreshold: scala.Int | scala.Double = null,
    refreshFunction: js.Function0[scala.Unit] = null,
    releaseToRefreshContent: reactLib.reactMod.ReactNs.ReactNode = null,
    scrollThreshold: scala.Double | java.lang.String = null,
    scrollableTarget: reactLib.reactMod.ReactNs.ReactNode | java.lang.String = null,
    style: js.Any = null
  ): InfiniteScrollProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("dataLength")(dataLength)
    __obj.updateDynamic("hasMore")(hasMore)
    __obj.updateDynamic("loader")(loader.asInstanceOf[js.Any])
    __obj.updateDynamic("next")(next)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (endMessage != null) __obj.updateDynamic("endMessage")(endMessage.asInstanceOf[js.Any])
    if (!js.isUndefined(hasChildren)) __obj.updateDynamic("hasChildren")(hasChildren)
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (initialScrollY != null) __obj.updateDynamic("initialScrollY")(initialScrollY.asInstanceOf[js.Any])
    if (onScroll != null) __obj.updateDynamic("onScroll")(onScroll)
    if (!js.isUndefined(pullDownToRefresh)) __obj.updateDynamic("pullDownToRefresh")(pullDownToRefresh)
    if (pullDownToRefreshContent != null) __obj.updateDynamic("pullDownToRefreshContent")(pullDownToRefreshContent.asInstanceOf[js.Any])
    if (pullDownToRefreshThreshold != null) __obj.updateDynamic("pullDownToRefreshThreshold")(pullDownToRefreshThreshold.asInstanceOf[js.Any])
    if (refreshFunction != null) __obj.updateDynamic("refreshFunction")(refreshFunction)
    if (releaseToRefreshContent != null) __obj.updateDynamic("releaseToRefreshContent")(releaseToRefreshContent.asInstanceOf[js.Any])
    if (scrollThreshold != null) __obj.updateDynamic("scrollThreshold")(scrollThreshold.asInstanceOf[js.Any])
    if (scrollableTarget != null) __obj.updateDynamic("scrollableTarget")(scrollableTarget.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[InfiniteScrollProps]
  }
}

