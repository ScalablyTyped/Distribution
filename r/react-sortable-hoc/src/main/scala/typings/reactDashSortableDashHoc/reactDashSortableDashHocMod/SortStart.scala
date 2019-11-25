package typings.reactDashSortableDashHoc.reactDashSortableDashHocMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortStart extends js.Object {
  var collection: Offset
  var index: Double
  var isKeySorting: Boolean
  var node: Element
}

object SortStart {
  @scala.inline
  def apply(collection: Offset, index: Double, isKeySorting: Boolean, node: Element): SortStart = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isKeySorting = isKeySorting.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SortStart]
  }
}

