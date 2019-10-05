package typings.realm.Realm

import typings.realm.Realm.Permissions.Permission
import typings.realm.Realm.Permissions.Role
import typings.realm.Realm.Permissions.User
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Realm.Permissions")
@js.native
object Permissions extends js.Object {
  @js.native
  class Class () extends js.Object {
    var class_name: String = js.native
    var name: String = js.native
    var permissions: js.Array[Permission] = js.native
    def findOrCreate(roleName: String): Permission = js.native
  }
  
  @js.native
  class ClassPrivileges () extends js.Object {
    var canCreate: Boolean = js.native
    var canModifySchema: Boolean = js.native
    var canQuery: Boolean = js.native
    var canRead: Boolean = js.native
    var canSetPermissions: Boolean = js.native
    var canUpdate: Boolean = js.native
  }
  
  @js.native
  class ObjectPrivileges () extends js.Object {
    var canDelete: Boolean = js.native
    var canRead: Boolean = js.native
    var canSetPermissions: Boolean = js.native
    var canUpdate: Boolean = js.native
  }
  
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
  
  @js.native
  class Realm () extends js.Object {
    var id: Double = js.native
    var permissions: js.Array[Permission] = js.native
    def findOrCreate(roleName: String): Permission = js.native
  }
  
  @js.native
  class RealmPrivileges () extends js.Object {
    var canModifySchema: Boolean = js.native
    var canRead: Boolean = js.native
    var canSetPermissions: Boolean = js.native
    var canUpdate: Boolean = js.native
  }
  
  @js.native
  class Role () extends js.Object {
    var members: js.Array[User] = js.native
    var name: String = js.native
  }
  
  @js.native
  class User () extends js.Object {
    var id: String = js.native
  }
  
  /* static members */
  @js.native
  object Class extends js.Object {
    var schema: ObjectSchema = js.native
  }
  
  /* static members */
  @js.native
  object Permission extends js.Object {
    var schema: ObjectSchema = js.native
  }
  
  /* static members */
  @js.native
  object Realm extends js.Object {
    var schema: ObjectSchema = js.native
  }
  
  /* static members */
  @js.native
  object Role extends js.Object {
    var schema: ObjectSchema = js.native
  }
  
  /* static members */
  @js.native
  object User extends js.Object {
    var schema: ObjectSchema = js.native
  }
  
}

