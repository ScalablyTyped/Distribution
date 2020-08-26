package typings.realm.Realm.Permissions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Class extends js.Object {
  var class_name: String = js.native
  var name: String = js.native
  var permissions: js.Array[Permission] = js.native
  def findOrCreate(roleName: String): Permission = js.native
}

object Class {
  @scala.inline
  def apply(
    class_name: String,
    findOrCreate: String => Permission,
    name: String,
    permissions: js.Array[Permission]
  ): Class = {
    val __obj = js.Dynamic.literal(class_name = class_name.asInstanceOf[js.Any], findOrCreate = js.Any.fromFunction1(findOrCreate), name = name.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Class]
  }
  @scala.inline
  implicit class ClassOps[Self <: Class] (val x: Self) extends AnyVal {
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
    def setClass_name(value: String): Self = this.set("class_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setFindOrCreate(value: String => Permission): Self = this.set("findOrCreate", js.Any.fromFunction1(value))
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPermissionsVarargs(value: Permission*): Self = this.set("permissions", js.Array(value :_*))
    @scala.inline
    def setPermissions(value: js.Array[Permission]): Self = this.set("permissions", value.asInstanceOf[js.Any])
  }
  
}

