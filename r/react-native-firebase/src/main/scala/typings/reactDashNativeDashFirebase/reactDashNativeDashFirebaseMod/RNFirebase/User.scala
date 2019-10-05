package typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.RNFirebase

import typings.reactDashNativeDashFirebase.reactDashNativeDashFirebaseMod.AuthCredential
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait User extends js.Object {
  /**
    * The user's display name (if available).
    */
  var displayName: String | Null = js.native
  /**
    * - The user's email address (if available).
    */
  var email: String | Null = js.native
  /**
    * - True if the user's email address has been verified.
    */
  var emailVerified: Boolean = js.native
  /**
    *
    */
  var isAnonymous: Boolean = js.native
  var metadata: UserMetadata = js.native
  var phoneNumber: String | Null = js.native
  /**
    * - The URL of the user's profile picture (if available).
    */
  var photoURL: String | Null = js.native
  /**
    * - Additional provider-specific information about the user.
    */
  var providerData: js.Array[UserInfo] = js.native
  /**
    *  - The authentication provider ID for the current user.
    *  For example, 'facebook.com', or 'google.com'.
    */
  var providerId: String = js.native
  /**
    *  - The user's unique ID.
    */
  var uid: String = js.native
  /**
    * Delete the current user.
    */
  def delete(): js.Promise[Unit] = js.native
  /**
    * Returns the users authentication token.
    *
    * @param forceRefresh: boolean - default to false
    */
  def getIdToken(): js.Promise[String] = js.native
  def getIdToken(forceRefresh: Boolean): js.Promise[String] = js.native
  /**
    * Returns a firebase.auth.IdTokenResult object which contains the ID token JWT string and
    * other helper properties for getting different data associated with the token as well as
    * all the decoded payload claims.
    *
    * @param forceRefresh boolean Force refresh regardless of token expiration.
    */
  def getIdTokenResult(): js.Promise[IdTokenResult] = js.native
  def getIdTokenResult(forceRefresh: Boolean): js.Promise[IdTokenResult] = js.native
  /**
    * @deprecated
    * @param credential
    */
  def linkAndRetrieveDataWithCredential(credential: AuthCredential): js.Promise[UserCredential] = js.native
  /**
    * Link the user with a 3rd party credential provider.
    */
  def linkWithCredential(credential: AuthCredential): js.Promise[UserCredential] = js.native
  /**
    * @deprecated
    * @param credential
    */
  def reauthenticateAndRetrieveDataWithCredential(credential: AuthCredential): js.Promise[UserCredential] = js.native
  /**
    * Re-authenticate a user with a third-party authentication provider
    */
  def reauthenticateWithCredential(credential: AuthCredential): js.Promise[UserCredential] = js.native
  /**
    * Refreshes the current user.
    */
  def reload(): js.Promise[Unit] = js.native
  /**
    * Sends a verification email to a user.
    * This will Promise reject is the user is anonymous.
    */
  def sendEmailVerification(): js.Promise[Unit] = js.native
  def sendEmailVerification(actionCodeSettings: ActionCodeSettings): js.Promise[Unit] = js.native
  def toJSON(): js.Object = js.native
  def unlink(providerId: String): js.Promise[User] = js.native
  /**
    * Updates the user's email address.
    * See Firebase docs for more information on security & email validation.
    * This will Promise reject is the user is anonymous.
    */
  def updateEmail(email: String): js.Promise[Unit] = js.native
  /**
    * Important: this is a security sensitive operation that requires the user to have recently signed in.
    * If this requirement isn't met, ask the user to authenticate again and then call firebase.User#reauthenticate.
    * This will Promise reject is the user is anonymous.
    */
  def updatePassword(password: String): js.Promise[Unit] = js.native
  /**
    * Updates the user's phone number.
    * See Firebase docs for more information on security & email validation.
    * This will Promise reject is the user is anonymous.
    */
  def updatePhoneNumber(credential: AuthCredential): js.Promise[Unit] = js.native
  /**
    * Updates a user's profile data.
    * Profile data should be an object of fields to update:
    */
  def updateProfile(updates: UpdateProfile): js.Promise[Unit] = js.native
}

