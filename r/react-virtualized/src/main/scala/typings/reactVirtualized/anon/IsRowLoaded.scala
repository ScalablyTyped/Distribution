package typings.reactVirtualized.anon

import typings.react.mod.ReactNode
import typings.react.mod.Validator
import typings.reactVirtualized.esInfiniteLoaderMod.InfiniteLoaderChildProps
import typings.reactVirtualized.mod.IndexRange
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IsRowLoaded extends js.Object {
  var children: Validator[js.Function1[/* props */ InfiniteLoaderChildProps, ReactNode]]
  var isRowLoaded: Validator[js.Function1[/* params */ typings.reactVirtualized.mod.Index, Boolean]]
  var loadMoreRows: Validator[js.Function1[/* params */ IndexRange, js.Promise[_]]]
  var minimumBatchSize: Validator[Double]
  var rowCount: Validator[Double]
  var threshold: Validator[Double]
}

object IsRowLoaded {
  @scala.inline
  def apply(
    children: Validator[js.Function1[/* props */ InfiniteLoaderChildProps, ReactNode]],
    isRowLoaded: Validator[js.Function1[/* params */ typings.reactVirtualized.mod.Index, Boolean]],
    loadMoreRows: Validator[js.Function1[/* params */ IndexRange, js.Promise[_]]],
    minimumBatchSize: Validator[Double],
    rowCount: Validator[Double],
    threshold: Validator[Double]
  ): IsRowLoaded = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], isRowLoaded = isRowLoaded.asInstanceOf[js.Any], loadMoreRows = loadMoreRows.asInstanceOf[js.Any], minimumBatchSize = minimumBatchSize.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsRowLoaded]
  }
}

