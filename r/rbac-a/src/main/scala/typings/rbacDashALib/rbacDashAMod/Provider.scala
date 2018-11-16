package typings
package rbacDashALib.rbacDashAMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rbac-a", "Provider")
@js.native
class Provider () extends js.Object {
  /**
       * Return all attributes for the specified role. The return value must
       * be an array. Return an empty array if role is missing or if no
       * attributes for the specified role.
       * Ex: ['attribute1', 'attribute2', ... ]
       * The method mey return a promise resolving with the
       * expected return value.
       */
  def getAttributes(role: java.lang.String): js.Array[java.lang.String] | stdLib.Promise[js.Array[java.lang.String]] = js.native
  /**
       * Return all permissions for the specified role. The return value
       * must be an array. Return an empty array if role is missing or
       * no permission for the specified role.
       * Ex: ['permission1', 'permission2', ... ]
       * The method mey return a promise resolving with the
       * expected return value.
       */
  def getPermission(role: java.lang.String): js.Array[java.lang.String] | stdLib.Promise[js.Array[java.lang.String]] = js.native
  /**
       * Return all the roles available for the given user. The return value
       * must be an object, recursively defining the associated roles for the
       * specified user. Return an empty object if user has no roles.
       * Ex: {
       *       "role1": {
       *         "role1.1": null,
       *         "role1.2": { ... },
       *         ...
       *       },
       *       "secondary": ...,
       *       ...
       *     }
       * The method mey return a promise resolving with the
       * expected return value.
       */
  def getRoles(user: js.Any): Roles | stdLib.Promise[Roles] = js.native
}

