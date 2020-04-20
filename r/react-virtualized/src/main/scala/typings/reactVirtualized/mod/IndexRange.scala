package typings.reactVirtualized.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IndexRange extends js.Object {
  var startIndex: Double
  var stopIndex: Double
}

object IndexRange {
  @scala.inline
  def apply(startIndex: Double, stopIndex: Double): IndexRange = {
    val __obj = js.Dynamic.literal(startIndex = startIndex.asInstanceOf[js.Any], stopIndex = stopIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IndexRange]
  }
}

