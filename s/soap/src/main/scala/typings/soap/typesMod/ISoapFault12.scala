package typings.soap.typesMod

import typings.soap.anon.Subcode
import typings.soap.anon.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISoapFault12 extends ISoapFault {
  
  var Code: Subcode = js.native
  
  var Reason: Text = js.native
  
  var statusCode: js.UndefOr[Double] = js.native
}
object ISoapFault12 {
  
  @scala.inline
  def apply(Code: Subcode, Reason: Text): ISoapFault12 = {
    val __obj = js.Dynamic.literal(Code = Code.asInstanceOf[js.Any], Reason = Reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISoapFault12]
  }
  
  @scala.inline
  implicit class ISoapFault12Ops[Self <: ISoapFault12] (val x: Self) extends AnyVal {
    
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
    def setCode(value: Subcode): Self = this.set("Code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReason(value: Text): Self = this.set("Reason", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusCode: Self = this.set("statusCode", js.undefined)
  }
}
