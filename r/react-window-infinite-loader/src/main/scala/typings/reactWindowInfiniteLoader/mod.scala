package typings.reactWindowInfiniteLoader

import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactWindow.mod.ListOnItemsRenderedProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-window-infinite-loader", JSImport.Namespace)
  @js.native
  open class ^ () extends InfiniteLoader
  
  @js.native
  trait InfiniteLoader
    extends Component[InfiniteLoaderProps, js.Object, Any] {
    
    def resetloadMoreItemsCache(): Unit = js.native
    def resetloadMoreItemsCache(autoReload: Boolean): Unit = js.native
  }
  
  trait InfiniteLoaderProps extends StObject {
    
    def children(props: typings.reactWindowInfiniteLoader.anon.OnItemsRendered): ReactNode
    
    def isItemLoaded(index: Double): Boolean
    
    var itemCount: Double
    
    def loadMoreItems(startIndex: Double, stopIndex: Double): js.Promise[Unit] | Unit
    
    var minimumBatchSize: js.UndefOr[Double] = js.undefined
    
    var threshold: js.UndefOr[Double] = js.undefined
  }
  object InfiniteLoaderProps {
    
    inline def apply(
      children: typings.reactWindowInfiniteLoader.anon.OnItemsRendered => ReactNode,
      isItemLoaded: Double => Boolean,
      itemCount: Double,
      loadMoreItems: (Double, Double) => js.Promise[Unit] | Unit
    ): InfiniteLoaderProps = {
      val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), isItemLoaded = js.Any.fromFunction1(isItemLoaded), itemCount = itemCount.asInstanceOf[js.Any], loadMoreItems = js.Any.fromFunction2(loadMoreItems))
      __obj.asInstanceOf[InfiniteLoaderProps]
    }
    
    extension [Self <: InfiniteLoaderProps](x: Self) {
      
      inline def setChildren(value: typings.reactWindowInfiniteLoader.anon.OnItemsRendered => ReactNode): Self = StObject.set(x, "children", js.Any.fromFunction1(value))
      
      inline def setIsItemLoaded(value: Double => Boolean): Self = StObject.set(x, "isItemLoaded", js.Any.fromFunction1(value))
      
      inline def setItemCount(value: Double): Self = StObject.set(x, "itemCount", value.asInstanceOf[js.Any])
      
      inline def setLoadMoreItems(value: (Double, Double) => js.Promise[Unit] | Unit): Self = StObject.set(x, "loadMoreItems", js.Any.fromFunction2(value))
      
      inline def setMinimumBatchSize(value: Double): Self = StObject.set(x, "minimumBatchSize", value.asInstanceOf[js.Any])
      
      inline def setMinimumBatchSizeUndefined: Self = StObject.set(x, "minimumBatchSize", js.undefined)
      
      inline def setThreshold(value: Double): Self = StObject.set(x, "threshold", value.asInstanceOf[js.Any])
      
      inline def setThresholdUndefined: Self = StObject.set(x, "threshold", js.undefined)
    }
  }
  
  type OnItemsRendered = js.Function1[/* props */ ListOnItemsRenderedProps, Any]
}
