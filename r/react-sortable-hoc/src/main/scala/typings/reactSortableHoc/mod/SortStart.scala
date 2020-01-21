package typings.reactSortableHoc.mod

import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SortStart extends js.Object {
  var collection: Offset
  var helper: HTMLElement
  var index: Double
  var isKeySorting: Boolean
  var node: Element
  var nodes: js.Array[HTMLElement]
}

object SortStart {
  @scala.inline
  def apply(
    collection: Offset,
    helper: HTMLElement,
    index: Double,
    isKeySorting: Boolean,
    node: Element,
    nodes: js.Array[HTMLElement]
  ): SortStart = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], helper = helper.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], isKeySorting = isKeySorting.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SortStart]
  }
}

