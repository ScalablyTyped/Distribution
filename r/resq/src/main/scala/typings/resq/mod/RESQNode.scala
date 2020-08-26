package typings.resq.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RESQNode extends js.Object {
  var _nodes: js.Array[RESQNode] = js.native
  var children: js.Array[RESQNode] = js.native
  var isFragment: Boolean = js.native
  var name: String = js.native
  var node: HTMLElement | Null = js.native
  var state: NotFunc[_] = js.native
}

object RESQNode {
  @scala.inline
  def apply(
    _nodes: js.Array[RESQNode],
    children: js.Array[RESQNode],
    isFragment: Boolean,
    name: String,
    state: NotFunc[_]
  ): RESQNode = {
    val __obj = js.Dynamic.literal(_nodes = _nodes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], isFragment = isFragment.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[RESQNode]
  }
  @scala.inline
  implicit class RESQNodeOps[Self <: RESQNode] (val x: Self) extends AnyVal {
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
    def set_nodesVarargs(value: RESQNode*): Self = this.set("_nodes", js.Array(value :_*))
    @scala.inline
    def set_nodes(value: js.Array[RESQNode]): Self = this.set("_nodes", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildrenVarargs(value: RESQNode*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[RESQNode]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsFragment(value: Boolean): Self = this.set("isFragment", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setState(value: NotFunc[_]): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def setNode(value: HTMLElement): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeNull: Self = this.set("node", null)
  }
  
}

