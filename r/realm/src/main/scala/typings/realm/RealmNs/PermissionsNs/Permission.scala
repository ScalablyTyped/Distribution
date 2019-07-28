package typings.realm.RealmNs.PermissionsNs

import typings.realm.RealmNs.ObjectSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Realm.Permissions.Permission")
@js.native
class Permission () extends js.Object {
  var canCreate: Boolean = js.native
  var canDelete: Boolean = js.native
  var canModifySchema: Boolean = js.native
  var canQuery: Boolean = js.native
  var canRead: Boolean = js.native
  var canSetPermissions: Boolean = js.native
  var canUpdate: Boolean = js.native
  var role: Role = js.native
}

/* static members */
@JSGlobal("Realm.Permissions.Permission")
@js.native
object Permission extends js.Object {
  var schema: ObjectSchema = js.native
}

