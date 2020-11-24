package typings.reactNativeFirebase.mod.RNFirebase

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ConfirmationResult extends js.Object {
  
  def confirm(verificationCode: String): js.Promise[User | Null] = js.native
  
  var verificationId: String | Null = js.native
}
object ConfirmationResult {
  
  @scala.inline
  def apply(confirm: String => js.Promise[User | Null]): ConfirmationResult = {
    val __obj = js.Dynamic.literal(confirm = js.Any.fromFunction1(confirm))
    __obj.asInstanceOf[ConfirmationResult]
  }
  
  @scala.inline
  implicit class ConfirmationResultOps[Self <: ConfirmationResult] (val x: Self) extends AnyVal {
    
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
    def setConfirm(value: String => js.Promise[User | Null]): Self = this.set("confirm", js.Any.fromFunction1(value))
    
    @scala.inline
    def setVerificationId(value: String): Self = this.set("verificationId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerificationIdNull: Self = this.set("verificationId", null)
  }
}
