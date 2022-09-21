package typings.reactNavigationCore

import typings.reactNavigationCore.typesMod.RouteProp
import typings.reactNavigationRouters.typesMod.NavigationState
import typings.reactNavigationRouters.typesMod.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useRouteCacheMod {
  
  @JSImport("@react-navigation/core/lib/typescript/src/useRouteCache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@react-navigation/core/lib/typescript/src/useRouteCache", "CHILD_STATE")
  @js.native
  val CHILD_STATE: js.Symbol = js.native
  
  inline def default_routes[State /* <: NavigationState[ParamListBase] */](
    routes: /* import warning: importer.ImportType#apply Failed type conversion: State['routes'] */ js.Any
  ): js.Array[RouteProp[ParamListBase, String]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(routes.asInstanceOf[js.Any]).asInstanceOf[js.Array[RouteProp[ParamListBase, String]]]
}
