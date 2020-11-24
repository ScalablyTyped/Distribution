package typings.reactNativeNavigation.layoutTreeCrawlerMod

import typings.reactNativeNavigation.layoutTypeMod.LayoutType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayoutNode extends js.Object {
  
  var children: js.Array[LayoutNode] = js.native
  
  var data: Data = js.native
  
  var id: String = js.native
  
  var `type`: LayoutType = js.native
}
object LayoutNode {
  
  @scala.inline
  def apply(children: js.Array[LayoutNode], data: Data, id: String, `type`: LayoutType): LayoutNode = {
    val __obj = js.Dynamic.literal(children = children.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[LayoutNode]
  }
  
  @scala.inline
  implicit class LayoutNodeOps[Self <: LayoutNode] (val x: Self) extends AnyVal {
    
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
    def setChildrenVarargs(value: LayoutNode*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[LayoutNode]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setData(value: Data): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: LayoutType): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
