package typings.resq.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RESQNode extends js.Object {
  var _nodes: js.Array[RESQNode]
  var children: js.Array[RESQNode]
  var isFragment: Boolean
  var name: String
  var node: HTMLElement | Null
  var state: NotFunc[_]
}

object RESQNode {
  @scala.inline
  def apply(
    _nodes: js.Array[RESQNode],
    children: js.Array[RESQNode],
    isFragment: Boolean,
    name: String,
    state: NotFunc[_],
    node: HTMLElement = null
  ): RESQNode = {
    val __obj = js.Dynamic.literal(_nodes = _nodes.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], isFragment = isFragment.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], node = node.asInstanceOf[js.Any])
    __obj.asInstanceOf[RESQNode]
  }
}

