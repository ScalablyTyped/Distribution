package typings.reactUid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hooksMod {
  
  @JSImport("react-uid/dist/es5/hooks", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useUID(): String = ^.asInstanceOf[js.Dynamic].applyDynamic("useUID")().asInstanceOf[String]
  
  inline def useUIDSeed(): SeedGenerator = ^.asInstanceOf[js.Dynamic].applyDynamic("useUIDSeed")().asInstanceOf[SeedGenerator]
  
  type SeedGenerator = js.Function1[/* id */ Any, String]
}
