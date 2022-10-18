package typings.semanticUiReact.mod

import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.semanticUiReact.distCommonjsModulesTransitionTransitionGroupMod.TransitionGroupComponent
import typings.semanticUiReact.distCommonjsModulesTransitionTransitionGroupMod.TransitionGroupProps
import typings.semanticUiReact.mod.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSImport("semantic-ui-react", "TransitionGroup")
@js.native
open class TransitionGroup protected () extends Component[TransitionGroupProps, ComponentState, Any] {
  def this(props: TransitionGroupProps) = this()
  def this(props: TransitionGroupProps, context: Any) = this()
}
object TransitionGroup {
  
  inline def apply: TransitionGroupComponent = ^.asInstanceOf[js.Dynamic].selectDynamic("TransitionGroup").asInstanceOf[TransitionGroupComponent]
}
