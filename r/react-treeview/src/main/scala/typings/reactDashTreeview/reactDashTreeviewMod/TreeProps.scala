package typings.reactDashTreeview.reactDashTreeviewMod

import typings.react.reactMod.HTMLAttributes
import typings.react.reactMod.ReactNode
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TreeProps extends HTMLAttributes[HTMLDivElement] {
  var childrenClassName: js.UndefOr[String] = js.undefined
  var collapsed: js.UndefOr[Boolean] = js.undefined
  var defaultCollapsed: js.UndefOr[Boolean] = js.undefined
  var itemClassName: js.UndefOr[String] = js.undefined
  var nodeLabel: ReactNode
  var treeViewClassName: js.UndefOr[String] = js.undefined
}

object TreeProps {
  @scala.inline
  def apply(
    nodeLabel: ReactNode,
    HTMLAttributes: HTMLAttributes[HTMLDivElement] = null,
    childrenClassName: String = null,
    collapsed: js.UndefOr[Boolean] = js.undefined,
    defaultCollapsed: js.UndefOr[Boolean] = js.undefined,
    itemClassName: String = null,
    treeViewClassName: String = null
  ): TreeProps = {
    val __obj = js.Dynamic.literal(nodeLabel = nodeLabel.asInstanceOf[js.Any])
    js.Dynamic.global.Object.assign(__obj, HTMLAttributes)
    if (childrenClassName != null) __obj.updateDynamic("childrenClassName")(childrenClassName)
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed)
    if (!js.isUndefined(defaultCollapsed)) __obj.updateDynamic("defaultCollapsed")(defaultCollapsed)
    if (itemClassName != null) __obj.updateDynamic("itemClassName")(itemClassName)
    if (treeViewClassName != null) __obj.updateDynamic("treeViewClassName")(treeViewClassName)
    __obj.asInstanceOf[TreeProps]
  }
}

