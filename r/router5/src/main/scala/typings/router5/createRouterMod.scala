package typings.router5

import typings.routeNode.mod.RouteNode
import typings.router5.anon.PartialOptions
import typings.router5.routerMod.Route
import typings.router5.routerMod.Router
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("router5/dist/createRouter", JSImport.Namespace)
@js.native
object createRouterMod extends js.Object {
  def default[Dependencies /* <: Record[String, _] */](): Router[Dependencies] = js.native
  def default[Dependencies /* <: Record[String, _] */](routes: js.UndefOr[scala.Nothing], options: js.UndefOr[scala.Nothing], dependencies: Dependencies): Router[Dependencies] = js.native
  def default[Dependencies /* <: Record[String, _] */](routes: js.UndefOr[scala.Nothing], options: PartialOptions): Router[Dependencies] = js.native
  def default[Dependencies /* <: Record[String, _] */](routes: js.UndefOr[scala.Nothing], options: PartialOptions, dependencies: Dependencies): Router[Dependencies] = js.native
  def default[Dependencies /* <: Record[String, _] */](routes: js.Array[Route[Dependencies]]): Router[Dependencies] = js.native
  def default[Dependencies /* <: Record[String, _] */](
    routes: js.Array[Route[Dependencies]],
    options: js.UndefOr[scala.Nothing],
    dependencies: Dependencies
  ): Router[Dependencies] = js.native
  def default[Dependencies /* <: Record[String, _] */](routes: js.Array[Route[Dependencies]], options: PartialOptions): Router[Dependencies] = js.native
  def default[Dependencies /* <: Record[String, _] */](routes: js.Array[Route[Dependencies]], options: PartialOptions, dependencies: Dependencies): Router[Dependencies] = js.native
  def default[Dependencies /* <: Record[String, _] */](routes: RouteNode): Router[Dependencies] = js.native
  def default[Dependencies /* <: Record[String, _] */](routes: RouteNode, options: js.UndefOr[scala.Nothing], dependencies: Dependencies): Router[Dependencies] = js.native
  def default[Dependencies /* <: Record[String, _] */](routes: RouteNode, options: PartialOptions): Router[Dependencies] = js.native
  def default[Dependencies /* <: Record[String, _] */](routes: RouteNode, options: PartialOptions, dependencies: Dependencies): Router[Dependencies] = js.native
}

