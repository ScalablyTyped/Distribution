package typings.reactUid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hooksMod {
  
  @JSImport("react-uid/dist/es5/hooks", "useUID")
  @js.native
  def useUID(): String = js.native
  
  @JSImport("react-uid/dist/es5/hooks", "useUIDSeed")
  @js.native
  def useUIDSeed(): SeedGenerator = js.native
  
  type SeedGenerator = js.Function1[/* id */ js.Any, String]
}
