package typings.reactBootstrapTable.mod

import typings.reactBootstrapTable.anon.Msg
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EditValidatorObject extends js.Object {
  
  /**
    * Boolean flag indicating whether the cell value is valid.
    */
  var isValid: Boolean = js.native
  
  /**
    * Notification object providing details on the validation result.
    */
  var notification: Msg = js.native
}
object EditValidatorObject {
  
  @scala.inline
  def apply(isValid: Boolean, notification: Msg): EditValidatorObject = {
    val __obj = js.Dynamic.literal(isValid = isValid.asInstanceOf[js.Any], notification = notification.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditValidatorObject]
  }
  
  @scala.inline
  implicit class EditValidatorObjectOps[Self <: EditValidatorObject] (val x: Self) extends AnyVal {
    
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
    def setIsValid(value: Boolean): Self = this.set("isValid", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotification(value: Msg): Self = this.set("notification", value.asInstanceOf[js.Any])
  }
}
