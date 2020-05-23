package typings.realm.Realm.Permissions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Permission extends js.Object {
  var canCreate: Boolean
  var canDelete: Boolean
  var canModifySchema: Boolean
  var canQuery: Boolean
  var canRead: Boolean
  var canSetPermissions: Boolean
  var canUpdate: Boolean
  var role: Role
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
}

