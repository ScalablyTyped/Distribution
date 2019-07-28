package typings.reactDashNativeDashGoogleDashSignin.reactDashNativeDashGoogleDashSigninMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("react-native-google-signin", "GoogleSignin")
@js.native
object GoogleSigninNs extends js.Object {
  /**
    * Configures the library for login. MUST be called before attempting login
    */
  def configure(): Unit = js.native
  def configure(params: ConfigureParams): Unit = js.native
  /**
    * Check if the device has Google Play Services installed. Always resolves
    * true on iOS
    */
  def hasPlayServices(): js.Promise[Boolean] = js.native
  def hasPlayServices(params: HasPlayServicesParams): js.Promise[Boolean] = js.native
  /**
    * Returns whether the user is currently signed in
    */
  def isSignedIn(): js.Promise[Boolean] = js.native
  /**
    * Removes your application from the user's authorized applications
    */
  def revokeAccess(): js.Promise[Unit] = js.native
  /**
    * Prompts the user to sign in with their Google account. Resolves with the
    * user if successful.
    */
  def signIn(): js.Promise[User] = js.native
  /**
    * Returns a Promise that resolves with the current signed in user or rejects
    * if not signed in.
    */
  def signInSilently(): js.Promise[User] = js.native
  /**
    * Signs the user out.
    */
  def signOut(): js.Promise[Unit] = js.native
}

