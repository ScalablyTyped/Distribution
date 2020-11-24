package typings.rbacA.mod

import typings.node.eventsMod.EventEmitter
import typings.rbacA.anon.Attributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rbac-a", "RBAC")
@js.native
class RBAC[P /* <: Provider */, AM /* <: AttributesManager */] protected () extends EventEmitter {
  def this(opts: Attributes[P, AM]) = this()
  
  val attributes: AM = js.native
  
  /**
    * Check the user for the given permissions. The method will return
    * a Promise resolving with a number. If the user has sufficient
    * access to the specified permissions, the promise should resolve
    * with a positive, non-zero value, or with NaN otherwise. If the
    * Promise is rejected, it should be considered as if the user has
    * insufficient access to the specified ressources.
    */
  def check(user: js.Any, permission: String): js.Promise[Double] = js.native
  def check(user: js.Any, permission: String, params: js.Object): js.Promise[Double] = js.native
  def check(user: js.Any, permission: js.Array[String]): js.Promise[Double] = js.native
  def check(user: js.Any, permission: js.Array[String], params: js.Object): js.Promise[Double] = js.native
  
  val provider: P = js.native
}
