package typings.reactDashWindowDashInfiniteDashLoader.reactDashWindowDashInfiniteDashLoaderMod

import typings.react.reactMod.ReactNode
import typings.reactDashWindowDashInfiniteDashLoader.Anon_OnItemsRendered
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfiniteLoaderProps extends js.Object {
  var itemCount: Double
  def children(props: Anon_OnItemsRendered): ReactNode
  def isItemLoaded(index: Double): Boolean
  def loadMoreItems(startIndex: Double, stopIndex: Double): js.Promise[_]
}

object InfiniteLoaderProps {
  @scala.inline
  def apply(
    children: Anon_OnItemsRendered => ReactNode,
    isItemLoaded: Double => Boolean,
    itemCount: Double,
    loadMoreItems: (Double, Double) => js.Promise[_]
  ): InfiniteLoaderProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), isItemLoaded = js.Any.fromFunction1(isItemLoaded), itemCount = itemCount, loadMoreItems = js.Any.fromFunction2(loadMoreItems))
  
    __obj.asInstanceOf[InfiniteLoaderProps]
  }
}

