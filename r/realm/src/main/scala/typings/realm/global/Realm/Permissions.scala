package typings.realm.global.Realm

import typings.realm.Realm.ObjectSchema
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Realm.Permissions")
@js.native
object Permissions extends js.Object {
  @js.native
  class Class ()
    extends typings.realm.Realm.Permissions.Class {
    /* CompleteClass */
    override var class_name: String = js.native
    /* CompleteClass */
    override var name: String = js.native
    /* CompleteClass */
    override var permissions: js.Array[typings.realm.Realm.Permissions.Permission] = js.native
    /* CompleteClass */
    override def findOrCreate(roleName: String): typings.realm.Realm.Permissions.Permission = js.native
  }
  
  @js.native
  class ClassPrivileges ()
    extends typings.realm.Realm.Permissions.ClassPrivileges {
    /* CompleteClass */
    override var canCreate: Boolean = js.native
    /* CompleteClass */
    override var canModifySchema: Boolean = js.native
    /* CompleteClass */
    override var canQuery: Boolean = js.native
    /* CompleteClass */
    override var canRead: Boolean = js.native
    /* CompleteClass */
    override var canSetPermissions: Boolean = js.native
    /* CompleteClass */
    override var canUpdate: Boolean = js.native
  }
  
  @js.native
  class ObjectPrivileges ()
    extends typings.realm.Realm.Permissions.ObjectPrivileges {
    /* CompleteClass */
    override var canDelete: Boolean = js.native
    /* CompleteClass */
    override var canRead: Boolean = js.native
    /* CompleteClass */
    override var canSetPermissions: Boolean = js.native
    /* CompleteClass */
    override var canUpdate: Boolean = js.native
  }
  
  @js.native
  class Permission ()
    extends typings.realm.Realm.Permissions.Permission {
    /* CompleteClass */
    override var canCreate: Boolean = js.native
    /* CompleteClass */
    override var canDelete: Boolean = js.native
    /* CompleteClass */
    override var canModifySchema: Boolean = js.native
    /* CompleteClass */
    override var canQuery: Boolean = js.native
    /* CompleteClass */
    override var canRead: Boolean = js.native
    /* CompleteClass */
    override var canSetPermissions: Boolean = js.native
    /* CompleteClass */
    override var canUpdate: Boolean = js.native
    /* CompleteClass */
    override var role: typings.realm.Realm.Permissions.Role = js.native
  }
  
  @js.native
  class Realm ()
    extends typings.realm.Realm.Permissions.Realm {
    /* CompleteClass */
    override var id: Double = js.native
    /* CompleteClass */
    override var permissions: js.Array[typings.realm.Realm.Permissions.Permission] = js.native
    /* CompleteClass */
    override def findOrCreate(roleName: String): typings.realm.Realm.Permissions.Permission = js.native
  }
  
  @js.native
  class RealmPrivileges ()
    extends typings.realm.Realm.Permissions.RealmPrivileges {
    /* CompleteClass */
    override var canModifySchema: Boolean = js.native
    /* CompleteClass */
    override var canRead: Boolean = js.native
    /* CompleteClass */
    override var canSetPermissions: Boolean = js.native
    /* CompleteClass */
    override var canUpdate: Boolean = js.native
  }
  
  @js.native
  class Role ()
    extends typings.realm.Realm.Permissions.Role {
    /* CompleteClass */
    override var members: js.Array[typings.realm.Realm.Permissions.User] = js.native
    /* CompleteClass */
    override var name: String = js.native
  }
  
  @js.native
  class User ()
    extends typings.realm.Realm.Permissions.User {
    /* CompleteClass */
    override var id: String = js.native
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

