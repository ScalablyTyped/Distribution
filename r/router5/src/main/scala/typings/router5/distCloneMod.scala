package typings.router5

import typings.router5.distTypesRouterMod.DefaultDependencies
import typings.router5.distTypesRouterMod.Router
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCloneMod {
  
  @JSImport("router5/dist/clone", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Dependencies /* <: DefaultDependencies */](router: Router[DefaultDependencies]): Router[Dependencies] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(router.asInstanceOf[js.Any]).asInstanceOf[Router[Dependencies]]
  inline def default[Dependencies /* <: DefaultDependencies */](router: Router[DefaultDependencies], dependencies: Dependencies): Router[Dependencies] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(router.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[Router[Dependencies]]
}
