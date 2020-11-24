package typings.storybookComponents.argControlMod

import typings.storybookComponents.typesMod.ArgType
import typings.storybookComponents.typesMod.Args
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArgControlProps extends js.Object {
  
  var arg: js.Any = js.native
  
  var row: ArgType = js.native
  
  def updateArgs(args: Args): Unit = js.native
}
object ArgControlProps {
  
  @scala.inline
  def apply(arg: js.Any, row: ArgType, updateArgs: Args => Unit): ArgControlProps = {
    val __obj = js.Dynamic.literal(arg = arg.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], updateArgs = js.Any.fromFunction1(updateArgs))
    __obj.asInstanceOf[ArgControlProps]
  }
  
  @scala.inline
  implicit class ArgControlPropsOps[Self <: ArgControlProps] (val x: Self) extends AnyVal {
    
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
    def setArg(value: js.Any): Self = this.set("arg", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRow(value: ArgType): Self = this.set("row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUpdateArgs(value: Args => Unit): Self = this.set("updateArgs", js.Any.fromFunction1(value))
  }
}
