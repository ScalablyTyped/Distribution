package typings.reactWindowInfiniteLoader.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InfiniteLoaderProps extends js.Object {
  
  def children(props: typings.reactWindowInfiniteLoader.anon.OnItemsRendered): ReactNode = js.native
  
  def isItemLoaded(index: Double): Boolean = js.native
  
  var itemCount: Double = js.native
  
  def loadMoreItems(startIndex: Double, stopIndex: Double): js.Promise[_] | Null = js.native
  
  var minimumBatchSize: js.UndefOr[Double] = js.native
  
  var threshold: js.UndefOr[Double] = js.native
}
object InfiniteLoaderProps {
  
  @scala.inline
  def apply(
    children: typings.reactWindowInfiniteLoader.anon.OnItemsRendered => ReactNode,
    isItemLoaded: Double => Boolean,
    itemCount: Double,
    loadMoreItems: (Double, Double) => js.Promise[_] | Null
  ): InfiniteLoaderProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), isItemLoaded = js.Any.fromFunction1(isItemLoaded), itemCount = itemCount.asInstanceOf[js.Any], loadMoreItems = js.Any.fromFunction2(loadMoreItems))
    __obj.asInstanceOf[InfiniteLoaderProps]
  }
  
  @scala.inline
  implicit class InfiniteLoaderPropsOps[Self <: InfiniteLoaderProps] (val x: Self) extends AnyVal {
    
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
    def setChildren(value: typings.reactWindowInfiniteLoader.anon.OnItemsRendered => ReactNode): Self = this.set("children", js.Any.fromFunction1(value))
    
    @scala.inline
    def setIsItemLoaded(value: Double => Boolean): Self = this.set("isItemLoaded", js.Any.fromFunction1(value))
    
    @scala.inline
    def setItemCount(value: Double): Self = this.set("itemCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoadMoreItems(value: (Double, Double) => js.Promise[_] | Null): Self = this.set("loadMoreItems", js.Any.fromFunction2(value))
    
    @scala.inline
    def setMinimumBatchSize(value: Double): Self = this.set("minimumBatchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinimumBatchSize: Self = this.set("minimumBatchSize", js.undefined)
    
    @scala.inline
    def setThreshold(value: Double): Self = this.set("threshold", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThreshold: Self = this.set("threshold", js.undefined)
  }
}
