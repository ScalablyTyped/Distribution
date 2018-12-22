package typings
package router5DashTransitionDashPathLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("router5-transition-path", JSImport.Namespace)
@js.native
object router5DashTransitionDashPathMod extends js.Object {
  def default(toState: router5DashTransitionDashPathLib.typesTransitionPathMod.State): router5DashTransitionDashPathLib.typesTransitionPathMod.TransitionPath = js.native
  def default(
    toState: router5DashTransitionDashPathLib.typesTransitionPathMod.State,
    fromState: router5DashTransitionDashPathLib.typesTransitionPathMod.State
  ): router5DashTransitionDashPathLib.typesTransitionPathMod.TransitionPath = js.native
  def nameToIDs(name: java.lang.String): js.Array[java.lang.String] = js.native
  def shouldUpdateNode(nodeName: java.lang.String): js.Function2[
    /* toState */ router5DashTransitionDashPathLib.typesTransitionPathMod.State, 
    /* fromSate */ router5DashTransitionDashPathLib.typesTransitionPathMod.State, 
    scala.Boolean
  ] = js.native
}

