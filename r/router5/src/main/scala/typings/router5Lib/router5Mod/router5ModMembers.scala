package typings
package router5Lib.router5Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("router5", JSImport.Namespace)
@js.native
object router5ModMembers extends js.Object {
  val constants: router5Lib.typesConstantsMod.Constants = js.native
  val createRouter: router5Lib.typesTypesRouterMod.CreateRouter = js.native
  val default: router5Lib.typesTypesRouterMod.CreateRouter = js.native
  val errorCodes: router5Lib.typesConstantsMod.ErrorCodes = js.native
  def cloneRouter(router: router5Lib.typesTypesRouterMod.Router): router5Lib.typesTypesRouterMod.Router = js.native
  def cloneRouter(
    router: router5Lib.typesTypesRouterMod.Router,
    dependencies: router5Lib.typesTypesRouterMod.Dependencies
  ): router5Lib.typesTypesRouterMod.Router = js.native
  def transitionPath(toState: router5DashTransitionDashPathLib.typesTransitionPathMod.State): router5DashTransitionDashPathLib.typesTransitionPathMod.TransitionPath = js.native
  def transitionPath(
    toState: router5DashTransitionDashPathLib.typesTransitionPathMod.State,
    fromState: router5DashTransitionDashPathLib.typesTransitionPathMod.State
  ): router5DashTransitionDashPathLib.typesTransitionPathMod.TransitionPath = js.native
}

