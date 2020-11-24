package typings.soap.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISoapFaultError extends js.Object {
  
  var Fault: ISoapFault = js.native
}
object ISoapFaultError {
  
  @scala.inline
  def apply(Fault: ISoapFault): ISoapFaultError = {
    val __obj = js.Dynamic.literal(Fault = Fault.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISoapFaultError]
  }
  
  @scala.inline
  implicit class ISoapFaultErrorOps[Self <: ISoapFaultError] (val x: Self) extends AnyVal {
    
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
    def setFault(value: ISoapFault): Self = this.set("Fault", value.asInstanceOf[js.Any])
  }
}
