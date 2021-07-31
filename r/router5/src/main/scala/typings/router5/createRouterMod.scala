package typings.router5

import typings.routeNode.mod.RouteNode
import typings.router5.anon.PartialOptions
import typings.router5.routerMod.Route
import typings.router5.routerMod.Router
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createRouterMod {
  
  @JSImport("router5/dist/createRouter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[Dependencies /* <: Record[String, js.Any] */](): Router[Dependencies] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Router[Dependencies]]
  @scala.inline
  def default[Dependencies /* <: Record[String, js.Any] */](routes: js.Array[Route[Dependencies]]): Router[Dependencies] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(routes.asInstanceOf[js.Any]).asInstanceOf[Router[Dependencies]]
  @scala.inline
  def default[Dependencies /* <: Record[String, js.Any] */](routes: js.Array[Route[Dependencies]], options: Unit, dependencies: Dependencies): Router[Dependencies] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(routes.asInstanceOf[js.Any], options.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[Router[Dependencies]]
  @scala.inline
  def default[Dependencies /* <: Record[String, js.Any] */](routes: js.Array[Route[Dependencies]], options: PartialOptions): Router[Dependencies] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(routes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Router[Dependencies]]
  @scala.inline
  def default[Dependencies /* <: Record[String, js.Any] */](routes: js.Array[Route[Dependencies]], options: PartialOptions, dependencies: Dependencies): Router[Dependencies] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(routes.asInstanceOf[js.Any], options.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[Router[Dependencies]]
  @scala.inline
  def default[Dependencies /* <: Record[String, js.Any] */](routes: Unit, options: Unit, dependencies: Dependencies): Router[Dependencies] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(routes.asInstanceOf[js.Any], options.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[Router[Dependencies]]
  @scala.inline
  def default[Dependencies /* <: Record[String, js.Any] */](routes: Unit, options: PartialOptions): Router[Dependencies] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(routes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Router[Dependencies]]
  @scala.inline
  def default[Dependencies /* <: Record[String, js.Any] */](routes: Unit, options: PartialOptions, dependencies: Dependencies): Router[Dependencies] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(routes.asInstanceOf[js.Any], options.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[Router[Dependencies]]
  @scala.inline
  def default[Dependencies /* <: Record[String, js.Any] */](routes: RouteNode): Router[Dependencies] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(routes.asInstanceOf[js.Any]).asInstanceOf[Router[Dependencies]]
  @scala.inline
  def default[Dependencies /* <: Record[String, js.Any] */](routes: RouteNode, options: Unit, dependencies: Dependencies): Router[Dependencies] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(routes.asInstanceOf[js.Any], options.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[Router[Dependencies]]
  @scala.inline
  def default[Dependencies /* <: Record[String, js.Any] */](routes: RouteNode, options: PartialOptions): Router[Dependencies] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(routes.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Router[Dependencies]]
  @scala.inline
  def default[Dependencies /* <: Record[String, js.Any] */](routes: RouteNode, options: PartialOptions, dependencies: Dependencies): Router[Dependencies] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(routes.asInstanceOf[js.Any], options.asInstanceOf[js.Any], dependencies.asInstanceOf[js.Any])).asInstanceOf[Router[Dependencies]]
}
