package typings.realm.Realm.Sync

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Realm.Sync.Credentials")
@js.native
class Credentials () extends js.Object {
  val identityProvider: String = js.native
  val token: String = js.native
  val userInfo: StringDictionary[js.Any] = js.native
}

/* static members */
@JSGlobal("Realm.Sync.Credentials")
@js.native
object Credentials extends js.Object {
  def adminToken(token: String): AdminCredentials = js.native
  def anonymous(): Credentials = js.native
  def azureAD(token: String): Credentials = js.native
  def custom(providerName: String, token: String): Credentials = js.native
  def custom(providerName: String, token: String, userInfo: StringDictionary[js.Any]): Credentials = js.native
  def facebook(token: String): Credentials = js.native
  def google(token: String): Credentials = js.native
  def jwt(token: String): Credentials = js.native
  def jwt(token: String, providerName: String): Credentials = js.native
  def nickname(value: String): Credentials = js.native
  def nickname(value: String, isAdmin: Boolean): Credentials = js.native
  def usernamePassword(username: String, password: String): Credentials = js.native
  def usernamePassword(username: String, password: String, createUser: Boolean): Credentials = js.native
}

