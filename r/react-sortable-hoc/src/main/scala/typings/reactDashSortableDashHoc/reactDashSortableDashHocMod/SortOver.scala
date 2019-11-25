package typings.reactDashSortableDashHoc.reactDashSortableDashHocMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortOver extends js.Object {
  var collection: Offset
  var index: Double
  var isKeySorting: Boolean
  var newIndex: Double
  var oldIndex: Double
}

object SortOver {
  @scala.inline
  def apply(collection: Offset, index: Double, isKeySorting: Boolean, newIndex: Double, oldIndex: Double): SortOver = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isKeySorting = isKeySorting.asInstanceOf[js.Any], newIndex = newIndex.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SortOver]
  }
}

