package typings.reactUid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-uid/dist/es5/hooks", JSImport.Namespace)
@js.native
object hooksMod extends js.Object {
  
  def useUID(): String = js.native
  
  def useUIDSeed(): SeedGenerator = js.native
  
  type SeedGenerator = js.Function1[/* id */ js.Any, String]
}
