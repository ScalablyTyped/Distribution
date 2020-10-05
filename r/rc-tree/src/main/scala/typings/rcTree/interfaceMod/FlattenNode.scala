package typings.rcTree.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlattenNode extends js.Object {
  var children: js.Array[FlattenNode] = js.native
  var data: DataNode = js.native
  var isEnd: js.Array[Boolean] = js.native
  var isStart: js.Array[Boolean] = js.native
  var parent: FlattenNode | Null = js.native
  var pos: String = js.native
}

object FlattenNode {
  @scala.inline
  def apply(
    children: js.Array[FlattenNode],
    data: DataNode,
    isEnd: js.Array[Boolean],
    isStart: js.Array[Boolean],
    pos: String
  ): FlattenNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], isEnd = isEnd.asInstanceOf[js.Any], isStart = isStart.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[FlattenNode]
  }
  @scala.inline
  implicit class FlattenNodeOps[Self <: FlattenNode] (val x: Self) extends AnyVal {
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
    def setChildrenVarargs(value: FlattenNode*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[FlattenNode]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: DataNode): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsEndVarargs(value: Boolean*): Self = this.set("isEnd", js.Array(value :_*))
    @scala.inline
    def setIsEnd(value: js.Array[Boolean]): Self = this.set("isEnd", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsStartVarargs(value: Boolean*): Self = this.set("isStart", js.Array(value :_*))
    @scala.inline
    def setIsStart(value: js.Array[Boolean]): Self = this.set("isStart", value.asInstanceOf[js.Any])
    @scala.inline
    def setPos(value: String): Self = this.set("pos", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: FlattenNode): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setParentNull: Self = this.set("parent", null)
  }
  
}

