package typings.rcDashTree.rcDashTreeMod

import typings.react.reactMod.Global.JSXNs.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InternalTreeNodeProps extends TreeNodeProps {
  var checked: Boolean
  var dragOver: Boolean
  var dragOverGapBottom: Boolean
  var dragOverGapTop: Boolean
  var eventKey: String
  var expanded: Boolean
  var halfChecked: Boolean
  var pos: String
  var selected: Boolean
}

object InternalTreeNodeProps {
  @scala.inline
  def apply(
    checked: Boolean,
    dragOver: Boolean,
    dragOverGapBottom: Boolean,
    dragOverGapTop: Boolean,
    eventKey: String,
    expanded: Boolean,
    halfChecked: Boolean,
    pos: String,
    selected: Boolean,
    className: String = null,
    disableCheckbox: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    icon: Element | (js.Function1[/* props */ InternalTreeNodeProps, Element]) = null,
    isLeaf: js.UndefOr[Boolean] = js.undefined,
    title: String | Element = null
  ): InternalTreeNodeProps = {
    val __obj = js.Dynamic.literal(checked = checked, dragOver = dragOver, dragOverGapBottom = dragOverGapBottom, dragOverGapTop = dragOverGapTop, eventKey = eventKey, expanded = expanded, halfChecked = halfChecked, pos = pos, selected = selected)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disableCheckbox)) __obj.updateDynamic("disableCheckbox")(disableCheckbox)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(isLeaf)) __obj.updateDynamic("isLeaf")(isLeaf)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalTreeNodeProps]
  }
}

