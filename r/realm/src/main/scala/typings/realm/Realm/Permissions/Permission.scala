package typings.realm.Realm.Permissions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Permission extends js.Object {
  var canCreate: Boolean = js.native
  var canDelete: Boolean = js.native
  var canModifySchema: Boolean = js.native
  var canQuery: Boolean = js.native
  var canRead: Boolean = js.native
  var canSetPermissions: Boolean = js.native
  var canUpdate: Boolean = js.native
  var role: Role = js.native
}

object Permission {
  @scala.inline
  def apply(
    canCreate: Boolean,
    canDelete: Boolean,
    canModifySchema: Boolean,
    canQuery: Boolean,
    canRead: Boolean,
    canSetPermissions: Boolean,
    canUpdate: Boolean,
    role: Role
  ): Permission = {
    val __obj = js.Dynamic.literal(canCreate = canCreate.asInstanceOf[js.Any], canDelete = canDelete.asInstanceOf[js.Any], canModifySchema = canModifySchema.asInstanceOf[js.Any], canQuery = canQuery.asInstanceOf[js.Any], canRead = canRead.asInstanceOf[js.Any], canSetPermissions = canSetPermissions.asInstanceOf[js.Any], canUpdate = canUpdate.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[Permission]
  }
  @scala.inline
  implicit class PermissionOps[Self <: Permission] (val x: Self) extends AnyVal {
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
    def setCanCreate(value: Boolean): Self = this.set("canCreate", value.asInstanceOf[js.Any])
    @scala.inline
    def setCanDelete(value: Boolean): Self = this.set("canDelete", value.asInstanceOf[js.Any])
    @scala.inline
    def setCanModifySchema(value: Boolean): Self = this.set("canModifySchema", value.asInstanceOf[js.Any])
    @scala.inline
    def setCanQuery(value: Boolean): Self = this.set("canQuery", value.asInstanceOf[js.Any])
    @scala.inline
    def setCanRead(value: Boolean): Self = this.set("canRead", value.asInstanceOf[js.Any])
    @scala.inline
    def setCanSetPermissions(value: Boolean): Self = this.set("canSetPermissions", value.asInstanceOf[js.Any])
    @scala.inline
    def setCanUpdate(value: Boolean): Self = this.set("canUpdate", value.asInstanceOf[js.Any])
    @scala.inline
    def setRole(value: Role): Self = this.set("role", value.asInstanceOf[js.Any])
  }
  
}

