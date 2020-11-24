package typings.storybookComponents.argsTableArgsTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArgsTableErrorProps extends ArgsTableProps {
  
  var error: ArgsTableError = js.native
}
object ArgsTableErrorProps {
  
  @scala.inline
  def apply(error: ArgsTableError): ArgsTableErrorProps = {
    val __obj = js.Dynamic.literal(error = error.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArgsTableErrorProps]
  }
  
  @scala.inline
  implicit class ArgsTableErrorPropsOps[Self <: ArgsTableErrorProps] (val x: Self) extends AnyVal {
    
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
    def setError(value: ArgsTableError): Self = this.set("error", value.asInstanceOf[js.Any])
  }
}
