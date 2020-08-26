package typings.rcTree.treeNodeMod

import typings.rcTree.contextTypesMod.TreeContextProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InternalTreeNodeProps extends TreeNodeProps {
  var context: js.UndefOr[TreeContextProps] = js.native
}

object InternalTreeNodeProps {
  @scala.inline
  def apply(): InternalTreeNodeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InternalTreeNodeProps]
  }
  @scala.inline
  implicit class InternalTreeNodePropsOps[Self <: InternalTreeNodeProps] (val x: Self) extends AnyVal {
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
    def setContext(value: TreeContextProps): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
  }
  
}

