package typings.realm.Realm.Permissions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Realm extends js.Object {
  var id: Double = js.native
  var permissions: js.Array[Permission] = js.native
  def findOrCreate(roleName: String): Permission = js.native
}

object Realm {
  @scala.inline
  def apply(findOrCreate: String => Permission, id: Double, permissions: js.Array[Permission]): Realm = {
    val __obj = js.Dynamic.literal(findOrCreate = js.Any.fromFunction1(findOrCreate), id = id.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Realm]
  }
  @scala.inline
  implicit class RealmOps[Self <: Realm] (val x: Self) extends AnyVal {
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
    def setFindOrCreate(value: String => Permission): Self = this.set("findOrCreate", js.Any.fromFunction1(value))
    @scala.inline
    def setId(value: Double): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setPermissionsVarargs(value: Permission*): Self = this.set("permissions", js.Array(value :_*))
    @scala.inline
    def setPermissions(value: js.Array[Permission]): Self = this.set("permissions", value.asInstanceOf[js.Any])
  }
  
}

