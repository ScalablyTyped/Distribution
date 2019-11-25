package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.auth

import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.AuthCredential
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EmailAuthProvider extends js.Object {
  var EMAIL_LINK_SIGN_IN_METHOD: String
  var EMAIL_PASSWORD_SIGN_IN_METHOD: String
  var PROVIDER_ID: String
  def credential(email: String, password: String): AuthCredential
  def credentialWithLink(email: String, emailLink: String): AuthCredential
}

object EmailAuthProvider {
  @scala.inline
  def apply(
    EMAIL_LINK_SIGN_IN_METHOD: String,
    EMAIL_PASSWORD_SIGN_IN_METHOD: String,
    PROVIDER_ID: String,
    credential: (String, String) => AuthCredential,
    credentialWithLink: (String, String) => AuthCredential
  ): EmailAuthProvider = {
    val __obj = js.Dynamic.literal(EMAIL_LINK_SIGN_IN_METHOD = EMAIL_LINK_SIGN_IN_METHOD.asInstanceOf[js.Any], EMAIL_PASSWORD_SIGN_IN_METHOD = EMAIL_PASSWORD_SIGN_IN_METHOD.asInstanceOf[js.Any], PROVIDER_ID = PROVIDER_ID.asInstanceOf[js.Any], credential = js.Any.fromFunction2(credential), credentialWithLink = js.Any.fromFunction2(credentialWithLink))
  
    __obj.asInstanceOf[EmailAuthProvider]
  }
}

