package typings.reapop

import typings.react.mod.global.JSX.Element
import typings.reactTransitionGroup.transitionMod.TransitionProps
import typings.reapop.anon.Duration
import typings.reapop.reapopStrings.addEndListener
import typings.std.HTMLElement
import typings.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fadeTransitionMod {
  
  @JSImport("reapop/dist/components/FadeTransition", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: Props): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  type Props = Duration & (Omit[TransitionProps[HTMLElement], addEndListener])
}
