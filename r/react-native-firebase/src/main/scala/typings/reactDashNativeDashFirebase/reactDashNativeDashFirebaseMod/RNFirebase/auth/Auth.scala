package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.auth

import org.scalablytyped.runtime.StringDictionary
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.App
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.AuthCredential
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.ActionCodeInfo
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.ActionCodeSettings
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.ConfirmationResult
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.PhoneAuthListener
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.User
import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase.UserCredential
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Auth
  extends /* key */ StringDictionary[js.Any] {
  val app: App = js.native
  /**
    * Returns the current Firebase authentication state.
    */
  var authResult: OrNull[AuthResult] = js.native
  /**
    * Returns the currently signed-in user (or null). See the User class documentation for further usage.
    */
  var currentUser: OrNull[User] = js.native
  /**
    * Gets/Sets the language for the app instance
    */
  var languageCode: OrNull[String] = js.native
  var settings: AuthSettings = js.native
  /**
    * Applies a verification code sent to the user by email or other out-of-band mechanism.
    */
  def applyActionCode(code: String): js.Promise[Unit] = js.native
  /**
    * Checks a verification code sent to the user by email or other out-of-band mechanism.
    */
  def checkActionCode(code: String): js.Promise[ActionCodeInfo] = js.native
  /**
    * Completes the password reset process, given a confirmation code and new password.
    */
  def confirmPasswordReset(code: String, newPassword: String): js.Promise[Unit] = js.native
  /**
    * @deprecated
    * @param email
    * @param password
    */
  def createUserAndRetrieveDataWithEmailAndPassword(email: String, password: String): js.Promise[UserCredential] = js.native
  /**
    * We can create a user by calling the createUserWithEmailAndPassword() function.
    * The method accepts two parameters, an email and a password.
    */
  def createUserWithEmailAndPassword(email: String, password: String): js.Promise[UserCredential] = js.native
  /**
    * Returns a list of authentication methods that can be used to sign in a given user (identified by its main email address).
    */
  def fetchSignInMethodsForEmail(email: String): js.Promise[js.Array[String]] = js.native
  def isSignInWithEmailLink(emailLink: String): Boolean = js.native
  /**
    * Listen for changes in the users auth state (logging in and out).
    * This method returns a unsubscribe function to stop listening to events.
    * Always ensure you unsubscribe from the listener when no longer needed to prevent updates to components no longer in use.
    */
  def onAuthStateChanged(listener: AuthListenerCallback): js.Function0[Unit] = js.native
  /**
    * Listen for changes in id token.
    * This method returns a unsubscribe function to stop listening to events.
    * Always ensure you unsubscribe from the listener when no longer needed to prevent updates to components no longer in use.
    */
  def onIdTokenChanged(listener: AuthListenerCallback): js.Function0[Unit] = js.native
  /**
    * Listen for changes in the user.
    * This method returns a unsubscribe function to stop listening to events.
    * Always ensure you unsubscribe from the listener when no longer needed to prevent updates to components no longer in use.
    */
  def onUserChanged(listener: AuthListenerCallback): js.Function0[Unit] = js.native
  /**
    * Sends a password reset email to the given email address.
    * Unlike the web SDK,
    * the email will contain a password reset link rather than a code.
    */
  def sendPasswordResetEmail(email: String): js.Promise[Unit] = js.native
  def sendPasswordResetEmail(email: String, actionCodeSettings: ActionCodeSettings): js.Promise[Unit] = js.native
  def sendSignInLinkToEmail(email: String): js.Promise[Unit] = js.native
  def sendSignInLinkToEmail(email: String, actionCodeSettings: ActionCodeSettings): js.Promise[Unit] = js.native
  /**
    * @deprecated
    * @param credential
    */
  def signInAndRetrieveDataWithCredential(credential: AuthCredential): js.Promise[UserCredential] = js.native
  /**
    * @deprecated
    * @param token
    */
  def signInAndRetrieveDataWithCustomToken(token: String): js.Promise[UserCredential] = js.native
  /**
    * @deprecated
    * @param email
    * @param password
    */
  def signInAndRetrieveDataWithEmailAndPassword(email: String, password: String): js.Promise[UserCredential] = js.native
  /**
    * Sign an anonymous user.
    * If the user has already signed in, that user will be returned
    */
  def signInAnonymously(): js.Promise[UserCredential] = js.native
  /**
    * @deprecated
    */
  def signInAnonymouslyAndRetrieveData(): js.Promise[UserCredential] = js.native
  /**
    * Sign in the user with a 3rd party credential provider.
    * credential requires the following properties:
    */
  def signInWithCredential(credential: AuthCredential): js.Promise[UserCredential] = js.native
  /**
    * Sign a user in with a self-signed JWT token.
    * To sign a user using a self-signed custom token,
    * use the signInWithCustomToken() function.
    * It accepts one parameter, the custom token:
    */
  def signInWithCustomToken(token: String): js.Promise[UserCredential] = js.native
  /**
    * To sign a user in with their email and password, use the signInWithEmailAndPassword() function.
    * It accepts two parameters, the user's email and password:
    */
  def signInWithEmailAndPassword(email: String, password: String): js.Promise[UserCredential] = js.native
  def signInWithEmailLink(email: String, emailLink: String): js.Promise[UserCredential] = js.native
  /**
    * Asynchronously signs in using a phone number.
    */
  def signInWithPhoneNumber(phoneNumber: String): js.Promise[ConfirmationResult] = js.native
  def signInWithPhoneNumber(phoneNumber: String, forceResend: Boolean): js.Promise[ConfirmationResult] = js.native
  def signOut(): js.Promise[Unit] = js.native
  def verifyPasswordResetCode(code: String): js.Promise[String] = js.native
  /**
    * Returns a PhoneAuthListener to listen to phone verification events,
    * on the final completion event a PhoneAuthCredential can be generated for
    * authentication purposes.
    */
  def verifyPhoneNumber(phoneNumber: String): PhoneAuthListener = js.native
  def verifyPhoneNumber(phoneNumber: String, autoVerifyTimeoutOrForceResend: Boolean): PhoneAuthListener = js.native
  def verifyPhoneNumber(phoneNumber: String, autoVerifyTimeoutOrForceResend: Boolean, forceResend: Boolean): PhoneAuthListener = js.native
  def verifyPhoneNumber(phoneNumber: String, autoVerifyTimeoutOrForceResend: Double): PhoneAuthListener = js.native
  def verifyPhoneNumber(phoneNumber: String, autoVerifyTimeoutOrForceResend: Double, forceResend: Boolean): PhoneAuthListener = js.native
}

