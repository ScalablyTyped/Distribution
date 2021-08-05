package typings.router5

import typings.router5.routerMod.Router
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object dependenciesMod {
  
  @JSImport("router5/dist/core/dependencies", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Dependencies](dependencies: Dependencies): js.Function1[/* router */ Router[Dependencies], Router[Dependencies]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(dependencies.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* router */ Router[Dependencies], Router[Dependencies]]]
}
