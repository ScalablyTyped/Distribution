package typings.realm.Realm.Permissions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectPrivileges extends js.Object {
  var canDelete: Boolean = js.native
  var canRead: Boolean = js.native
  var canSetPermissions: Boolean = js.native
  var canUpdate: Boolean = js.native
}

object ObjectPrivileges {
  @scala.inline
  def apply(canDelete: Boolean, canRead: Boolean, canSetPermissions: Boolean, canUpdate: Boolean): ObjectPrivileges = {
    val __obj = js.Dynamic.literal(canDelete = canDelete.asInstanceOf[js.Any], canRead = canRead.asInstanceOf[js.Any], canSetPermissions = canSetPermissions.asInstanceOf[js.Any], canUpdate = canUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectPrivileges]
  }
  @scala.inline
  implicit class ObjectPrivilegesOps[Self <: ObjectPrivileges] (val x: Self) extends AnyVal {
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
    def setCanDelete(value: Boolean): Self = this.set("canDelete", value.asInstanceOf[js.Any])
    @scala.inline
    def setCanRead(value: Boolean): Self = this.set("canRead", value.asInstanceOf[js.Any])
    @scala.inline
    def setCanSetPermissions(value: Boolean): Self = this.set("canSetPermissions", value.asInstanceOf[js.Any])
    @scala.inline
    def setCanUpdate(value: Boolean): Self = this.set("canUpdate", value.asInstanceOf[js.Any])
  }
  
}

