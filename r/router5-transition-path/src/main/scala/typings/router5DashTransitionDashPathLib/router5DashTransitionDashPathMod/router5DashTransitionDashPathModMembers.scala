package typings
package router5DashTransitionDashPathLib.router5DashTransitionDashPathMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("router5-transition-path", JSImport.Namespace)
@js.native
object router5DashTransitionDashPathModMembers extends js.Object {
  def default(toState: router5Lib.createDashRouterMod.State): TransitionPath = js.native
  def default(toState: router5Lib.createDashRouterMod.State, fromState: router5Lib.createDashRouterMod.State): TransitionPath = js.native
  def nameToIDs(name: java.lang.String): js.Array[java.lang.String] = js.native
  def shouldUpdateNode(nodeName: java.lang.String): js.Function2[
    /* toState */ router5Lib.createDashRouterMod.State, 
    /* fromState */ js.UndefOr[router5Lib.createDashRouterMod.State], 
    scala.Boolean
  ] = js.native
}

