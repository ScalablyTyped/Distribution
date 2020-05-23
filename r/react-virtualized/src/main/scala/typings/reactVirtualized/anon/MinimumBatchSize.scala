package typings.reactVirtualized.anon

import typings.reactVirtualized.reactVirtualizedNumbers.`0`
import typings.reactVirtualized.reactVirtualizedNumbers.`10`
import typings.reactVirtualized.reactVirtualizedNumbers.`15`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MinimumBatchSize extends js.Object {
  var minimumBatchSize: `10`
  var rowCount: `0`
  var threshold: `15`
}

object MinimumBatchSize {
  @scala.inline
  def apply(minimumBatchSize: `10`, rowCount: `0`, threshold: `15`): MinimumBatchSize = {
    val __obj = js.Dynamic.literal(minimumBatchSize = minimumBatchSize.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], threshold = threshold.asInstanceOf[js.Any])
    __obj.asInstanceOf[MinimumBatchSize]
  }
}

