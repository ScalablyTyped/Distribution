package typings.soap.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISoapFault11 extends ISoapFault {
  
  var detail: js.UndefOr[String] = js.native
  
  var faultcode: Double | String = js.native
  
  var faultstring: String = js.native
  
  var statusCode: js.UndefOr[Double] = js.native
}
object ISoapFault11 {
  
  @scala.inline
  def apply(faultcode: Double | String, faultstring: String): ISoapFault11 = {
    val __obj = js.Dynamic.literal(faultcode = faultcode.asInstanceOf[js.Any], faultstring = faultstring.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISoapFault11]
  }
  
  @scala.inline
  implicit class ISoapFault11Ops[Self <: ISoapFault11] (val x: Self) extends AnyVal {
    
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
    def setFaultcode(value: Double | String): Self = this.set("faultcode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFaultstring(value: String): Self = this.set("faultstring", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDetail(value: String): Self = this.set("detail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDetail: Self = this.set("detail", js.undefined)
    
    @scala.inline
    def setStatusCode(value: Double): Self = this.set("statusCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusCode: Self = this.set("statusCode", js.undefined)
  }
}
