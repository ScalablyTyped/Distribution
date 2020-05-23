package typings.realm.Realm.Permissions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectPrivileges extends js.Object {
  var canDelete: Boolean
  var canRead: Boolean
  var canSetPermissions: Boolean
  var canUpdate: Boolean
}

object ObjectPrivileges {
  @scala.inline
  def apply(canDelete: Boolean, canRead: Boolean, canSetPermissions: Boolean, canUpdate: Boolean): ObjectPrivileges = {
    val __obj = js.Dynamic.literal(canDelete = canDelete.asInstanceOf[js.Any], canRead = canRead.asInstanceOf[js.Any], canSetPermissions = canSetPermissions.asInstanceOf[js.Any], canUpdate = canUpdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectPrivileges]
  }
}

