package typings.reactNativeFirebase.mod.RNFirebase.auth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthSettings extends js.Object {
  /**
    * Flag to determine whether app verification should be disabled for testing or not.
    *
    * @platform iOS
    * @param disabled
    */
  var appVerificationDisabledForTesting: Boolean
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
  def setAutoRetrievedSmsCodeForPhoneNumber(phoneNumber: String, smsCode: String): js.Promise[Null]
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
}

