package typings.realm.Realm.Permissions

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Class extends js.Object {
  var class_name: String
  var name: String
  var permissions: js.Array[Permission]
  def findOrCreate(roleName: String): Permission
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
}

