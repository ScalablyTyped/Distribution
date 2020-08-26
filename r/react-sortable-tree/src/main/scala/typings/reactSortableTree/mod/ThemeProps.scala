package typings.reactSortableTree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ThemeProps extends ThemeTreeProps {
  var treeNodeRenderer: js.UndefOr[TreeRenderer] = js.native
}

object ThemeProps {
  @scala.inline
  def apply(): ThemeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ThemeProps]
  }
  @scala.inline
  implicit class ThemePropsOps[Self <: ThemeProps] (val x: Self) extends AnyVal {
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
    def setTreeNodeRenderer(value: TreeRenderer): Self = this.set("treeNodeRenderer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTreeNodeRenderer: Self = this.set("treeNodeRenderer", js.undefined)
  }
  
}

