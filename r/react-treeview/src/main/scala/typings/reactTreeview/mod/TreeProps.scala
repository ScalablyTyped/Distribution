package typings.reactTreeview.mod

import typings.react.mod.HTMLAttributes
import typings.react.mod.ReactNode
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeProps extends HTMLAttributes[HTMLDivElement] {
  var childrenClassName: js.UndefOr[String] = js.native
  var collapsed: js.UndefOr[Boolean] = js.native
  var defaultCollapsed: js.UndefOr[Boolean] = js.native
  var itemClassName: js.UndefOr[String] = js.native
  var nodeLabel: ReactNode = js.native
  var treeViewClassName: js.UndefOr[String] = js.native
}

object TreeProps {
  @scala.inline
  def apply(): TreeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeProps]
  }
  @scala.inline
  implicit class TreePropsOps[Self <: TreeProps] (val x: Self) extends AnyVal {
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
    def setChildrenClassName(value: String): Self = this.set("childrenClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildrenClassName: Self = this.set("childrenClassName", js.undefined)
    @scala.inline
    def setCollapsed(value: Boolean): Self = this.set("collapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapsed: Self = this.set("collapsed", js.undefined)
    @scala.inline
    def setDefaultCollapsed(value: Boolean): Self = this.set("defaultCollapsed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultCollapsed: Self = this.set("defaultCollapsed", js.undefined)
    @scala.inline
    def setItemClassName(value: String): Self = this.set("itemClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemClassName: Self = this.set("itemClassName", js.undefined)
    @scala.inline
    def setNodeLabel(value: ReactNode): Self = this.set("nodeLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeLabel: Self = this.set("nodeLabel", js.undefined)
    @scala.inline
    def setTreeViewClassName(value: String): Self = this.set("treeViewClassName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTreeViewClassName: Self = this.set("treeViewClassName", js.undefined)
  }
  
}

