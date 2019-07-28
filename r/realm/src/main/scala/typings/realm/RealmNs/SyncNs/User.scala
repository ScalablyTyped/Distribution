package typings.realm.RealmNs.SyncNs

import org.scalablytyped.runtime.StringDictionary
import typings.realm.Anon_Provider
import typings.realm.Realm
import typings.realm.RealmNs.Configuration
import typings.realm.RealmNs.PartialConfiguration
import typings.realm.RealmNs.Results
import typings.realm.realmStrings.any
import typings.realm.realmStrings.currentUser
import typings.realm.realmStrings.otherUser
import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * User
  * @see { @link https://realm.io/docs/javascript/latest/api/Realm.Sync.User.html }
  */
@JSGlobal("Realm.Sync.User")
@js.native
class User () extends js.Object {
  val identity: String = js.native
  val isAdmin: Boolean = js.native
  val isAdminToken: Boolean = js.native
  val server: String = js.native
  val token: String = js.native
  def acceptPermissionOffer(token: String): js.Promise[String] = js.native
  def applyPermissions(condition: PermissionCondition, realmUrl: String, accessLevel: AccessLevel): js.Promise[PermissionChange] = js.native
  def createConfiguration(): Configuration = js.native
  def createConfiguration(config: PartialConfiguration): Configuration = js.native
  @JSName("getGrantedPermissions")
  def getGrantedPermissions_any(recipient: any): js.Promise[Results[Permission]] = js.native
  @JSName("getGrantedPermissions")
  def getGrantedPermissions_currentUser(recipient: currentUser): js.Promise[Results[Permission]] = js.native
  @JSName("getGrantedPermissions")
  def getGrantedPermissions_otherUser(recipient: otherUser): js.Promise[Results[Permission]] = js.native
  def invalidatePermissionOffer(permissionOfferOrToken: String): js.Promise[Unit] = js.native
  def invalidatePermissionOffer(permissionOfferOrToken: PermissionOffer): js.Promise[Unit] = js.native
  def logout(): js.Promise[Unit] = js.native
  def offerPermissions(realmUrl: String, accessLevel: AccessLevel): js.Promise[String] = js.native
  def offerPermissions(realmUrl: String, accessLevel: AccessLevel, expiresAt: Date): js.Promise[String] = js.native
  def openManagementRealm(): Realm = js.native
  def retrieveAccount(provider: String, username: String): js.Promise[Account] = js.native
  def serialize(): SerializedUser | SerializedTokenUser = js.native
}

/* static members */
@JSGlobal("Realm.Sync.User")
@js.native
object User extends js.Object {
  val all: StringDictionary[User] = js.native
  val current: User = js.native
  // Deprecated
  /** @deprecated, to be removed in future versions */
  def adminUser(adminToken: String): User = js.native
  def adminUser(adminToken: String, server: String): User = js.native
  /** @deprecated, to be removed in future versions */
  def authenticate(server: String, provider: String, options: js.Any): js.Promise[User] = js.native
  def completePasswordReset(server: String, resetToken: String, newPassword: String): js.Promise[Unit] = js.native
  def confirmEmail(server: String, confirmationToken: String): js.Promise[Unit] = js.native
  def deserialize(serialized: SerializedTokenUser): User = js.native
  def deserialize(serialized: SerializedUser): User = js.native
  def login(server: String, credentials: AdminCredentials): User = js.native
  def login(server: String, credentials: Credentials): js.Promise[User] = js.native
  /** @deprecated, to be removed in future versions */
  def login(server: String, username: String, password: String): js.Promise[User] = js.native
  /** @deprecated, to be removed in future versions */
  def register(server: String, username: String, password: String): js.Promise[User] = js.native
  /** @deprecated, to be removed in future versions */
  def registerWithProvider(server: String, options: Anon_Provider): js.Promise[User] = js.native
  def requestEmailConfirmation(server: String, email: String): js.Promise[Unit] = js.native
  def requestPasswordReset(server: String, email: String): js.Promise[Unit] = js.native
}

