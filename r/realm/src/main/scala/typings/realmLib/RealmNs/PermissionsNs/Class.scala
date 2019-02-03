package typings
package realmLib.RealmNs.PermissionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Realm.Permissions.Class")
@js.native
class Class () extends js.Object {
  var class_name: java.lang.String = js.native
  var name: java.lang.String = js.native
  var permissions: js.Array[Permission] = js.native
  def findOrCreate(roleName: java.lang.String): Permission = js.native
}

/* static members */
@JSGlobal("Realm.Permissions.Class")
@js.native
object Class extends js.Object {
  var schema: realmLib.RealmNs.ObjectSchema = js.native
}

