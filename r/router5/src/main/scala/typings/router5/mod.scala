package typings.router5

import typings.routeNode.routeNodeMod.Route
import typings.routeNode.routeNodeMod.RouteNodeOptions
import typings.router5.anon.PartialOptions
import typings.router5.constantsMod.Constants_
import typings.router5.constantsMod.ErrorCodes_
import typings.router5.routerMod.DefaultDependencies
import typings.router5.routerMod.Router
import typings.router5TransitionPath.transitionPathMod.State
import typings.router5TransitionPath.transitionPathMod.TransitionPath
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("router5", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class RouteNode ()
    extends typings.routeNode.mod.RouteNode {
    def this(name: String) = this()
    def this(name: js.UndefOr[scala.Nothing], path: String) = this()
    def this(name: String, path: String) = this()
    def this(name: js.UndefOr[scala.Nothing], path: js.UndefOr[scala.Nothing], childRoutes: js.Array[Route]) = this()
    def this(name: js.UndefOr[scala.Nothing], path: String, childRoutes: js.Array[Route]) = this()
    def this(name: String, path: js.UndefOr[scala.Nothing], childRoutes: js.Array[Route]) = this()
    def this(name: String, path: String, childRoutes: js.Array[Route]) = this()
    def this(
      name: js.UndefOr[scala.Nothing],
      path: js.UndefOr[scala.Nothing],
      childRoutes: js.UndefOr[scala.Nothing],
      options: RouteNodeOptions
    ) = this()
    def this(
      name: js.UndefOr[scala.Nothing],
      path: js.UndefOr[scala.Nothing],
      childRoutes: js.Array[Route],
      options: RouteNodeOptions
    ) = this()
    def this(
      name: js.UndefOr[scala.Nothing],
      path: String,
      childRoutes: js.UndefOr[scala.Nothing],
      options: RouteNodeOptions
    ) = this()
    def this(
      name: js.UndefOr[scala.Nothing],
      path: String,
      childRoutes: js.Array[Route],
      options: RouteNodeOptions
    ) = this()
    def this(
      name: String,
      path: js.UndefOr[scala.Nothing],
      childRoutes: js.UndefOr[scala.Nothing],
      options: RouteNodeOptions
    ) = this()
    def this(
      name: String,
      path: js.UndefOr[scala.Nothing],
      childRoutes: js.Array[Route],
      options: RouteNodeOptions
    ) = this()
    def this(name: String, path: String, childRoutes: js.UndefOr[scala.Nothing], options: RouteNodeOptions) = this()
    def this(name: String, path: String, childRoutes: js.Array[Route], options: RouteNodeOptions) = this()
  }
  
  val constants: Constants_ = js.native
  val errorCodes: ErrorCodes_ = js.native
  def cloneRouter[Dependencies /* <: DefaultDependencies */](router: Router[DefaultDependencies]): Router[Dependencies] = js.native
  def cloneRouter[Dependencies /* <: DefaultDependencies */](router: Router[DefaultDependencies], dependencies: Dependencies): Router[Dependencies] = js.native
  def createRouter[Dependencies /* <: Record[String, _] */](): Router[Dependencies] = js.native
  def createRouter[Dependencies /* <: Record[String, _] */](routes: js.UndefOr[scala.Nothing], options: js.UndefOr[scala.Nothing], dependencies: Dependencies): Router[Dependencies] = js.native
  def createRouter[Dependencies /* <: Record[String, _] */](routes: js.UndefOr[scala.Nothing], options: PartialOptions): Router[Dependencies] = js.native
  def createRouter[Dependencies /* <: Record[String, _] */](routes: js.UndefOr[scala.Nothing], options: PartialOptions, dependencies: Dependencies): Router[Dependencies] = js.native
  def createRouter[Dependencies /* <: Record[String, _] */](routes: js.Array[typings.router5.routerMod.Route[Dependencies]]): Router[Dependencies] = js.native
  def createRouter[Dependencies /* <: Record[String, _] */](
    routes: js.Array[typings.router5.routerMod.Route[Dependencies]],
    options: js.UndefOr[scala.Nothing],
    dependencies: Dependencies
  ): Router[Dependencies] = js.native
  def createRouter[Dependencies /* <: Record[String, _] */](routes: js.Array[typings.router5.routerMod.Route[Dependencies]], options: PartialOptions): Router[Dependencies] = js.native
  def createRouter[Dependencies /* <: Record[String, _] */](
    routes: js.Array[typings.router5.routerMod.Route[Dependencies]],
    options: PartialOptions,
    dependencies: Dependencies
  ): Router[Dependencies] = js.native
  def createRouter[Dependencies /* <: Record[String, _] */](routes: typings.routeNode.mod.RouteNode): Router[Dependencies] = js.native
  def createRouter[Dependencies /* <: Record[String, _] */](
    routes: typings.routeNode.mod.RouteNode,
    options: js.UndefOr[scala.Nothing],
    dependencies: Dependencies
  ): Router[Dependencies] = js.native
  def createRouter[Dependencies /* <: Record[String, _] */](routes: typings.routeNode.mod.RouteNode, options: PartialOptions): Router[Dependencies] = js.native
  def createRouter[Dependencies /* <: Record[String, _] */](routes: typings.routeNode.mod.RouteNode, options: PartialOptions, dependencies: Dependencies): Router[Dependencies] = js.native
  def default[Dependencies /* <: Record[String, _] */](): Router[Dependencies] = js.native
  def default[Dependencies /* <: Record[String, _] */](routes: js.UndefOr[scala.Nothing], options: js.UndefOr[scala.Nothing], dependencies: Dependencies): Router[Dependencies] = js.native
  def default[Dependencies /* <: Record[String, _] */](routes: js.UndefOr[scala.Nothing], options: PartialOptions): Router[Dependencies] = js.native
  def default[Dependencies /* <: Record[String, _] */](routes: js.UndefOr[scala.Nothing], options: PartialOptions, dependencies: Dependencies): Router[Dependencies] = js.native
  def default[Dependencies /* <: Record[String, _] */](routes: js.Array[typings.router5.routerMod.Route[Dependencies]]): Router[Dependencies] = js.native
  def default[Dependencies /* <: Record[String, _] */](
    routes: js.Array[typings.router5.routerMod.Route[Dependencies]],
    options: js.UndefOr[scala.Nothing],
    dependencies: Dependencies
  ): Router[Dependencies] = js.native
  def default[Dependencies /* <: Record[String, _] */](routes: js.Array[typings.router5.routerMod.Route[Dependencies]], options: PartialOptions): Router[Dependencies] = js.native
  def default[Dependencies /* <: Record[String, _] */](
    routes: js.Array[typings.router5.routerMod.Route[Dependencies]],
    options: PartialOptions,
    dependencies: Dependencies
  ): Router[Dependencies] = js.native
  def default[Dependencies /* <: Record[String, _] */](routes: typings.routeNode.mod.RouteNode): Router[Dependencies] = js.native
  def default[Dependencies /* <: Record[String, _] */](
    routes: typings.routeNode.mod.RouteNode,
    options: js.UndefOr[scala.Nothing],
    dependencies: Dependencies
  ): Router[Dependencies] = js.native
  def default[Dependencies /* <: Record[String, _] */](routes: typings.routeNode.mod.RouteNode, options: PartialOptions): Router[Dependencies] = js.native
  def default[Dependencies /* <: Record[String, _] */](routes: typings.routeNode.mod.RouteNode, options: PartialOptions, dependencies: Dependencies): Router[Dependencies] = js.native
  def transitionPath(toState: State): TransitionPath = js.native
  def transitionPath(toState: State, fromState: State): TransitionPath = js.native
}

