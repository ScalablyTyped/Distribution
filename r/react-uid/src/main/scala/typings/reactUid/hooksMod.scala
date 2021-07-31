package typings.reactUid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hooksMod {
  
  @JSImport("react-uid/dist/es5/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def useUID(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("useUID")().asInstanceOf[String]
  
  @scala.inline
  def useUIDSeed(): SeedGenerator = ^.asInstanceOf[js.Dynamic].applyDynamic("useUIDSeed")().asInstanceOf[SeedGenerator]
  
  type SeedGenerator = js.Function1[/* id */ js.Any, String]
}
