package typings.realm.Realm.Auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Authentication provider where users identify using email and password.
  */
@js.native
trait EmailPasswordAuth extends js.Object {
  
  /**
    * Call the custom function to reset the password.
    *
    * @param email the email associated with the user.
    * @param password the new password.
    * @param args one or more arguments to pass to the function.
    */
  def callResetPasswordFunction(email: String, password: String, args: js.Any*): js.Promise[Unit] = js.native
  
  /**
    * Confirm a user by the token received.
    *
    * @param token the token received.
    * @param tokenId the id of the token received.
    */
  def confirmUser(token: String, tokenId: String): js.Promise[Unit] = js.native
  
  /**
    * Register a new user.
    *
    * @param email The new users email.
    * @param password the new users passsword.
    */
  def registerUser(email: String, password: String): js.Promise[Unit] = js.native
  
  /**
    * Resend the confirmation email.
    *
    * @param email the email associated to resend the confirmation to.
    */
  def resendConfirmationEmail(email: String): js.Promise[Unit] = js.native
  
  /**
    * Complete resetting the password
    *
    * @param token the token received.
    * @param tokenId the id of the token received.
    * @param password the new password.
    */
  def resetPassword(token: String, tokenId: String, password: String): js.Promise[Unit] = js.native
  
  /**
    * Send an email with tokens to reset the password.
    *
    * @param email the email to send the tokens to.
    */
  def sendResetPasswordEmail(email: String): js.Promise[Unit] = js.native
}
object EmailPasswordAuth {
  
  @scala.inline
  def apply(
    callResetPasswordFunction: (String, String, /* repeated */ js.Any) => js.Promise[Unit],
    confirmUser: (String, String) => js.Promise[Unit],
    registerUser: (String, String) => js.Promise[Unit],
    resendConfirmationEmail: String => js.Promise[Unit],
    resetPassword: (String, String, String) => js.Promise[Unit],
    sendResetPasswordEmail: String => js.Promise[Unit]
  ): EmailPasswordAuth = {
    val __obj = js.Dynamic.literal(callResetPasswordFunction = js.Any.fromFunction3(callResetPasswordFunction), confirmUser = js.Any.fromFunction2(confirmUser), registerUser = js.Any.fromFunction2(registerUser), resendConfirmationEmail = js.Any.fromFunction1(resendConfirmationEmail), resetPassword = js.Any.fromFunction3(resetPassword), sendResetPasswordEmail = js.Any.fromFunction1(sendResetPasswordEmail))
    __obj.asInstanceOf[EmailPasswordAuth]
  }
  
  @scala.inline
  implicit class EmailPasswordAuthOps[Self <: EmailPasswordAuth] (val x: Self) extends AnyVal {
    
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
    def setCallResetPasswordFunction(value: (String, String, /* repeated */ js.Any) => js.Promise[Unit]): Self = this.set("callResetPasswordFunction", js.Any.fromFunction3(value))
    
    @scala.inline
    def setConfirmUser(value: (String, String) => js.Promise[Unit]): Self = this.set("confirmUser", js.Any.fromFunction2(value))
    
    @scala.inline
    def setRegisterUser(value: (String, String) => js.Promise[Unit]): Self = this.set("registerUser", js.Any.fromFunction2(value))
    
    @scala.inline
    def setResendConfirmationEmail(value: String => js.Promise[Unit]): Self = this.set("resendConfirmationEmail", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResetPassword(value: (String, String, String) => js.Promise[Unit]): Self = this.set("resetPassword", js.Any.fromFunction3(value))
    
    @scala.inline
    def setSendResetPasswordEmail(value: String => js.Promise[Unit]): Self = this.set("sendResetPasswordEmail", js.Any.fromFunction1(value))
  }
}
