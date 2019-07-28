package typings.router5DashTransitionDashPath

import typings.router5DashTransitionDashPath.typesTransitionPathMod.State
import typings.router5DashTransitionDashPath.typesTransitionPathMod.TransitionPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("router5-transition-path", JSImport.Namespace)
@js.native
object router5DashTransitionDashPathMod extends js.Object {
  def default(toState: State): TransitionPath = js.native
  def default(toState: State, fromState: State): TransitionPath = js.native
  def nameToIDs(name: String): js.Array[String] = js.native
  def shouldUpdateNode(nodeName: String): js.Function2[/* toState */ State, /* fromSate */ State, Boolean] = js.native
}

