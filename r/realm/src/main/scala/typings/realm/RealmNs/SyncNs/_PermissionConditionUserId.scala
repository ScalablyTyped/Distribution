package typings.realm.RealmNs.SyncNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _PermissionConditionUserId extends PermissionCondition {
  var userId: String
}

object _PermissionConditionUserId {
  @scala.inline
  def apply(userId: String): _PermissionConditionUserId = {
    val __obj = js.Dynamic.literal(userId = userId)
  
    __obj.asInstanceOf[_PermissionConditionUserId]
  }
}

