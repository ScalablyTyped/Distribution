package typings
package realmLib.RealmNs.SyncNs

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
  val identity: java.lang.String = js.native
  val isAdmin: scala.Boolean = js.native
  val isAdminToken: scala.Boolean = js.native
  val server: java.lang.String = js.native
  val token: java.lang.String = js.native
  def acceptPermissionOffer(token: java.lang.String): stdLib.Promise[java.lang.String] = js.native
  def applyPermissions(condition: PermissionCondition, realmUrl: java.lang.String, accessLevel: AccessLevel): stdLib.Promise[PermissionChange] = js.native
  def createConfiguration(): realmLib.RealmNs.Configuration = js.native
  def createConfiguration(config: realmLib.RealmNs.PartialConfiguration): realmLib.RealmNs.Configuration = js.native
  @JSName("getGrantedPermissions")
  def getGrantedPermissions_any(recipient: realmLib.realmLibStrings.any): stdLib.Promise[realmLib.RealmNs.Results[Permission]] = js.native
  @JSName("getGrantedPermissions")
  def getGrantedPermissions_currentUser(recipient: realmLib.realmLibStrings.currentUser): stdLib.Promise[realmLib.RealmNs.Results[Permission]] = js.native
  @JSName("getGrantedPermissions")
  def getGrantedPermissions_otherUser(recipient: realmLib.realmLibStrings.otherUser): stdLib.Promise[realmLib.RealmNs.Results[Permission]] = js.native
  def invalidatePermissionOffer(permissionOfferOrToken: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def invalidatePermissionOffer(permissionOfferOrToken: PermissionOffer): stdLib.Promise[scala.Unit] = js.native
  def logout(): stdLib.Promise[scala.Unit] = js.native
  def offerPermissions(realmUrl: java.lang.String, accessLevel: AccessLevel): stdLib.Promise[java.lang.String] = js.native
  def offerPermissions(realmUrl: java.lang.String, accessLevel: AccessLevel, expiresAt: stdLib.Date): stdLib.Promise[java.lang.String] = js.native
  def openManagementRealm(): realmLib.Realm = js.native
  def retrieveAccount(provider: java.lang.String, username: java.lang.String): stdLib.Promise[Account] = js.native
  def serialize(): SerializedUser = js.native
}

/**
     * User
     * @see { @link https://realm.io/docs/javascript/latest/api/Realm.Sync.User.html }
     */
@JSGlobal("Realm.Sync.User")
@js.native
object User extends js.Object {
  val all: ScalablyTyped.runtime.StringDictionary[realmLib.RealmNs.SyncNs.User] = js.native
  val current: realmLib.RealmNs.SyncNs.User = js.native
  // Deprecated
  /** @deprecated, to be removed in future versions */
  def adminUser(adminToken: java.lang.String): realmLib.RealmNs.SyncNs.User = js.native
  // Deprecated
  /** @deprecated, to be removed in future versions */
  def adminUser(adminToken: java.lang.String, server: java.lang.String): realmLib.RealmNs.SyncNs.User = js.native
  /** @deprecated, to be removed in future versions */
  def authenticate(server: java.lang.String, provider: java.lang.String, options: js.Any): stdLib.Promise[realmLib.RealmNs.SyncNs.User] = js.native
  def completePasswordReset(server: java.lang.String, resetToken: java.lang.String, newPassword: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def confirmEmail(server: java.lang.String, confirmationToken: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def deserialize(serialized: realmLib.RealmNs.SyncNs.SerializedUser): realmLib.RealmNs.SyncNs.User = js.native
  def login(server: java.lang.String, credentials: realmLib.RealmNs.SyncNs.AdminCredentials): realmLib.RealmNs.SyncNs.User = js.native
  def login(server: java.lang.String, credentials: realmLib.RealmNs.SyncNs.Credentials): stdLib.Promise[realmLib.RealmNs.SyncNs.User] = js.native
  /** @deprecated, to be removed in future versions */
  def login(server: java.lang.String, username: java.lang.String, password: java.lang.String): stdLib.Promise[realmLib.RealmNs.SyncNs.User] = js.native
  /** @deprecated, to be removed in future versions */
  def register(server: java.lang.String, username: java.lang.String, password: java.lang.String): stdLib.Promise[realmLib.RealmNs.SyncNs.User] = js.native
  /** @deprecated, to be removed in future versions */
  def registerWithProvider(server: java.lang.String, options: realmLib.Anon_ProviderToken): stdLib.Promise[realmLib.RealmNs.SyncNs.User] = js.native
  def requestEmailConfirmation(server: java.lang.String, email: java.lang.String): stdLib.Promise[scala.Unit] = js.native
  def requestPasswordReset(server: java.lang.String, email: java.lang.String): stdLib.Promise[scala.Unit] = js.native
}

