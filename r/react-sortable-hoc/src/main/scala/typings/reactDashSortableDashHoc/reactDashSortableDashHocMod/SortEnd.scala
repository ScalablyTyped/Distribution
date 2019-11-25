package typings.reactDashSortableDashHoc.reactDashSortableDashHocMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortEnd extends js.Object {
  var collection: Offset
  var isKeySorting: Boolean
  var newIndex: Double
  var oldIndex: Double
}

object SortEnd {
  @scala.inline
  def apply(collection: Offset, isKeySorting: Boolean, newIndex: Double, oldIndex: Double): SortEnd = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], isKeySorting = isKeySorting.asInstanceOf[js.Any], newIndex = newIndex.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SortEnd]
  }
}

