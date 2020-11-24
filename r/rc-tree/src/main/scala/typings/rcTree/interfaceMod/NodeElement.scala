package typings.rcTree.interfaceMod

import typings.rcTree.anon.IsTreeNode
import typings.std.HTMLSpanElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react.react.ReactElement & {  selectHandle :std.HTMLSpanElement | undefined,   type :{  isTreeNode :boolean}} */
@js.native
trait NodeElement extends js.Object {
  
  var key: typings.react.mod.Key | Null = js.native
  
  var props: js.Any = js.native
  
  var selectHandle: js.UndefOr[HTMLSpanElement] = js.native
  
  var `type`: js.Any with IsTreeNode = js.native
}
object NodeElement {
  
  @scala.inline
  def apply(props: js.Any, `type`: js.Any with IsTreeNode): NodeElement = {
    val __obj = js.Dynamic.literal(props = props.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeElement]
  }
  
  @scala.inline
  implicit class NodeElementOps[Self <: NodeElement] (val x: Self) extends AnyVal {
    
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
    def setProps(value: js.Any): Self = this.set("props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: js.Any with IsTreeNode): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKey(value: typings.react.mod.Key): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyNull: Self = this.set("key", null)
    
    @scala.inline
    def setSelectHandle(value: HTMLSpanElement): Self = this.set("selectHandle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelectHandle: Self = this.set("selectHandle", js.undefined)
  }
}
