package typings.reactInfiniteScrollComponent.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InfiniteScrollProps extends js.Object {
  
  /**
    * Children component which will be rendered
    */
  var children: js.UndefOr[ReactNode] = js.native
  
  /**
    * Set any custom class you want
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    * Set the length of the data.This will unlock the subsequent calls to next.
    */
  var dataLength: Double = js.native
  
  /**
    * This message is shown to the user when they have seen all the records, which means they are at the bottom and hasMore is false
    */
  var endMessage: js.UndefOr[ReactNode] = js.native
  
  /**
    * Children is by default assumed to be of type array and it's length is used to determine if loader needs to be shown or not,
    * if your children is not an array, specify this prop to tell if your items are 0 or more.
    */
  var hasChildren: js.UndefOr[Boolean] = js.native
  
  /**
    * It tells the InfiniteScroll component on whether to call next function on reaching the bottom and shows an endMessage to the user
    */
  var hasMore: Boolean = js.native
  
  /**
    * Give only if you want to have a fixed height scrolling content
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * Set a scroll y position for the component to render with.
    */
  var initialScrollY: js.UndefOr[Double] = js.native
  
  /**
    * You can send a loader component to show while the component waits for the next load of data. e.g. <h3>Loading...</h3> or any fancy loader element
    */
  var loader: ReactNode = js.native
  
  /**
    * A function which must be called after reaching the bottom. It must trigger some sort of action which fetches the next data.
    * The data is passed as children to the InfiniteScroll component and the data should contain previous items too.
    * e.g. Initial data = [1, 2, 3] and then next load of data should be [1, 2, 3, 4, 5, 6].
    */
  def next(): Unit = js.native
  
  /**
    * A function that will listen to the scroll event on the scrolling container. Note that the scroll event is throttled, so you may not receive as many events as you would expect.
    */
  var onScroll: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * To enable Pull Down to Refresh feature
    */
  var pullDownToRefresh: js.UndefOr[Boolean] = js.native
  
  /**
    * Any JSX that you want to show the user, default={<h3>Pull down to refresh</h3>}
    */
  var pullDownToRefreshContent: js.UndefOr[ReactNode] = js.native
  
  /**
    * Minimum distance the user needs to pull down to trigger the refresh, default=100px
    */
  var pullDownToRefreshThreshold: js.UndefOr[Double] = js.native
  
  /**
    * This function will be called, it should return the fresh data that you want to show the user
    */
  var refreshFunction: js.UndefOr[js.Function0[Unit]] = js.native
  
  /**
    * Any JSX that you want to show the user, default={<h3>Release to refresh</h3>}
    */
  var releaseToRefreshContent: js.UndefOr[ReactNode] = js.native
  
  /**
    * A threshold value defining when InfiniteScroll will call next. Default value is 0.8. It means the next will be called when user comes below 80% of the total height.
    * If you pass threshold in pixels (scrollThreshold="200px"), next will be called once you scroll at least (100% - scrollThreshold) pixels down.
    */
  var scrollThreshold: js.UndefOr[Double | String] = js.native
  
  /**
    * Reference to a (parent) DOM element that is already providing overflow scrollbars to the InfiniteScroll component.
    * You should provide the id of the DOM node preferably.
    */
  var scrollableTarget: js.UndefOr[ReactNode | String] = js.native
  
  /**
    * Set any style which you want to override.
    */
  var style: js.UndefOr[js.Any] = js.native
}
object InfiniteScrollProps {
  
  @scala.inline
  def apply(dataLength: Double, hasMore: Boolean, next: () => Unit): InfiniteScrollProps = {
    val __obj = js.Dynamic.literal(dataLength = dataLength.asInstanceOf[js.Any], hasMore = hasMore.asInstanceOf[js.Any], next = js.Any.fromFunction0(next))
    __obj.asInstanceOf[InfiniteScrollProps]
  }
  
  @scala.inline
  implicit class InfiniteScrollPropsOps[Self <: InfiniteScrollProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setDataLength(value: Double): Self = this.set("dataLength", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHasMore(value: Boolean): Self = this.set("hasMore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNext(value: () => Unit): Self = this.set("next", js.Any.fromFunction0(value))
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setEndMessage(value: ReactNode): Self = this.set("endMessage", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndMessage: Self = this.set("endMessage", js.undefined)
    
    @scala.inline
    def setHasChildren(value: Boolean): Self = this.set("hasChildren", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHasChildren: Self = this.set("hasChildren", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHeight: Self = this.set("height", js.undefined)
    
    @scala.inline
    def setInitialScrollY(value: Double): Self = this.set("initialScrollY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialScrollY: Self = this.set("initialScrollY", js.undefined)
    
    @scala.inline
    def setLoader(value: ReactNode): Self = this.set("loader", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLoader: Self = this.set("loader", js.undefined)
    
    @scala.inline
    def setOnScroll(value: () => Unit): Self = this.set("onScroll", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteOnScroll: Self = this.set("onScroll", js.undefined)
    
    @scala.inline
    def setPullDownToRefresh(value: Boolean): Self = this.set("pullDownToRefresh", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePullDownToRefresh: Self = this.set("pullDownToRefresh", js.undefined)
    
    @scala.inline
    def setPullDownToRefreshContent(value: ReactNode): Self = this.set("pullDownToRefreshContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePullDownToRefreshContent: Self = this.set("pullDownToRefreshContent", js.undefined)
    
    @scala.inline
    def setPullDownToRefreshThreshold(value: Double): Self = this.set("pullDownToRefreshThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePullDownToRefreshThreshold: Self = this.set("pullDownToRefreshThreshold", js.undefined)
    
    @scala.inline
    def setRefreshFunction(value: () => Unit): Self = this.set("refreshFunction", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteRefreshFunction: Self = this.set("refreshFunction", js.undefined)
    
    @scala.inline
    def setReleaseToRefreshContent(value: ReactNode): Self = this.set("releaseToRefreshContent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReleaseToRefreshContent: Self = this.set("releaseToRefreshContent", js.undefined)
    
    @scala.inline
    def setScrollThreshold(value: Double | String): Self = this.set("scrollThreshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollThreshold: Self = this.set("scrollThreshold", js.undefined)
    
    @scala.inline
    def setScrollableTarget(value: ReactNode | String): Self = this.set("scrollableTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScrollableTarget: Self = this.set("scrollableTarget", js.undefined)
    
    @scala.inline
    def setStyle(value: js.Any): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
}
