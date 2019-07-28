package typings.realm.RealmNs.PermissionsNs

import typings.realm.RealmNs.ObjectSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Realm.Permissions.Realm")
@js.native
class Realm () extends js.Object {
  var id: Double = js.native
  var permissions: js.Array[Permission] = js.native
  def findOrCreate(roleName: String): Permission = js.native
}

/* static members */
@JSGlobal("Realm.Permissions.Realm")
@js.native
object Realm extends js.Object {
  var schema: ObjectSchema = js.native
}

