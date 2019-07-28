package typings.rcDashTree.rcDashTreeMod

import typings.react.reactMod.Global.JSXNs.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeNodeProps extends js.Object {
  /**
    * additional css class for treeNode
    */
  var className: js.UndefOr[String] = js.undefined
  /**
    * whether treeNode's checkbox is disabled
    */
  var disableCheckbox: js.UndefOr[Boolean] = js.undefined
  /**
    * whether treeNode is disabled
    */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /**
    * customize icon. When you pass component, whose render will receive full TreeNode props as component props
    */
  var icon: js.UndefOr[Element | (js.Function1[/* props */ InternalTreeNodeProps, Element])] = js.undefined
  /**
    * whether it is a leaf node
    */
  var isLeaf: js.UndefOr[Boolean] = js.undefined
  /**
    * tree / subTree's title
    */
  var title: js.UndefOr[String | Element] = js.undefined
}

object TreeNodeProps {
  @scala.inline
  def apply(
    className: String = null,
    disableCheckbox: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    icon: Element | (js.Function1[/* props */ InternalTreeNodeProps, Element]) = null,
    isLeaf: js.UndefOr[Boolean] = js.undefined,
    title: String | Element = null
  ): TreeNodeProps = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (!js.isUndefined(disableCheckbox)) __obj.updateDynamic("disableCheckbox")(disableCheckbox)
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled)
    if (icon != null) __obj.updateDynamic("icon")(icon.asInstanceOf[js.Any])
    if (!js.isUndefined(isLeaf)) __obj.updateDynamic("isLeaf")(isLeaf)
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeNodeProps]
  }
}

