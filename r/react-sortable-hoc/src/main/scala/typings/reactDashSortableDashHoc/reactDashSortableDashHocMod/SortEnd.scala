package typings.reactDashSortableDashHoc.reactDashSortableDashHocMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortEnd extends js.Object {
  var collection: Offset
  var newIndex: Double
  var oldIndex: Double
}

object SortEnd {
  @scala.inline
  def apply(collection: Offset, newIndex: Double, oldIndex: Double): SortEnd = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], newIndex = newIndex, oldIndex = oldIndex)
  
    __obj.asInstanceOf[SortEnd]
  }
}

