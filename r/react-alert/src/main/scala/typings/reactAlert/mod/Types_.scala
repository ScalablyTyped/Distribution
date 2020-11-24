package typings.reactAlert.mod

import typings.reactAlert.reactAlertStrings.error
import typings.reactAlert.reactAlertStrings.info
import typings.reactAlert.reactAlertStrings.success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Types_ extends js.Object {
  
  var ERROR: error = js.native
  
  var INFO: info = js.native
  
  var SUCCESS: success = js.native
}
object Types_ {
  
  @scala.inline
  def apply(ERROR: error, INFO: info, SUCCESS: success): Types_ = {
    val __obj = js.Dynamic.literal(ERROR = ERROR.asInstanceOf[js.Any], INFO = INFO.asInstanceOf[js.Any], SUCCESS = SUCCESS.asInstanceOf[js.Any])
    __obj.asInstanceOf[Types_]
  }
  
  @scala.inline
  implicit class Types_Ops[Self <: Types_] (val x: Self) extends AnyVal {
    
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
    def setERROR(value: error): Self = this.set("ERROR", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setINFO(value: info): Self = this.set("INFO", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSUCCESS(value: success): Self = this.set("SUCCESS", value.asInstanceOf[js.Any])
  }
}
