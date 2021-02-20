package typings.reactInfiniteScroller

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.react.mod.ReactElement
import typings.reactInfiniteScroller.mod.InfiniteScroll.InfiniteScroll
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-infinite-scroller", JSImport.Namespace)
  @js.native
  class ^ () extends InfiniteScroll
  
  object InfiniteScroll {
    
    @js.native
    trait InfiniteScroll
      extends Component[InfiniteScrollProps, js.Object, js.Any] {
      
      def getParentElement(): js.UndefOr[HTMLElement | Null] = js.native
      def getParentElement(elem: HTMLElement): js.UndefOr[HTMLElement | Null] = js.native
    }
    
    /**
      * <InfiniteScroll /> properties.
      */
    @js.native
    trait InfiniteScrollProps
      extends HTMLProps[typings.reactInfiniteScroller.mod.InfiniteScroll.InfiniteScroll] {
      
      /**
        * Name of the element that the component should render as.
        * Defaults to 'div'.
        */
      var element: js.UndefOr[String] = js.native
      
      /**
        * Override method to return a different scroll listener if it's not the immediate parent of InfiniteScroll.
        */
      var getScrollParent: js.UndefOr[js.Function0[HTMLElement | Null]] = js.native
      
      /**
        * Whether there are more items to be loaded. Event listeners are removed if false.
        * Defaults to false.
        */
      var hasMore: js.UndefOr[Boolean] = js.native
      
      /**
        * Whether the component should load the first set of items.
        * Defaults to true.
        */
      var initialLoad: js.UndefOr[Boolean] = js.native
      
      /**
        * Whether new items should be loaded when user scrolls to the top of the scrollable area.
        * Default to false.
        */
      var isReverse: js.UndefOr[Boolean] = js.native
      
      /**
        * A callback for when more items are requested by the user.
        * Page param is next page index.
        */
      def loadMore(page: Double): Unit = js.native
      
      /**
        * Loader component for indicating "loading more".
        */
      var loader: js.UndefOr[ReactElement] = js.native
      
      /**
        * The number of the first page to load, with the default of 0, the first page is 1.
        * Defaults to 0.
        */
      var pageStart: js.UndefOr[Double] = js.native
      
      /**
        * The distance in pixels before the end of the items that will trigger a call to loadMore.
        * Defaults to 250.
        */
      var threshold: js.UndefOr[Double] = js.native
      
      /**
        * Proxy to the useCapture option of the added event listeners.
        * Defaults to false.
        */
      var useCapture: js.UndefOr[Boolean] = js.native
      
      /**
        * Add scroll listeners to the window, or else, the component's parentNode.
        * Defaults to true.
        */
      var useWindow: js.UndefOr[Boolean] = js.native
    }
    object InfiniteScrollProps {
      
      @scala.inline
      def apply(loadMore: Double => Unit): InfiniteScrollProps = {
        val __obj = js.Dynamic.literal(loadMore = js.Any.fromFunction1(loadMore))
        __obj.asInstanceOf[InfiniteScrollProps]
      }
      
      @scala.inline
      implicit class InfiniteScrollPropsMutableBuilder[Self <: InfiniteScrollProps] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setElement(value: String): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setElementUndefined: Self = StObject.set(x, "element", js.undefined)
        
        @scala.inline
        def setGetScrollParent(value: () => HTMLElement | Null): Self = StObject.set(x, "getScrollParent", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetScrollParentUndefined: Self = StObject.set(x, "getScrollParent", js.undefined)
        
        @scala.inline
        def setHasMore(value: Boolean): Self = StObject.set(x, "hasMore", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setHasMoreUndefined: Self = StObject.set(x, "hasMore", js.undefined)
        
        @scala.inline
        def setInitialLoad(value: Boolean): Self = StObject.set(x, "initialLoad", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setInitialLoadUndefined: Self = StObject.set(x, "initialLoad", js.undefined)
        
        @scala.inline
        def setIsReverse(value: Boolean): Self = StObject.set(x, "isReverse", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setIsReverseUndefined: Self = StObject.set(x, "isReverse", js.undefined)
        
        @scala.inline
        def setLoadMore(value: Double => Unit): Self = StObject.set(x, "loadMore", js.Any.fromFunction1(value))
        
        @scala.inline
        def setLoader(value: ReactElement): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
        
        @scala.inline
        def setPageStart(value: Double): Self = StObject.set(x, "pageStart", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setPageStartUndefined: Self = StObject.set(x, "pageStart", js.undefined)
        
        @scala.inline
        def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
        
        @scala.inline
        def setUseCapture(value: Boolean): Self = StObject.set(x, "useCapture", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUseCaptureUndefined: Self = StObject.set(x, "useCapture", js.undefined)
        
        @scala.inline
        def setUseWindow(value: Boolean): Self = StObject.set(x, "useWindow", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setUseWindowUndefined: Self = StObject.set(x, "useWindow", js.undefined)
      }
    }
  }
}
