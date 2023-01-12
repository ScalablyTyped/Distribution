package typings.reduxInfiniteScroll

import typings.react.mod.Component
import typings.react.mod.HTMLProps
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("redux-infinite-scroll", JSImport.Default)
  @js.native
  open class default ()
    extends Component[InfiniteScrollerProps & HTMLProps[HTMLDivElement], js.Object, Any]
  
  type InfiniteScoller = Component[InfiniteScrollerProps & HTMLProps[HTMLDivElement], js.Object, Any]
  
  trait InfiniteScrollerProps extends StObject {
    
    var children: js.UndefOr[js.Array[Element]] = js.undefined
    
    var containerHeight: js.UndefOr[Double | String] = js.undefined
    
    var elementIsScrollable: js.UndefOr[Boolean] = js.undefined
    
    var hasMore: js.UndefOr[Boolean] = js.undefined
    
    var holderType: js.UndefOr[String] = js.undefined
    
    var items: js.UndefOr[js.Array[Element]] = js.undefined
    
    def loadMore(): Unit
    
    var loader: js.UndefOr[Any] = js.undefined
    
    var loadingMore: js.UndefOr[Boolean] = js.undefined
    
    var showLoader: js.UndefOr[Boolean] = js.undefined
    
    var threshold: js.UndefOr[Double] = js.undefined
  }
  object InfiniteScrollerProps {
    
    inline def apply(loadMore: () => Unit): InfiniteScrollerProps = {
      val __obj = js.Dynamic.literal(loadMore = js.Any.fromFunction0(loadMore))
      __obj.asInstanceOf[InfiniteScrollerProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: InfiniteScrollerProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: js.Array[Element]): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setChildrenVarargs(value: Element*): Self = StObject.set(x, "children", js.Array(value*))
      
      inline def setContainerHeight(value: Double | String): Self = StObject.set(x, "containerHeight", value.asInstanceOf[js.Any])
      
      inline def setContainerHeightUndefined: Self = StObject.set(x, "containerHeight", js.undefined)
      
      inline def setElementIsScrollable(value: Boolean): Self = StObject.set(x, "elementIsScrollable", value.asInstanceOf[js.Any])
      
      inline def setElementIsScrollableUndefined: Self = StObject.set(x, "elementIsScrollable", js.undefined)
      
      inline def setHasMore(value: Boolean): Self = StObject.set(x, "hasMore", value.asInstanceOf[js.Any])
      
      inline def setHasMoreUndefined: Self = StObject.set(x, "hasMore", js.undefined)
      
      inline def setHolderType(value: String): Self = StObject.set(x, "holderType", value.asInstanceOf[js.Any])
      
      inline def setHolderTypeUndefined: Self = StObject.set(x, "holderType", js.undefined)
      
      inline def setItems(value: js.Array[Element]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
      
      inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
      
      inline def setItemsVarargs(value: Element*): Self = StObject.set(x, "items", js.Array(value*))
      
      inline def setLoadMore(value: () => Unit): Self = StObject.set(x, "loadMore", js.Any.fromFunction0(value))
      
      inline def setLoader(value: Any): Self = StObject.set(x, "loader", value.asInstanceOf[js.Any])
      
      inline def setLoaderUndefined: Self = StObject.set(x, "loader", js.undefined)
      
      inline def setLoadingMore(value: Boolean): Self = StObject.set(x, "loadingMore", value.asInstanceOf[js.Any])
      
      inline def setLoadingMoreUndefined: Self = StObject.set(x, "loadingMore", js.undefined)
      
      inline def setShowLoader(value: Boolean): Self = StObject.set(x, "showLoader", value.asInstanceOf[js.Any])
      
      inline def setShowLoaderUndefined: Self = StObject.set(x, "showLoader", js.undefined)
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    }
  }
}
