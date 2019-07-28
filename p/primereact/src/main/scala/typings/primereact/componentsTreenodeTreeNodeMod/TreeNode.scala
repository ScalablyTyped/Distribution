package typings.primereact.componentsTreenodeTreeNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeNode extends js.Object {
  var children: js.Array[TreeNode]
  var className: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
  var draggable: js.UndefOr[Boolean] = js.undefined
  var droppable: js.UndefOr[Boolean] = js.undefined
  var icon: js.UndefOr[String] = js.undefined
  var key: js.UndefOr[js.Any] = js.undefined
  var label: js.UndefOr[String] = js.undefined
  var leaf: js.UndefOr[Boolean] = js.undefined
  var selectable: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[js.Object] = js.undefined
}

object TreeNode {
  @scala.inline
  def apply(
    children: js.Array[TreeNode],
    className: String = null,
    data: js.Any = null,
    draggable: js.UndefOr[Boolean] = js.undefined,
    droppable: js.UndefOr[Boolean] = js.undefined,
    icon: String = null,
    key: js.Any = null,
    label: String = null,
    leaf: js.UndefOr[Boolean] = js.undefined,
    selectable: js.UndefOr[Boolean] = js.undefined,
    style: js.Object = null
  ): TreeNode = {
    val __obj = js.Dynamic.literal(children = children)
    if (className != null) __obj.updateDynamic("className")(className)
    if (data != null) __obj.updateDynamic("data")(data)
    if (!js.isUndefined(draggable)) __obj.updateDynamic("draggable")(draggable)
    if (!js.isUndefined(droppable)) __obj.updateDynamic("droppable")(droppable)
    if (icon != null) __obj.updateDynamic("icon")(icon)
    if (key != null) __obj.updateDynamic("key")(key)
    if (label != null) __obj.updateDynamic("label")(label)
    if (!js.isUndefined(leaf)) __obj.updateDynamic("leaf")(leaf)
    if (!js.isUndefined(selectable)) __obj.updateDynamic("selectable")(selectable)
    if (style != null) __obj.updateDynamic("style")(style)
    __obj.asInstanceOf[TreeNode]
  }
}

