package typings.reactSortableHoc.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SortEnd extends js.Object {
  var collection: Offset = js.native
  var isKeySorting: Boolean = js.native
  var newIndex: Double = js.native
  var nodes: js.Array[HTMLElement] = js.native
  var oldIndex: Double = js.native
}

object SortEnd {
  @scala.inline
  def apply(
    collection: Offset,
    isKeySorting: Boolean,
    newIndex: Double,
    nodes: js.Array[HTMLElement],
    oldIndex: Double
  ): SortEnd = {
    val __obj = js.Dynamic.literal(collection = collection.asInstanceOf[js.Any], isKeySorting = isKeySorting.asInstanceOf[js.Any], newIndex = newIndex.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any], oldIndex = oldIndex.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortEnd]
  }
  @scala.inline
  implicit class SortEndOps[Self <: SortEnd] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCollection(value: Offset): Self = this.set("collection", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsKeySorting(value: Boolean): Self = this.set("isKeySorting", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewIndex(value: Double): Self = this.set("newIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodesVarargs(value: HTMLElement*): Self = this.set("nodes", js.Array(value :_*))
    @scala.inline
    def setNodes(value: js.Array[HTMLElement]): Self = this.set("nodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setOldIndex(value: Double): Self = this.set("oldIndex", value.asInstanceOf[js.Any])
  }
  
}

