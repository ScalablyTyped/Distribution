package typings.router5

import typings.routeNode.mod.RouteNode
import typings.router5.routerMod.Route
import typings.router5.routerMod.Router
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object routesMod {
  
  @JSImport("router5/dist/core/routes", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[Dependencies](routes: js.Array[Route[Dependencies]]): js.Function1[/* router */ Router[Dependencies], Router[Dependencies]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(routes.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* router */ Router[Dependencies], Router[Dependencies]]]
  @scala.inline
  def default[Dependencies](routes: RouteNode): js.Function1[/* router */ Router[Dependencies], Router[Dependencies]] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(routes.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* router */ Router[Dependencies], Router[Dependencies]]]
}
