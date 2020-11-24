package typings.rcEasyui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SelectionMode extends js.Object {
  
  var selectionMode: String = js.native
}
object SelectionMode {
  
  @scala.inline
  def apply(selectionMode: String): SelectionMode = {
    val __obj = js.Dynamic.literal(selectionMode = selectionMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[SelectionMode]
  }
  
  @scala.inline
  implicit class SelectionModeOps[Self <: SelectionMode] (val x: Self) extends AnyVal {
    
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
    def setSelectionMode(value: String): Self = this.set("selectionMode", value.asInstanceOf[js.Any])
  }
}
