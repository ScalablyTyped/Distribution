package typings.router5TransitionPath

import typings.router5TransitionPath.distTransitionPathMod.State
import typings.router5TransitionPath.distTransitionPathMod.TransitionPath
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("router5-transition-path", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(toState: State): TransitionPath = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(toState.asInstanceOf[js.Any]).asInstanceOf[TransitionPath]
  inline def default(toState: State, fromState: State): TransitionPath = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(toState.asInstanceOf[js.Any], fromState.asInstanceOf[js.Any])).asInstanceOf[TransitionPath]
  
  inline def nameToIDs(name: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("nameToIDs")(name.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  
  inline def shouldUpdateNode(nodeName: String): js.Function2[/* toState */ State, /* fromSate */ State, Boolean] = ^.asInstanceOf[js.Dynamic].applyDynamic("shouldUpdateNode")(nodeName.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* toState */ State, /* fromSate */ State, Boolean]]
}
