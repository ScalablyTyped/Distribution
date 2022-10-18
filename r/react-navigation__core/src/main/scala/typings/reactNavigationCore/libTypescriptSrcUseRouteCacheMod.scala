package typings.reactNavigationCore

import typings.reactNavigationCore.libTypescriptSrcTypesMod.RouteProp
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.NavigationState
import typings.reactNavigationRouters.libTypescriptSrcTypesMod.ParamListBase
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypescriptSrcUseRouteCacheMod {
  
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
