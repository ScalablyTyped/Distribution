package typings.realm.Realm.Sync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PermissionConditionUserId extends PermissionCondition {
  var userId: String = js.native
}

object PermissionConditionUserId {
  @scala.inline
  def apply(userId: String): PermissionConditionUserId = {
    val __obj = js.Dynamic.literal(userId = userId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PermissionConditionUserId]
  }
  @scala.inline
  implicit class PermissionConditionUserIdOps[Self <: PermissionConditionUserId] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setUserId(value: String): Self = this.set("userId", value.asInstanceOf[js.Any])
  }
  
}

