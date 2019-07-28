package typings.router5.router5Mod

import typings.router5.typesConstantsMod.Constants
import typings.router5.typesConstantsMod.ErrorCodes
import typings.router5.typesTypesRouterMod.CreateRouter
import typings.router5.typesTypesRouterMod.Dependencies
import typings.router5.typesTypesRouterMod.Router
import typings.router5DashTransitionDashPath.typesTransitionPathMod.State
import typings.router5DashTransitionDashPath.typesTransitionPathMod.TransitionPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("router5", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val constants: Constants = js.native
  val createRouter: CreateRouter = js.native
  val default: CreateRouter = js.native
  val errorCodes: ErrorCodes = js.native
  def cloneRouter(router: Router): Router = js.native
  def cloneRouter(router: Router, dependencies: Dependencies): Router = js.native
  def transitionPath(toState: State): TransitionPath = js.native
  def transitionPath(toState: State, fromState: State): TransitionPath = js.native
}

