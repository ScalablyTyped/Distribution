package typings
package realmLib.RealmNs.SyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Realm.Sync.Credentials")
@js.native
class Credentials () extends js.Object {
  val identityProvider: java.lang.String = js.native
  val token: java.lang.String = js.native
  val userInfo: org.scalablytyped.runtime.StringDictionary[js.Any] = js.native
}

/* static members */
@JSGlobal("Realm.Sync.Credentials")
@js.native
object Credentials extends js.Object {
  def adminToken(token: java.lang.String): realmLib.RealmNs.SyncNs.AdminCredentials = js.native
  def anonymous(): realmLib.RealmNs.SyncNs.Credentials = js.native
  def azureAD(token: java.lang.String): realmLib.RealmNs.SyncNs.Credentials = js.native
  def custom(providerName: java.lang.String, token: java.lang.String): realmLib.RealmNs.SyncNs.Credentials = js.native
  def custom(
    providerName: java.lang.String,
    token: java.lang.String,
    userInfo: org.scalablytyped.runtime.StringDictionary[js.Any]
  ): realmLib.RealmNs.SyncNs.Credentials = js.native
  def facebook(token: java.lang.String): realmLib.RealmNs.SyncNs.Credentials = js.native
  def google(token: java.lang.String): realmLib.RealmNs.SyncNs.Credentials = js.native
  def jwt(token: java.lang.String): realmLib.RealmNs.SyncNs.Credentials = js.native
  def jwt(token: java.lang.String, providerName: java.lang.String): realmLib.RealmNs.SyncNs.Credentials = js.native
  def nickname(value: java.lang.String): realmLib.RealmNs.SyncNs.Credentials = js.native
  def nickname(value: java.lang.String, isAdmin: scala.Boolean): realmLib.RealmNs.SyncNs.Credentials = js.native
  def usernamePassword(username: java.lang.String, password: java.lang.String): realmLib.RealmNs.SyncNs.Credentials = js.native
  def usernamePassword(username: java.lang.String, password: java.lang.String, createUser: scala.Boolean): realmLib.RealmNs.SyncNs.Credentials = js.native
}

