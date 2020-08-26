package typings.rcTreeSelect.interfaceMod

import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LegacyCheckedNode extends js.Object {
  var children: js.UndefOr[js.Array[LegacyCheckedNode]] = js.native
  var node: ReactElement = js.native
  var pos: String = js.native
}

object LegacyCheckedNode {
  @scala.inline
  def apply(node: ReactElement, pos: String): LegacyCheckedNode = {
    val __obj = js.Dynamic.literal(node = node.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[LegacyCheckedNode]
  }
  @scala.inline
  implicit class LegacyCheckedNodeOps[Self <: LegacyCheckedNode] (val x: Self) extends AnyVal {
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
    def setNode(value: ReactElement): Self = this.set("node", value.asInstanceOf[js.Any])
    @scala.inline
    def setPos(value: String): Self = this.set("pos", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildrenVarargs(value: LegacyCheckedNode*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[LegacyCheckedNode]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
  }
  
}

