package typings.sharepoint.CUI.Page

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommandDispatcher extends js.Object {
  
  def executeCommand(commandId: String, properties: js.Any): js.Any = js.native
}
object CommandDispatcher {
  
  @scala.inline
  def apply(executeCommand: (String, js.Any) => js.Any): CommandDispatcher = {
    val __obj = js.Dynamic.literal(executeCommand = js.Any.fromFunction2(executeCommand))
    __obj.asInstanceOf[CommandDispatcher]
  }
  
  @scala.inline
  implicit class CommandDispatcherOps[Self <: CommandDispatcher] (val x: Self) extends AnyVal {
    
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
    def setExecuteCommand(value: (String, js.Any) => js.Any): Self = this.set("executeCommand", js.Any.fromFunction2(value))
  }
}
