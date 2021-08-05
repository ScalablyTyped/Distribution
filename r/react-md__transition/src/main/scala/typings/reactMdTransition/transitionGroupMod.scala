package typings.reactMdTransition

import typings.react.mod.ReactElement
import typings.reactMdTransition.useTransitionGroupMod.TransitionGroupOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object transitionGroupMod {
  
  @JSImport("@react-md/transition/types/TransitionGroup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def TransitionGroup(props: TransitionGroupOptions): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("TransitionGroup")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
}
