package typings.router5TransitionPath

import typings.router5TransitionPath.transitionPathMod.State
import typings.router5TransitionPath.transitionPathMod.TransitionPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("router5-transition-path", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def default(toState: State): TransitionPath = js.native
  def default(toState: State, fromState: State): TransitionPath = js.native
  
  def nameToIDs(name: String): js.Array[String] = js.native
  
  def shouldUpdateNode(nodeName: String): js.Function2[/* toState */ State, /* fromSate */ State, Boolean] = js.native
}
