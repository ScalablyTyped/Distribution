package typings.rbacA.rbacMod

import typings.rbacA.anon.Attributes
import typings.rbacA.mod.AttributesManager
import typings.rbacA.mod.Provider
import typings.rbacA.mod.RBAC
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rbac-a/lib/rbac", JSImport.Namespace)
@js.native
class ^[P /* <: Provider */, AM /* <: AttributesManager */] protected () extends RBAC[P, AM] {
  def this(opts: Attributes[P, AM]) = this()
}

