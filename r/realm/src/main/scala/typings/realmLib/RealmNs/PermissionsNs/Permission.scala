package typings
package realmLib.RealmNs.PermissionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Realm.Permissions.Permission")
@js.native
class Permission () extends js.Object {
  var canCreate: scala.Boolean = js.native
  var canDelete: scala.Boolean = js.native
  var canModifySchema: scala.Boolean = js.native
  var canQuery: scala.Boolean = js.native
  var canRead: scala.Boolean = js.native
  var canSetPermissions: scala.Boolean = js.native
  var canUpdate: scala.Boolean = js.native
  var role: Role = js.native
}

/* static members */
@JSGlobal("Realm.Permissions.Permission")
@js.native
object Permission extends js.Object {
  var schema: realmLib.RealmNs.ObjectSchema = js.native
}

