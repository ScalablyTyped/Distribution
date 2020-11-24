package typings.reduxFirstRouter.anon

import typings.reduxFirstRouter.mod.NavigationAction
import typings.reduxFirstRouter.mod.Nullable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Action extends js.Object {
  
  var action: js.Object = js.native
  
  var navigationAction: Nullable[NavigationAction] = js.native
}
object Action {
  
  @scala.inline
  def apply(action: js.Object): Action = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  
  @scala.inline
  implicit class ActionOps[Self <: Action] (val x: Self) extends AnyVal {
    
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
    def setAction(value: js.Object): Self = this.set("action", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNavigationAction(value: Nullable[NavigationAction]): Self = this.set("navigationAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNavigationAction: Self = this.set("navigationAction", js.undefined)
    
    @scala.inline
    def setNavigationActionNull: Self = this.set("navigationAction", null)
  }
}
