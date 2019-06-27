package typings
package reactDashWindowDashInfiniteDashLoaderLib.reactDashWindowDashInfiniteDashLoaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfiniteLoaderProps extends js.Object {
  var itemCount: scala.Double
  def children(props: reactDashWindowDashInfiniteDashLoaderLib.Anon_OnItemsRendered): reactLib.reactMod.ReactNode
  def isItemLoaded(index: scala.Double): scala.Boolean
  def loadMoreItems(startIndex: scala.Double, stopIndex: scala.Double): js.Promise[_]
}

object InfiniteLoaderProps {
  @scala.inline
  def apply(
    children: reactDashWindowDashInfiniteDashLoaderLib.Anon_OnItemsRendered => reactLib.reactMod.ReactNode,
    isItemLoaded: scala.Double => scala.Boolean,
    itemCount: scala.Double,
    loadMoreItems: (scala.Double, scala.Double) => js.Promise[_]
  ): InfiniteLoaderProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), isItemLoaded = js.Any.fromFunction1(isItemLoaded), itemCount = itemCount, loadMoreItems = js.Any.fromFunction2(loadMoreItems))
  
    __obj.asInstanceOf[InfiniteLoaderProps]
  }
}

