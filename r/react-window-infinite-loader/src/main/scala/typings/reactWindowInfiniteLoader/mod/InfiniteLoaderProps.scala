package typings.reactWindowInfiniteLoader.mod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InfiniteLoaderProps extends js.Object {
  var itemCount: Double
  var minimumBatchSize: js.UndefOr[Double] = js.undefined
  var threshold: js.UndefOr[Double] = js.undefined
  def children(props: typings.reactWindowInfiniteLoader.anon.OnItemsRendered): ReactNode
  def isItemLoaded(index: Double): Boolean
  def loadMoreItems(startIndex: Double, stopIndex: Double): js.Promise[_] | Null
}

object InfiniteLoaderProps {
  @scala.inline
  def apply(
    children: typings.reactWindowInfiniteLoader.anon.OnItemsRendered => ReactNode,
    isItemLoaded: Double => Boolean,
    itemCount: Double,
    loadMoreItems: (Double, Double) => js.Promise[_] | Null,
    minimumBatchSize: js.UndefOr[Double] = js.undefined,
    threshold: js.UndefOr[Double] = js.undefined
  ): InfiniteLoaderProps = {
    val __obj = js.Dynamic.literal(children = js.Any.fromFunction1(children), isItemLoaded = js.Any.fromFunction1(isItemLoaded), itemCount = itemCount.asInstanceOf[js.Any], loadMoreItems = js.Any.fromFunction2(loadMoreItems))
    if (!js.isUndefined(minimumBatchSize)) __obj.updateDynamic("minimumBatchSize")(minimumBatchSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(threshold)) __obj.updateDynamic("threshold")(threshold.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[InfiniteLoaderProps]
  }
}

