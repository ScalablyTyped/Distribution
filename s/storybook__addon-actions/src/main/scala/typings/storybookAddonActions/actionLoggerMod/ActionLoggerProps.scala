package typings.storybookAddonActions.actionLoggerMod

import typings.storybookAddonActions.actionDisplayMod.ActionDisplay
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionLoggerProps extends js.Object {
  
  var actions: js.Array[ActionDisplay] = js.native
  
  def onClear(): Unit = js.native
}
object ActionLoggerProps {
  
  @scala.inline
  def apply(actions: js.Array[ActionDisplay], onClear: () => Unit): ActionLoggerProps = {
    val __obj = js.Dynamic.literal(actions = actions.asInstanceOf[js.Any], onClear = js.Any.fromFunction0(onClear))
    __obj.asInstanceOf[ActionLoggerProps]
  }
  
  @scala.inline
  implicit class ActionLoggerPropsOps[Self <: ActionLoggerProps] (val x: Self) extends AnyVal {
    
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
    def setActionsVarargs(value: ActionDisplay*): Self = this.set("actions", js.Array(value :_*))
    
    @scala.inline
    def setActions(value: js.Array[ActionDisplay]): Self = this.set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClear(value: () => Unit): Self = this.set("onClear", js.Any.fromFunction0(value))
  }
}
