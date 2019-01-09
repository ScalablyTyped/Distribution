package typings
package rbacDashALib.rbacDashAMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rbac-a", "RBAC")
@js.native
class RBAC[P /* <: Provider */, AM /* <: AttributesManager */] protected ()
  extends nodeLib.eventsMod.EventEmitter {
  def this(opts: rbacDashALib.Anon_Attributes[P, AM]) = this()
  val attributes: AM = js.native
  val provider: P = js.native
  /**
    * Check the user for the given permissions. The method will return
    * a Promise resolving with a number. If the user has sufficient
    * access to the specified permissions, the promise should resolve
    * with a positive, non-zero value, or with NaN otherwise. If the
    * Promise is rejected, it should be considered as if the user has
    * insufficient access to the specified ressources.
    */
  def check(user: js.Any, permission: java.lang.String): js.Promise[scala.Double] = js.native
  def check(user: js.Any, permission: java.lang.String, params: js.Object): js.Promise[scala.Double] = js.native
  def check(user: js.Any, permission: js.Array[java.lang.String]): js.Promise[scala.Double] = js.native
  def check(user: js.Any, permission: js.Array[java.lang.String], params: js.Object): js.Promise[scala.Double] = js.native
}

