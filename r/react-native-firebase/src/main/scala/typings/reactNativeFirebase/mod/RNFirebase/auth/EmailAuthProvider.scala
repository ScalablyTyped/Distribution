package typings.reactNativeFirebase.mod.RNFirebase.auth

import typings.reactNativeFirebase.mod.AuthCredential
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EmailAuthProvider extends js.Object {
  var EMAIL_LINK_SIGN_IN_METHOD: String = js.native
  var EMAIL_PASSWORD_SIGN_IN_METHOD: String = js.native
  var PROVIDER_ID: String = js.native
  def credential(email: String, password: String): AuthCredential = js.native
  def credentialWithLink(email: String, emailLink: String): AuthCredential = js.native
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
  @scala.inline
  implicit class EmailAuthProviderOps[Self <: EmailAuthProvider] (val x: Self) extends AnyVal {
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
    def setEMAIL_LINK_SIGN_IN_METHOD(value: String): Self = this.set("EMAIL_LINK_SIGN_IN_METHOD", value.asInstanceOf[js.Any])
    @scala.inline
    def setEMAIL_PASSWORD_SIGN_IN_METHOD(value: String): Self = this.set("EMAIL_PASSWORD_SIGN_IN_METHOD", value.asInstanceOf[js.Any])
    @scala.inline
    def setPROVIDER_ID(value: String): Self = this.set("PROVIDER_ID", value.asInstanceOf[js.Any])
    @scala.inline
    def setCredential(value: (String, String) => AuthCredential): Self = this.set("credential", js.Any.fromFunction2(value))
    @scala.inline
    def setCredentialWithLink(value: (String, String) => AuthCredential): Self = this.set("credentialWithLink", js.Any.fromFunction2(value))
  }
  
}

