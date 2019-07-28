package typings.realm.RealmNs.SyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UserInfo extends js.Object {
  var id: String
  var isAdmin: Boolean
}

object UserInfo {
  @scala.inline
  def apply(id: String, isAdmin: Boolean): UserInfo = {
    val __obj = js.Dynamic.literal(id = id, isAdmin = isAdmin)
  
    __obj.asInstanceOf[UserInfo]
  }
}

