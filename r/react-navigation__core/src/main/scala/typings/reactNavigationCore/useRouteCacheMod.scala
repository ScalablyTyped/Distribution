package typings.reactNavigationCore

import typings.reactNavigationRouters.typesMod.NavigationState
import typings.reactNavigationRouters.typesMod.ParamListBase
import typings.reactNavigationRouters.typesMod.Route
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-navigation/core/lib/typescript/src/useRouteCache", JSImport.Namespace)
@js.native
object useRouteCacheMod extends js.Object {
  
  @JSName("default")
  def default_routes[State /* <: NavigationState[ParamListBase] */](
    routes: /* import warning: importer.ImportType#apply Failed type conversion: State['routes'] */ js.Any
  ): js.Array[Route[String, js.UndefOr[js.Object]]] = js.native
  
  @js.native
  object SUPPRESS_STATE_ACCESS_WARNING extends js.Object {
    
    var value: Boolean = js.native
  }
}
