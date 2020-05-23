package typings.realm.Realm.Permissions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RealmPrivileges extends js.Object {
  var canModifySchema: Boolean
  var canRead: Boolean
  var canSetPermissions: Boolean
  var canUpdate: Boolean
}

object RealmPrivileges {
  @scala.inline
  def apply(canModifySchema: Boolean, canRead: Boolean, canSetPermissions: Boolean, canUpdate: Boolean): RealmPrivileges = {
    val __obj = js.Dynamic.literal(canModifySchema = canModifySchema.asInstanceOf[js.Any], canRead = canRead.asInstanceOf[js.Any], canSetPermissions = canSetPermissions.asInstanceOf[js.Any], canUpdate = canUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[RealmPrivileges]
  }
}

