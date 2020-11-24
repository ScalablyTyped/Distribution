package typings.reactNativeFirebase.mod.RNFirebase

import typings.reactNativeFirebase.anon.Email
import typings.reactNativeFirebase.reactNativeFirebaseStrings.EMAIL_SIGNIN
import typings.reactNativeFirebase.reactNativeFirebaseStrings.ERROR
import typings.reactNativeFirebase.reactNativeFirebaseStrings.PASSWORD_RESET
import typings.reactNativeFirebase.reactNativeFirebaseStrings.RECOVER_EMAIL
import typings.reactNativeFirebase.reactNativeFirebaseStrings.VERIFY_EMAIL
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ActionCodeInfo extends js.Object {
  
  var data: Email = js.native
  
  var operation: PASSWORD_RESET | VERIFY_EMAIL | RECOVER_EMAIL | EMAIL_SIGNIN | ERROR = js.native
}
object ActionCodeInfo {
  
  @scala.inline
  def apply(data: Email, operation: PASSWORD_RESET | VERIFY_EMAIL | RECOVER_EMAIL | EMAIL_SIGNIN | ERROR): ActionCodeInfo = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], operation = operation.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionCodeInfo]
  }
  
  @scala.inline
  implicit class ActionCodeInfoOps[Self <: ActionCodeInfo] (val x: Self) extends AnyVal {
    
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
    def setData(value: Email): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOperation(value: PASSWORD_RESET | VERIFY_EMAIL | RECOVER_EMAIL | EMAIL_SIGNIN | ERROR): Self = this.set("operation", value.asInstanceOf[js.Any])
  }
}
