package typings
package rcDashTreeLib.rcDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InternalTreeNodeProps extends TreeNodeProps {
  var checked: scala.Boolean
  var dragOver: scala.Boolean
  var dragOverGapBottom: scala.Boolean
  var dragOverGapTop: scala.Boolean
  var eventKey: java.lang.String
  var expanded: scala.Boolean
  var halfChecked: scala.Boolean
  var pos: java.lang.String
  var selected: scala.Boolean
}

object InternalTreeNodeProps {
  @scala.inline
  def apply(
    checked: scala.Boolean,
    dragOver: scala.Boolean,
    dragOverGapBottom: scala.Boolean,
    dragOverGapTop: scala.Boolean,
    eventKey: java.lang.String,
    expanded: scala.Boolean,
    halfChecked: scala.Boolean,
    pos: java.lang.String,
    selected: scala.Boolean,
    className: java.lang.String = null,
    disableCheckbox: js.UndefOr[scala.Boolean] = js.undefined,
    disabled: js.UndefOr[scala.Boolean] = js.undefined,
    icon: reactLib.reactMod.Global.JSXNs.Element | (js.Function1[/* props */ InternalTreeNodeProps, reactLib.reactMod.Global.JSXNs.Element]) = null,
    isLeaf: js.UndefOr[scala.Boolean] = js.undefined,
    title: java.lang.String | reactLib.reactMod.Global.JSXNs.Element = null
  ): InternalTreeNodeProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("checked")(checked)
    __obj.updateDynamic("dragOver")(dragOver)
    __obj.updateDynamic("dragOverGapBottom")(dragOverGapBottom)
    __obj.updateDynamic("dragOverGapTop")(dragOverGapTop)
    __obj.updateDynamic("eventKey")(eventKey)
    __obj.updateDynamic("expanded")(expanded)
    __obj.updateDynamic("halfChecked")(halfChecked)
    __obj.updateDynamic("pos")(pos)
    __obj.updateDynamic("selected")(selected)
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disableCheckbox)) __obj.updateDynamic("disableCheckbox")(disableCheckbox)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(isLeaf)) __obj.updateDynamic("isLeaf")(isLeaf)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[InternalTreeNodeProps]
  }
}

