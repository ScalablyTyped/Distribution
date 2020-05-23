package typings.realm.Realm.Permissions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Realm extends js.Object {
  var id: Double
  var permissions: js.Array[Permission]
  def findOrCreate(roleName: String): Permission
}

object Realm {
  @scala.inline
  def apply(findOrCreate: String => Permission, id: Double, permissions: js.Array[Permission]): Realm = {
    val __obj = js.Dynamic.literal(findOrCreate = js.Any.fromFunction1(findOrCreate), id = id.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Realm]
  }
}

