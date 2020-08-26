package typings.realm.mod

import typings.realm.Realm.ObjectSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("realm", "Permissions")
@js.native
object Permissions extends js.Object {
  @js.native
  class Class ()
    extends typings.realm.Realm.Permissions.Class
  
  @js.native
  class ClassPrivileges ()
    extends typings.realm.Realm.Permissions.ClassPrivileges
  
  @js.native
  class ObjectPrivileges ()
    extends typings.realm.Realm.Permissions.ObjectPrivileges
  
  @js.native
  class Permission ()
    extends typings.realm.Realm.Permissions.Permission
  
  @js.native
  class Realm ()
    extends typings.realm.Realm.Permissions.Realm
  
  @js.native
  class RealmPrivileges ()
    extends typings.realm.Realm.Permissions.RealmPrivileges
  
  @js.native
  class Role ()
    extends typings.realm.Realm.Permissions.Role
  
  @js.native
  class User ()
    extends typings.realm.Realm.Permissions.User
  
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

