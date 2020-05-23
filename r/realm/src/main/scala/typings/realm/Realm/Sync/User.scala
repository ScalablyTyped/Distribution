package typings.realm.Realm.Sync

import typings.realm.Realm.Configuration
import typings.realm.Realm.PartialConfiguration
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
@js.native
trait User extends js.Object {
  val identity: String = js.native
  val isAdmin: Boolean = js.native
  val isAdminToken: Boolean = js.native
  val server: String = js.native
  val token: String = js.native
  def acceptPermissionOffer(token: String): js.Promise[String] = js.native
  def applyPermissions(condition: PermissionCondition, realmUrl: String, accessLevel: AccessLevel): js.Promise[Unit] = js.native
  def createConfiguration(): Configuration = js.native
  def createConfiguration(config: PartialConfiguration): Configuration = js.native
  @JSName("getGrantedPermissions")
  def getGrantedPermissions_any(recipient: any): js.Promise[js.Array[Permission]] = js.native
  @JSName("getGrantedPermissions")
  def getGrantedPermissions_currentUser(recipient: currentUser): js.Promise[js.Array[Permission]] = js.native
  @JSName("getGrantedPermissions")
  def getGrantedPermissions_otherUser(recipient: otherUser): js.Promise[js.Array[Permission]] = js.native
  def getPermissionOffers(): js.Promise[js.Array[PermissionOffer]] = js.native
  def invalidatePermissionOffer(permissionOfferOrToken: String): js.Promise[Unit] = js.native
  def invalidatePermissionOffer(permissionOfferOrToken: PermissionOffer): js.Promise[Unit] = js.native
  def logout(): js.Promise[Unit] = js.native
  def offerPermissions(realmUrl: String, accessLevel: AccessLevel): js.Promise[String] = js.native
  def offerPermissions(realmUrl: String, accessLevel: AccessLevel, expiresAt: Date): js.Promise[String] = js.native
  def retrieveAccount(provider: String, username: String): js.Promise[Account] = js.native
  def serialize(): SerializedUser | SerializedTokenUser = js.native
}

