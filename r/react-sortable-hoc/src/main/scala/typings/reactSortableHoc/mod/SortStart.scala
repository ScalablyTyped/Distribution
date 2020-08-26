package typings.reactSortableHoc.mod

import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SortStart extends js.Object {
  var collection: Offset = js.native
  var helper: HTMLElement = js.native
  var index: Double = js.native
  var isKeySorting: Boolean = js.native
  var node: Element = js.native
  var nodes: js.Array[HTMLElement] = js.native
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
  @scala.inline
  implicit class SortStartOps[Self <: SortStart] (val x: Self) extends AnyVal {
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
    def setHelper(value: HTMLElement): Self = this.set("helper", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsKeySorting(value: Boolean): Self = this.set("isKeySorting", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode(value: Element): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodesVarargs(value: HTMLElement*): Self = this.set("nodes", js.Array(value :_*))
    @scala.inline
    def setNodes(value: js.Array[HTMLElement]): Self = this.set("nodes", value.asInstanceOf[js.Any])
  }
  
}

