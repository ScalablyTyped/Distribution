package typings.reactInfiniteScrollComponent

import typings.react.mod.Component
import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-infinite-scroll-component", JSImport.Namespace)
  @js.native
  class ^ ()
    extends Component[InfiniteScrollProps, js.Any, js.Any]
  
  type InfiniteScroll = Component[InfiniteScrollProps, js.Any, js.Any]
  
  @js.native
  trait InfiniteScrollProps extends StObject {
    
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
    implicit class InfiniteScrollPropsMutableBuilder[Self <: InfiniteScrollProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDataLength(value: Double): Self = StObject.set(x, "dataLength", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndMessage(value: ReactNode): Self = StObject.set(x, "endMessage", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndMessageUndefined: Self = StObject.set(x, "endMessage", js.undefined)
      
      @scala.inline
      def setHasChildren(value: Boolean): Self = StObject.set(x, "hasChildren", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHasChildrenUndefined: Self = StObject.set(x, "hasChildren", js.undefined)
      
      @scala.inline
      def setHasMore(value: Boolean): Self = StObject.set(x, "hasMore", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setInitialScrollY(value: Double): Self = StObject.set(x, "initialScrollY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialScrollYUndefined: Self = StObject.set(x, "initialScrollY", js.undefined)
      
      @scala.inline
      def setLoader(value: ReactNode): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
      
      @scala.inline
      def setNext(value: () => Unit): Self = StObject.set(x, "next", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnScroll(value: () => Unit): Self = StObject.set(x, "onScroll", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnScrollUndefined: Self = StObject.set(x, "onScroll", js.undefined)
      
      @scala.inline
      def setPullDownToRefresh(value: Boolean): Self = StObject.set(x, "pullDownToRefresh", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPullDownToRefreshContent(value: ReactNode): Self = StObject.set(x, "pullDownToRefreshContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPullDownToRefreshContentUndefined: Self = StObject.set(x, "pullDownToRefreshContent", js.undefined)
      
      @scala.inline
      def setPullDownToRefreshThreshold(value: Double): Self = StObject.set(x, "pullDownToRefreshThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPullDownToRefreshThresholdUndefined: Self = StObject.set(x, "pullDownToRefreshThreshold", js.undefined)
      
      @scala.inline
      def setPullDownToRefreshUndefined: Self = StObject.set(x, "pullDownToRefresh", js.undefined)
      
      @scala.inline
      def setRefreshFunction(value: () => Unit): Self = StObject.set(x, "refreshFunction", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRefreshFunctionUndefined: Self = StObject.set(x, "refreshFunction", js.undefined)
      
      @scala.inline
      def setReleaseToRefreshContent(value: ReactNode): Self = StObject.set(x, "releaseToRefreshContent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReleaseToRefreshContentUndefined: Self = StObject.set(x, "releaseToRefreshContent", js.undefined)
      
      @scala.inline
      def setScrollThreshold(value: Double | String): Self = StObject.set(x, "scrollThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollThresholdUndefined: Self = StObject.set(x, "scrollThreshold", js.undefined)
      
      @scala.inline
      def setScrollableTarget(value: ReactNode | String): Self = StObject.set(x, "scrollableTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollableTargetUndefined: Self = StObject.set(x, "scrollableTarget", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
