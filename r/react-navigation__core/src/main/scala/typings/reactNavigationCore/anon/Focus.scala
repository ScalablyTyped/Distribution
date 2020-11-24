package typings.reactNavigationCore.anon

import typings.reactNavigationCore.navigationBuilderContextMod.ChildActionListener
import typings.reactNavigationCore.navigationBuilderContextMod.FocusedNavigationListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Focus extends js.Object {
  
  var action: js.Array[ChildActionListener] = js.native
  
  var focus: js.Array[FocusedNavigationListener] = js.native
}
object Focus {
  
  @scala.inline
  def apply(action: js.Array[ChildActionListener], focus: js.Array[FocusedNavigationListener]): Focus = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any])
    __obj.asInstanceOf[Focus]
  }
  
  @scala.inline
  implicit class FocusOps[Self <: Focus] (val x: Self) extends AnyVal {
    
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
    def setActionVarargs(value: ChildActionListener*): Self = this.set("action", js.Array(value :_*))
    
    @scala.inline
    def setAction(value: js.Array[ChildActionListener]): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusVarargs(value: FocusedNavigationListener*): Self = this.set("focus", js.Array(value :_*))
    
    @scala.inline
    def setFocus(value: js.Array[FocusedNavigationListener]): Self = this.set("focus", value.asInstanceOf[js.Any])
  }
}
