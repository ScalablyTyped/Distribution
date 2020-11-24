package typings.reactNativeFirebase.mod.RNFirebase.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuthSettings extends js.Object {
  
  /**
    * Flag to determine whether app verification should be disabled for testing or not.
    *
    * @platform iOS
    * @param disabled
    */
  var appVerificationDisabledForTesting: Boolean = js.native
  
  /**
    * The phone number and SMS code here must have been configured in the
    * Firebase Console (Authentication > Sign In Method > Phone).
    *
    * Calling this method a second time will overwrite the previously passed parameters.
    * Only one number can be configured at a given time.
    *
    * @platform Android
    * @param phoneNumber
    * @param smsCode
    * @return {*}
    */
  def setAutoRetrievedSmsCodeForPhoneNumber(phoneNumber: String, smsCode: String): js.Promise[Null] = js.native
}
object AuthSettings {
  
  @scala.inline
  def apply(
    appVerificationDisabledForTesting: Boolean,
    setAutoRetrievedSmsCodeForPhoneNumber: (String, String) => js.Promise[Null]
  ): AuthSettings = {
    val __obj = js.Dynamic.literal(appVerificationDisabledForTesting = appVerificationDisabledForTesting.asInstanceOf[js.Any], setAutoRetrievedSmsCodeForPhoneNumber = js.Any.fromFunction2(setAutoRetrievedSmsCodeForPhoneNumber))
    __obj.asInstanceOf[AuthSettings]
  }
  
  @scala.inline
  implicit class AuthSettingsOps[Self <: AuthSettings] (val x: Self) extends AnyVal {
    
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
    def setAppVerificationDisabledForTesting(value: Boolean): Self = this.set("appVerificationDisabledForTesting", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetAutoRetrievedSmsCodeForPhoneNumber(value: (String, String) => js.Promise[Null]): Self = this.set("setAutoRetrievedSmsCodeForPhoneNumber", js.Any.fromFunction2(value))
  }
}
