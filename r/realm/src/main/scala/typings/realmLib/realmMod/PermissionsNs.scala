package typings
package realmLib.realmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("realm", "Permissions")
@js.native
object PermissionsNs extends js.Object {
  @js.native
  class Class ()
    extends realmLib.RealmNs.PermissionsNs.Class
  
  @js.native
  class ClassPrivileges ()
    extends realmLib.RealmNs.PermissionsNs.ClassPrivileges
  
  @js.native
  class ObjectPrivileges ()
    extends realmLib.RealmNs.PermissionsNs.ObjectPrivileges
  
  @js.native
  class Permission ()
    extends realmLib.RealmNs.PermissionsNs.Permission
  
  @js.native
  class Realm ()
    extends realmLib.RealmNs.PermissionsNs.Realm
  
  @js.native
  class RealmPrivileges ()
    extends realmLib.RealmNs.PermissionsNs.RealmPrivileges
  
  @js.native
  class Role ()
    extends realmLib.RealmNs.PermissionsNs.Role
  
  @js.native
  class User ()
    extends realmLib.RealmNs.PermissionsNs.User
  
  @js.native
  object Class extends js.Object {
    var schema: realmLib.RealmNs.ObjectSchema = js.native
  }
  
  @js.native
  object Permission extends js.Object {
    var schema: realmLib.RealmNs.ObjectSchema = js.native
  }
  
  @js.native
  object Realm extends js.Object {
    var schema: realmLib.RealmNs.ObjectSchema = js.native
  }
  
  @js.native
  object Role extends js.Object {
    var schema: realmLib.RealmNs.ObjectSchema = js.native
  }
  
  @js.native
  object User extends js.Object {
    var schema: realmLib.RealmNs.ObjectSchema = js.native
  }
  
}

