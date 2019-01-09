package typings
package reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-firebase", "RNFirebase")
@js.native
object RNFirebaseNs extends js.Object {
  trait ActionCodeInfo extends js.Object {
    var data: reactDashNativeDashFirebaseLib.Anon_Email
    var operation: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.PASSWORD_RESET | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.VERIFY_EMAIL | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.RECOVER_EMAIL | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.EMAIL_SIGNIN | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.ERROR
  }
  
  trait ActionCodeSettings extends js.Object {
    var android: reactDashNativeDashFirebaseLib.Anon_InstallApp
    var handleCodeInApp: js.UndefOr[scala.Boolean] = js.undefined
    var iOS: reactDashNativeDashFirebaseLib.Anon_BundleId
    var url: java.lang.String
  }
  
  trait AdditionalUserInfo extends js.Object {
    var isNewUser: scala.Boolean
    var profile: js.UndefOr[js.Object] = js.undefined
    var providerId: java.lang.String
    var username: js.UndefOr[java.lang.String] = js.undefined
  }
  
  /**
    * firebase Analytics
    */
  @js.native
  trait Analytics
    extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
    /**Log a custom event with optional params. */
    def logEvent(event: java.lang.String): scala.Unit = js.native
    def logEvent(event: java.lang.String, params: js.Object): scala.Unit = js.native
    /** Sets whether analytics collection is enabled for this app on this device. */
    def setAnalyticsCollectionEnabled(enabled: scala.Boolean): scala.Unit = js.native
    def setCurrentScreen(): scala.Unit = js.native
    /**
      * Sets the current screen name, which specifies the current visual context in your app.
      * Whilst screenClassOverride is optional,
      * it is recommended it is always sent as your current class name,
      * for example on Android it will always show as 'MainActivity' if not specified.
      */
    def setCurrentScreen(screenName: java.lang.String): scala.Unit = js.native
    def setCurrentScreen(screenName: java.lang.String, screenClassOverride: java.lang.String): scala.Unit = js.native
    def setCurrentScreen(screenName: scala.Null, screenClassOverride: java.lang.String): scala.Unit = js.native
    /**
      * Sets the minimum engagement time required before starting a session.
      * The default value is 10000 (10 seconds)
      */
    def setMinimumSessionDuration(milliseconds: scala.Double): scala.Unit = js.native
    /**
      * Sets the duration of inactivity that terminates the current session.
      * The default value is 1800000 (30 minutes).
      */
    def setSessionTimeoutDuration(milliseconds: scala.Double): scala.Unit = js.native
    def setUserId(): scala.Unit = js.native
    /**
      * Gives a user a unique identification.
      * @example
      * const id = firebase.auth().currentUser.uid;
      *
      * firebase.analytics().setUserId(id);
      */
    def setUserId(id: java.lang.String): scala.Unit = js.native
    /**
      * Sets multiple user properties to the supplied values.
      */
    def setUserProperties(fieldMapping: org.scalablytyped.runtime.StringDictionary[java.lang.String | scala.Null]): scala.Unit = js.native
    def setUserProperty(name: java.lang.String): scala.Unit = js.native
    /**
      * Sets a key/value pair of data on the current user.
      */
    def setUserProperty(name: java.lang.String, value: java.lang.String): scala.Unit = js.native
  }
  
  trait ConfirmationResult extends js.Object {
    var verificationId: java.lang.String | scala.Null
    def confirm(verificationCode: java.lang.String): js.Promise[User | scala.Null]
  }
  
  trait GoogleApiAvailabilityType extends js.Object {
    var error: js.UndefOr[java.lang.String] = js.undefined
    var isAvailable: scala.Boolean
    var isUserResolvableError: js.UndefOr[scala.Boolean] = js.undefined
    var status: scala.Double
  }
  
  trait IdTokenResult extends js.Object {
    var authTime: java.lang.String
    var claims: org.scalablytyped.runtime.StringDictionary[js.Any]
    var expirationTime: java.lang.String
    var issuedAtTime: java.lang.String
    var signInProvider: scala.Null | java.lang.String
    var token: java.lang.String
  }
  
  trait PhoneAuthError extends js.Object {
    var code: java.lang.String | scala.Null
    var message: java.lang.String | scala.Null
    var stack: java.lang.String | scala.Null
    var verificationId: java.lang.String
  }
  
  @js.native
  trait PhoneAuthListener extends js.Object {
    def `catch`(fn: js.Function1[/* error */ stdLib.Error, scala.Unit]): js.Promise[_] = js.native
    def on(event: java.lang.String, observer: js.Function1[/* snapshot */ PhoneAuthSnapshot, scala.Unit]): PhoneAuthListener = js.native
    def on(
      event: java.lang.String,
      observer: js.Function1[/* snapshot */ PhoneAuthSnapshot, scala.Unit],
      errorCb: js.Function1[/* error */ PhoneAuthError, scala.Unit]
    ): PhoneAuthListener = js.native
    def on(
      event: java.lang.String,
      observer: js.Function1[/* snapshot */ PhoneAuthSnapshot, scala.Unit],
      errorCb: js.Function1[/* error */ PhoneAuthError, scala.Unit],
      successCb: js.Function1[/* snapshot */ PhoneAuthSnapshot, scala.Unit]
    ): PhoneAuthListener = js.native
    def `then`(fn: js.Function1[/* snapshot */ PhoneAuthSnapshot, scala.Unit]): js.Promise[_] = js.native
  }
  
  trait PhoneAuthSnapshot extends js.Object {
    var code: java.lang.String | scala.Null
    var error: stdLib.Error | scala.Null
    var state: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.sent | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.timeout | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.verified | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.error
    var verificationId: java.lang.String
  }
  
  trait RnError
    extends stdLib.Error {
    var code: js.UndefOr[java.lang.String] = js.undefined
  }
  
  trait UpdateProfile extends js.Object {
    var displayName: js.UndefOr[java.lang.String] = js.undefined
    var photoURL: js.UndefOr[java.lang.String] = js.undefined
  }
  
  @js.native
  trait User extends js.Object {
    /**
      * The user's display name (if available).
      */
    var displayName: java.lang.String | scala.Null = js.native
    /**
      * - The user's email address (if available).
      */
    var email: java.lang.String | scala.Null = js.native
    /**
      * - True if the user's email address has been verified.
      */
    var emailVerified: scala.Boolean = js.native
    /**
      *
      */
    var isAnonymous: scala.Boolean = js.native
    var metadata: UserMetadata = js.native
    var phoneNumber: java.lang.String | scala.Null = js.native
    /**
      * - The URL of the user's profile picture (if available).
      */
    var photoURL: java.lang.String | scala.Null = js.native
    /**
      * - Additional provider-specific information about the user.
      */
    var providerData: js.Array[UserInfo] = js.native
    /**
      *  - The authentication provider ID for the current user.
      *  For example, 'facebook.com', or 'google.com'.
      */
    var providerId: java.lang.String = js.native
    /**
      *  - The user's unique ID.
      */
    var uid: java.lang.String = js.native
    /**
      * Delete the current user.
      */
    def delete(): js.Promise[scala.Unit] = js.native
    /**
      * Returns the users authentication token.
      *
      * @param forceRefresh: boolean - default to false
      */
    def getIdToken(): js.Promise[java.lang.String] = js.native
    def getIdToken(forceRefresh: scala.Boolean): js.Promise[java.lang.String] = js.native
    /**
      * Returns a firebase.auth.IdTokenResult object which contains the ID token JWT string and
      * other helper properties for getting different data associated with the token as well as
      * all the decoded payload claims.
      *
      * @param forceRefresh boolean Force refresh regardless of token expiration.
      */
    def getIdTokenResult(): js.Promise[IdTokenResult] = js.native
    def getIdTokenResult(forceRefresh: scala.Boolean): js.Promise[IdTokenResult] = js.native
    /**
      * @deprecated
      * @param credential
      */
    def linkAndRetrieveDataWithCredential(credential: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.AuthCredential): js.Promise[UserCredential] = js.native
    /**
      * Link the user with a 3rd party credential provider.
      */
    def linkWithCredential(credential: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.AuthCredential): js.Promise[UserCredential] = js.native
    /**
      * @deprecated
      * @param credential
      */
    def reauthenticateAndRetrieveDataWithCredential(credential: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.AuthCredential): js.Promise[UserCredential] = js.native
    /**
      * Re-authenticate a user with a third-party authentication provider
      */
    def reauthenticateWithCredential(credential: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.AuthCredential): js.Promise[UserCredential] = js.native
    /**
      * Refreshes the current user.
      */
    def reload(): js.Promise[scala.Unit] = js.native
    /**
      * Sends a verification email to a user.
      * This will Promise reject is the user is anonymous.
      */
    def sendEmailVerification(): js.Promise[scala.Unit] = js.native
    def sendEmailVerification(actionCodeSettings: ActionCodeSettings): js.Promise[scala.Unit] = js.native
    def toJSON(): js.Object = js.native
    def unlink(providerId: java.lang.String): js.Promise[User] = js.native
    /**
      * Updates the user's email address.
      * See Firebase docs for more information on security & email validation.
      * This will Promise reject is the user is anonymous.
      */
    def updateEmail(email: java.lang.String): js.Promise[scala.Unit] = js.native
    /**
      * Important: this is a security sensitive operation that requires the user to have recently signed in.
      * If this requirement isn't met, ask the user to authenticate again and then call firebase.User#reauthenticate.
      * This will Promise reject is the user is anonymous.
      */
    def updatePassword(password: java.lang.String): js.Promise[scala.Unit] = js.native
    /**
      * Updates the user's phone number.
      * See Firebase docs for more information on security & email validation.
      * This will Promise reject is the user is anonymous.
      */
    def updatePhoneNumber(credential: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.AuthCredential): js.Promise[scala.Unit] = js.native
    /**
      * Updates a user's profile data.
      * Profile data should be an object of fields to update:
      */
    def updateProfile(updates: UpdateProfile): js.Promise[scala.Unit] = js.native
  }
  
  trait UserCredential extends js.Object {
    var additionalUserInfo: js.UndefOr[AdditionalUserInfo] = js.undefined
    var user: User
  }
  
  trait UserInfo extends js.Object {
    var displayName: js.UndefOr[java.lang.String] = js.undefined
    var email: js.UndefOr[java.lang.String] = js.undefined
    var phoneNumber: js.UndefOr[java.lang.String] = js.undefined
    var photoURL: js.UndefOr[java.lang.String] = js.undefined
    var providerId: java.lang.String
    var uid: java.lang.String
  }
  
  trait UserMetadata extends js.Object {
    var creationTime: js.UndefOr[java.lang.String] = js.undefined
    var lastSignInTime: js.UndefOr[java.lang.String] = js.undefined
  }
  
  /**
    * pass custom options by passing an object with configuration options.
    * The configuration object will be generated first by the native configuration object, if set and then will be overridden if passed in JS.
    * That is, all of the following key/value pairs are optional if the native configuration is set.
    */
  trait configurationOptions extends js.Object {
    /**
      * default ""
      * The secret iOS API key used for authenticating requests from our app
      */
    var APIKey: js.UndefOr[java.lang.String] = js.undefined
    /**
      * default  ""
      * The Project number from the Google Developer's console used to configure Google Cloud Messaging
      */
    var GCMSenderID: js.UndefOr[java.lang.String] = js.undefined
    /**
      * default ""
      * The Android client ID used in Google AppInvite when an iOS app has it's android version
      */
    var androidClientID: js.UndefOr[java.lang.String] = js.undefined
    /**
      * Default from app [NSBundle mainBundle]  The bundle ID for the app to be bundled with
      */
    var bundleID: js.UndefOr[java.lang.String] = js.undefined
    /**
      * default ""
      * The OAuth2 client ID for iOS application used to authenticate Google Users for signing in with Google
      */
    var clientID: js.UndefOr[java.lang.String] = js.undefined
    /**
      * default ""
      * The database root (i.e. https://my-app.firebaseio.com)
      */
    var databaseURL: js.UndefOr[java.lang.String] = js.undefined
    /**
      *  default false
      *  When set to true, RNFirebase will log messages to the console and fire debug events we can listen to in js
      * @usage
      * firebase.on('debug', msg => console.log('Received debug message', msg))
      */
    var debug: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * default ""
      * URL scheme to set up durable deep link service
      */
    var deepLinkURLScheme: js.UndefOr[java.lang.String] = js.undefined
    /**
      * default ""
      * The Google App ID that is used to uniquely identify an instance of an app.
      */
    var googleAppID: js.UndefOr[java.lang.String] = js.undefined
    /**
      * default false
      * When set to true, database persistence will be enabled.
      */
    var persistence: js.UndefOr[scala.Boolean] = js.undefined
    /**
      * default ""
      * The Google Cloud storage bucket name
      */
    var storageBucket: js.UndefOr[java.lang.String] = js.undefined
    /**
      * default ""
      * The tracking ID for Google Analytics
      */
    var trackingID: js.UndefOr[java.lang.String] = js.undefined
  }
  
  @JSName("auth")
  @js.native
  object authNs extends js.Object {
    @js.native
    trait Auth
      extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
      val app: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.App = js.native
      /**
        * Returns the current Firebase authentication state.
        */
      var authResult: OrNull[AuthResult] = js.native
      /**
        * Returns the currently signed-in user (or null). See the User class documentation for further usage.
        */
      var currentUser: OrNull[reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.User] = js.native
      /**
        * Gets/Sets the language for the app instance
        */
      var languageCode: OrNull[java.lang.String] = js.native
      var settings: AuthSettings = js.native
      /**
        * Applies a verification code sent to the user by email or other out-of-band mechanism.
        */
      def applyActionCode(code: java.lang.String): js.Promise[scala.Unit] = js.native
      /**
        * Checks a verification code sent to the user by email or other out-of-band mechanism.
        */
      def checkActionCode(code: java.lang.String): js.Promise[
            reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.ActionCodeInfo
          ] = js.native
      /**
        * Completes the password reset process, given a confirmation code and new password.
        */
      def confirmPasswordReset(code: java.lang.String, newPassword: java.lang.String): js.Promise[scala.Unit] = js.native
      /**
        * @deprecated
        * @param email
        * @param password
        */
      def createUserAndRetrieveDataWithEmailAndPassword(email: java.lang.String, password: java.lang.String): js.Promise[
            reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.UserCredential
          ] = js.native
      /**
        * We can create a user by calling the createUserWithEmailAndPassword() function.
        * The method accepts two parameters, an email and a password.
        */
      def createUserWithEmailAndPassword(email: java.lang.String, password: java.lang.String): js.Promise[
            reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.UserCredential
          ] = js.native
      /**
        * Returns a list of authentication methods that can be used to sign in a given user (identified by its main email address).
        */
      def fetchSignInMethodsForEmail(email: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
      def isSignInWithEmailLink(emailLink: java.lang.String): scala.Boolean = js.native
      /**
        * Listen for changes in the users auth state (logging in and out).
        * This method returns a unsubscribe function to stop listening to events.
        * Always ensure you unsubscribe from the listener when no longer needed to prevent updates to components no longer in use.
        */
      def onAuthStateChanged(listener: AuthListenerCallback): js.Function0[scala.Unit] = js.native
      /**
        * Listen for changes in id token.
        * This method returns a unsubscribe function to stop listening to events.
        * Always ensure you unsubscribe from the listener when no longer needed to prevent updates to components no longer in use.
        */
      def onIdTokenChanged(listener: AuthListenerCallback): js.Function0[scala.Unit] = js.native
      /**
        * Listen for changes in the user.
        * This method returns a unsubscribe function to stop listening to events.
        * Always ensure you unsubscribe from the listener when no longer needed to prevent updates to components no longer in use.
        */
      def onUserChanged(listener: AuthListenerCallback): js.Function0[scala.Unit] = js.native
      /**
        * Sends a password reset email to the given email address.
        * Unlike the web SDK,
        * the email will contain a password reset link rather than a code.
        */
      def sendPasswordResetEmail(email: java.lang.String): js.Promise[scala.Unit] = js.native
      def sendPasswordResetEmail(
        email: java.lang.String,
        actionCodeSettings: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.ActionCodeSettings
      ): js.Promise[scala.Unit] = js.native
      def sendSignInLinkToEmail(email: java.lang.String): js.Promise[scala.Unit] = js.native
      def sendSignInLinkToEmail(
        email: java.lang.String,
        actionCodeSettings: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.ActionCodeSettings
      ): js.Promise[scala.Unit] = js.native
      /**
        * @deprecated
        * @param credential
        */
      def signInAndRetrieveDataWithCredential(credential: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.AuthCredential): js.Promise[
            reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.UserCredential
          ] = js.native
      /**
        * @deprecated
        * @param token
        */
      def signInAndRetrieveDataWithCustomToken(token: java.lang.String): js.Promise[
            reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.UserCredential
          ] = js.native
      /**
        * @deprecated
        * @param email
        * @param password
        */
      def signInAndRetrieveDataWithEmailAndPassword(email: java.lang.String, password: java.lang.String): js.Promise[
            reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.UserCredential
          ] = js.native
      /**
        * Sign an anonymous user.
        * If the user has already signed in, that user will be returned
        */
      def signInAnonymously(): js.Promise[
            reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.UserCredential
          ] = js.native
      /**
        * @deprecated
        */
      def signInAnonymouslyAndRetrieveData(): js.Promise[
            reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.UserCredential
          ] = js.native
      /**
        * Sign in the user with a 3rd party credential provider.
        * credential requires the following properties:
        */
      def signInWithCredential(credential: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.AuthCredential): js.Promise[
            reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.UserCredential
          ] = js.native
      /**
        * Sign a user in with a self-signed JWT token.
        * To sign a user using a self-signed custom token,
        * use the signInWithCustomToken() function.
        * It accepts one parameter, the custom token:
        */
      def signInWithCustomToken(token: java.lang.String): js.Promise[
            reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.UserCredential
          ] = js.native
      /**
        * To sign a user in with their email and password, use the signInWithEmailAndPassword() function.
        * It accepts two parameters, the user's email and password:
        */
      def signInWithEmailAndPassword(email: java.lang.String, password: java.lang.String): js.Promise[
            reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.UserCredential
          ] = js.native
      def signInWithEmailLink(email: java.lang.String, emailLink: java.lang.String): js.Promise[
            reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.UserCredential
          ] = js.native
      /**
        * Asynchronously signs in using a phone number.
        */
      def signInWithPhoneNumber(phoneNumber: java.lang.String): js.Promise[
            reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.ConfirmationResult
          ] = js.native
      def signInWithPhoneNumber(phoneNumber: java.lang.String, forceResend: scala.Boolean): js.Promise[
            reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.ConfirmationResult
          ] = js.native
      def signOut(): js.Promise[scala.Unit] = js.native
      def verifyPasswordResetCode(code: java.lang.String): js.Promise[java.lang.String] = js.native
      /**
        * Returns a PhoneAuthListener to listen to phone verification events,
        * on the final completion event a PhoneAuthCredential can be generated for
        * authentication purposes.
        */
      def verifyPhoneNumber(phoneNumber: java.lang.String): reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.PhoneAuthListener = js.native
      def verifyPhoneNumber(phoneNumber: java.lang.String, autoVerifyTimeoutOrForceResend: scala.Boolean): reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.PhoneAuthListener = js.native
      def verifyPhoneNumber(
        phoneNumber: java.lang.String,
        autoVerifyTimeoutOrForceResend: scala.Boolean,
        forceResend: scala.Boolean
      ): reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.PhoneAuthListener = js.native
      def verifyPhoneNumber(phoneNumber: java.lang.String, autoVerifyTimeoutOrForceResend: scala.Double): reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.PhoneAuthListener = js.native
      def verifyPhoneNumber(
        phoneNumber: java.lang.String,
        autoVerifyTimeoutOrForceResend: scala.Double,
        forceResend: scala.Boolean
      ): reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.PhoneAuthListener = js.native
    }
    
    @js.native
    trait AuthProvider extends js.Object {
      var PROVIDER_ID: java.lang.String = js.native
      def credential(): reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.AuthCredential = js.native
      def credential(token: java.lang.String): reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.AuthCredential = js.native
      def credential(token: java.lang.String, secret: java.lang.String): reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.AuthCredential = js.native
      def credential(token: scala.Null, secret: java.lang.String): reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.AuthCredential = js.native
    }
    
    trait AuthSettings extends js.Object {
      /**
        * Flag to determine whether app verification should be disabled for testing or not.
        *
        * @platform iOS
        * @param disabled
        */
      var appVerificationDisabledForTesting: scala.Boolean
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
      def setAutoRetrievedSmsCodeForPhoneNumber(phoneNumber: java.lang.String, smsCode: java.lang.String): js.Promise[scala.Null]
    }
    
    trait AuthStatics extends js.Object {
      var EmailAuthProvider: EmailAuthProvider
      var FacebookAuthProvider: AuthProvider
      var GithubAuthProvider: AuthProvider
      var GoogleAuthProvider: AuthProvider
      var OAuthProvider: AuthProvider
      var PhoneAuthProvider: AuthProvider
      var PhoneAuthState: reactDashNativeDashFirebaseLib.Anon_AUTOVERIFIED
      var TwitterAuthProvider: AuthProvider
    }
    
    trait EmailAuthProvider extends js.Object {
      var EMAIL_LINK_SIGN_IN_METHOD: java.lang.String
      var EMAIL_PASSWORD_SIGN_IN_METHOD: java.lang.String
      var PROVIDER_ID: java.lang.String
      def credential(email: java.lang.String, password: java.lang.String): reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.AuthCredential
      def credentialWithLink(email: java.lang.String, emailLink: java.lang.String): reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.AuthCredential
    }
    
    type AuthListenerCallback = js.Function1[
        /* user */ OrNull[reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.User], 
        scala.Unit
      ]
    type AuthResult = reactDashNativeDashFirebaseLib.Anon_Authenticated | scala.Null
    type OrNull[T] = T | scala.Null
  }
  
  @JSName("config")
  @js.native
  object configNs extends js.Object {
    @js.native
    trait Config extends js.Object {
      /**
        * Fetches the remote config data from Firebase, defined in the dashboard.
        * The default expiration duration is 43200 seconds (12 hours)
        */
      def activateFetched(): js.Promise[scala.Boolean] = js.native
      /** Enable Remote Config developer mode to allow for frequent refreshes of the cache. */
      def enableDeveloperMode(): scala.Unit = js.native
      /**
        * Fetches the remote config data from Firebase, defined in the dashboard.
        * If duration is defined (seconds), data will be locally cached for this duration.
        *
        * The default duration is 43200 seconds (12 hours).
        * To force a cache refresh call the method with a duration of 0.
        */
      def fetch(): js.Promise[java.lang.String] = js.native
      def fetch(duration: scala.Double): js.Promise[java.lang.String] = js.native
      /**
        * Returns all keys as an array by a prefix. If no prefix is defined all keys are returned.
        */
      def getKeysByPrefix(): js.Promise[js.Array[java.lang.String]] = js.native
      def getKeysByPrefix(prefix: java.lang.String): js.Promise[js.Array[java.lang.String]] = js.native
      /**
        * Gets a config item by key.
        * Returns a snapshot containing source (default, remote or static) and val function.
        */
      def getValue(key: java.lang.String): js.Promise[ConfigSnapshot] = js.native
      /**
        * Gets multiple values by key.
        * Returns a snapshot object with snapshot keys e.g. snapshots.foo.val().
        */
      def getValues(array: js.Array[java.lang.String]): js.Promise[Object[ConfigSnapshot]] = js.native
      /**
        * Sets default values for the app to use when accessing values.
        * Any data fetched and activated will override any default values.
        * Any values in the defaults but not on Firebase will be untouched.
        */
      def setDefaults(defaults: js.Object): scala.Unit = js.native
      /**
        * Sets the default values from a resource:
        * - Android: Id for the XML resource, which should be in your application's res/xml folder.
        * - iOS: The plist file name, with no file name extension.
        */
      def setDefaultsFromResource(resource: java.lang.String): scala.Unit = js.native
      def setDefaultsFromResource(resource: scala.Double): scala.Unit = js.native
    }
    
    trait ConfigSnapshot extends js.Object {
      var source: java.lang.String
      def `val`(): js.Any
    }
    
    trait Object[ConfigSnapshot]
      extends /* key */ org.scalablytyped.runtime.StringDictionary[ConfigSnapshot]
    
  }
  
  @JSName("crashlytics")
  @js.native
  object crashlyticsNs extends js.Object {
    trait Crashlytics extends js.Object {
      /**
        * Forces a crash. Useful for testing your application is set up correctly.
        */
      def crash(): scala.Unit
      /**
        * Enable Crashlytics reporting. Only avaliable when disabled automatic initialization
        */
      def enableCrashlyticsCollection(): scala.Unit
      /**
        * Logs a message that will appear in any subsequent crash reports.
        */
      def log(message: java.lang.String): scala.Unit
      /**
        * Logs a non fatal exception.
        */
      def recordError(code: scala.Double, message: java.lang.String): scala.Unit
      /**
        * Set a boolean value to show alongside any subsequent crash reports.
        */
      def setBoolValue(key: java.lang.String, value: scala.Boolean): scala.Unit
      /**
        * Set a float value to show alongside any subsequent crash reports.
        */
      def setFloatValue(key: java.lang.String, value: scala.Double): scala.Unit
      /**
        * Set an integer value to show alongside any subsequent crash reports.
        */
      def setIntValue(key: java.lang.String, value: scala.Double): scala.Unit
      /**
        * Set a string value to show alongside any subsequent crash reports.
        */
      def setStringValue(key: java.lang.String, value: java.lang.String): scala.Unit
      /**
        * Set the user ID to show alongside any subsequent crash reports.
        */
      def setUserIdentifier(userId: java.lang.String): scala.Unit
    }
    
  }
  
  @JSName("database")
  @js.native
  object databaseNs extends js.Object {
    trait DataSnapshot extends js.Object {
      var key: java.lang.String | scala.Null
      var ref: Reference
      def child(path: java.lang.String): DataSnapshot
      def exists(): scala.Boolean
      def exportVal(): reactDashNativeDashFirebaseLib.Anon_Priority
      def forEach(action: js.Function1[/* a */ this.type, scala.Boolean]): scala.Boolean
      def getPriority(): java.lang.String | scala.Double | scala.Null
      def hasChild(path: java.lang.String): scala.Boolean
      def hasChildren(): scala.Boolean
      def numChildren(): scala.Double
      def toJSON(): js.Object | scala.Null
      def `val`(): js.Any
    }
    
    @js.native
    trait Database
      extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
      /**
        * Removes all event handlers and their native subscriptions
        */
      def cleanup(): js.Promise[_] = js.native
      /**
        * disconnect to firebase backend
        */
      def goOffline(): scala.Unit = js.native
      /**
        * connect to firebase backend
        */
      def goOnline(): scala.Unit = js.native
      /**
        * unregister listener
        */
      def off(path: java.lang.String, modifiersString: java.lang.String): js.Any = js.native
      def off(path: java.lang.String, modifiersString: java.lang.String, eventName: java.lang.String): js.Any = js.native
      def off(
        path: java.lang.String,
        modifiersString: java.lang.String,
        eventName: java.lang.String,
        origCB: js.Function0[scala.Unit]
      ): js.Any = js.native
      /**
        * register listener
        */
      def on(
        path: java.lang.String,
        modifiersString: java.lang.String,
        modifiers: js.Array[java.lang.String],
        eventName: java.lang.String,
        cb: js.Function0[scala.Unit],
        errorCb: js.Function0[scala.Unit]
      ): js.Any = js.native
      /**
        * Returns a new firebase reference instance
        * */
      def ref(): RnReference = js.native
      def ref(path: java.lang.String): RnReference = js.native
    }
    
    trait DatabaseStatics extends js.Object {
      /** @see https://www.firebase.com/docs/java-api/javadoc/com/firebase/client/ServerValue.html#TIMESTAMP */
      var ServerValue: reactDashNativeDashFirebaseLib.Anon_Key
    }
    
    @js.native
    trait Query extends js.Object {
      var ref: Reference = js.native
      def endAt(): Query = js.native
      def endAt(value: java.lang.String): Query = js.native
      def endAt(value: java.lang.String, key: java.lang.String): Query = js.native
      def endAt(value: scala.Boolean): Query = js.native
      def endAt(value: scala.Boolean, key: java.lang.String): Query = js.native
      def endAt(value: scala.Double): Query = js.native
      def endAt(value: scala.Double, key: java.lang.String): Query = js.native
      def endAt(value: scala.Null, key: java.lang.String): Query = js.native
      def equalTo(): Query = js.native
      def equalTo(value: java.lang.String): Query = js.native
      def equalTo(value: java.lang.String, key: java.lang.String): Query = js.native
      def equalTo(value: scala.Boolean): Query = js.native
      def equalTo(value: scala.Boolean, key: java.lang.String): Query = js.native
      def equalTo(value: scala.Double): Query = js.native
      def equalTo(value: scala.Double, key: java.lang.String): Query = js.native
      def equalTo(value: scala.Null, key: java.lang.String): Query = js.native
      def isEqual(): scala.Boolean = js.native
      def isEqual(other: Query): scala.Boolean = js.native
      def limitToFirst(limit: scala.Double): Query = js.native
      def limitToLast(limit: scala.Double): Query = js.native
      def off(): scala.Unit = js.native
      def off(eventType: QueryEventType): scala.Unit = js.native
      def off(eventType: QueryEventType, callback: QuerySuccessCallback): scala.Unit = js.native
      def off(eventType: QueryEventType, callback: QuerySuccessCallback, context: js.Object): scala.Unit = js.native
      def on(eventType: QueryEventType, callback: QuerySuccessCallback): js.Function2[
            /* a */ DataSnapshot | scala.Null, 
            /* b */ js.UndefOr[java.lang.String], 
            QuerySuccessCallback
          ] = js.native
      def on(
        eventType: QueryEventType,
        callback: QuerySuccessCallback,
        cancelCallbackOrContext: QueryErrorCallback
      ): js.Function2[
            /* a */ DataSnapshot | scala.Null, 
            /* b */ js.UndefOr[java.lang.String], 
            QuerySuccessCallback
          ] = js.native
      def on(
        eventType: QueryEventType,
        callback: QuerySuccessCallback,
        cancelCallbackOrContext: QueryErrorCallback,
        context: js.Object
      ): js.Function2[
            /* a */ DataSnapshot | scala.Null, 
            /* b */ js.UndefOr[java.lang.String], 
            QuerySuccessCallback
          ] = js.native
      def once(eventType: QueryEventType): js.Promise[DataSnapshot] = js.native
      def once(eventType: QueryEventType, successCallback: QuerySuccessCallback): js.Promise[DataSnapshot] = js.native
      def once(
        eventType: QueryEventType,
        successCallback: QuerySuccessCallback,
        failureCallbackOrContext: QueryErrorCallback
      ): js.Promise[DataSnapshot] = js.native
      def once(
        eventType: QueryEventType,
        successCallback: QuerySuccessCallback,
        failureCallbackOrContext: QueryErrorCallback,
        context: js.Object
      ): js.Promise[DataSnapshot] = js.native
      def orderByChild(path: java.lang.String): Query = js.native
      def orderByKey(): Query = js.native
      def orderByPriority(): Query = js.native
      def orderByValue(): Query = js.native
      def startAt(): Query = js.native
      def startAt(value: java.lang.String): Query = js.native
      def startAt(value: java.lang.String, key: java.lang.String): Query = js.native
      def startAt(value: scala.Boolean): Query = js.native
      def startAt(value: scala.Boolean, key: java.lang.String): Query = js.native
      def startAt(value: scala.Double): Query = js.native
      def startAt(value: scala.Double, key: java.lang.String): Query = js.native
      def startAt(value: scala.Null, key: java.lang.String): Query = js.native
      def toJSON(): js.Object = js.native
    }
    
    @js.native
    trait Reference extends Query {
      var key: java.lang.String | scala.Null = js.native
      var parent: Reference | scala.Null = js.native
      var root: Reference = js.native
      def child(path: java.lang.String): Reference = js.native
      def onDisconnect(): js.Any = js.native
      def push(): ThenableReference[_] = js.native
      def push(value: js.Any): ThenableReference[_] = js.native
      def push(
        value: js.Any,
        onComplete: js.Function1[
              /* a */ reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.RnError | scala.Null, 
              _
            ]
      ): ThenableReference[_] = js.native
      def remove(): js.Promise[_] = js.native
      def remove(
        onComplete: js.Function1[
              /* a */ reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.RnError | scala.Null, 
              _
            ]
      ): js.Promise[_] = js.native
      def set(value: js.Any): js.Promise[_] = js.native
      def set(
        value: js.Any,
        onComplete: js.Function1[
              /* a */ reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.RnError | scala.Null, 
              _
            ]
      ): js.Promise[_] = js.native
      def setPriority(
        priority: java.lang.String,
        onComplete: js.Function1[
              /* a */ reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.RnError | scala.Null, 
              _
            ]
      ): js.Promise[_] = js.native
      def setPriority(
        priority: scala.Double,
        onComplete: js.Function1[
              /* a */ reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.RnError | scala.Null, 
              _
            ]
      ): js.Promise[_] = js.native
      def setPriority(
        priority: scala.Null,
        onComplete: js.Function1[
              /* a */ reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.RnError | scala.Null, 
              _
            ]
      ): js.Promise[_] = js.native
      def setWithPriority(newVal: js.Any): js.Promise[_] = js.native
      def setWithPriority(newVal: js.Any, newPriority: java.lang.String): js.Promise[_] = js.native
      def setWithPriority(
        newVal: js.Any,
        newPriority: java.lang.String,
        onComplete: js.Function1[
              /* a */ reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.RnError | scala.Null, 
              _
            ]
      ): js.Promise[_] = js.native
      def setWithPriority(newVal: js.Any, newPriority: scala.Double): js.Promise[_] = js.native
      def setWithPriority(
        newVal: js.Any,
        newPriority: scala.Double,
        onComplete: js.Function1[
              /* a */ reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.RnError | scala.Null, 
              _
            ]
      ): js.Promise[_] = js.native
      def setWithPriority(
        newVal: js.Any,
        newPriority: scala.Null,
        onComplete: js.Function1[
              /* a */ reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.RnError | scala.Null, 
              _
            ]
      ): js.Promise[_] = js.native
      def transaction(transactionUpdate: js.Function1[/* a */ js.Any, _]): js.Promise[_] = js.native
      def transaction(
        transactionUpdate: js.Function1[/* a */ js.Any, _],
        onComplete: js.Function3[
              /* a */ reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.RnError | scala.Null, 
              /* b */ scala.Boolean, 
              /* c */ DataSnapshot | scala.Null, 
              _
            ]
      ): js.Promise[_] = js.native
      def transaction(
        transactionUpdate: js.Function1[/* a */ js.Any, _],
        onComplete: js.Function3[
              /* a */ reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.RnError | scala.Null, 
              /* b */ scala.Boolean, 
              /* c */ DataSnapshot | scala.Null, 
              _
            ],
        applyLocally: scala.Boolean
      ): js.Promise[_] = js.native
      def update(values: js.Object): js.Promise[_] = js.native
      def update(
        values: js.Object,
        onComplete: js.Function1[
              /* a */ reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.RnError | scala.Null, 
              _
            ]
      ): js.Promise[_] = js.native
    }
    
    @js.native
    trait RnReference
      extends Reference
         with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
      def filter(name: java.lang.String, value: js.Any): js.Any = js.native
      def filter(name: java.lang.String, value: js.Any, key: java.lang.String): js.Any = js.native
      def keepSynced(bool: scala.Boolean): js.Any = js.native
    }
    
    @js.native
    trait ThenableReference[T]
      extends Reference
         with stdLib.Promise[T]
    
    type QueryErrorCallback = js.Function1[/* e */ stdLib.Error, scala.Unit]
    type QueryEventType = reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.value | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.child_added | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.child_removed | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.child_changed | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.child_moved
    type QuerySuccessCallback = js.Function2[
        /* snapshot */ DataSnapshot, 
        /* previousChildId */ js.UndefOr[java.lang.String | scala.Null], 
        scala.Unit
      ]
  }
  
  @JSName("firestore")
  @js.native
  object firestoreNs extends js.Object {
    @js.native
    class Blob () extends js.Object {
      def isEqual(other: Blob): scala.Boolean = js.native
      def toBase64(): java.lang.String = js.native
      def toUint8Array(): stdLib.Uint8Array = js.native
    }
    
    @js.native
    trait CollectionReference extends js.Object {
      val firestore: Firestore = js.native
      val id: java.lang.String = js.native
      val parent: DocumentReference = js.native
      def add(data: js.Object): js.Promise[DocumentReference] = js.native
      def doc(): DocumentReference = js.native
      def doc(documentPath: java.lang.String): DocumentReference = js.native
      def endAt(snapshot: DocumentSnapshot): Query = js.native
      def endAt(varargs: js.Any*): Query = js.native
      def endBefore(snapshot: DocumentSnapshot): Query = js.native
      def endBefore(varargs: js.Any*): Query = js.native
      def get(): js.Promise[QuerySnapshot] = js.native
      def get(
        options: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.TypesNs.GetOptions
      ): js.Promise[QuerySnapshot] = js.native
      def limit(limit: scala.Double): Query = js.native
      def onSnapshot(
        metadataChanges: MetadataChanges,
        observer: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.QueryNs.Observer
      ): js.Function0[scala.Unit] = js.native
      def onSnapshot(
        metadataChanges: MetadataChanges,
        onNext: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.QueryNs.ObserverOnNext
      ): js.Function0[scala.Unit] = js.native
      def onSnapshot(
        metadataChanges: MetadataChanges,
        onNext: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.QueryNs.ObserverOnNext,
        onError: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.QueryNs.ObserverOnError
      ): js.Function0[scala.Unit] = js.native
      def onSnapshot(
        observer: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.QueryNs.Observer
      ): js.Function0[scala.Unit] = js.native
      def onSnapshot(
        onNext: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.QueryNs.ObserverOnNext
      ): js.Function0[scala.Unit] = js.native
      def onSnapshot(
        onNext: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.QueryNs.ObserverOnNext,
        onError: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.QueryNs.ObserverOnError
      ): js.Function0[scala.Unit] = js.native
      def orderBy(fieldPath: java.lang.String): Query = js.native
      def orderBy(
        fieldPath: java.lang.String,
        directionStr: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.TypesNs.QueryDirection
      ): Query = js.native
      def orderBy(fieldPath: FieldPath): Query = js.native
      def orderBy(
        fieldPath: FieldPath,
        directionStr: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.TypesNs.QueryDirection
      ): Query = js.native
      def startAfter(snapshot: DocumentSnapshot): Query = js.native
      def startAfter(varargs: js.Any*): Query = js.native
      def startAt(snapshot: DocumentSnapshot): Query = js.native
      def startAt(varargs: js.Any*): Query = js.native
      def where(
        fieldPath: java.lang.String,
        op: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.TypesNs.QueryOperator,
        value: js.Any
      ): Query = js.native
      def where(
        fieldPath: FieldPath,
        op: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.TypesNs.QueryOperator,
        value: js.Any
      ): Query = js.native
    }
    
    trait DocumentChange extends js.Object {
      val doc: DocumentSnapshot
      val newIndex: scala.Double
      val oldIndex: scala.Double
      val `type`: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.added | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.modified | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.removed
    }
    
    @js.native
    trait DocumentReference extends js.Object {
      val firestore: Firestore = js.native
      val id: java.lang.String | scala.Null = js.native
      val parent: CollectionReference = js.native
      val path: java.lang.String = js.native
      def collection(collectionPath: java.lang.String): CollectionReference = js.native
      def delete(): js.Promise[scala.Unit] = js.native
      def get(): js.Promise[DocumentSnapshot] = js.native
      def get(
        options: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.TypesNs.GetOptions
      ): js.Promise[DocumentSnapshot] = js.native
      def onSnapshot(
        metadataChanges: MetadataChanges,
        observer: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.DocumentReferenceNs.Observer
      ): js.Function0[scala.Unit] = js.native
      def onSnapshot(
        metadataChanges: MetadataChanges,
        onNext: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.DocumentReferenceNs.ObserverOnNext
      ): js.Function0[scala.Unit] = js.native
      def onSnapshot(
        metadataChanges: MetadataChanges,
        onNext: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.DocumentReferenceNs.ObserverOnNext,
        onError: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.DocumentReferenceNs.ObserverOnError
      ): js.Function0[scala.Unit] = js.native
      def onSnapshot(
        observer: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.DocumentReferenceNs.Observer
      ): js.Function0[scala.Unit] = js.native
      def onSnapshot(
        onNext: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.DocumentReferenceNs.ObserverOnNext
      ): js.Function0[scala.Unit] = js.native
      def onSnapshot(
        onNext: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.DocumentReferenceNs.ObserverOnNext,
        onError: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.DocumentReferenceNs.ObserverOnError
      ): js.Function0[scala.Unit] = js.native
      def set(data: js.Object): js.Promise[scala.Unit] = js.native
      def set(
        data: js.Object,
        writeOptions: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.TypesNs.SetOptions
      ): js.Promise[scala.Unit] = js.native
      def update(
        key1: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.TypesNs.UpdateKey,
        val1: js.Any
      ): js.Promise[scala.Unit] = js.native
      def update(
        key1: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.TypesNs.UpdateKey,
        val1: js.Any,
        key2: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.TypesNs.UpdateKey,
        val2: js.Any
      ): js.Promise[scala.Unit] = js.native
      def update(
        key1: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.TypesNs.UpdateKey,
        val1: js.Any,
        key2: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.TypesNs.UpdateKey,
        val2: js.Any,
        key3: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.TypesNs.UpdateKey,
        val3: js.Any
      ): js.Promise[scala.Unit] = js.native
      def update(
        key1: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.TypesNs.UpdateKey,
        val1: js.Any,
        key2: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.TypesNs.UpdateKey,
        val2: js.Any,
        key3: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.TypesNs.UpdateKey,
        val3: js.Any,
        key4: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.TypesNs.UpdateKey,
        val4: js.Any
      ): js.Promise[scala.Unit] = js.native
      def update(
        key1: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.TypesNs.UpdateKey,
        val1: js.Any,
        key2: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.TypesNs.UpdateKey,
        val2: js.Any,
        key3: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.TypesNs.UpdateKey,
        val3: js.Any,
        key4: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.TypesNs.UpdateKey,
        val4: js.Any,
        key5: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.TypesNs.UpdateKey,
        val5: js.Any
      ): js.Promise[scala.Unit] = js.native
      def update(obj: js.Object): js.Promise[scala.Unit] = js.native
    }
    
    @js.native
    trait DocumentSnapshot extends js.Object {
      val exists: scala.Boolean = js.native
      val id: java.lang.String | scala.Null = js.native
      val metadata: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.TypesNs.SnapshotMetadata = js.native
      val ref: DocumentReference = js.native
      def data(): js.Object | scala.Unit = js.native
      def get(fieldPath: java.lang.String): js.UndefOr[_] = js.native
      def get(fieldPath: FieldPath): js.UndefOr[_] = js.native
    }
    
    @js.native
    class FieldPath protected () extends js.Object {
      def this(segments: java.lang.String*) = this()
    }
    
    @js.native
    class FieldValue () extends js.Object
    
    trait Firestore extends js.Object {
      val app: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.App
      def batch(): WriteBatch
      def collection(collectionPath: java.lang.String): CollectionReference
      def disableNetwork(): js.Promise[scala.Unit]
      def doc(documentPath: java.lang.String): DocumentReference
      def enableNetwork(): js.Promise[scala.Unit]
      def enablePersistence(enabled: scala.Boolean): js.Promise[scala.Unit]
      def runTransaction(updateFunction: js.Function1[/* transaction */ Transaction, js.Promise[_]]): js.Promise[_]
      def settings(settings: Settings): js.Promise[scala.Unit]
    }
    
    @js.native
    trait FirestoreStatics extends js.Object {
      var Blob: reactDashNativeDashFirebaseLib.Anon_Array = js.native
      var FieldPath: reactDashNativeDashFirebaseLib.Anon_DocumentId = js.native
      var FieldValue: reactDashNativeDashFirebaseLib.Anon_ArrayRemove = js.native
      var GeoPoint: org.scalablytyped.runtime.Instantiable2[/* latitude */ scala.Double, /* longitude */ scala.Double, GeoPoint] = js.native
      def enableLogging(enabled: scala.Boolean): scala.Unit = js.native
      @JSName("setLogLevel")
      def setLogLevel_debug(logLevel: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.debug): scala.Unit = js.native
      @JSName("setLogLevel")
      def setLogLevel_error(logLevel: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.error): scala.Unit = js.native
      @JSName("setLogLevel")
      def setLogLevel_silent(logLevel: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.silent): scala.Unit = js.native
    }
    
    @js.native
    class GeoPoint protected () extends js.Object {
      def this(latitude: scala.Double, longitude: scala.Double) = this()
      val latitude: scala.Double = js.native
      val longitude: scala.Double = js.native
    }
    
    trait MetadataChanges extends js.Object {
      var includeMetadataChanges: scala.Boolean
    }
    
    @js.native
    class Path protected () extends js.Object {
      def this(pathComponents: js.Array[java.lang.String]) = this()
      val id: java.lang.String | scala.Null = js.native
      val isCollection: scala.Boolean = js.native
      val isDocument: scala.Boolean = js.native
      val relativeName: java.lang.String = js.native
      def child(relativePath: java.lang.String): Path = js.native
      def parent(): Path | scala.Null = js.native
    }
    
    @js.native
    trait Query extends js.Object {
      val firestore: Firestore = js.native
      def endAt(snapshot: DocumentSnapshot): Query = js.native
      def endAt(varargs: js.Any*): Query = js.native
      def endBefore(snapshot: DocumentSnapshot): Query = js.native
      def endBefore(varargs: js.Any*): Query = js.native
      def get(): js.Promise[QuerySnapshot] = js.native
      def get(
        options: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.TypesNs.GetOptions
      ): js.Promise[QuerySnapshot] = js.native
      def limit(limit: scala.Double): Query = js.native
      def onSnapshot(
        metadataChanges: MetadataChanges,
        observer: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.QueryNs.Observer
      ): js.Function0[scala.Unit] = js.native
      def onSnapshot(
        metadataChanges: MetadataChanges,
        onNext: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.QueryNs.ObserverOnNext
      ): js.Function0[scala.Unit] = js.native
      def onSnapshot(
        metadataChanges: MetadataChanges,
        onNext: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.QueryNs.ObserverOnNext,
        onError: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.QueryNs.ObserverOnError
      ): js.Function0[scala.Unit] = js.native
      def onSnapshot(
        observer: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.QueryNs.Observer
      ): js.Function0[scala.Unit] = js.native
      def onSnapshot(
        onNext: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.QueryNs.ObserverOnNext
      ): js.Function0[scala.Unit] = js.native
      def onSnapshot(
        onNext: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.QueryNs.ObserverOnNext,
        onError: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.QueryNs.ObserverOnError
      ): js.Function0[scala.Unit] = js.native
      def orderBy(fieldPath: java.lang.String): Query = js.native
      def orderBy(
        fieldPath: java.lang.String,
        directionStr: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.TypesNs.QueryDirection
      ): Query = js.native
      def orderBy(fieldPath: FieldPath): Query = js.native
      def orderBy(
        fieldPath: FieldPath,
        directionStr: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.TypesNs.QueryDirection
      ): Query = js.native
      def startAfter(snapshot: DocumentSnapshot): Query = js.native
      def startAfter(varargs: js.Any*): Query = js.native
      def startAt(snapshot: DocumentSnapshot): Query = js.native
      def startAt(varargs: js.Any*): Query = js.native
      def where(
        fieldPath: java.lang.String,
        op: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.TypesNs.QueryOperator,
        value: js.Any
      ): Query = js.native
      def where(
        fieldPath: FieldPath,
        op: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.TypesNs.QueryOperator,
        value: js.Any
      ): Query = js.native
    }
    
    trait QuerySnapshot extends js.Object {
      val docChanges: js.Array[DocumentChange]
      val docs: js.Array[DocumentSnapshot]
      val empty: scala.Boolean
      val metadata: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.TypesNs.SnapshotMetadata
      val query: Query
      val size: scala.Double
      def forEach(callback: js.Function1[/* snapshot */ DocumentSnapshot, _]): scala.Unit
    }
    
    trait Settings extends js.Object {
      var host: js.UndefOr[java.lang.String] = js.undefined
      var persistence: js.UndefOr[scala.Boolean] = js.undefined
      var ssl: js.UndefOr[scala.Boolean] = js.undefined
      var timestampsInSnapshots: js.UndefOr[scala.Boolean] = js.undefined
    }
    
    @js.native
    trait Transaction extends js.Object {
      def delete(docRef: DocumentReference): WriteBatch = js.native
      def get(documentRef: DocumentReference): js.Promise[DocumentSnapshot] = js.native
      def set(documentRef: DocumentReference, data: js.Object): Transaction = js.native
      def set(
        documentRef: DocumentReference,
        data: js.Object,
        options: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.TypesNs.SetOptions
      ): Transaction = js.native
      def update(
        docRef: DocumentReference,
        key1: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.TypesNs.UpdateKey,
        val1: js.Any
      ): WriteBatch = js.native
      def update(
        docRef: DocumentReference,
        key1: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.TypesNs.UpdateKey,
        val1: js.Any,
        key2: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.TypesNs.UpdateKey,
        val2: js.Any
      ): WriteBatch = js.native
      def update(
        docRef: DocumentReference,
        key1: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.TypesNs.UpdateKey,
        val1: js.Any,
        key2: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.TypesNs.UpdateKey,
        val2: js.Any,
        key3: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.TypesNs.UpdateKey,
        val3: js.Any
      ): WriteBatch = js.native
      def update(
        docRef: DocumentReference,
        key1: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.TypesNs.UpdateKey,
        val1: js.Any,
        key2: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.TypesNs.UpdateKey,
        val2: js.Any,
        key3: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.TypesNs.UpdateKey,
        val3: js.Any,
        key4: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.TypesNs.UpdateKey,
        val4: js.Any
      ): WriteBatch = js.native
      def update(
        docRef: DocumentReference,
        key1: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.TypesNs.UpdateKey,
        val1: js.Any,
        key2: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.TypesNs.UpdateKey,
        val2: js.Any,
        key3: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.TypesNs.UpdateKey,
        val3: js.Any,
        key4: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.TypesNs.UpdateKey,
        val4: js.Any,
        key5: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.TypesNs.UpdateKey,
        val5: js.Any
      ): WriteBatch = js.native
      // multiple overrides for update() to allow strong-typed var_args
      def update(docRef: DocumentReference, obj: js.Object): WriteBatch = js.native
    }
    
    @js.native
    trait WriteBatch extends js.Object {
      def commit(): js.Promise[scala.Unit] = js.native
      def delete(docRef: DocumentReference): WriteBatch = js.native
      def set(docRef: DocumentReference, data: js.Object): WriteBatch = js.native
      def set(
        docRef: DocumentReference,
        data: js.Object,
        options: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.TypesNs.SetOptions
      ): WriteBatch = js.native
      def update(
        docRef: DocumentReference,
        key1: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.TypesNs.UpdateKey,
        val1: js.Any
      ): WriteBatch = js.native
      def update(
        docRef: DocumentReference,
        key1: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.TypesNs.UpdateKey,
        val1: js.Any,
        key2: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.TypesNs.UpdateKey,
        val2: js.Any
      ): WriteBatch = js.native
      def update(
        docRef: DocumentReference,
        key1: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.TypesNs.UpdateKey,
        val1: js.Any,
        key2: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.TypesNs.UpdateKey,
        val2: js.Any,
        key3: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.TypesNs.UpdateKey,
        val3: js.Any
      ): WriteBatch = js.native
      def update(
        docRef: DocumentReference,
        key1: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.TypesNs.UpdateKey,
        val1: js.Any,
        key2: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.TypesNs.UpdateKey,
        val2: js.Any,
        key3: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.TypesNs.UpdateKey,
        val3: js.Any,
        key4: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.TypesNs.UpdateKey,
        val4: js.Any
      ): WriteBatch = js.native
      def update(
        docRef: DocumentReference,
        key1: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.TypesNs.UpdateKey,
        val1: js.Any,
        key2: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.TypesNs.UpdateKey,
        val2: js.Any,
        key3: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.TypesNs.UpdateKey,
        val3: js.Any,
        key4: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.TypesNs.UpdateKey,
        val4: js.Any,
        key5: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.TypesNs.UpdateKey,
        val5: js.Any
      ): WriteBatch = js.native
      // multiple overrides for update() to allow strong-typed var_args
      def update(docRef: DocumentReference, obj: js.Object): WriteBatch = js.native
    }
    
    @js.native
    object Blob extends js.Object {
      def fromBase64String(base64: java.lang.String): reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.Blob = js.native
      def fromUint8Array(array: stdLib.Uint8Array): reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.Blob = js.native
    }
    
    @JSName("DocumentReference")
    @js.native
    object DocumentReferenceNs extends js.Object {
      @js.native
      trait Observer extends js.Object {
        var error: js.UndefOr[ObserverOnError] = js.native
        @JSName("next")
        var next_Original: ObserverOnNext = js.native
        def next(
          documentSnapshot: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.DocumentSnapshot
        ): scala.Unit = js.native
      }
      
      type ObserverOnError = js.Function1[
            /* err */ reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.QueryNs.SnapshotError, 
            scala.Unit
          ]
      type ObserverOnNext = js.Function1[
            /* documentSnapshot */ reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.DocumentSnapshot, 
            scala.Unit
          ]
    }
    
    @js.native
    object FieldPath extends js.Object {
      def documentId(): reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.FieldPath = js.native
    }
    
    @js.native
    object FieldValue extends js.Object {
      def arrayRemove(
        elements: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.AnyJs*
      ): reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.FieldValue = js.native
      def arrayUnion(
        elements: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.AnyJs*
      ): reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.FieldValue = js.native
      def delete(): reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.FieldValue = js.native
      def serverTimestamp(): reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.FieldValue = js.native
    }
    
    @js.native
    object Path extends js.Object {
      def fromName(name: java.lang.String): reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.Path = js.native
    }
    
    @JSName("Query")
    @js.native
    object QueryNs extends js.Object {
      trait FieldFilter extends js.Object {
        var fieldPath: NativeFieldPath
        var operator: java.lang.String
        var value: js.Any
      }
      
      trait FieldOrder extends js.Object {
        var direction: java.lang.String
        var fieldPath: NativeFieldPath
      }
      
      trait NativeError
        extends stdLib.Error {
        var code: java.lang.String
        var nativeErrorCode: js.UndefOr[java.lang.String] = js.undefined
        var nativeErrorMessage: js.UndefOr[java.lang.String] = js.undefined
      }
      
      trait NativeFieldPath extends js.Object {
        var elements: js.UndefOr[js.Array[java.lang.String]] = js.undefined
        var string: js.UndefOr[java.lang.String] = js.undefined
        var `type`: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.fieldpath | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.string
      }
      
      @js.native
      trait Observer extends js.Object {
        var error: js.UndefOr[ObserverOnError] = js.native
        @JSName("next")
        var next_Original: ObserverOnNext = js.native
        def next(
          querySnapshot: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.QuerySnapshot
        ): scala.Unit = js.native
      }
      
      trait QueryOptions extends js.Object {
        var endAt: js.UndefOr[js.Array[_]] = js.undefined
        var endBefore: js.UndefOr[js.Array[_]] = js.undefined
        var limit: js.UndefOr[scala.Double] = js.undefined
        var offset: js.UndefOr[scala.Double] = js.undefined
        var selectFields: js.UndefOr[js.Array[java.lang.String]] = js.undefined
        var startAfter: js.UndefOr[js.Array[_]] = js.undefined
        var startAt: js.UndefOr[js.Array[_]] = js.undefined
      }
      
      trait SnapshotError extends NativeError {
        var appName: java.lang.String
        var path: java.lang.String
      }
      
      type ObserverOnError = js.Function1[/* err */ SnapshotError, scala.Unit]
      type ObserverOnNext = js.Function1[
            /* querySnapshot */ reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.QuerySnapshot, 
            scala.Unit
          ]
    }
    
    @JSName("QuerySnapshot")
    @js.native
    object QuerySnapshotNs extends js.Object {
      trait NativeData extends js.Object {
        var changes: js.Array[
                reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.TypesNs.NativeDocumentChange
              ]
        var documents: js.Array[
                reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.TypesNs.NativeDocumentSnapshot
              ]
        var metadata: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.TypesNs.SnapshotMetadata
      }
      
    }
    
    @JSName("Types")
    @js.native
    object TypesNs extends js.Object {
      trait GetOptions extends js.Object {
        var source: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.default | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.server | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.cache
      }
      
      trait NativeDocumentChange extends js.Object {
        var document: NativeDocumentSnapshot
        var newIndex: scala.Double
        var oldIndex: scala.Double
        var `type`: java.lang.String
      }
      
      trait NativeDocumentSnapshot extends js.Object {
        var data: org.scalablytyped.runtime.StringDictionary[TypeMap]
        var metadata: SnapshotMetadata
        var path: java.lang.String
      }
      
      trait SetOptions extends js.Object {
        var merge: js.UndefOr[scala.Boolean] = js.undefined
      }
      
      trait SnapshotMetadata extends js.Object {
        var fromCache: scala.Boolean
        var hasPendingWrites: scala.Boolean
      }
      
      trait TypeMap extends js.Object {
        var `type`: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.array | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.boolean | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.date | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.documentid | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.fieldvalue | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.geopoint | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.`null` | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.number | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.`object` | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.reference | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.string
        var value: js.Any
      }
      
      type QueryDirection = reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.asc | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.ASC | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.desc | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.DESC
      type QueryOperator = reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.`=` | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.`==` | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.`>` | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.`>=` | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.`<` | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.`<=` | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.`array-contains`
      /** The key in update() function for DocumentReference and WriteBatch. */
      type UpdateKey = java.lang.String | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.firestoreNs.FieldPath
    }
    
    type AnyJs = js.UndefOr[scala.Null | scala.Boolean | scala.Double | java.lang.String | js.Object]
  }
  
  // Source: https://github.com/firebase/firebase-js-sdk/blob/master/packages/functions-types/index.d.ts
  @JSName("functions")
  @js.native
  object functionsNs extends js.Object {
    /**
      * `FirebaseFunctions` represents a Functions app, and is the entry point for
      * all Functions operations.
      */
    trait Functions
      extends /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] {
      /**
        * Gets an `HttpsCallable` instance that refers to the function with the given
        * name.
        *
        * @param name The name of the https callable function.
        * @return The `HttpsCallable` instance.
        */
      def httpsCallable(name: java.lang.String): HttpsCallable
      /**
        * Changes this instance to point to a Cloud Functions emulator running
        * locally.
        *
        * See https://firebase.google.com/docs/functions/local-emulator
        *
        * @param origin the origin string of the local emulator started via firebase tools
        * "http://10.0.0.8:1337".
        */
      def useFunctionsEmulator(origin: java.lang.String): js.Promise[scala.Null]
    }
    
    /**
      * firebase.functions.X
      */
    trait FunctionsStatics extends js.Object {
      /**
        * Uppercased + underscored variables of @FunctionsErrorCode
        */
      var HttpsErrorCode: HttpsErrorCode
    }
    
    /**
      * An HttpsCallableResult wraps a single result from a function call.
      */
    trait HttpsCallableResult extends js.Object {
      val data: js.Any
    }
    
    trait HttpsError
      extends stdLib.Error {
      /**
        * A standard error code that will be returned to the client. This also
        * determines the HTTP status code of the response, as defined in code.proto.
        */
      val code: FunctionsErrorCode
      /**
        * Extra data to be converted to JSON and included in the error response.
        */
      val details: js.UndefOr[js.Any] = js.undefined
    }
    
    trait HttpsErrorCode
      extends /* name */ org.scalablytyped.runtime.StringDictionary[FunctionsErrorCode]
    
    /**
      * The set of Firebase Functions status codes. The codes are the same at the
      * ones exposed by gRPC here:
      * https://github.com/grpc/grpc/blob/master/doc/statuscodes.md
      *
      * Possible values:
      * - 'cancelled': The operation was cancelled (typically by the caller).
      * - 'unknown': Unknown error or an error from a different error domain.
      * - 'invalid-argument': Client specified an invalid argument. Note that this
      *   differs from 'failed-precondition'. 'invalid-argument' indicates
      *   arguments that are problematic regardless of the state of the system
      *   (e.g. an invalid field name).
      * - 'deadline-exceeded': Deadline expired before operation could complete.
      *   For operations that change the state of the system, this error may be
      *   returned even if the operation has completed successfully. For example,
      *   a successful response from a server could have been delayed long enough
      *   for the deadline to expire.
      * - 'not-found': Some requested document was not found.
      * - 'already-exists': Some document that we attempted to create already
      *   exists.
      * - 'permission-denied': The caller does not have permission to execute the
      *   specified operation.
      * - 'resource-exhausted': Some resource has been exhausted, perhaps a
      *   per-user quota, or perhaps the entire file system is out of space.
      * - 'failed-precondition': Operation was rejected because the system is not
      *   in a state required for the operation's execution.
      * - 'aborted': The operation was aborted, typically due to a concurrency
      *   issue like transaction aborts, etc.
      * - 'out-of-range': Operation was attempted past the valid range.
      * - 'unimplemented': Operation is not implemented or not supported/enabled.
      * - 'internal': Internal errors. Means some invariants expected by
      *   underlying system has been broken. If you see one of these errors,
      *   something is very broken.
      * - 'unavailable': The service is currently unavailable. This is most likely
      *   a transient condition and may be corrected by retrying with a backoff.
      * - 'data-loss': Unrecoverable data loss or corruption.
      * - 'unauthenticated': The request does not have valid authentication
      *   credentials for the operation.
      */
    type FunctionsErrorCode = reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.ok | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.cancelled | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.unknown | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.`invalid-argument` | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.`deadline-exceeded` | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.`not-found` | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.`already-exists` | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.`permission-denied` | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.`resource-exhausted` | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.`failed-precondition` | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.aborted | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.`out-of-range` | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.unimplemented | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.internal | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.unavailable | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.`data-loss` | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.unauthenticated
    /**
      * An HttpsCallable is a reference to a "callable" http trigger in
      * Google Cloud Functions.
      */
    type HttpsCallable = js.Function1[/* data */ js.UndefOr[js.Any], js.Promise[HttpsCallableResult]]
  }
  
  @JSName("iid")
  @js.native
  object iidNs extends js.Object {
    @js.native
    trait InstanceId extends js.Object {
      def delete(): js.Promise[scala.Unit] = js.native
      def deleteToken(): js.Promise[scala.Unit] = js.native
      def deleteToken(authorizedEntity: java.lang.String): js.Promise[scala.Unit] = js.native
      def deleteToken(authorizedEntity: java.lang.String, scope: java.lang.String): js.Promise[scala.Unit] = js.native
      def get(): js.Promise[java.lang.String] = js.native
      def getToken(): js.Promise[java.lang.String] = js.native
      def getToken(authorizedEntity: java.lang.String): js.Promise[java.lang.String] = js.native
      def getToken(authorizedEntity: java.lang.String, scope: java.lang.String): js.Promise[java.lang.String] = js.native
    }
    
  }
  
  @JSName("links")
  @js.native
  object linksNs extends js.Object {
    trait AnalyticsParameters extends js.Object {
      def setCampaign(campaign: java.lang.String): DynamicLink
      def setContent(content: java.lang.String): DynamicLink
      def setMedium(medium: java.lang.String): DynamicLink
      def setSource(source: java.lang.String): DynamicLink
      def setTerm(term: java.lang.String): DynamicLink
    }
    
    trait AndroidParameters extends js.Object {
      def setFallbackUrl(fallbackUrl: java.lang.String): DynamicLink
      def setMinimumVersion(minimumVersion: scala.Double): DynamicLink
      def setPackageName(packageName: java.lang.String): DynamicLink
    }
    
    @js.native
    class DynamicLink protected () extends js.Object {
      def this(link: java.lang.String, dynamicLinkDomain: java.lang.String) = this()
      var analytics: AnalyticsParameters = js.native
      var android: AndroidParameters = js.native
      var ios: IOSParameters = js.native
      var itunes: ITunesParameters = js.native
      var navigation: NavigationParameters = js.native
      var social: SocialParameters = js.native
    }
    
    trait IOSParameters extends js.Object {
      def setAppStoreId(appStoreId: java.lang.String): DynamicLink
      def setBundleId(bundleId: java.lang.String): DynamicLink
      def setCustomScheme(customScheme: java.lang.String): DynamicLink
      def setFallbackUrl(fallbackUrl: java.lang.String): DynamicLink
      def setIPadBundleId(iPadBundleId: java.lang.String): DynamicLink
      def setIPadFallbackUrl(iPadFallbackUrl: java.lang.String): DynamicLink
      def setMinimumVersion(minimumVersion: java.lang.String): DynamicLink
    }
    
    trait ITunesParameters extends js.Object {
      def setAffiliateToken(affiliateToken: java.lang.String): DynamicLink
      def setCampaignToken(campaignToken: java.lang.String): DynamicLink
      def setProviderToken(providerToken: java.lang.String): DynamicLink
    }
    
    @js.native
    trait Links extends js.Object {
      /** Creates a standard dynamic link. */
      def createDynamicLink(dynamicLink: DynamicLink): js.Promise[java.lang.String] = js.native
      /** Creates a short dynamic link. */
      @JSName("createShortDynamicLink")
      def createShortDynamicLink_SHORT(
        dynamicLink: DynamicLink,
        `type`: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.SHORT
      ): js.Promise[java.lang.String] = js.native
      @JSName("createShortDynamicLink")
      def createShortDynamicLink_UNGUESSABLE(
        dynamicLink: DynamicLink,
        `type`: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.UNGUESSABLE
      ): js.Promise[java.lang.String] = js.native
      /**
        * Returns the URL that the app has been launched from. If the app was
        * not launched from a URL the return value will be null.
        */
      def getInitialLink(): js.Promise[java.lang.String | scala.Null] = js.native
      /**
        * Subscribe to URL open events while the app is still running.
        * The listener is called from URL open events whilst the app is still
        * running, use getInitialLink for URLs which cause the app to open
        * from a previously closed / not running state.
        * Returns an unsubscribe function, call the returned function to
        * unsubscribe from all future events.
        */
      def onLink(listener: js.Function1[/* url */ java.lang.String, scala.Unit]): js.Function0[scala.Unit] = js.native
    }
    
    trait LinksStatics extends js.Object {
      var DynamicLink: org.scalablytyped.runtime.Instantiable2[/* link */ java.lang.String, /* dynamicLinkDomain */ java.lang.String, DynamicLink]
    }
    
    trait NavigationParameters extends js.Object {
      def setForcedRedirectEnabled(forcedRedirectEnabled: scala.Boolean): DynamicLink
    }
    
    trait SocialParameters extends js.Object {
      def setDescriptionText(descriptionText: java.lang.String): DynamicLink
      def setImageUrl(imageUrl: java.lang.String): DynamicLink
      def setTitle(title: java.lang.String): DynamicLink
    }
    
  }
  
  @JSName("messaging")
  @js.native
  object messagingNs extends js.Object {
    @js.native
    class IOSMessaging () extends js.Object {
      /**
        * Returns the devices APNS token.
        */
      def getAPNSToken(): js.Promise[java.lang.String | scala.Null] = js.native
      /**
        * Register for iOS remote notifications
        */
      def registerForRemoteNotifications(): js.Promise[scala.Unit] = js.native
    }
    
    @js.native
    trait Messaging extends js.Object {
      /**
        * Returns firebase.messaging.IOSMessaging that gets the
        *  iOS specific methods and properties of messaging.
        */
      var ios: IOSMessaging = js.native
      def deleteToken(): js.Promise[scala.Unit] = js.native
      def deleteToken(authorizedEntity: java.lang.String): js.Promise[scala.Unit] = js.native
      def deleteToken(authorizedEntity: java.lang.String, scope: java.lang.String): js.Promise[scala.Unit] = js.native
      /**
        * Returns the devices FCM token.
        */
      def getToken(): js.Promise[java.lang.String] = js.native
      /**
        * Checks if the app has notification permissions.
        */
      def hasPermission(): js.Promise[scala.Boolean] = js.native
      /**
        * On a new message,
        * the payload object is passed to the listener callback.
        * This method is only triggered when the app is running.
        */
      def onMessage(listener: js.Function1[/* message */ js.Any, _]): js.Function0[_] = js.native
      /**
        * On the event a devices FCM token is refreshed by Google,
        *  the new token is returned in a callback listener.
        */
      def onTokenRefresh(listener: js.Function1[/* token */ java.lang.String, _]): js.Function0[_] = js.native
      /**
        * Requests app notification permissions in an Alert dialog.
        */
      def requestPermission(): js.Promise[scala.Unit] = js.native
      /**
        * Send an upstream message
        */
      def sendMessage(remoteMessage: RemoteMessage): js.Promise[scala.Unit] = js.native
      /**
        * Subscribes the device to a topic.
        */
      def subscribeToTopic(topic: java.lang.String): scala.Unit = js.native
      /**
        * Unsubscribe the device from a topic.
        */
      def unsubscribeFromTopic(topic: java.lang.String): scala.Unit = js.native
    }
    
    trait MessagingStatics extends js.Object {
      var RemoteMessage: org.scalablytyped.runtime.Instantiable0[RemoteMessage]
    }
    
    @js.native
    class RemoteMessage () extends js.Object {
      var collapseKey: js.UndefOr[java.lang.String] = js.native
      var data: js.Object = js.native
      var from: js.UndefOr[java.lang.String] = js.native
      var messageId: js.UndefOr[java.lang.String] = js.native
      var messageType: java.lang.String = js.native
      var sentTime: js.UndefOr[scala.Double] = js.native
      var to: js.UndefOr[java.lang.String] = js.native
      var ttl: js.UndefOr[scala.Double] = js.native
      def setCollapseKey(collapseKey: java.lang.String): RemoteMessage = js.native
      def setData(data: js.Object): RemoteMessage = js.native
      def setMessageId(messageId: java.lang.String): RemoteMessage = js.native
      def setMessageType(messageType: java.lang.String): RemoteMessage = js.native
      def setTo(to: java.lang.String): RemoteMessage = js.native
      def setTtl(ttl: scala.Double): RemoteMessage = js.native
    }
    
  }
  
  @JSName("notifications")
  @js.native
  object notificationsNs extends js.Object {
    @js.native
    class AndroidNotification () extends js.Object {
      var actions: js.UndefOr[
            js.Array[
              reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.AndroidNs.Action
            ]
          ] = js.native
      var autoCancel: js.UndefOr[scala.Boolean] = js.native
      var badgeIconType: js.UndefOr[
            reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.AndroidNs.BadgeIconType
          ] = js.native
      var bigPicture: js.UndefOr[js.Any] = js.native
      var bigText: js.UndefOr[js.Any] = js.native
      var category: js.UndefOr[
            reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.AndroidNs.Category
          ] = js.native
      var channelId: js.UndefOr[java.lang.String] = js.native
      var clickAction: js.UndefOr[java.lang.String] = js.native
      var color: js.UndefOr[java.lang.String] = js.native
      var colorized: js.UndefOr[scala.Boolean] = js.native
      var contentInfo: js.UndefOr[java.lang.String] = js.native
      var defaults: js.UndefOr[
            js.Array[
              reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.AndroidNs.Defaults
            ]
          ] = js.native
      var group: js.UndefOr[java.lang.String] = js.native
      var groupAlertBehaviour: js.UndefOr[
            reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.AndroidNs.GroupAlert
          ] = js.native
      var groupSummary: js.UndefOr[scala.Boolean] = js.native
      var largeIcon: js.UndefOr[java.lang.String] = js.native
      var lights: js.UndefOr[
            reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.AndroidNs.Lights
          ] = js.native
      var localOnly: js.UndefOr[scala.Boolean] = js.native
      var number: js.UndefOr[scala.Double] = js.native
      var ongoing: js.UndefOr[scala.Boolean] = js.native
      var onlyAlertOnce: js.UndefOr[scala.Boolean] = js.native
      var people: js.UndefOr[js.Array[java.lang.String]] = js.native
      var priority: js.UndefOr[
            reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.AndroidNs.Priority
          ] = js.native
      var progress: js.UndefOr[
            reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.AndroidNs.Progress
          ] = js.native
      var remoteInputHistory: js.UndefOr[js.Array[java.lang.String]] = js.native
      var shortcutId: js.UndefOr[java.lang.String] = js.native
      var showWhen: js.UndefOr[scala.Boolean] = js.native
      var smallIcon: js.UndefOr[js.Any] = js.native
      var sortKey: js.UndefOr[java.lang.String] = js.native
      var tag: js.UndefOr[java.lang.String] = js.native
      var ticker: js.UndefOr[java.lang.String] = js.native
      var timeoutAfter: js.UndefOr[scala.Double] = js.native
      var usesChronometer: js.UndefOr[scala.Boolean] = js.native
      var vibrate: js.UndefOr[js.Array[scala.Double]] = js.native
      var visibility: js.UndefOr[
            reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.AndroidNs.Visibility
          ] = js.native
      var when: js.UndefOr[scala.Double] = js.native
      def addAction(
        action: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.AndroidNs.Action
      ): Notification = js.native
      def addPerson(person: java.lang.String): Notification = js.native
      def setAutoCancel(autoCancel: scala.Boolean): Notification = js.native
      def setBadgeIconType(
        badgeIconType: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.AndroidNs.BadgeIconType
      ): Notification = js.native
      def setBigPicture(picture: java.lang.String): Notification = js.native
      def setBigPicture(picture: java.lang.String, largeIcon: java.lang.String): Notification = js.native
      def setBigPicture(picture: java.lang.String, largeIcon: java.lang.String, contentTitle: java.lang.String): Notification = js.native
      def setBigPicture(
        picture: java.lang.String,
        largeIcon: java.lang.String,
        contentTitle: java.lang.String,
        summaryText: java.lang.String
      ): Notification = js.native
      def setBigText(text: java.lang.String): Notification = js.native
      def setBigText(text: java.lang.String, contentTitle: java.lang.String): Notification = js.native
      def setBigText(text: java.lang.String, contentTitle: java.lang.String, summaryText: java.lang.String): Notification = js.native
      def setCategory(
        category: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.AndroidNs.Category
      ): Notification = js.native
      def setChannelId(channelId: java.lang.String): Notification = js.native
      def setClickAction(clickAction: java.lang.String): Notification = js.native
      def setColor(color: java.lang.String): Notification = js.native
      def setColorized(colorized: scala.Boolean): Notification = js.native
      def setContentInfo(contentInfo: java.lang.String): Notification = js.native
      def setDefaults(
        defaults: js.Array[
              reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.AndroidNs.Defaults
            ]
      ): Notification = js.native
      def setGroup(group: java.lang.String): Notification = js.native
      def setGroupAlertBehaviour(
        groupAlertBehaviour: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.AndroidNs.GroupAlert
      ): Notification = js.native
      def setGroupSummary(groupSummary: scala.Boolean): Notification = js.native
      def setLargeIcon(largeIcon: java.lang.String): Notification = js.native
      def setLights(argb: scala.Double, onMs: scala.Double, offMs: scala.Double): Notification = js.native
      def setLocalOnly(localOnly: scala.Boolean): Notification = js.native
      def setNumber(number: scala.Double): Notification = js.native
      def setOngoing(ongoing: scala.Boolean): Notification = js.native
      def setOnlyAlertOnce(onlyAlertOnce: scala.Boolean): Notification = js.native
      def setPriority(
        priority: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.AndroidNs.Priority
      ): Notification = js.native
      def setProgress(max: scala.Double, progress: scala.Double, indeterminate: scala.Boolean): Notification = js.native
      //setPublicVersion(publicVersion: Notification): Notification
      def setRemoteInputHistory(remoteInputHistory: js.Array[java.lang.String]): Notification = js.native
      def setShortcutId(shortcutId: java.lang.String): Notification = js.native
      def setShowWhen(showWhen: scala.Boolean): Notification = js.native
      def setSmallIcon(icon: java.lang.String): Notification = js.native
      def setSmallIcon(icon: java.lang.String, level: scala.Double): Notification = js.native
      def setSortKey(sortKey: java.lang.String): Notification = js.native
      def setTag(tag: java.lang.String): Notification = js.native
      def setTicker(ticker: java.lang.String): Notification = js.native
      def setTimeoutAfter(timeoutAfter: scala.Double): Notification = js.native
      def setUsesChronometer(usesChronometer: scala.Boolean): Notification = js.native
      def setVibrate(vibrate: js.Array[scala.Double]): Notification = js.native
      def setVisibility(
        visibility: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.AndroidNs.Visibility
      ): Notification = js.native
      def setWhen(when: scala.Double): Notification = js.native
    }
    
    trait AndroidNotifications extends js.Object {
      def createChannel(
        channel: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.AndroidNs.Channel
      ): js.Promise[scala.Unit]
      def createChannelGroup(
        channelGroup: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.AndroidNs.ChannelGroup
      ): js.Promise[scala.Unit]
      def createChannelGroups(
        channelGroups: js.Array[
              reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.AndroidNs.ChannelGroup
            ]
      ): js.Promise[scala.Unit]
      def createChannels(
        channels: js.Array[
              reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.AndroidNs.Channel
            ]
      ): js.Promise[scala.Unit]
      def deleteChannel(channelId: java.lang.String): js.Promise[scala.Unit]
      def deleteChannelGroup(groupId: java.lang.String): js.Promise[scala.Unit]
    }
    
    @js.native
    class IOSAttachment () extends js.Object {
      var identifier: java.lang.String = js.native
      var options: IOSAttachmentOptions = js.native
      var url: java.lang.String = js.native
    }
    
    @js.native
    class IOSAttachmentOptions () extends js.Object {
      var thumbnailClippingRect: js.Any = js.native
      var thumbnailHidden: scala.Boolean = js.native
      var thumbnailTime: java.lang.String = js.native
      var typeHint: java.lang.String = js.native
    }
    
    @js.native
    class IOSNotification () extends js.Object {
      var alertAction: js.UndefOr[java.lang.String] = js.native
      var attachments: js.Array[IOSAttachment] = js.native
      var badge: js.UndefOr[scala.Double] = js.native
      var category: js.UndefOr[java.lang.String] = js.native
      var complete: js.UndefOr[CompletionHandler] = js.native
      var hasAction: js.UndefOr[scala.Boolean] = js.native
      var launchImage: js.UndefOr[java.lang.String] = js.native
      var threadIdentifier: js.UndefOr[java.lang.String] = js.native
      def addAttachment(identifier: java.lang.String, url: java.lang.String, options: IOSAttachmentOptions): Notification = js.native
      def setAlertAction(alertAction: java.lang.String): Notification = js.native
      def setBadge(badge: scala.Double): Notification = js.native
      def setCategory(category: java.lang.String): Notification = js.native
      def setHasAction(hasAction: scala.Boolean): Notification = js.native
      def setLaunchImage(launchImage: java.lang.String): Notification = js.native
      def setThreadIdentifier(threadIdentifier: java.lang.String): Notification = js.native
    }
    
    @js.native
    class Notification () extends js.Object {
      var android: AndroidNotification = js.native
      var body: java.lang.String = js.native
      var data: js.Any = js.native
      var ios: IOSNotification = js.native
      var notificationId: java.lang.String = js.native
      var sound: js.UndefOr[java.lang.String] = js.native
      var subtitle: js.UndefOr[java.lang.String] = js.native
      var title: java.lang.String = js.native
      def setBody(body: java.lang.String): Notification = js.native
      def setData(data: js.Any): Notification = js.native
      def setNotificationId(notificationId: java.lang.String): Notification = js.native
      def setSound(sound: java.lang.String): Notification = js.native
      def setSubtitle(subtitle: java.lang.String): Notification = js.native
      def setTitle(title: java.lang.String): Notification = js.native
    }
    
    @js.native
    class NotificationOpen () extends js.Object {
      var action: java.lang.String = js.native
      var notification: Notification = js.native
      var results: js.UndefOr[js.Any] = js.native
    }
    
    trait Notifications extends js.Object {
      var android: AndroidNotifications
      /**
        * Cancels all notifications
        */
      def cancelAllNotifications(): scala.Unit
      /**
        * Cancels a notification by ID
        */
      def cancelNotification(notificationId: java.lang.String): scala.Unit
      def displayNotification(notification: Notification): js.Promise[scala.Unit]
      /**
        * Returns the current badge number on the app icon.
        */
      def getBadge(): js.Promise[scala.Double]
      def getInitialNotification(): js.Promise[NotificationOpen]
      def getScheduledNotifications(): js.Promise[js.Array[Notification]]
      def onNotification(listener: js.Function1[/* notification */ Notification, _]): js.Function0[_]
      def onNotificationDisplayed(listener: js.Function1[/* notification */ Notification, _]): js.Function0[_]
      def onNotificationOpened(listener: js.Function1[/* notificationOpen */ NotificationOpen, _]): js.Function0[_]
      def removeAllDeliveredNotifications(): scala.Unit
      def removeDeliveredNotification(notificationId: java.lang.String): scala.Unit
      /**
        * Schedule a local notification to be shown on the device.
        */
      def scheduleNotification(notification: Notification, schedule: js.Any): js.Any
      /**
        * Sets the badge number on the iOS app icon.
        */
      def setBadge(badge: scala.Double): scala.Unit
    }
    
    trait NotificationsStatics extends js.Object {
      var Android: reactDashNativeDashFirebaseLib.Anon_Action
      var Notification: org.scalablytyped.runtime.Instantiable0[Notification]
    }
    
    @JSName("Android")
    @js.native
    object AndroidNs extends js.Object {
      @js.native
      class Action protected () extends js.Object {
        def this(action: java.lang.String, icon: java.lang.String, title: java.lang.String) = this()
        var action: java.lang.String = js.native
        var allowGeneratedReplies: scala.Boolean = js.native
        var icon: java.lang.String = js.native
        var remoteInputs: js.Array[RemoteInput] = js.native
        var semanticAction: js.UndefOr[SemanticAction] = js.native
        var showUserInterface: js.UndefOr[scala.Boolean] = js.native
        var title: java.lang.String = js.native
        def addRemoteInput(remoteInput: RemoteInput): Action = js.native
        def setAllowGenerateReplies(allowGeneratedReplies: scala.Boolean): Action = js.native
        def setSemanticAction(semanticAction: SemanticAction): Action = js.native
        def setShowUserInterface(showUserInterface: scala.Boolean): Action = js.native
      }
      
      @js.native
      sealed trait BadgeIconType extends js.Object
      
      @js.native
      class Channel protected () extends js.Object {
        def this(channelId: java.lang.String, name: java.lang.String, importance: Importance) = this()
        var bypassDnd: js.UndefOr[scala.Boolean] = js.native
        var channelId: java.lang.String = js.native
        var description: js.UndefOr[java.lang.String] = js.native
        var group: js.UndefOr[java.lang.String] = js.native
        var importance: Importance = js.native
        var lightColor: js.UndefOr[java.lang.String] = js.native
        var lightsEnabled: js.UndefOr[scala.Boolean] = js.native
        var lockScreenVisibility: js.UndefOr[Visibility] = js.native
        var name: java.lang.String = js.native
        var showBadge: js.UndefOr[scala.Boolean] = js.native
        var sound: js.UndefOr[java.lang.String] = js.native
        var vibrationEnabled: js.UndefOr[scala.Boolean] = js.native
        var vibrationPattern: js.UndefOr[js.Array[scala.Double]] = js.native
        def enableLights(lightsEnabled: scala.Boolean): Channel = js.native
        def enableVibration(vibrationEnabled: scala.Boolean): Channel = js.native
        def setBypassDnd(bypassDnd: scala.Boolean): Channel = js.native
        def setDescription(description: java.lang.String): Channel = js.native
        def setGroup(groupId: java.lang.String): Channel = js.native
        def setLightColor(lightColor: java.lang.String): Channel = js.native
        def setLockScreenVisibility(lockScreenVisibility: Visibility): Channel = js.native
        def setShowBadge(showBadge: scala.Boolean): Channel = js.native
        def setSound(sound: java.lang.String): Channel = js.native
        def setVibrationPattern(vibrationPattern: js.Array[scala.Double]): Channel = js.native
      }
      
      @js.native
      class ChannelGroup protected () extends js.Object {
        def this(groupId: java.lang.String, name: java.lang.String) = this()
        var groupId: java.lang.String = js.native
        var name: java.lang.String = js.native
      }
      
      @js.native
      sealed trait Defaults extends js.Object
      
      @js.native
      sealed trait GroupAlert extends js.Object
      
      @js.native
      sealed trait Importance extends js.Object
      
      @js.native
      class Lights () extends js.Object {
        var argb: scala.Double = js.native
        var offMs: scala.Double = js.native
        var onMs: scala.Double = js.native
      }
      
      @js.native
      sealed trait Priority extends js.Object
      
      @js.native
      class Progress () extends js.Object {
        var indeterminate: scala.Boolean = js.native
        var max: scala.Double = js.native
        var progress: scala.Double = js.native
      }
      
      @js.native
      class RemoteInput protected () extends js.Object {
        def this(resultKey: java.lang.String) = this()
        var allowFreeFormInput: js.UndefOr[scala.Boolean] = js.native
        var allowedDataTypes: js.Array[_] = js.native
        var choices: js.Array[java.lang.String] = js.native
        var label: js.UndefOr[java.lang.String] = js.native
        var resultKey: java.lang.String = js.native
        def setAllowDataType(mimeType: java.lang.String, allow: scala.Boolean): RemoteInput = js.native
        def setAllowFreeFormInput(allowFreeFormInput: scala.Boolean): RemoteInput = js.native
        def setChoices(choices: js.Array[java.lang.String]): RemoteInput = js.native
        def setLabel(label: java.lang.String): RemoteInput = js.native
      }
      
      @js.native
      sealed trait SemanticAction extends js.Object
      
      @js.native
      sealed trait Visibility extends js.Object
      
      @js.native
      object BadgeIconType extends js.Object {
        @js.native
        sealed trait Large
          extends reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.AndroidNs.BadgeIconType
        
        @js.native
        sealed trait None
          extends reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.AndroidNs.BadgeIconType
        
        @js.native
        sealed trait Small
          extends reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.AndroidNs.BadgeIconType
        
        /* 2 */ val Large: Large with scala.Double = js.native
        /* 0 */ val None: None with scala.Double = js.native
        /* 1 */ val Small: Small with scala.Double = js.native
        @JSBracketAccess
        def apply(value: scala.Double): js.UndefOr[
                reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.AndroidNs.BadgeIconType with scala.Double
              ] = js.native
      }
      
      @js.native
      object Defaults extends js.Object {
        @js.native
        sealed trait All
          extends reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.AndroidNs.Defaults
        
        @js.native
        sealed trait Lights
          extends reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.AndroidNs.Defaults
        
        @js.native
        sealed trait Sound
          extends reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.AndroidNs.Defaults
        
        @js.native
        sealed trait Vibrate
          extends reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.AndroidNs.Defaults
        
        /* -1 */ val All: All with scala.Double = js.native
        /* 4 */ val Lights: Lights with scala.Double = js.native
        /* 1 */ val Sound: Sound with scala.Double = js.native
        /* 2 */ val Vibrate: Vibrate with scala.Double = js.native
        @JSBracketAccess
        def apply(value: scala.Double): js.UndefOr[
                reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.AndroidNs.Defaults with scala.Double
              ] = js.native
      }
      
      @js.native
      object GroupAlert extends js.Object {
        @js.native
        sealed trait All
          extends reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.AndroidNs.GroupAlert
        
        @js.native
        sealed trait Children
          extends reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.AndroidNs.GroupAlert
        
        @js.native
        sealed trait Summary
          extends reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.AndroidNs.GroupAlert
        
        /* 0 */ val All: All with scala.Double = js.native
        /* 2 */ val Children: Children with scala.Double = js.native
        /* 1 */ val Summary: Summary with scala.Double = js.native
        @JSBracketAccess
        def apply(value: scala.Double): js.UndefOr[
                reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.AndroidNs.GroupAlert with scala.Double
              ] = js.native
      }
      
      @js.native
      object Importance extends js.Object {
        @js.native
        sealed trait Default
          extends reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.AndroidNs.Importance
        
        @js.native
        sealed trait High
          extends reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.AndroidNs.Importance
        
        @js.native
        sealed trait Low
          extends reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.AndroidNs.Importance
        
        @js.native
        sealed trait Max
          extends reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.AndroidNs.Importance
        
        @js.native
        sealed trait Min
          extends reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.AndroidNs.Importance
        
        @js.native
        sealed trait None
          extends reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.AndroidNs.Importance
        
        @js.native
        sealed trait Unspecified
          extends reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.AndroidNs.Importance
        
        /* 3 */ val Default: Default with scala.Double = js.native
        /* 4 */ val High: High with scala.Double = js.native
        /* 2 */ val Low: Low with scala.Double = js.native
        /* 5 */ val Max: Max with scala.Double = js.native
        /* 1 */ val Min: Min with scala.Double = js.native
        /* 3 */ val None: None with scala.Double = js.native
        /* -1000 */ val Unspecified: Unspecified with scala.Double = js.native
        @JSBracketAccess
        def apply(value: scala.Double): js.UndefOr[
                reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.AndroidNs.Importance with scala.Double
              ] = js.native
      }
      
      @js.native
      object Priority extends js.Object {
        @js.native
        sealed trait Default
          extends reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.AndroidNs.Priority
        
        @js.native
        sealed trait High
          extends reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.AndroidNs.Priority
        
        @js.native
        sealed trait Low
          extends reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.AndroidNs.Priority
        
        @js.native
        sealed trait Max
          extends reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.AndroidNs.Priority
        
        @js.native
        sealed trait Min
          extends reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.AndroidNs.Priority
        
        /* 0 */ val Default: Default with scala.Double = js.native
        /* 1 */ val High: High with scala.Double = js.native
        /* -1 */ val Low: Low with scala.Double = js.native
        /* 2 */ val Max: Max with scala.Double = js.native
        /* -2 */ val Min: Min with scala.Double = js.native
        @JSBracketAccess
        def apply(value: scala.Double): js.UndefOr[
                reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.AndroidNs.Priority with scala.Double
              ] = js.native
      }
      
      @js.native
      object SemanticAction extends js.Object {
        @js.native
        sealed trait Archive
          extends reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.AndroidNs.SemanticAction
        
        @js.native
        sealed trait Call
          extends reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.AndroidNs.SemanticAction
        
        @js.native
        sealed trait Delete
          extends reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.AndroidNs.SemanticAction
        
        @js.native
        sealed trait MarkAsRead
          extends reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.AndroidNs.SemanticAction
        
        @js.native
        sealed trait MarkAsUnread
          extends reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.AndroidNs.SemanticAction
        
        @js.native
        sealed trait Mute
          extends reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.AndroidNs.SemanticAction
        
        @js.native
        sealed trait None
          extends reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.AndroidNs.SemanticAction
        
        @js.native
        sealed trait Reply
          extends reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.AndroidNs.SemanticAction
        
        @js.native
        sealed trait ThumbsDown
          extends reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.AndroidNs.SemanticAction
        
        @js.native
        sealed trait ThumbsUp
          extends reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.AndroidNs.SemanticAction
        
        @js.native
        sealed trait Unmute
          extends reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.AndroidNs.SemanticAction
        
        /* 5 */ val Archive: Archive with scala.Double = js.native
        /* 10 */ val Call: Call with scala.Double = js.native
        /* 4 */ val Delete: Delete with scala.Double = js.native
        /* 2 */ val MarkAsRead: MarkAsRead with scala.Double = js.native
        /* 3 */ val MarkAsUnread: MarkAsUnread with scala.Double = js.native
        /* 6 */ val Mute: Mute with scala.Double = js.native
        /* 0 */ val None: None with scala.Double = js.native
        /* 1 */ val Reply: Reply with scala.Double = js.native
        /* 9 */ val ThumbsDown: ThumbsDown with scala.Double = js.native
        /* 8 */ val ThumbsUp: ThumbsUp with scala.Double = js.native
        /* 7 */ val Unmute: Unmute with scala.Double = js.native
        @JSBracketAccess
        def apply(value: scala.Double): js.UndefOr[
                reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.AndroidNs.SemanticAction with scala.Double
              ] = js.native
      }
      
      @js.native
      object Visibility extends js.Object {
        @js.native
        sealed trait Private
          extends reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.AndroidNs.Visibility
        
        @js.native
        sealed trait Public
          extends reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.AndroidNs.Visibility
        
        @js.native
        sealed trait Secret
          extends reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.AndroidNs.Visibility
        
        /* 0 */ val Private: Private with scala.Double = js.native
        /* 1 */ val Public: Public with scala.Double = js.native
        /* -1 */ val Secret: Secret with scala.Double = js.native
        @JSBracketAccess
        def apply(value: scala.Double): js.UndefOr[
                reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.notificationsNs.AndroidNs.Visibility with scala.Double
              ] = js.native
      }
      
      type Category = reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.alarm | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.call | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.email | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.err | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.event | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.msg | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.progress | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.promo | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.recommendation | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.reminder | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.service | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.social | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.status | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.system | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.transport
    }
    
    type BackgroundFetchResultValue = java.lang.String
    type CompletionHandler = js.Function1[/* backgroundFetchResult */ BackgroundFetchResultValue, scala.Unit]
  }
  
  @JSName("perf")
  @js.native
  object perfNs extends js.Object {
    trait HttpMetric extends js.Object {
      /**
        * Return an attribute by name, or null if it does not exist.
        */
      def getAttribute(attribute: java.lang.String): js.Promise[java.lang.String | scala.Null]
      /**
        * Return an object of key-value attributes.
        */
      def getAttributes(): js.Promise[js.Object]
      /**
        * Set an attribute. Returns true if it was set, false if it was not.
        */
      def putAttribute(attribute: java.lang.String, value: java.lang.String): js.Promise[
            reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibNumbers.`true` | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibNumbers.`false`
          ]
      /**
        * Remove an attribute by name.
        */
      def removeAttribute(attribute: java.lang.String): js.Promise[scala.Null]
      /**
        * Set the request HTTP response code.
        */
      def setHttpResponseCode(code: scala.Double): js.Promise[scala.Null]
      /**
        * Set the request payload size, in bytes.
        */
      def setRequestPayloadSize(bytes: scala.Double): js.Promise[scala.Null]
      /**
        * Set the response content type.
        */
      def setResponseContentType(`type`: java.lang.String): js.Promise[scala.Null]
      /**
        * Set the response payload size, in bytes.
        */
      def setResponsePayloadSize(bytes: scala.Double): js.Promise[scala.Null]
      /**
        * Start a HttpMetric instance.
        */
      def start(): js.Promise[scala.Null]
      /**
        * Stop a HttpMetric instance.
        */
      def stop(): js.Promise[scala.Null]
    }
    
    trait Perf extends js.Object {
      /**
        * Returns a new HTTP Metric instance.
        */
      def newHttpMetric(url: java.lang.String, httpMethod: HttpMethod): HttpMetric
      /**
        * Returns a new Trace instance.
        */
      def newTrace(trace: java.lang.String): Trace
      /**
        * Globally enable or disable performance monitoring.
        */
      def setPerformanceCollectionEnabled(enabled: scala.Boolean): scala.Unit
    }
    
    trait Trace extends js.Object {
      /**
        * Return an attribute by name, or null if it does not exist.
        */
      def getAttribute(attribute: java.lang.String): js.Promise[java.lang.String | scala.Null]
      /**
        * Return an object of key-value attributes.
        */
      def getAttributes(): js.Promise[js.Object]
      /**
        * Get a metric by name. Returns 0 if it does not exist.
        */
      def getMetric(metricName: java.lang.String): js.Promise[scala.Double]
      /**
        * Increment a metric by name and value.
        */
      def incrementMetric(metricName: java.lang.String, incrementBy: scala.Double): js.Promise[scala.Null]
      /**
        * Set an attribute. Returns true if it was set, false if it was not.
        */
      def putAttribute(attribute: java.lang.String, value: java.lang.String): js.Promise[
            reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibNumbers.`true` | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibNumbers.`false`
          ]
      /**
        * Set a metric.
        */
      def putMetric(metricName: java.lang.String, value: scala.Double): js.Promise[scala.Null]
      /**
        * Remove an attribute by name.
        */
      def removeAttribute(attribute: java.lang.String): js.Promise[scala.Null]
      /**
        * Start a Trace instance.
        */
      def start(): js.Promise[scala.Null]
      /**
        * Stop a Trace instance.
        */
      def stop(): js.Promise[scala.Null]
    }
    
    type HttpMethod = reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.CONNECT | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.DELETE | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.GET | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.HEAD | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.OPTIONS | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.PATCH | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.POST | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.PUT | reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseLibStrings.TRACE
  }
  
  @JSName("storage")
  @js.native
  object storageNs extends js.Object {
    trait DownloadTaskSnapshot extends js.Object {
      var bytesTransferred: scala.Double
      var ref: Reference
      var state: TaskState
      var totalBytes: scala.Double
    }
    
    trait FullMetadata extends SettableMetadata {
      var bucket: java.lang.String
      var fullPath: java.lang.String
      var generation: java.lang.String
      var md5Hash: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      var metageneration: java.lang.String
      var name: java.lang.String
      var size: scala.Double
      var timeCreated: java.lang.String
      var updated: java.lang.String
    }
    
    /**
      * A reference represents a reference to a Google Cloud Storage object.
      *
      * You can upload, download, and delete objects, as well as get/set object
      * metadata for a file via this reference.
      */
    @js.native
    trait Reference extends js.Object {
      var fullPath: java.lang.String = js.native
      /**
        * Returns a reference to a relative path from this reference.
        *
        * @param path The relative path
        */
      def child(path: java.lang.String): Reference = js.native
      /**
        * Deletes the object at this reference's location.
        */
      def delete(): js.Promise[scala.Unit] = js.native
      /**
        * Downloads the storage object for this reference to the device file
        * path specified.
        *
        * @param filePath The destination path of the downloaded file.
        */
      def downloadFile(filePath: java.lang.String): StorageTask[DownloadTaskSnapshot] = js.native
      /**
        * Fetches a long lived download URL for this object.
        */
      def getDownloadURL(): js.Promise[java.lang.String] = js.native
      /**
        * Fetches metadata for the object at this location, if one exists.
        *
        * @returns A promise that is resolved with the metadata; or rejected on
        *          failure, including if the object does not exist.
        */
      def getMetadata(): js.Promise[FullMetadata] = js.native
      /**
        * Uploads the file path specified from the device into a storage object
        * for this reference.
        *
        * @param filePath The path to the file on the device. It must be a full
        *        file path.
        * @param metadata The metadata to associate with this file.
        */
      def putFile(filePath: java.lang.String): StorageTask[UploadTaskSnapshot] = js.native
      def putFile(filePath: java.lang.String, metadata: SettableMetadata): StorageTask[UploadTaskSnapshot] = js.native
      /**
        * Updates the metadata for the object at this location, if one exists.
        *
        * @param metadata
        */
      def updateMetadata(metadata: SettableMetadata): js.Promise[FullMetadata] = js.native
    }
    
    trait SettableMetadata extends js.Object {
      var cacheControl: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      var contentDisposition: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      var contentEncoding: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      var contentLanguage: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      var contentType: js.UndefOr[java.lang.String | scala.Null] = js.undefined
      var customMetadata: js.UndefOr[stdLib.Partial[stdLib.Record[java.lang.String, java.lang.String]]] = js.undefined
    }
    
    /**
      * The Firebase Storage service interface.
      *
      * An instance can be accessed using `firebase.storage()`.
      */
    @js.native
    class Storage () extends js.Object {
      /**
        * The app associated with the Storage service instance.
        */
      var app: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.App = js.native
      /**
        * Returns a reference for the given path in the default bucket.
        *
        * @param path A relative path to initialize the reference with, for
        *        example path/to/image.jpg. If not passed, the returned
        *        reference points to the bucket root.
        */
      def ref(): Reference = js.native
      def ref(path: java.lang.String): Reference = js.native
      /**
        * Returns a reference for the given absolute URL.
        *
        * @param url URL must be in the form of either
        *        -   a Cloud Storage URL, for example gs://bucket/files/image.png; or
        *        -   download URL taken from object metadata.
        */
      def refFromURL(url: java.lang.String): Reference = js.native
      /**
        * @param time The new maximum download retry time in milliseconds.
        */
      def setMaxDownloadRetryTime(time: scala.Double): scala.Unit = js.native
      /**
        * @param time The new maximum operation retry time in milliseconds.
        */
      def setMaxOperationRetryTime(time: scala.Double): scala.Unit = js.native
      /**
        * @param time The new maximum upload retry time in milliseconds.
        */
      def setMaxUploadRetryTime(time: scala.Double): scala.Unit = js.native
    }
    
    trait StorageStatics extends js.Object {
      var Native: js.UndefOr[reactDashNativeDashFirebaseLib.Anon_CACHESDIRECTORYPATH] = js.undefined
      var TaskEvent: TaskState
      var TaskState: TaskState
    }
    
    @js.native
    trait StorageTask[T]
      extends stdLib.Promise[T] {
      /**
        * Not supported by react-native-firebase
        */
      def cancel(): scala.Unit = js.native
      def on(
        event: TaskEvent,
        next: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.Handler[T]
      ): js.Function0[scala.Unit] = js.native
      def on(
        event: TaskEvent,
        next: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.Handler[T],
        error: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.ErrorHandler
      ): js.Function0[scala.Unit] = js.native
      def on(
        event: TaskEvent,
        next: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.Handler[T],
        error: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.ErrorHandler,
        complete: reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.Handler[T]
      ): js.Function0[scala.Unit] = js.native
      def on(event: TaskEvent, observer: reactDashNativeDashFirebaseLib.Anon_Complete[T]): js.Function0[scala.Unit] = js.native
      /**
        * Not supported by react-native-firebase
        */
      def pause(): scala.Unit = js.native
      /**
        * Not supported by react-native-firebase
        */
      def resume(): scala.Unit = js.native
    }
    
    @js.native
    sealed trait TaskEvent extends js.Object
    
    @js.native
    sealed trait TaskState extends js.Object
    
    trait UploadTaskSnapshot extends js.Object {
      var bytesTransferred: scala.Double
      var downloadURL: java.lang.String | scala.Null
      var metadata: FullMetadata
      var ref: Reference
      var state: TaskState
      var task: StorageTask[UploadTaskSnapshot]
      var totalBytes: scala.Double
    }
    
    @js.native
    object TaskEvent extends js.Object {
      @js.native
      sealed trait STATE_CHANGED
        extends reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.storageNs.TaskEvent
      
      /* "state_changed" */ val STATE_CHANGED: STATE_CHANGED with java.lang.String = js.native
      @JSBracketAccess
      def apply(value: java.lang.String): js.UndefOr[
            reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.storageNs.TaskEvent with java.lang.String
          ] = js.native
    }
    
    @js.native
    object TaskState extends js.Object {
      @js.native
      sealed trait CANCELLED
        extends reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.storageNs.TaskState
      
      @js.native
      sealed trait ERROR
        extends reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.storageNs.TaskState
      
      @js.native
      sealed trait PAUSED
        extends reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.storageNs.TaskState
      
      @js.native
      sealed trait RUNNING
        extends reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.storageNs.TaskState
      
      @js.native
      sealed trait SUCCESS
        extends reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.storageNs.TaskState
      
      /* "cancelled" */ val CANCELLED: CANCELLED with java.lang.String = js.native
      /* "error" */ val ERROR: ERROR with java.lang.String = js.native
      /* "paused" */ val PAUSED: PAUSED with java.lang.String = js.native
      /* "running" */ val RUNNING: RUNNING with java.lang.String = js.native
      /* "success" */ val SUCCESS: SUCCESS with java.lang.String = js.native
      @JSBracketAccess
      def apply(value: java.lang.String): js.UndefOr[
            reactDashNativeDashFirebaseLib.reactDashNativeDashFirebaseMod.RNFirebaseNs.storageNs.TaskState with java.lang.String
          ] = js.native
    }
    
  }
  
  type ErrorHandler = Handler[RnError]
  type Handler[T] = js.Function1[/* value */ T, scala.Unit]
}

