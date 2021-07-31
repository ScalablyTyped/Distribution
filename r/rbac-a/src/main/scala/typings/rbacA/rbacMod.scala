package typings.rbacA

import typings.rbacA.anon.Attributes
import typings.rbacA.mod.AttributesManager
import typings.rbacA.mod.Provider
import typings.rbacA.mod.RBAC
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rbacMod {
  
  @JSImport("rbac-a/lib/rbac", JSImport.Namespace)
  @js.native
  class ^[P /* <: Provider */, AM /* <: AttributesManager */] protected () extends RBAC[P, AM] {
    def this(opts: Attributes[P, AM]) = this()
  }
}
