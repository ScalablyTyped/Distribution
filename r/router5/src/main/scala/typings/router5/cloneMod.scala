package typings.router5

import typings.router5.routerMod.DefaultDependencies
import typings.router5.routerMod.Router
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cloneMod {
  
  @JSImport("router5/dist/clone", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Dependencies /* <: DefaultDependencies */](router: Router[DefaultDependencies]): Router[Dependencies] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(router.asInstanceOf[js.Any]).asInstanceOf[Router[Dependencies]]
  inline def default[Dependencies /* <: DefaultDependencies */](router: Router[DefaultDependencies], dependencies: Dependencies): Router[Dependencies] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(router.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[Router[Dependencies]]
}
