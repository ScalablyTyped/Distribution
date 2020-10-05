package typings.rcTreeSelect.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InnerDataNode extends DataNode {
  @JSName("children")
  var children_InnerDataNode: js.UndefOr[js.Array[InnerDataNode]] = js.native
  @JSName("key")
  var key_InnerDataNode: Key = js.native
  @JSName("value")
  var value_InnerDataNode: RawValueType = js.native
}

object InnerDataNode {
  @scala.inline
  def apply(key: Key, value: RawValueType): InnerDataNode = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[InnerDataNode]
  }
  @scala.inline
  implicit class InnerDataNodeOps[Self <: InnerDataNode] (val x: Self) extends AnyVal {
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
    def setKey(value: Key): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setValue(value: RawValueType): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildrenVarargs(value: InnerDataNode*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[InnerDataNode]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
  }
  
}

