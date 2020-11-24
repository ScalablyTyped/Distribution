package typings.reactAce.typesMod

import typings.aceBuilds.mod.Ace.Editor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ICommand extends js.Object {
  
  var bindKey: ICommandBindKey = js.native
  
  var exec: String | ICommandExecFunction = js.native
  
  var name: String = js.native
}
object ICommand {
  
  @scala.inline
  def apply(bindKey: ICommandBindKey, exec: String | ICommandExecFunction, name: String): ICommand = {
    val __obj = js.Dynamic.literal(bindKey = bindKey.asInstanceOf[js.Any], exec = exec.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ICommand]
  }
  
  @scala.inline
  implicit class ICommandOps[Self <: ICommand] (val x: Self) extends AnyVal {
    
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
    def setBindKey(value: ICommandBindKey): Self = this.set("bindKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecFunction2(value: (/* editor */ Editor, /* args */ js.UndefOr[js.Any]) => js.Any): Self = this.set("exec", js.Any.fromFunction2(value))
    
    @scala.inline
    def setExec(value: String | ICommandExecFunction): Self = this.set("exec", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
  }
}
