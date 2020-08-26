package typings.reactNativeFirebase.mod.RNFirebase.auth

import typings.reactNativeFirebase.anon.AUTOVERIFIED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthStatics extends js.Object {
  var AppleAuthProvider: AuthProvider = js.native
  var EmailAuthProvider: typings.reactNativeFirebase.mod.RNFirebase.auth.EmailAuthProvider = js.native
  var FacebookAuthProvider: AuthProvider = js.native
  var GithubAuthProvider: AuthProvider = js.native
  var GoogleAuthProvider: AuthProvider = js.native
  var OAuthProvider: AuthProvider = js.native
  var PhoneAuthProvider: AuthProvider = js.native
  var PhoneAuthState: AUTOVERIFIED = js.native
  var TwitterAuthProvider: AuthProvider = js.native
}

object AuthStatics {
  @scala.inline
  def apply(
    AppleAuthProvider: AuthProvider,
    EmailAuthProvider: EmailAuthProvider,
    FacebookAuthProvider: AuthProvider,
    GithubAuthProvider: AuthProvider,
    GoogleAuthProvider: AuthProvider,
    OAuthProvider: AuthProvider,
    PhoneAuthProvider: AuthProvider,
    PhoneAuthState: AUTOVERIFIED,
    TwitterAuthProvider: AuthProvider
  ): AuthStatics = {
    val __obj = js.Dynamic.literal(AppleAuthProvider = AppleAuthProvider.asInstanceOf[js.Any], EmailAuthProvider = EmailAuthProvider.asInstanceOf[js.Any], FacebookAuthProvider = FacebookAuthProvider.asInstanceOf[js.Any], GithubAuthProvider = GithubAuthProvider.asInstanceOf[js.Any], GoogleAuthProvider = GoogleAuthProvider.asInstanceOf[js.Any], OAuthProvider = OAuthProvider.asInstanceOf[js.Any], PhoneAuthProvider = PhoneAuthProvider.asInstanceOf[js.Any], PhoneAuthState = PhoneAuthState.asInstanceOf[js.Any], TwitterAuthProvider = TwitterAuthProvider.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthStatics]
  }
  @scala.inline
  implicit class AuthStaticsOps[Self <: AuthStatics] (val x: Self) extends AnyVal {
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
    def setAppleAuthProvider(value: AuthProvider): Self = this.set("AppleAuthProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmailAuthProvider(value: EmailAuthProvider): Self = this.set("EmailAuthProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def setFacebookAuthProvider(value: AuthProvider): Self = this.set("FacebookAuthProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def setGithubAuthProvider(value: AuthProvider): Self = this.set("GithubAuthProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def setGoogleAuthProvider(value: AuthProvider): Self = this.set("GoogleAuthProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def setOAuthProvider(value: AuthProvider): Self = this.set("OAuthProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhoneAuthProvider(value: AuthProvider): Self = this.set("PhoneAuthProvider", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhoneAuthState(value: AUTOVERIFIED): Self = this.set("PhoneAuthState", value.asInstanceOf[js.Any])
    @scala.inline
    def setTwitterAuthProvider(value: AuthProvider): Self = this.set("TwitterAuthProvider", value.asInstanceOf[js.Any])
  }
  
}

