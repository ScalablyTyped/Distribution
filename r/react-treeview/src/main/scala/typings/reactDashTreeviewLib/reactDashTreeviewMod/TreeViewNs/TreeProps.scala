package typings
package reactDashTreeviewLib.reactDashTreeviewMod.TreeViewNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeProps
  extends reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLDivElement] {
  var childrenClassName: js.UndefOr[java.lang.String] = js.undefined
  var collapsed: js.UndefOr[scala.Boolean] = js.undefined
  var defaultCollapsed: js.UndefOr[scala.Boolean] = js.undefined
  var itemClassName: js.UndefOr[java.lang.String] = js.undefined
  var nodeLabel: reactLib.reactMod.ReactNs.ReactNode
  var treeViewClassName: js.UndefOr[java.lang.String] = js.undefined
}

object TreeProps {
  @scala.inline
  def apply(
    nodeLabel: reactLib.reactMod.ReactNs.ReactNode,
    HTMLAttributes: reactLib.reactMod.ReactNs.HTMLAttributes[reactLib.HTMLDivElement] = null,
    childrenClassName: java.lang.String = null,
    collapsed: js.UndefOr[scala.Boolean] = js.undefined,
    defaultCollapsed: js.UndefOr[scala.Boolean] = js.undefined,
    itemClassName: java.lang.String = null,
    treeViewClassName: java.lang.String = null
  ): TreeProps = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("nodeLabel")(nodeLabel.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (childrenClassName != null) __obj.updateDynamic("childrenClassName")(childrenClassName)
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed)
    if (!js.isUndefined(defaultCollapsed)) __obj.updateDynamic("defaultCollapsed")(defaultCollapsed)
    if (itemClassName != null) __obj.updateDynamic("itemClassName")(itemClassName)
    if (treeViewClassName != null) __obj.updateDynamic("treeViewClassName")(treeViewClassName)
    __obj.asInstanceOf[TreeProps]
  }
}

