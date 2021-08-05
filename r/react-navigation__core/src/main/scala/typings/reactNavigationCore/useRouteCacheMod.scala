package typings.reactNavigationCore

import typings.reactNavigationRouters.typesMod.NavigationState
import typings.reactNavigationRouters.typesMod.ParamListBase
import typings.reactNavigationRouters.typesMod.Route
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useRouteCacheMod {
  
  @JSImport("@react-navigation/core/lib/typescript/src/useRouteCache", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  object SUPPRESS_STATE_ACCESS_WARNING {
    
    @JSImport("@react-navigation/core/lib/typescript/src/useRouteCache", "SUPPRESS_STATE_ACCESS_WARNING")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@react-navigation/core/lib/typescript/src/useRouteCache", "SUPPRESS_STATE_ACCESS_WARNING.value")
    @js.native
    def value: Boolean = js.native
    inline def value_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("value")(x.asInstanceOf[js.Any])
  }
  
  inline def default_routes[State /* <: NavigationState[ParamListBase] */](
    routes: /* import warning: importer.ImportType#apply Failed type conversion: State['routes'] */ js.Any
  ): js.Array[Route[String, js.UndefOr[js.Object]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(routes.asInstanceOf[js.Any]).asInstanceOf[js.Array[Route[String, js.UndefOr[js.Object]]]]
}
