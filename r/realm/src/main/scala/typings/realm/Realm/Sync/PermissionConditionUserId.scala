package typings.realm.Realm.Sync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PermissionConditionUserId extends PermissionCondition {
  var userId: String
}

object PermissionConditionUserId {
  @scala.inline
  def apply(userId: String): PermissionConditionUserId = {
    val __obj = js.Dynamic.literal(userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionConditionUserId]
  }
}

