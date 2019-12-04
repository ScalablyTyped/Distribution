package typings.rbacDashA.libRbacMod

import typings.rbacDashA.Anon_Attributes
import typings.rbacDashA.rbacDashAMod.AttributesManager
import typings.rbacDashA.rbacDashAMod.Provider
import typings.rbacDashA.rbacDashAMod.RBAC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rbac-a/lib/rbac", JSImport.Namespace)
@js.native
class ^[P /* <: Provider */, AM /* <: AttributesManager */] protected () extends RBAC[P, AM] {
  def this(opts: Anon_Attributes[P, AM]) = this()
}

