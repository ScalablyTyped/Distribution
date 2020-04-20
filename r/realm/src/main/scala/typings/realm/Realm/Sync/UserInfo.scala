package typings.realm.Realm.Sync

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
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], isAdmin = isAdmin.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserInfo]
  }
}

