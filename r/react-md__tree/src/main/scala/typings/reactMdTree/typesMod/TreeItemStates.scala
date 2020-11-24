package typings.reactMdTree.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TreeItemStates extends js.Object {
  
  /**
    * Boolean if the tree item is expanded. When this is true, it should add
    * `aria-expanded="true"` to the tree item.
    */
  var expanded: Boolean = js.native
  
  /**
    * Boolean if the tree item is the current keyboard focus.
    */
  var focused: Boolean = js.native
  
  /**
    * Boolean if the tree item is currently selected.
    */
  var selected: Boolean = js.native
}
object TreeItemStates {
  
  @scala.inline
  def apply(expanded: Boolean, focused: Boolean, selected: Boolean): TreeItemStates = {
    val __obj = js.Dynamic.literal(expanded = expanded.asInstanceOf[js.Any], focused = focused.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any])
    __obj.asInstanceOf[TreeItemStates]
  }
  
  @scala.inline
  implicit class TreeItemStatesOps[Self <: TreeItemStates] (val x: Self) extends AnyVal {
    
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
    def setExpanded(value: Boolean): Self = this.set("expanded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocused(value: Boolean): Self = this.set("focused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
  }
}
