package typings.realm.RealmNs.SyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerializedUser extends js.Object {
  var identity: String
  var isAdmin: Boolean
  var refreshToken: String
  var server: String
}

object SerializedUser {
  @scala.inline
  def apply(identity: String, isAdmin: Boolean, refreshToken: String, server: String): SerializedUser = {
    val __obj = js.Dynamic.literal(identity = identity, isAdmin = isAdmin, refreshToken = refreshToken, server = server)
  
    __obj.asInstanceOf[SerializedUser]
  }
}

