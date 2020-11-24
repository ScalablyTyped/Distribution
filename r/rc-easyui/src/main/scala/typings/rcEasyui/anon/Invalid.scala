package typings.rcEasyui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Invalid extends js.Object {
  
  var invalid: Boolean = js.native
  
  var validateOnBlur: Boolean = js.native
  
  var validateOnChange: Boolean = js.native
  
  var validateOnCreate: Boolean = js.native
}
object Invalid {
  
  @scala.inline
  def apply(invalid: Boolean, validateOnBlur: Boolean, validateOnChange: Boolean, validateOnCreate: Boolean): Invalid = {
    val __obj = js.Dynamic.literal(invalid = invalid.asInstanceOf[js.Any], validateOnBlur = validateOnBlur.asInstanceOf[js.Any], validateOnChange = validateOnChange.asInstanceOf[js.Any], validateOnCreate = validateOnCreate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Invalid]
  }
  
  @scala.inline
  implicit class InvalidOps[Self <: Invalid] (val x: Self) extends AnyVal {
    
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
    def setInvalid(value: Boolean): Self = this.set("invalid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateOnBlur(value: Boolean): Self = this.set("validateOnBlur", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateOnChange(value: Boolean): Self = this.set("validateOnChange", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValidateOnCreate(value: Boolean): Self = this.set("validateOnCreate", value.asInstanceOf[js.Any])
  }
}
