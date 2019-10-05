package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.auth

import typings.reactDashNativeDashFirebase.Anon_AUTOVERIFIED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AuthStatics extends js.Object {
  var EmailAuthProvider: typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.auth.EmailAuthProvider
  var FacebookAuthProvider: AuthProvider
  var GithubAuthProvider: AuthProvider
  var GoogleAuthProvider: AuthProvider
  var OAuthProvider: AuthProvider
  var PhoneAuthProvider: AuthProvider
  var PhoneAuthState: Anon_AUTOVERIFIED
  var TwitterAuthProvider: AuthProvider
}

object AuthStatics {
  @scala.inline
  def apply(
    EmailAuthProvider: EmailAuthProvider,
    FacebookAuthProvider: AuthProvider,
    GithubAuthProvider: AuthProvider,
    GoogleAuthProvider: AuthProvider,
    OAuthProvider: AuthProvider,
    PhoneAuthProvider: AuthProvider,
    PhoneAuthState: Anon_AUTOVERIFIED,
    TwitterAuthProvider: AuthProvider
  ): AuthStatics = {
    val __obj = js.Dynamic.literal(EmailAuthProvider = EmailAuthProvider, FacebookAuthProvider = FacebookAuthProvider, GithubAuthProvider = GithubAuthProvider, GoogleAuthProvider = GoogleAuthProvider, OAuthProvider = OAuthProvider, PhoneAuthProvider = PhoneAuthProvider, PhoneAuthState = PhoneAuthState, TwitterAuthProvider = TwitterAuthProvider)
  
    __obj.asInstanceOf[AuthStatics]
  }
}

