package typings.realm.RealmNs.PermissionsNs

import typings.realm.RealmNs.ObjectSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Realm.Permissions.Class")
@js.native
class Class () extends js.Object {
  var class_name: String = js.native
  var name: String = js.native
  var permissions: js.Array[Permission] = js.native
  def findOrCreate(roleName: String): Permission = js.native
}

/* static members */
@JSGlobal("Realm.Permissions.Class")
@js.native
object Class extends js.Object {
  var schema: ObjectSchema = js.native
}

