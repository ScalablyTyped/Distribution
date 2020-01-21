package typings.router5

import typings.routeNode.mod.Callback
import typings.routeNode.mod.Route
import typings.router5.constantsMod.Constants_
import typings.router5.constantsMod.ErrorCodes_
import typings.router5.routerMod.CreateRouter
import typings.router5.routerMod.Dependencies
import typings.router5.routerMod.Router
import typings.router5TransitionPath.transitionPathMod.State
import typings.router5TransitionPath.transitionPathMod.TransitionPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("router5", JSImport.Namespace)
@js.native
object mod extends js.Object {
  @js.native
  class RouteNode protected ()
    extends typings.routeNode.mod.default {
    def this(
      name: js.UndefOr[String],
      path: js.UndefOr[String],
      childRoutes: js.UndefOr[js.Array[Route]],
      cb: js.UndefOr[Callback],
      parent: js.UndefOr[typings.routeNode.mod.RouteNode],
      finalSort: js.UndefOr[Boolean],
      sort: js.UndefOr[Boolean]
    ) = this()
  }
  
  val constants: Constants_ = js.native
  val createRouter: CreateRouter = js.native
  val default: CreateRouter = js.native
  val errorCodes: ErrorCodes_ = js.native
  def cloneRouter(router: Router): Router = js.native
  def cloneRouter(router: Router, dependencies: Dependencies): Router = js.native
  def transitionPath(toState: State): TransitionPath = js.native
  def transitionPath(toState: State, fromState: State): TransitionPath = js.native
}

