package typings.router5TransitionPath

import typings.router5TransitionPath.transitionPathMod.State
import typings.router5TransitionPath.transitionPathMod.TransitionPath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("router5-transition-path", JSImport.Default)
  @js.native
  def default(toState: State): TransitionPath = js.native
  @JSImport("router5-transition-path", JSImport.Default)
  @js.native
  def default(toState: State, fromState: State): TransitionPath = js.native
  
  @JSImport("router5-transition-path", "nameToIDs")
  @js.native
  def nameToIDs(name: String): js.Array[String] = js.native
  
  @JSImport("router5-transition-path", "shouldUpdateNode")
  @js.native
  def shouldUpdateNode(nodeName: String): js.Function2[/* toState */ State, /* fromSate */ State, Boolean] = js.native
}
