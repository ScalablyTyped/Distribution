package typings.reactSortableTree.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TreeItem
  extends /* x */ StringDictionary[js.Any] {
  var children: js.UndefOr[js.Array[TreeItem] | GetTreeItemChildrenFn] = js.native
  var expanded: js.UndefOr[Boolean] = js.native
  var subtitle: js.UndefOr[ReactNode] = js.native
  var title: js.UndefOr[ReactNode] = js.native
}

object TreeItem {
  @scala.inline
  def apply(): TreeItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TreeItem]
  }
  @scala.inline
  implicit class TreeItemOps[Self <: TreeItem] (val x: Self) extends AnyVal {
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
    def setChildrenVarargs(value: TreeItem*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildrenFunction1(value: /* data */ GetTreeItemChildren => Unit): Self = this.set("children", js.Any.fromFunction1(value))
    @scala.inline
    def setChildren(value: js.Array[TreeItem] | GetTreeItemChildrenFn): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setExpanded(value: Boolean): Self = this.set("expanded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpanded: Self = this.set("expanded", js.undefined)
    @scala.inline
    def setSubtitle(value: ReactNode): Self = this.set("subtitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtitle: Self = this.set("subtitle", js.undefined)
    @scala.inline
    def setTitle(value: ReactNode): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

