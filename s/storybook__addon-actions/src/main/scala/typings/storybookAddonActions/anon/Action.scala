package typings.storybookAddonActions.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Action extends js.Object {
  
  def action(): Unit = js.native
  
  def actions(): Unit = js.native
  
  def withActions(): Unit = js.native
}
object Action {
  
  @scala.inline
  def apply(action: () => Unit, actions: () => Unit, withActions: () => Unit): Action = {
    val __obj = js.Dynamic.literal(action = js.Any.fromFunction0(action), actions = js.Any.fromFunction0(actions), withActions = js.Any.fromFunction0(withActions))
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
    def setAction(value: () => Unit): Self = this.set("action", js.Any.fromFunction0(value))
    
    @scala.inline
    def setActions(value: () => Unit): Self = this.set("actions", js.Any.fromFunction0(value))
    
    @scala.inline
    def setWithActions(value: () => Unit): Self = this.set("withActions", js.Any.fromFunction0(value))
  }
}
