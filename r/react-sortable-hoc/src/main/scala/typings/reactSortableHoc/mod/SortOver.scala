package typings.reactSortableHoc.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortOver extends js.Object {
  var collection: Offset
  var helper: HTMLElement
  var index: Double
  var isKeySorting: Boolean
  var newIndex: Double
  var nodes: js.Array[HTMLElement]
  var oldIndex: Double
}

object SortOver {
  @scala.inline
  def apply(
    collection: Offset,
    helper: HTMLElement,
    index: Double,
    isKeySorting: Boolean,
    newIndex: Double,
    nodes: js.Array[HTMLElement],
    oldIndex: Double
  ): SortOver = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], helper = helper.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isKeySorting = isKeySorting.asInstanceOf[js.Any], newIndex = newIndex.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortOver]
  }
}

