package typings.reactNativeFirebase.mod.RNFirebase

import org.scalablytyped.runtime.StringDictionary
import typings.reactNativeFirebase.anon.AUTOVERIFIED
import typings.reactNativeFirebase.anon.Authenticated
import typings.reactNativeFirebase.mod.App
import typings.reactNativeFirebase.mod.AuthCredential
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object auth {
  
  @js.native
  trait Auth
    extends StObject
       with /* key */ StringDictionary[js.Any] {
    
    val app: App = js.native
    
    /**
      * Applies a verification code sent to the user by email or other out-of-band mechanism.
      */
    def applyActionCode(code: String): js.Promise[Unit] = js.native
    
    /**
      * Returns the current Firebase authentication state.
      */
    var authResult: OrNull[AuthResult] = js.native
    
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
      * Returns the currently signed-in user (or null). See the User class documentation for further usage.
      */
    var currentUser: OrNull[User] = js.native
    
    /**
      * Returns a list of authentication methods that can be used to sign in a given user (identified by its main email address).
      */
    def fetchSignInMethodsForEmail(email: String): js.Promise[js.Array[String]] = js.native
    
    def isSignInWithEmailLink(emailLink: String): Boolean = js.native
    
    /**
      * Gets/Sets the language for the app instance
      */
    var languageCode: OrNull[String] = js.native
    
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
    
    var settings: AuthSettings = js.native
    
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
    def verifyPhoneNumber(phoneNumber: String, autoVerifyTimeoutOrForceResend: Unit, forceResend: Boolean): PhoneAuthListener = js.native
  }
  
  type AuthListenerCallback = js.Function1[/* user */ OrNull[User], Unit]
  
  @js.native
  trait AuthProvider extends StObject {
    
    var PROVIDER_ID: String = js.native
    
    def credential(): AuthCredential = js.native
    def credential(token: String): AuthCredential = js.native
    def credential(token: String, secret: String): AuthCredential = js.native
    def credential(token: Null, secret: String): AuthCredential = js.native
  }
  
  type AuthResult = Authenticated | Null
  
  trait AuthSettings extends StObject {
    
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
    
    inline def apply(
      appVerificationDisabledForTesting: Boolean,
      setAutoRetrievedSmsCodeForPhoneNumber: (String, String) => js.Promise[Null]
    ): AuthSettings = {
      val __obj = js.Dynamic.literal(appVerificationDisabledForTesting = appVerificationDisabledForTesting.asInstanceOf[js.Any], setAutoRetrievedSmsCodeForPhoneNumber = js.Any.fromFunction2(setAutoRetrievedSmsCodeForPhoneNumber))
      __obj.asInstanceOf[AuthSettings]
    }
    
    extension [Self <: AuthSettings](x: Self) {
      
      inline def setAppVerificationDisabledForTesting(value: Boolean): Self = StObject.set(x, "appVerificationDisabledForTesting", value.asInstanceOf[js.Any])
      
      inline def setSetAutoRetrievedSmsCodeForPhoneNumber(value: (String, String) => js.Promise[Null]): Self = StObject.set(x, "setAutoRetrievedSmsCodeForPhoneNumber", js.Any.fromFunction2(value))
    }
  }
  
  trait AuthStatics extends StObject {
    
    var AppleAuthProvider: AuthProvider
    
    var EmailAuthProvider: typings.reactNativeFirebase.mod.RNFirebase.auth.EmailAuthProvider
    
    var FacebookAuthProvider: AuthProvider
    
    var GithubAuthProvider: AuthProvider
    
    var GoogleAuthProvider: AuthProvider
    
    var OAuthProvider: AuthProvider
    
    var PhoneAuthProvider: AuthProvider
    
    var PhoneAuthState: AUTOVERIFIED
    
    var TwitterAuthProvider: AuthProvider
  }
  object AuthStatics {
    
    inline def apply(
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
    
    extension [Self <: AuthStatics](x: Self) {
      
      inline def setAppleAuthProvider(value: AuthProvider): Self = StObject.set(x, "AppleAuthProvider", value.asInstanceOf[js.Any])
      
      inline def setEmailAuthProvider(value: EmailAuthProvider): Self = StObject.set(x, "EmailAuthProvider", value.asInstanceOf[js.Any])
      
      inline def setFacebookAuthProvider(value: AuthProvider): Self = StObject.set(x, "FacebookAuthProvider", value.asInstanceOf[js.Any])
      
      inline def setGithubAuthProvider(value: AuthProvider): Self = StObject.set(x, "GithubAuthProvider", value.asInstanceOf[js.Any])
      
      inline def setGoogleAuthProvider(value: AuthProvider): Self = StObject.set(x, "GoogleAuthProvider", value.asInstanceOf[js.Any])
      
      inline def setOAuthProvider(value: AuthProvider): Self = StObject.set(x, "OAuthProvider", value.asInstanceOf[js.Any])
      
      inline def setPhoneAuthProvider(value: AuthProvider): Self = StObject.set(x, "PhoneAuthProvider", value.asInstanceOf[js.Any])
      
      inline def setPhoneAuthState(value: AUTOVERIFIED): Self = StObject.set(x, "PhoneAuthState", value.asInstanceOf[js.Any])
      
      inline def setTwitterAuthProvider(value: AuthProvider): Self = StObject.set(x, "TwitterAuthProvider", value.asInstanceOf[js.Any])
    }
  }
  
  trait EmailAuthProvider extends StObject {
    
    var EMAIL_LINK_SIGN_IN_METHOD: String
    
    var EMAIL_PASSWORD_SIGN_IN_METHOD: String
    
    var PROVIDER_ID: String
    
    def credential(email: String, password: String): AuthCredential
    
    def credentialWithLink(email: String, emailLink: String): AuthCredential
  }
  object EmailAuthProvider {
    
    inline def apply(
      EMAIL_LINK_SIGN_IN_METHOD: String,
      EMAIL_PASSWORD_SIGN_IN_METHOD: String,
      PROVIDER_ID: String,
      credential: (String, String) => AuthCredential,
      credentialWithLink: (String, String) => AuthCredential
    ): EmailAuthProvider = {
      val __obj = js.Dynamic.literal(EMAIL_LINK_SIGN_IN_METHOD = EMAIL_LINK_SIGN_IN_METHOD.asInstanceOf[js.Any], EMAIL_PASSWORD_SIGN_IN_METHOD = EMAIL_PASSWORD_SIGN_IN_METHOD.asInstanceOf[js.Any], PROVIDER_ID = PROVIDER_ID.asInstanceOf[js.Any], credential = js.Any.fromFunction2(credential), credentialWithLink = js.Any.fromFunction2(credentialWithLink))
      __obj.asInstanceOf[EmailAuthProvider]
    }
    
    extension [Self <: EmailAuthProvider](x: Self) {
      
      inline def setCredential(value: (String, String) => AuthCredential): Self = StObject.set(x, "credential", js.Any.fromFunction2(value))
      
      inline def setCredentialWithLink(value: (String, String) => AuthCredential): Self = StObject.set(x, "credentialWithLink", js.Any.fromFunction2(value))
      
      inline def setEMAIL_LINK_SIGN_IN_METHOD(value: String): Self = StObject.set(x, "EMAIL_LINK_SIGN_IN_METHOD", value.asInstanceOf[js.Any])
      
      inline def setEMAIL_PASSWORD_SIGN_IN_METHOD(value: String): Self = StObject.set(x, "EMAIL_PASSWORD_SIGN_IN_METHOD", value.asInstanceOf[js.Any])
      
      inline def setPROVIDER_ID(value: String): Self = StObject.set(x, "PROVIDER_ID", value.asInstanceOf[js.Any])
    }
  }
  
  type OrNull[T] = T | Null
}
