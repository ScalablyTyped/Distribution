package typings.realm.RealmNs.SyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerializedTokenUser extends js.Object {
  var adminToken: String
  var server: String
}

object SerializedTokenUser {
  @scala.inline
  def apply(adminToken: String, server: String): SerializedTokenUser = {
    val __obj = js.Dynamic.literal(adminToken = adminToken, server = server)
  
    __obj.asInstanceOf[SerializedTokenUser]
  }
}

