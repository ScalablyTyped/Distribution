package typings.reactDashWindowDashInfiniteDashLoader.reactDashWindowDashInfiniteDashLoaderMod

import typings.react.reactMod.ReactNode
import typings.reactDashWindowDashInfiniteDashLoader.Anon_OnItemsRendered
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfiniteLoaderProps extends js.Object {
  var itemCount: Double
  var minimumBatchSize: js.UndefOr[Double] = js.undefined
  var threshold: js.UndefOr[Double] = js.undefined
  def children(props: Anon_OnItemsRendered): ReactNode
  def isItemLoaded(index: Double): Boolean
  def loadMoreItems(startIndex: Double, stopIndex: Double): js.Promise[_] | Null
}

object InfiniteLoaderProps {
  @scala.inline
  def apply(
    children: Anon_OnItemsRendered => ReactNode,
    isItemLoaded: Double => Boolean,
    itemCount: Double,
    loadMoreItems: (Double, Double) => js.Promise[_] | Null,
    minimumBatchSize: Int | Double = null,
    threshold: Int | Double = null
  ): InfiniteLoaderProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), isItemLoaded = js.Any.fromFunction1(isItemLoaded), itemCount = itemCount, loadMoreItems = js.Any.fromFunction2(loadMoreItems))
    if (minimumBatchSize != null) __obj.updateDynamic("minimumBatchSize")(minimumBatchSize.asInstanceOf[js.Any])
    if (threshold != null) __obj.updateDynamic("threshold")(threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfiniteLoaderProps]
  }
}

